package exercicios.e1;

import java.util.Arrays;

public class Banda {
	private String nome;
	private String[] integrantes;
	public Banda(String nome, String[] integrantes) {
		super();
		this.nome = nome;
		this.integrantes = integrantes;

	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getIntegrantes() {
		String s = "";
		for (int i = 0; i < integrantes.length; i++) {
			s += integrantes[i] + " ";
		}
		return s;
	}
	public void setIntegrantes(String[] integrantes) {
		this.integrantes = integrantes;
	}
	@Override
	public String toString() {
		return "Banda [nome=" + nome + ", integrantes=" + Arrays.toString(integrantes) + "]";
	}

	
	
	

}
