import java.util.Scanner;
public class Ex19 {
    public static void main(String[] args) {
        Scanner e = new Scanner (System.in);
        String nome;
        double nt1,nt2,m;

        System.out.println("Qual é o seu nome?: ");
        nome = e.nextLine();

        System.out.println("Qual foi sua primeira nota?: ");
        nt1 = e.nextDouble();

        System.out.println("Qual foi sua segunda nota?: ");
        nt2 = e.nextDouble();

        m = (nt1+nt2)/2;
        System.out.println("Olá " + nome + ", sua média foi igual a " + m);

        if (m>=7){
            System.out.println("Você teve um bom aproveitamento!!!");
        }
        else{System.out.println("Você teve um mal aproveitamento!!!");}
    }
}
