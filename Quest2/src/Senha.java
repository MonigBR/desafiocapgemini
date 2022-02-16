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

	public void diferenca(String Senha ) {

		int x=0;
		int y=0;
		int z=0;		
		int digito=0; 
		int maiusculo=0;
		int minusculo=0;
		
		for (int i = 0; i < this.getNovaSenha().length();i++) {					
			
			if (Character.isDigit(this.getNovaSenha().charAt(i))){
				x += 0;
			}
			else {
				x += 1;
			}
											
			if (Character.isUpperCase(this.getNovaSenha().charAt(i))){
				y += 0;
			}
			else {
				y += 1;
			}
			
			if (Character.isLowerCase(this.getNovaSenha().charAt(i))){					
				z += 0;
			}
			else {
				z += 1;
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
		
		int tamanhomin = 6;
		int caracteresFal = digito+minusculo+maiusculo;	
		int newsenha = Math.max(tamanhomin - getNovaSenha().length(), caracteresFal);
		
		if (newsenha <= 0) {
			System.out.println("senha é forte");
		}
		else {
			System.out.printf("Faltam %d caracteres para sua senha ser forte.", newsenha);	
		}			
	}
}



	
