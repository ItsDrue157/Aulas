import java.util.Random;
import java.util.Scanner;

public class Aleatorio {
    public static void main(String[] args) {
        Random random = new Random();
        int numeroSecreto = random.nextInt(100); // Gera um número aleatório entre 0 e 100 // Inicializa a variável tentativas
        
        for (int tentativas = 0; tentativas < 5; tentativas++) {
            Scanner leitura = new Scanner(System.in);
            
            System.out.println("Digite um numero: ");
            int numeroDigitado = leitura.nextInt();

            if (numeroSecreto == numeroDigitado){
                System.out.println("parabens");
                break;

            }
            else if (numeroDigitado > numeroSecreto) {
                System.out.println("O numero digitado foi maior que o numero gerado. ");

            }
            else{
                System.out.println("O numero digitado eh menor que o numero gerado. ");

            }
            System.out.println("Tentativas: "+(tentativas+1)+ " de 5."  );

            
            

        }
        System.out.println("O numero secreto era: "+ numeroSecreto+".");
    }
}
