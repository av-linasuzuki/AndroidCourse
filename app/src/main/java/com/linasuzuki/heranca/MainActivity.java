package com.linasuzuki.heranca;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Animal animal = new Animal();
        animal.AnimalCorrer();

        // Cria um objeto do tipo Cao = Instancia a classe Cao
        Cao cao = new Cao();

        //Chama o método correr onde a classe Cao herdou da Superclasse Animal
        cao.AnimalCorrer();

        //Chama o método específico da classe Cao
        cao.CaoLatir();

        //Define a cor para o método setCor que a classe Cao herdou da superclasse Animal
        //Atribuindo a cor marron para a String cor do método
        cao.setCor("Marron");

        //recupera a cor definida para a String cor e imprime
        System.out.println(cao.getCor());

        //Chama o método CaoCorrer da classe Cao
        cao.CaoCorrer();
    }
}
