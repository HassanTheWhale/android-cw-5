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

public class FragOne extends Fragment {

    public FragOne() {
        // Required empty public constructor
    }

    private RecyclerView recyclerView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment


        ArrayList<Movie> moviesArrayList = new ArrayList<Movie>();
        moviesArrayList.add(
                new Movie("Harry Potter and the Sorcerer's Stone", R.drawable.hpa,
                        "An orphaned boy enrolls in a school of wizardry, where he learns the truth about himself, his family and the terrible evil that haunts the magical world.",
                        "2001", "152 min",
                        "7.6", "https://www.imdb.com/title/tt0241527/?ref_=ttls_li_tt"));
        moviesArrayList.add(
                new Movie("Harry Potter and the Chamber of Secrets", R.drawable.hpb,
                        "An ancient prophecy seems to be coming true when a mysterious presence begins stalking the corridors of a school of magic and leaving its victims paralyzed.",
                        "2002", "161 min",
                        "7.4", "https://www.imdb.com/title/tt0295297/?ref_=ttls_li_tt"));
        moviesArrayList.add(
                new Movie("Harry Potter and the Prisoner of Azkaban", R.drawable.hpc,
                        "Harry Potter, Ron and Hermione return to Hogwarts School of Witchcraft and Wizardry for their third year of study, where they delve into the mystery surrounding an escaped prisoner who poses a dangerous threat to the young wizard.",
                        "2004", "142 min",
                        "7.9", "https://www.imdb.com/title/tt0304141/?ref_=ttls_li_tt"));
        moviesArrayList.add(
                new Movie("Harry Potter and the Goblet of Fire", R.drawable.hpd,
                        "Harry Potter finds himself competing in a hazardous tournament between rival schools of magic, but he is distracted by recurring nightmares.",
                        "2005", "157 min",
                        "7.7", "https://www.imdb.com/title/tt0330373/?ref_=ttls_li_tt"));


        View view = inflater.inflate(R.layout.fragment_frag_one, container, false);

        recyclerView = view.findViewById(R.id.rv);
        recyclerView.setHasFixedSize(true);

        RecyclerView.LayoutManager lm = new LinearLayoutManager(view.getContext());
        recyclerView.setLayoutManager(lm);

        MovieAdapter movieAdapter = new MovieAdapter(moviesArrayList, view.getContext(), (MainActivity) getActivity());
        recyclerView.setAdapter(movieAdapter);

        return view;
    }
}