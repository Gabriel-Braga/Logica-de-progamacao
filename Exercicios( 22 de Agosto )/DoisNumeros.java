package vinte.dois.agosto;
import java.util.Scanner;
public class DoisNumeros {
    public static void main(String args[]) {
        Scanner tcl = new Scanner(System.in);
        System.out.println("Digite um valor.");
        int a = tcl.nextInt();
        System.out.println("Digite outro valor.");
        int b = tcl.nextInt();
        if (a > b) {
            System.out.println("O primeiro valor é maior.");
            System.out.println("O segundo valor é menor.");
        } else if (a < b) {
            System.out.println("O primeiro valor é menor.");
            System.out.println("O segundo valor é maior.");
        } else {
            System.out.println("São iguais");
        }
    }
}
