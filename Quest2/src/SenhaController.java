import java.util.Scanner;

/**Classe controller da entidade Senha
 * 
 * @author Michel Konig
 *
 */
public class SenhaController {
	
	public static void main(String[] args) {

/**Método de entrada do parametro String novaSenha
 *
 */
	Scanner sc = new Scanner(System.in);
	System.out.println("Digite sua senha que atenda os seguintes requesítos:");	
	System.out.println("     Possui no mínimo 6 caracteres");
	System.out.println("     Contém no mínimo 1 digito");
	System.out.println("     Contém no mínimo 1 letra em minúsculo");
	System.out.println("     Contém no mínimo 1 letra em maiúsculo");
	System.out.println("     Contém no mínimo 1 caractere especial (!@#$%^&*()-+)");			

	
	String novaSenha = sc.next();
	
	Senha senha = new Senha(novaSenha); 
	
	senha.digiteSenha(novaSenha);
		
	sc.close();
	}
}
