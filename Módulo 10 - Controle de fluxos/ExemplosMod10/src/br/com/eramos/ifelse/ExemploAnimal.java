package br.com.eramos.ifelse;

import java.util.Scanner;

public class ExemploAnimal {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Digite o nome de um animal: ");
        String texto = s.next();
        String texto2 = animais(texto);
        System.out.println(texto2);
    }


    public static String animais(String animal){
        String resultado;

        if (animal.equals("Cachorro") || animal.equals("Gato")){
            resultado = "Animal domestico";
        } else if (animal.equals("Tigre")) {
            resultado = "Animal selvagem";
        } else {
            resultado = "Animal desconhecido";
        }
        return resultado;

    }
}
