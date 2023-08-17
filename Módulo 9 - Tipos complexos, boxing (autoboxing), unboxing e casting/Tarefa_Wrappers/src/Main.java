import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        byte n;
        n = ler.nextByte();
        System.out.println("Número com variável do tipo primitivo: " + n);
        Short n1;
        n1 = ler.nextShort();
        System.out.println("Número com variável do tipo Wrapper: " + n1);
    }
}