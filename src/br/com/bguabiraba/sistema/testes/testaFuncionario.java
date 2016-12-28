
package br.com.bguabiraba.sistema.testes;

import br.com.bguabiraba.sistema.funcionario.funcionario;


public class testaFuncionario {

	public static void main(String[] args) {
				
		funcionario f = new funcionario();
		
		try {
			f.aumentaSalario(-1000);	
		} catch (Exception e) {
			System.out.println("Houve uma IllegalArgumentException ao aumentar o salario");
		}
		
				
		
		
	}
}
