public class Senha {
	
	public Senha(String novaSenha) {
		super();
		this.novaSenha = novaSenha;
	}
	
	public Senha() {}

	private String novaSenha;
	
	public String getNovaSenha() {
		return novaSenha;
	}

	public void setNovaSenha(String novaSenha) {
		this.novaSenha = novaSenha;
	}

	public void digiteSenha(String Senha ) {

		int x=0;
		int y=0;
		int z=0;
		int a=0;
		int digito=0; 
		int maiusculo=0;
		int minusculo=0;
		int caractere=0;
		
		for (int i = 0; i < this.getNovaSenha().length();i++) {					
			
			if (Character.isDigit(this.getNovaSenha().charAt(i))){	x += 0;
			}
			else {x += 1;
			}
											
			if (Character.isUpperCase(this.getNovaSenha().charAt(i))){y += 0;
			}
			else {y += 1;
			}
			
			if (Character.isLowerCase(this.getNovaSenha().charAt(i))){z += 0;
			}
			else {z += 1;
			}	
			
			if (this.getNovaSenha().charAt(i) == ('@')
					||this.getNovaSenha().charAt(i) == ('#')
					||this.getNovaSenha().charAt(i) == ('$')
					||this.getNovaSenha().charAt(i) == ('%')
					||this.getNovaSenha().charAt(i) == ('^')
					||this.getNovaSenha().charAt(i) == ('&')
					||this.getNovaSenha().charAt(i) == ('*')
					||this.getNovaSenha().charAt(i) == (')')
					||this.getNovaSenha().charAt(i) == ('(')
					||this.getNovaSenha().charAt(i) == ('+')
					||this.getNovaSenha().charAt(i) == ('-')) {a +=0;		
			}
			else {a += 1;
			}
			
		}
		
		if (this.getNovaSenha().length() == x) {
			digito = 1;
		}
		if (this.getNovaSenha().length() == y) {
			maiusculo = 1;
		}
		if (this.getNovaSenha().length() == z) {
			minusculo = 1;
		}
		if (this.getNovaSenha().length() == a) {
			caractere = 1;
		}
			
		int tamanhoMin = 6;
		int caracteresFaltando = digito+minusculo+maiusculo+caractere;	
		int senha = Math.max(tamanhoMin - getNovaSenha().length(), caracteresFaltando);
		
		if (senha <= 0) {
			System.out.println("senha é forte");
		}
		else {
			System.out.printf("Faltam %d caracteres para sua senha ser considerada forte.", senha);	
		}			
	}
}



	
