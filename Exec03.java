import java.util.Scanner;
public class Exec03 {
    public static void main(String args[]) {
        Scanner tcl = new Scanner(System.in);
        System.out.println("Quantos km seu carro trafegou ?");
        float kilo = tcl.nextFloat();
        System.out.println("Quantos litros ele gastou ?");
        float litro = tcl.nextFloat();
        float cons = litro / kilo;
        System.out.println("O consumo médio deste veículo foi de :" + cons + " l/km.");
    }
}
