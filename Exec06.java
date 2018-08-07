import java.util.Scanner;
public class Exec06 {
    public static void main(String args[]) {
        Scanner tcl = new Scanner(System.in);
        System.out.println("Qual o valor da sua compra?");
        float compra = tcl.nextFloat();
        float parcela = compra / 5;
        System.out.println("No cartão em 5 vezes sem juros, cada parcela custará: " + parcela);
    }
}
