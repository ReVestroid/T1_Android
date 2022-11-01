package com.example.t1_1818036;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Biodata extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_biodata);

        final EditText nama =
                (EditText)findViewById(R.id.input1);
        final EditText nim =
                (EditText)findViewById(R.id.input2);
        final EditText jurusan =
                (EditText)findViewById(R.id.input3);
        final EditText angkatan =
                (EditText)findViewById(R.id.input4);

        final TextView nama_t =
                (TextView)findViewById(R.id.output1);
        final TextView nim_t =
                (TextView)findViewById(R.id.output2);
        final TextView jurusan_t =
                (TextView)findViewById(R.id.output3);
        final TextView angkatan_t =
                (TextView)findViewById(R.id.output4);

        final Button tampil =
                (Button)findViewById(R.id.button2);
        tampil.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                String nama1 = nama.getText().toString();
                String nim1 = nim.getText().toString();
                String jurusan1 = jurusan.getText().toString();
                String angkatan1 = angkatan.getText().toString();

                nama_t.setText(nama1);
                nim_t.setText(nim1);
                jurusan_t.setText(jurusan1);
                angkatan_t.setText(angkatan1);
            }
        });
    }
}