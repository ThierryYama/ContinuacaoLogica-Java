import java.util.Scanner;
public class Ex20 {
    public static void main(String[] args) {
        Scanner e = new Scanner (System.in);
        int n;
        
        System.out.println("Digite um numero inteiro: ");   
        n = e.nextInt();

        if (n%2==0){
            System.out.println("O numero " + n + " é par");
        }
        else {System.out.println("O numero " + n + " é impar");}
    }
}