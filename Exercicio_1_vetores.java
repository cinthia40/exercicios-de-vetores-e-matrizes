package vetores_matrizes;

import java.util.Scanner;

public class Exercicio_1_vetores {

	public static void main(String[] args) {
		int[] vetor = {2,5,1,3,4,9,7,8,10,6};
		
		int x,numero,busca=-1;
		
		Scanner leia = new Scanner (System.in);
	
		
		
		System.out.println("1 - 2 - 3 - 4 - 5 - 6 - 7 - 8 - 9 - 10");
		System.out.println("\nDigite o número que você deseja encontrar: ");
		numero = leia.nextInt();
		
		
		for(x=0;x<10;x++) {
			

			
			if(numero == vetor[x]) {
				busca = x;
			}
					
		
		}
		

		 if (busca == -1){
			 System.out.printf("O número ",numero," não foi encontrado!");
		}
		
		else {
			
			System.out.printf("O número %d está localizado na posição: %d",numero,busca);
		}
		
		

	}

}
