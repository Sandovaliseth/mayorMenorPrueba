package com.wposs.mayormenor;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements View.OnClickListener, Interface.View{

    EditText numeros;
    Button agregar;
    TextView ordenado;
    Interface.Presenter presenter;
    ArrayList<Integer> listaNumeros;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.variables();
        presenter = new Present(this);
    }

    @Override
    public void variables() {
        numeros= findViewById(R.id.txtNumeros);
        ordenado= findViewById(R.id.txtOrdenado);
        agregar = findViewById(R.id.btnAgregar);
        agregar.setOnClickListener(this);
        listaNumeros = new ArrayList<>();
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnAgregar:
                listaNumeros.add(Integer.parseInt(numeros.getText().toString()));
                limpiar();
                ArrayList<Integer> mostrar = presenter.ordenar(listaNumeros);
                //ordenado.setText(mostrar.toString());
                String [] espacios = mostrar.toString().split(" ");
                String comas = mostrar.toString().replace(",","");
                ordenado.setText(comas);
                break;
        }
    }

    void limpiar() {
        numeros.setText("");
    }
}