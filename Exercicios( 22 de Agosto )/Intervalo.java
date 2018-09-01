package vinte.dois.agosto;
import java.util.Scanner;
public class Intervalo {
    public static void main(String args[]) {
        Scanner tcl = new Scanner(System.in);
        System.out.println("Digite o 1° valor.");
        int v1 = tcl.nextInt();
        System.out.println("Digite o 2° valor.");
        int v2 = tcl.nextInt();
        if (v1 == v2 || v1 - v2 == 1 || v1 - v2 == -1 || v2 - v1 == 1 || v2 - v1 == -1) {
            System.out.println("Não há intervalo.");
        } else if (v1 > v2) {
            for (int i = v2++; i < v1; i++) {
                System.out.println(i);
            }
        } else if (v1 < v2) {
            for (int i = v1++; i < v2; i++) {
                System.out.println(i);
            }
        }
    }
}
