package com.example.atmconsultoria.iu.servicos;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.atmconsultoria.R;

public class ServicosFragment extends Fragment {

    public ServicosFragment() {
        // Required empty public constructor
    }

    @SuppressLint("SetTextI18n")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_servicos, container, false);
        TextView textView1 = view.findViewById(R.id.text_header_servicos);
        TextView textView2 = view.findViewById(R.id.text_body1_servicos);
        TextView textView3 = view.findViewById(R.id.text_body2_servicos);
        TextView textView4 = view.findViewById(R.id.text_foot_servicos);


        textView1.setText("Sistemas de Gestão da Qualidade");

        textView2.setText("Qualidade é uma responsabilidade de todos os níveis da organização. " +
                "Ao implementar um sistema de gestão da qualidade, a empresa se prepara melhor " +
                "para gerenciar os riscos relacionados à qualidade. Existem várias normas e " +
                "padrões para medir a qualidade, como a ISO 9001, ISO 14001, ISO 18001, " +
                "ISO 31000, certificação ONA e outras.");

        textView3.setText("Indicadores de desempenho");

        textView4.setText("A definição e análise de indicadores permitem avaliar o desempenho da" +
                " organização de acordo com as metas estabelecidas, possibilitando seu " +
                "acompanhamento e permitindo que sejam feitas as adequações necessárias para " +
                "atingir os resultados desejados.");

        return view;
    }
}