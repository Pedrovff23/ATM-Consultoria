package com.example.atmconsultoria.iu.clientes;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.atmconsultoria.R;

public class ClientesFragment extends Fragment {


    public ClientesFragment() {
        // Required empty public constructor
    }


    @SuppressLint("SetTextI18n")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_clientes, container, false);

        TextView textView1 = view.findViewById(R.id.text_header_clientes);
        TextView textView2 = view.findViewById(R.id.text_body1_clientes);
        TextView textView3 = view.findViewById(R.id.text_foot_clientes);

        textView1.setText("Clientes");

        textView2.setText("Em mais de 15 anos de existência a ATM acumula experiência em serviços" +
                " de consultorias para empresas nacionais e multinacionais, de diversos portes," +
                "tendo atendido mais de 1000 empresas desde sua abertura ;)");

        textView3.setText("> 3M\n" + "> OLX\n" + "> Mercado Livre\n"+"> Embraer\n"+"> Natura\n"+
                "> Lojas Americans");

        return view;
    }
}