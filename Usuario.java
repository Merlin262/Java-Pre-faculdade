package arrays;

public class Usuario {
	
	String nome;
	String email;
	
	public boolean equals(Object objeto) {
		
		if(objeto instanceof Usuario) {
		Usuario outro = (Usuario) objeto;
		
		boolean nomeIgaul = outro.nome.equals(this.nome);
		boolean emailIgaul = outro.nome.equals(this.email);
		
		return nomeIgaul && emailIgaul;
	}else{
		return false;
	}
}

}
