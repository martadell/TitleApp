package edu.upc.eseiaat.pma.titleapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class EditTitleActivity extends AppCompatActivity {

    private EditText edit_title;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_title);

        //(II)
        Intent intent = getIntent();
        String title = intent.getStringExtra("title");
        edit_title = (EditText) findViewById(R.id.edit_title);
        edit_title.setText(title);
    }

    public void saveTitle(View view) {
        //(III)
        String new_title = edit_title.getText().toString();
        //new intent buit i li afegim el title nou, modificat
        Intent data = new Intent();
        data.putExtra("title", new_title);
        setResult(RESULT_OK, data);
        finish();
    }
}
