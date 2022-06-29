package com.example.atmconsultoria.iu.sobre;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.atmconsultoria.R;

import mehdi.sakout.aboutpage.AboutPage;
import mehdi.sakout.aboutpage.Element;

public class SobreFragment extends Fragment {


    public SobreFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        Element versao = new Element();
        versao.setTitle("Versão 1.0");

        String descricao = "A ATM Consultoria tem como missão apoiar organizaçoes que desejam" +
                " alcançar o sucesso atráves da exceleência em gestão e da busca pela qualidade";

        // Inflate the layout for this fragment

        return new AboutPage(getActivity())
                .setImage(R.drawable.logo)
                .setDescription(descricao)
                .addGroup("Entre em contato")
                .addEmail("atendimento@atmconsultoria.com.br","Envie um e-mail")
                .addWebsite("https://www.google.com.br/","Acesse o nosso site")
                .addGroup("Redes Socias")
                .addFacebook("sophia.paes","Facebook")
                .addTwitter("patymagal","Twitter")
                .addInstagram("mariapfernandes","Instagram")
                .addYoutube("LowCarsOficial","youtube")
                .addPlayStore("com.zhiliaoapp.musically","Google Play")
                .addItem(versao)
                .create();

    }
}