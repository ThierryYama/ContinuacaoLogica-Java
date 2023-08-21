import java.util.Scanner;

public class Ex24 {
    public static void main(String[] args) {
        Scanner e = new Scanner (System.in);

        double km;
        double passagem;


        System.out.println("Quantos Km deseja percorrer?: ");
        km = e.nextDouble();

        if (km<=200){
            passagem = km*0.50;
            System.out.println("Preço da passagem é " + passagem);
        }
        else{
            passagem = km*0.45;
            System.out.println("Preço da passagem é " + passagem);
        }

    }
}
