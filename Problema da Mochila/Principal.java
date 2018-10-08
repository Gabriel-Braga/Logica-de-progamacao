import java.util.Scanner;
public class Principal {
    public static void main(String args[]) {
        Scanner tcl = new Scanner(System.in);
        System.out.println("Qual o peso máximo que a mochila suporta?");
        Mochila m1 = new Mochila(tcl.nextFloat());
        System.out.println("Quantos objetos há na casa?");
        Produto p[] = new Produto[tcl.nextInt()];
        String a;
        float b, c = 0;
        for (int x = 0; x < p.length; x++) {
            System.out.println("Qual o nome do objeto "+(x + 1)+" ?");
            a = tcl.next();
            System.out.println("Qual o peso do objeto ?");
            b = tcl.nextFloat();
            System.out.println("Qual o valor do objeto ?");
            c = tcl.nextFloat();
            p[x] = new Produto(a, b, c);
        }
        Produto aux;
        for (int y = 0; y < p.length; y++) {
            for (int z = 0; z < p.length - 1; z++) {
                if (p[z].id < p[z + 1].id) {
                    aux = p[z];
                    p[z] = p[z + 1];
                    p[z + 1] = aux;
                }
            }
        }
        float comp = m1.maxPeso;
        int cont = 0;
        for (Produto p1 : p) {
            if (comp - p1.peso >= 0) {
                comp -= p1.peso;
                cont++;
                System.out.println("Você colocará na mochila: " + p1.nome);
            }
            if (comp == 0) {
                break;
            }
        }
        if(cont == 0) {
            System.out.println("Não é possível levar nada.");
        }
    }
}
