import java.util.Scanner;
public class Ex21 {
    public static void main(String[] args) {
        Scanner e = new Scanner (System.in);
        int ano;
        
        System.out.println("Que ano estamos?: ");
        ano = e.nextInt();

        // dificuldade para fazer essa regra do "400" de resto suave
        
    
            if ((ano%400==0)||(ano%4==0)&&(ano%100!=0)){
                System.out.println("Esse ano é bissexto!!");
            }
            else{
                System.out.println("Esse ano não é bissexto!!");
            }
        }

   
    }

