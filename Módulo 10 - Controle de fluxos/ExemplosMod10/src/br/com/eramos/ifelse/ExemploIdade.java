package br.com.eramos.ifelse;

import java.util.Scanner;

public class ExemploIdade {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Insira a sua idade: ");
        int idade = s.nextInt();
        String idadeSt = getIdade(idade);
        System.out.println(idadeSt);

    }

    public static String getIdade(int idade){
        if (idade >=0 && idade <=5){
            return "Você é um bebê";
        } else if (idade >=6 && idade <=10) {
            return "Você é uma criança";
        } else if (idade>=11 && idade <=18) {
            return "Você é um adolescente";
        } else if (idade >=19 && idade <=60){
            return "Você é um adulto";
        } else {
            return "Você é um idoso";
        }
    }
}
