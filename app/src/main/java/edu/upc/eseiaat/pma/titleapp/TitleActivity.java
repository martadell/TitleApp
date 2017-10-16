package edu.upc.eseiaat.pma.titleapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class TitleActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_title);
    }

    public void editTitle(View view) {
        //1. Crear un intent
        Intent intent = new Intent(this,EditTitleActivity.class);
        //2. Passar l'intent a Android perquè inicialitzi l'activitat
        startActivity(intent);
    }
}
