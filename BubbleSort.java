import java.util.Scanner;
public class BubbleSort {
    public static void main(String args[]) {
        Scanner tcl = new Scanner(System.in);
        System.out.println("Qual o tamanho do seu vetor ?");
        int vet[] = new int [tcl.nextInt()];
        int aux = 0;
// For para gerar valores aleatórios
        for (int x = 0; x < vet.length; x++) {
            System.out.print((x + 1)+"° valor:");
            vet[x] = tcl.nextInt();
        }
        
// Bubble sort
        for (int i = 0; i < vet.length; i++) {
            for (int j = 0; j < vet.length; j++) {
                if (vet[j] > vet[i]) {
                    aux = vet[j];
                    vet[j] = vet[i];
                    vet[i] = aux;
                }
            }
        }
        
// Mostrando vetor        
        for (int i = 0; i < vet.length; i++) {
            if((float)((i + 1) % 10) == 0){
                System.out.print("{"+ vet[i] +"}\n");
            } else {
                System.out.print("{"+ vet[i] +"}");
            }
        }
    }
}
