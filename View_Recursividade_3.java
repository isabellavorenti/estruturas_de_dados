package estrutura_de_dados;

import javax.swing.JOptionPane;

public class View_Recursividade_3 
{
	public static void main(String[] args) 
	{
	
		Recursividade_3 funcao = new Recursividade_3();
		
		int n = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro até 12: "));
		
		while (n > 12) 
		{
			n = Integer.parseInt(JOptionPane.showInputDialog("Valor excedeu o limite de entrada! Digite novamente: "));
		}
		
		int resultado = funcao.fatorial(n);
		System.out.println(resultado);
		
	}

}
