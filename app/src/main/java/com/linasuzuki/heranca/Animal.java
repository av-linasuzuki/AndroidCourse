package com.linasuzuki.heranca;

public class Animal {

    int tamanho;
    String cor;
    double peso;

    //Setter and Getter
    //Setter
    void setCor(String cor){
        //this=cor da classe Animal = cor do método setCor
        //Atribui a cor do método setCor para cor da classe Animal
        this.cor = cor;
    }

    //Getter = recuperar
    String getCor()
    {
        //retorna cor da Classe Animal
        return this.cor;
    }

    void AnimalDormir()
    {
        System.out.println("Dormiu");
    }

    void AnimalCorrer()
    {
        System.out.println("Correr como um");
    }
}
