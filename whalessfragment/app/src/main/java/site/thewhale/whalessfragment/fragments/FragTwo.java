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

public class FragTwo extends Fragment {


    public FragTwo() {
        // Required empty public constructor
    }

    private RecyclerView recyclerView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        ArrayList<Movie> moviesArrayList2 = new ArrayList<Movie>();
        moviesArrayList2.add(
                new Movie("The Avengers ", R.drawable.aven,
                        "Earth's mightiest heroes must come together and learn to fight as a team if they are going to stop the mischievous Loki and his alien army from enslaving humanity.",
                        "2012", "143 min",
                        "8", "https://www.imdb.com/title/tt0848228/?ref_=ttls_li_i"));
        moviesArrayList2.add(
                new Movie("Avengers: Age of Ultron", R.drawable.avenb,
                        "When Tony Stark and Bruce Banner try to jump-start a dormant peacekeeping program called Ultron, things go horribly wrong and it's up to Earth's mightiest heroes to stop the villainous Ultron from enacting his terrible plan.",
                        "2015", "141 min",
                        "7.3", "https://www.imdb.com/title/tt2395427/?ref_=ttls_li_i"));
        moviesArrayList2.add(
                new Movie("Avengers: Infinity War", R.drawable.avenc,
                        "The Avengers and their allies must be willing to sacrifice all in an attempt to defeat the powerful Thanos before his blitz of devastation and ruin puts an end to the universe.",
                        "2018", "149 min",
                        "8.4", "https://www.imdb.com/title/tt4154756/?ref_=ttls_li_i"));
        moviesArrayList2.add(
                new Movie("Avengers: Endgame", R.drawable.avend,
                        "After the devastating events of Avengers: Infinity War (2018), the universe is in ruins. With the help of remaining allies, the Avengers assemble once more in order to reverse Thanos' actions and restore balance to the universe.",
                        "2019", "181 min",
                        "8.4", "https://www.imdb.com/title/tt4154796/?ref_=ttls_li_i"));


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