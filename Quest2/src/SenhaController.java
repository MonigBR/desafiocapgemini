import java.util.Scanner;

public class SenhaController {
	
	public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);
	
	System.out.print("  senha: ");
	String novaSenha = sc.next();
	
	Senha senha = new Senha(novaSenha); 
	
	senha.diferenca(novaSenha);
		
	sc.close();
	}
}
