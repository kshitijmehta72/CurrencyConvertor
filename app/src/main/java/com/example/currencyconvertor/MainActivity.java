package com.example.currencyconvertor;

import android.os.DeadObjectException;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void convert(View v)
    {
        EditText ed1=(EditText)findViewById(R.id.editText);
        Double d=Double.parseDouble(ed1.getText().toString());
        Double d2=d*71.4;

        Toast.makeText(this,String.format("%.2f",d2)+" Rs",Toast.LENGTH_SHORT).show();


    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
