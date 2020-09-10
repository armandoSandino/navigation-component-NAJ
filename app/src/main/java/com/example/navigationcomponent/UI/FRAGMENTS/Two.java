package com.example.navigationcomponent.UI.FRAGMENTS;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.navigationcomponent.R;
import com.google.android.material.button.MaterialButton;


public class Two extends Fragment {

    public Two() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_two, container, false);
    }
    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        MaterialButton btnAtras =  view.findViewById(R.id.btnAtras);
        MaterialButton btnSiguiente = view.findViewById(R.id.btnSiguiente);

        final NavController navController = Navigation.findNavController(  view );

        btnAtras.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // llamamos al fragmento
                Navigation.findNavController( v ).navigate( R.id.inicio );
            }
        });

        btnSiguiente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Navigation.findNavController( v ).navigate( R.id.fragmentTwo );
                navController.navigate(R.id.three);
            }
        });
    }
}