import java.util.Scanner;

public class Ex18 {
    public static void main(String[] args) {
        Scanner e = new Scanner (System.in);
        int nc,i,ano;

        System.out.println("Qual sua data de nascimento?: ");
        nc = e.nextInt();

        // System.out.println("Em que ano estamos?: ");  Forma para calcular atemporal
        // ano = e.nextInt();
        // i = ano-nc;
       
        i = 2023 - nc;
        
        if (i>=18){
            System.out.println("Você tem " + i + " anos , ou seja, está apto(a) para votar!!!");
        }
        else{ System.out.println("Você tem " + i + " anos, ou seja, não está apto(a) para votar!!");
        }
    
    }
}
