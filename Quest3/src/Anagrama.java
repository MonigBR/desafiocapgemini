import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;
/** Classe Senha, algoritmo que informa o n�mero de pares de substrings que s�o anagramas
 * 
 * @author Michel Konig
 * 
 */	
public class Anagrama {

	public static void main(String[] args) {

/**M�todo de entrada do o conjunto de caracteres para saber o n�mero de pares de substrings que s�o anagramas
 *
 *@param String anagramas - conjunto de caracteres
 *
 */
		Scanner sc = new Scanner(System.in);	
		System.out.println();
		System.out.print("Digite o conjunto de caracteres para saber quantos anagramas apartir dos subconjutos formados ser�o gerados: ");
		String conjunto = sc.next();	
		anagramas(conjunto);	
		System.out.println();	
		sc.close();
		}
/**M�todo o n�mero de pares de substrings que s�o anagramas
* 
* @param Anagramas - conjunto de caracteres
*/	
	public static void anagramas(String conjunto) {
		HashMap<String, Integer> sub = new HashMap<>();	
		int anagramas = 0;
		for(int i=0; i<conjunto.length(); i++) {
			
			for(int j=i; j<conjunto.length(); j++) {
			
				char[] novoConjuntoChar = conjunto.substring(i, j+1).toCharArray();
				Arrays.sort(novoConjuntoChar);
				String novoConjunto = new String(novoConjuntoChar);
				
				if(sub.containsKey(novoConjunto)) {				
					sub.put(novoConjunto, sub.get(novoConjunto)+1);
					}
				
				else {
					sub.put(novoConjunto, 1);
					}
				}
			}
		
		for(String novoConjunto:sub.keySet()) {
			int valor = sub.get(novoConjunto);
			if(valor == 1) {
				anagramas += 0;
				}
				
			else {
				anagramas += 1;			
				}
			}
			
		System.out.println();
		System.out.printf("Existem %d anagrama(s) do conjunto de caracteres %s.", anagramas, conjunto);
	}
}
