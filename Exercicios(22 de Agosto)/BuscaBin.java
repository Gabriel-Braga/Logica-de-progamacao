import java.util.Scanner;
import java.util.Random;
public class BuscaBin {
    public static void main(String args[]) {
        Scanner tcl = new Scanner(System.in);
        Random rand = new Random();
        System.out.println("Qual o tamanho do vetor?");
        int aux = tcl.nextInt();
        int vet[] = new int [aux];
        for (int x = 0; x < vet.length; x++) {
            vet[x] = x;
        }
        
// Variáveis principais
        int inicio = 0;
        int fim = vet.length;
        int meio;
        
// Recebendo valor a ser procurado
        System.out.println("Qual valor quer achar?");
        aux = tcl.nextInt();
        
// While para buscar o valor
        while(inicio <= fim) {
            meio = (inicio + fim) / 2;
            if (aux > vet[meio]) {
                inicio = meio + 1;
            } else if (aux < vet[meio]) {
                fim = meio - 1;
            } else {
                System.out.println("O valor está na "+ (meio + 1) + "° posição");
                break;
            }
        }

// Mostrar vetor        
        for (int i = 0; i < vet.length; i++) {
            if((float)(i % 10) == 0){
                System.out.print("{"+ vet[i] +"}\n");
            } else {
                System.out.print("{"+ vet[i] +"}");
            }
        }
    }
}
