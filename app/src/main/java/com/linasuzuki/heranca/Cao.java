package com.linasuzuki.heranca;

//A classe Cao herda(extends) os atributos e métodos da classe Animal
public class Cao extends Animal {

    //método específico da classe Cao
    public void CaoLatir()
    {
        System.out.println("Latiu");
    }
    //Sobrescreve o método da classe pai
    void CaoCorrer()
    {
        //super referencia o método correr da superclasse (pai)
        super.AnimalCorrer();
        System.out.println("cão");
    }
}
