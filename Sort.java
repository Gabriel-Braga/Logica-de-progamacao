import java.util.Scanner;
public class Sort {
    public static void main(String args[]) {
        Scanner tcl = new Scanner(System.in);
        int vet[] = new int [10];
        int aux;
        
        // For para receber os valores do usuário
        for (int i = 0; i < vet.length; i++) {
            vet[i] = tcl.nextInt();
        }
        
        // Organizar o vetor
            for (int x = 0; x < vet.length - 1; x++) {
                if (vet[x] > vet[x + 1]) {
                    aux = vet[x + 1];
                
                    for (int y = x; y >= 0; y--) {
                        if (aux < vet[y]) {
                            vet[y + 1] = vet[y];
                            vet[y] = aux;
                        } else {
                            vet[y + 1] = aux;
                            break;
                        }
                    }
                }
            }
        
        // Mostrando o vetor organizado
        for (int k = 0; k < vet.length; k++) {
            System.out.print("{" + vet[k] + "] " );
        }
        System.out.println(" ");
    }
}
