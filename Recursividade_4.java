package estrutura_de_dados;

public class Recursividade_4 
{
	public Recursividade_4 ()
	{
		super();
	}
	
	public int Contador(int[] vetor, int i, int n)
	{
		
		//Quando i for do tamanho do vetor, deve retornar n (número de vezes em que aparece um número negativo).
		if(i == 8)
		{
			return n;
		}
		
		// Se o conteúdo do vetor[i] for negativo, n soma 1.
		else if (vetor[i] < 0)
		{
			n = (n + 1); 
		}
		
		return Contador(vetor, i + 1, n);
		
	}
}
