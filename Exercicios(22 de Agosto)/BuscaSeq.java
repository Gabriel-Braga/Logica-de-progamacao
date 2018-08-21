import java.util.Scanner;
import java.util.Random;
public class BuscaSeq {
    public static void main(String args[]) {
        Scanner tcl = new Scanner(System.in);
        Random rand = new Random();
        System.out.println("Qual o tamanho do vetor ?");
        int aux = tcl.nextInt();
        int vet[] = new int[aux];

// Colocando valores aleatorios no vetor 
        for (int x = 0; x < vet.length; x++) {
            vet[x] = rand.nextInt(10);
        }

// Recebendo valor a ser procurado        
        System.out.println("Qual número quer procurar ?");
        aux = tcl.nextInt();
        boolean varc = false;
        
// For para procurar o vetor
        for (int i = 0; i < 10; i++) {
            if(vet[i] == aux) {
                System.out.println("O valor está na posição "+ (i + 1) +"º");
                varc = true;
            }
        }
        if(varc == false) {
            System.out.println("O valor digitado não foi encontrado.");
        }

// Mostrando vetor        
        for (int i = 0; i < vet.length; i++) {
            if((float)(i % 10) == 0){
                System.out.print("{"+ vet[i] +"}\n");
            } else {
                System.out.print("{"+ vet[i] +"}");
            }
        }

    }
}
