import java.util.Scanner;

/** Classe quest_1, algoritmo que mostre na tela uma escada de tamanho n
 * 
 * @author Michel Konig
 *
 */
public class quest_1 {

	public static void main(String[] args) {
		
/**
 * Comando que pede para o usario informar a quantidade de degraus
 * 
 */
		Scanner sc = new Scanner(System.in);
		
		int numberSteps = sc.nextInt();	
/**
 * Comando de repeticao que gera a quantidade de degraus		
 */
		for (int i=1; i<=numberSteps; i++) {
			int inverse = numberSteps-i;
			String space = " ";
			String step = "*";
			String repeat = space.repeat(inverse) + step.repeat(i);
			System.out.println(repeat);
			
			sc.close();
			
		}
	}
}
