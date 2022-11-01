package com.example.t1_1818036;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Segitiga extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segitiga);

        final EditText tinggi =
                (EditText)findViewById(R.id.edit_tinggi);
        final EditText alas =
                (EditText)findViewById(R.id.edit_alas);

        final TextView luas =
                (TextView)findViewById(R.id.output_luas);

        final Button tampil = (Button)findViewById(R.id.btn_luas);

        tampil.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                int tinggi1 = Integer.parseInt(tinggi.getText().toString());
                int alas1 = Integer.parseInt(alas.getText().toString());

                int x = tinggi1*alas1/2;

                luas.setText(String.valueOf(x));
            }
        });
    }
}