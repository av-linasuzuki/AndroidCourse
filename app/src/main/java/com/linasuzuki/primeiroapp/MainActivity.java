package com.linasuzuki.primeiroapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    //Criação da ação do botão
    public void alterarTexto(View view)
    {
        //O botão que chama essa função, referencia o id do componente "alvo"
        //ou seja, o id do componente TextView
        TextView textView = findViewById(R.id.txtvCliqueAbaixo);

        textView.setText("Texto foi alterado com sucesso.");
    }
}
