package br.com.eramos.ifelse;

import java.util.Scanner;

public class ExemploScanner {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = s.nextLine();
        System.out.print("Digite sua idade: ");
        int idade = s.nextInt();
        System.out.println("Seu nome é " + nome);
        System.out.println("Você tem " + idade + " anos");

    }
}
