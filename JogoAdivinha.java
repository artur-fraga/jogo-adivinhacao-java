import java.util.Scanner;

public class JogoAdivinha {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("-------------------");
        System.out.println("JOGO DE ADIVINHAÇÃO");
        System.out.println("-------------------");


        System.out.print("Qual o número máximo?");
        int numMax = entrada.nextInt();
        int num = (int) (1 + Math.random() * (numMax-1));

        System.out.print("Qual seu palpite?");
        int palpite = entrada.nextInt();
        int tentativas = 1;

        while (palpite != num){
            if (palpite > num){
                System.out.println("NÚMERO SECRETO É MENOR");
            } else {
                System.out.println("NÚMERO SECRETO É MAIOR");
            }
            System.out.print("Qual seu palpite?");
            palpite = entrada.nextInt();
            tentativas += 1;
        }

        System.out.println(" ");
        System.out.println("ACERTOU! O número secreto é " + num);
        System.out.println("Foram necessárias " + tentativas + " tentativas.");
        
        entrada.close();
        
    }
 
    
}
