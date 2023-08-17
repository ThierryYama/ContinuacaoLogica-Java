import java.util.Scanner;

public class Ex17 {
    public static void main(String[] args) {
        Scanner e = new Scanner(System.in);
        int v, m, nv;

        System.out.println("Velocidade do carro (Km/h): ");
        v = e.nextInt();
        if (v > 80) {
            System.out.println("Você foi multado!!!");
        }
        if (v <= 80) {
            System.out.println("Tome cuidado para não ser multado!!");
        }

        nv = v - 80;
        m = nv * 5;

        if (m>0){
        System.out.println("Valor da multa: " + m);
        }
    }
}
