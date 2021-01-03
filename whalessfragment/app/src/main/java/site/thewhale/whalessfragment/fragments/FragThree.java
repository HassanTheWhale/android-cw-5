package site.thewhale.whalessfragment.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

import site.thewhale.whalessfragment.MainActivity;
import site.thewhale.whalessfragment.Movie;
import site.thewhale.whalessfragment.MovieAdapter;
import site.thewhale.whalessfragment.R;

public class FragThree extends Fragment {

    public FragThree() {
        // Required empty public constructor
    }

    private RecyclerView recyclerView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        ArrayList<Movie> moviesArrayList2 = new ArrayList<Movie>();
        moviesArrayList2.add(
                new Movie("X-Men", R.drawable.xmena,
                        "In a world where mutants (evolved super-powered humans) exist and are discriminated against, two groups form for an inevitable clash: the supremacist Brotherhood, and the pacifist X-Men.",
                        "2000", "104 min",
                        "7.4", "https://www.imdb.com/title/tt0120903/?ref_=ttls_li_i"));
        moviesArrayList2.add(
                new Movie("X2: X-Men United ", R.drawable.xmenb,
                        "When anti-mutant Colonel William Stryker kidnaps Professor X and attacks his school, the X-Men must ally with their archenemy Magneto to stop him.",
                        "2003", "134 min",
                        "7.4", "https://www.imdb.com/title/tt0290334/?ref_=ttls_li_i"));
        moviesArrayList2.add(
                new Movie("X-Men: The Last Stand", R.drawable.xmenc,
                        "The human government develops a cure for mutations, and Jean Gray becomes a darker uncontrollable persona called the Phoenix who allies with Magneto, causing escalation into an all-out battle for the X-Men.",
                        "2006", "104 min",
                        "6.7", "https://www.imdb.com/title/tt0376994/?ref_=ttls_li_i"));

        View view = inflater.inflate(R.layout.fragment_frag_one, container, false);

        recyclerView = view.findViewById(R.id.rv);
        recyclerView.setHasFixedSize(true);

        RecyclerView.LayoutManager lm = new LinearLayoutManager(view.getContext());
        recyclerView.setLayoutManager(lm);

        MovieAdapter movieAdapter = new MovieAdapter(moviesArrayList2, view.getContext(), (MainActivity) getActivity());
        recyclerView.setAdapter(movieAdapter);

        return view;
    }
}