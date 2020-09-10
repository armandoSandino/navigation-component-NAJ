package com.example.navigationcomponent;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.material.button.MaterialButton;

public class Inicio extends Fragment {


    public Inicio() {

    }
    // se llama primero el onCreateView luego el  onViewCreated
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_inicio, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        MaterialButton btnOne =  view.findViewById(R.id.btnOne);
        MaterialButton btnTwo = view.findViewById(R.id.btnTwo);

        final NavController navController = Navigation.findNavController(  view );

        btnOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // llamamos al fragmento
                Navigation.findNavController( v ).navigate( R.id.one );
            }
        });

        btnTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Navigation.findNavController( v ).navigate( R.id.fragmentTwo );
                navController.navigate(R.id.two);
            }
        });
    }

}