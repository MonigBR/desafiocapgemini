import java.util.Scanner;

/**Classe controller da entidade Senha
 * 
 * @author Michel Konig
 *
 */
public class SenhaController {
	
	public static void main(String[] args) {

/**M�todo de entrada do parametro String novaSenha
 *
 */
	Scanner sc = new Scanner(System.in);
	System.out.println("Digite sua senha que atenda os seguintes reques�tos:");	
	System.out.println("     Possui no m�nimo 6 caracteres");
	System.out.println("     Cont�m no m�nimo 1 digito");
	System.out.println("     Cont�m no m�nimo 1 letra em min�sculo");
	System.out.println("     Cont�m no m�nimo 1 letra em mai�sculo");
	System.out.println("     Cont�m no m�nimo 1 caractere especial (!@#$%^&*()-+)");			

	
	String novaSenha = sc.next();
	
	Senha senha = new Senha(novaSenha); 
	
	senha.digiteSenha(novaSenha);
		
	sc.close();
	}
}
