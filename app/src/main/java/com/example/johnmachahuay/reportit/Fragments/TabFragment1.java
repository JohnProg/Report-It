package com.example.johnmachahuay.reportit.Fragments;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.SearchView;
import android.widget.TextView;

import com.example.johnmachahuay.reportit.Adapters.PostAdapter;
import com.example.johnmachahuay.reportit.Models.Post;
import com.example.johnmachahuay.reportit.R;
import com.example.johnmachahuay.reportit.activity.HomeActivity;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class TabFragment1 extends Fragment implements SearchView.OnQueryTextListener {

    private RecyclerView recyclerView;
    private PostAdapter postAdapter;
    private List<Post> postList;

    public TabFragment1() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setHasOptionsMenu(true);
        ((HomeActivity) getActivity()).getSupportActionBar().setTitle(R.string.home);

        postList = new ArrayList<Post>();
        postAdapter = new PostAdapter(getContext(), postList);
    }

    private void populatePosts() {
        Post a = new Post("Accidente 1", "http://blog.trucksuvidha.com/wp-content/uploads/2015/03/road-accident.jpg");
        postList.add(a);

        a = new Post("Accidente 2", "https://www.mcminnlaw.com/assets/accident-car-ambulance.jpg");
        postList.add(a);

        a = new Post("Pista rota", "http://cde.elcomercio.pe/66/ima/0/0/3/9/8/398667.jpg");
        postList.add(a);

        a = new Post("No acatar la luz roja", "http://diariomovil.com.ar/wp-content/uploads/2015/07/semaforo-rojo.jpg");
        postList.add(a);

        a = new Post("Accidente 2", "https://www.mcminnlaw.com/assets/accident-car-ambulance.jpg");
        postList.add(a);

        a = new Post("Pista rota", "http://cde.elcomercio.pe/66/ima/0/0/3/9/8/398667.jpg");
        postList.add(a);

        a = new Post("No acatar la luz roja", "http://diariomovil.com.ar/wp-content/uploads/2015/07/semaforo-rojo.jpg");
        postList.add(a);

        a = new Post("Accidente 2", "https://www.mcminnlaw.com/assets/accident-car-ambulance.jpg");
        postList.add(a);

        a = new Post("Pista rota", "http://cde.elcomercio.pe/66/ima/0/0/3/9/8/398667.jpg");
        postList.add(a);

        a = new Post("No acatar la luz roja", "http://diariomovil.com.ar/wp-content/uploads/2015/07/semaforo-rojo.jpg");
        postList.add(a);

        a = new Post("Accidente 2", "https://www.mcminnlaw.com/assets/accident-car-ambulance.jpg");
        postList.add(a);

        a = new Post("Pista rota", "http://cde.elcomercio.pe/66/ima/0/0/3/9/8/398667.jpg");
        postList.add(a);

        a = new Post("No acatar la luz roja", "http://diariomovil.com.ar/wp-content/uploads/2015/07/semaforo-rojo.jpg");
        postList.add(a);

        postAdapter.notifyDataSetChanged();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.tab_fragment1, container, false);
        recyclerView = (RecyclerView) view.findViewById(R.id.recycler_view);
        RecyclerView.LayoutManager mLayoutManager = new GridLayoutManager(getContext(), 2);
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(postAdapter);

        populatePosts();

        return view;
    }

    @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        inflater.inflate(R.menu.menu_item_search, menu);

        SearchView searchView = (SearchView) menu.findItem(R.id.menu_item_search).getActionView();
        searchView.setQueryHint(getString(R.string.search));
        searchView.setOnQueryTextListener(this);
    }

    @Override
    public boolean onQueryTextSubmit(String s) {
        return true;
    }

    @Override
    public boolean onQueryTextChange(String s) {
        return true;
    }
}
