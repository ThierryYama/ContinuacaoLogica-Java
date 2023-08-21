import java.util.Scanner;

public class Ex22 {
    public static void main(String[] args) {
        Scanner e = new Scanner (System.in);
        int ano,idade,tempo;

        System.out.println("Qual seu ano de nascimento?: ");
        ano = e.nextInt();

        idade = 2023-ano;

        if (idade<18){
            tempo = idade - 18;
            tempo = tempo*-1;
            System.out.println("Faltam " + tempo + " ano para o alistamento!!");
        }
        else{
            tempo = idade - 18;
            System.out.println("Passaram " + tempo + " ano do alistamento!!");
        }
    }
}
