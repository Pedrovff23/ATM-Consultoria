package com.example.atmconsultoria;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.example.atmconsultoria.databinding.ActivityMainBinding;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.navigation.NavigationView;
import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    private NavController navController;
    private DrawerLayout drawer;
    private FloatingActionButton floatingActionButton;
    private AppBarConfiguration barConfiguration;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


        drawer = binding.drawerLayout;
        NavigationView navigationView = binding.navigationView;
        floatingActionButton = binding.appBarMain.floatingbutton;

        setSupportActionBar(binding.appBarMain.toolbar);

        floatingActionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                enviarEmail();
            }
        });

        barConfiguration = new AppBarConfiguration
                .Builder(R.id.principal, R.id.servicos, R.id.clientes, R.id.contato, R.id.sobre)
                .setOpenableLayout(drawer)
                .build();

        navController = Navigation.findNavController(this, R.id.fragment);
        NavigationUI.setupActionBarWithNavController(this, navController, barConfiguration);
        NavigationUI.setupWithNavController(navigationView, navController);
    }


    private void enviarEmail() {

        //String celular = "tel:11996352894";
        //String imagem = "https://www.melhoresdestinos.com.br/wp-content/uploads/2020/06/praias-
        // brasil-sancho.jpg";
        //String endereco = "https://www.google.com.br/maps/place/Parque+Municipal+Am%C3%A9rico
        // +Renn%C3%A9+Giannetti/@-19.9243753,-43.9372527,17z/data=!3m1!4b1!4m5!3m4!1s0xa699efaab95
        // 4d5:0x70d68d04878c017!8m2!3d-19.9243753!4d-43.935064";

        //Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse(celular));
        //Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(imagem));
        //Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(endereco));
        Intent intent = new Intent(Intent.ACTION_SEND);

        intent.putExtra(Intent.EXTRA_EMAIL, new String[]{"atendimento@atmconsultoria.com.br"});

        intent.putExtra(Intent.EXTRA_SUBJECT,"Contato pelo App"); //Assunto do email

        intent.putExtra(Intent.EXTRA_TEXT,"Mensagem automatica");

        //posso ver os tipos pelo MIME TYPES
        intent.setType("message/rfc822");
        //intent.setType("text/plain");
        //intent.setType("image/*");
        //intent.setType("aplication/pdf");

        startActivity(Intent.createChooser(intent,"Compartilhar"));
    }

    @Override
    public void onBackPressed() {
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onSupportNavigateUp() {
        return NavigationUI.navigateUp(navController, barConfiguration)
                || super.onSupportNavigateUp();
    }

}