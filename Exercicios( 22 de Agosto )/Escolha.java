package vinte.dois.agosto;
import java.util.Scanner;
public class Escolha {
    public static void main(String args[]) {
        Scanner tcl = new Scanner(System.in);
        int aux = 0;
        System.out.println("Qual o tamanho do vetor que será criado?");
        int vet[] = new int[tcl.nextInt()];
        System.out.println("Insira os valores:");
        for (int i = 0; i < vet.length; i++) {
            vet[i] = tcl.nextInt();
        }
        System.out.println("Deseja organizar o vetor de forma decrescente ou crescente? [D/C]");
        String varc = tcl.next();
        if (varc.equals("D")) {
            for (int x = 0; x < vet.length; x++) {
                for (int y = 0; y < vet.length; y++) {
                    if (vet[y] < vet[y + 1]) {
                        aux = vet[y];
                        vet[y] = vet[y + 1];
                        aux = vet[y + 1];
                    }
                }
            }
            System.out.println("Vetor organizado:");
            for (int i = 0; i < vet.length; i++) {
                System.out.print("{"+ vet[i]+"} ");
            }
        } else if (varc.equals("C")) {
            for (int x = 0; x < vet.length; x++) {
                for (int y = 0; y < vet.length; y++) {
                    if (vet[y] > vet[y + 1]) {
                        aux = vet[y];
                        vet[y] = vet[y + 1];
                        aux = vet[y + 1];
                    }
                }
            }
            System.out.println("Vetor organizado:");
            for (int i = 0; i < vet.length; i++) {
                System.out.print("{"+ vet[i]+"} ");
            }
        } else {
            System.out.println("Digite um valor válido da próxima vez.");
        }
    }
}
