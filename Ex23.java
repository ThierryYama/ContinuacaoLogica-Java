import java.util.Scanner;

public class Ex23{
    public static void main(String[] args) {
        Scanner e = new Scanner (System.in);

        String nome;
        String sexo;
        double valor;
        double desconto;

        System.out.println("Qual é seu nome?: ");
        nome = e.nextLine();

        System.out.println("Qual seu sexo?: ");
        sexo = e.nextLine();

        System.out.println("Qual o valor das suas compras?: ");
        valor = e.nextDouble();

        if (sexo=="mulher"){
            desconto = valor*0.13;
            valor = valor - desconto;
            System.out.println("Seu valor de compras com desconto foi: R$ " + valor);
        }
        else{
            if(sexo=="homem"){
                desconto = valor*0.05;
                valor = valor - desconto;
                System.out.println("Seu valor de compras com desconto foi: R$ " + valor);
            }
        }

    }


}