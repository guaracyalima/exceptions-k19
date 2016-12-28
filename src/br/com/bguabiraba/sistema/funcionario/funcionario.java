package br.com.bguabiraba.sistema.funcionario;

public class funcionario {
	private double salario;
	private String nome;
	
	/**
	 * gera��o automatica do toString() -
	 * classe que gera as "defini��es" das variaveis de forma 
	 * automatica
	 * * */  
	public String toString() {
		return "funcionario [salario=" + salario + ", nome=" + nome + "]";
	}
	
	/*
	 * Gerador de metodo de comporta��o automatico 
	 * */
	
	
	
	

	public void aumentaSalario (double aumento){
		if(aumento < 0){
			IllegalArgumentException erro = new IllegalArgumentException();
			throw erro;
		}
	}
	
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		long temp;
		temp = Double.doubleToLongBits(salario);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		funcionario other = (funcionario) obj;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (Double.doubleToLongBits(salario) != Double
				.doubleToLongBits(other.salario))
			return false;
		return true;
	}
	
	

	public double getSalario() {
		return salario;
	}
	
	public void setSalario(double salario) {
		this.salario = salario;
	}
}
