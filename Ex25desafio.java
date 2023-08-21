import java.util.Scanner;

public class Ex25desafio{
    public static void main(String[] args) {
        Scanner e = new Scanner (System.in);
        int segmento1,segmento2,segemento3;

        System.out.println("Valor do primeiro segemento de reta: ");
        segmento1 = e.nextInt();

        System.out.println("Valor do primeiro segemento de reta: ");
        segmento2 = e.nextInt();        
        
        System.out.println("Valor do primeiro segemento de reta: ");
        segemento3 = e.nextInt();

        if ((segmento1<(segmento2+segemento3))&&(segmento2<(segemento3+segmento1))&&(segemento3<(segmento1+segmento2))){
            System.out.println("Pode ser formado um triangulo!!");
        }
        else{System.out.println("Não pode ser formado um triangulo!!");}

    }

}