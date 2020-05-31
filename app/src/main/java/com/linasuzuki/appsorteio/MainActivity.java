package com.linasuzuki.appsorteio;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void SorteiaNumero( View view )
    {
        TextView IdTxtVMsg = (TextView) findViewById(R.id.txtvResultado);

        int numSorteado = new Random().nextInt(10);

        IdTxtVMsg.setText("O número sorteado foi: " + numSorteado);
    }
}
