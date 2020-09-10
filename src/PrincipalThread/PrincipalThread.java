package PrincipalThread;

import MetodosThread.ThreadVetor;

public class PrincipalThread {

	public static void main(String[] args) {
		int num1 = 1;
		int num2 = 2;
		int[] vet = new int[1000];
		
		for (int i = 0; i < vet.length; i++) {
			int num = (int) (1 + Math.random() * 100);
			vet[i] = num;				
		}
		
		
		Thread tem1 = new ThreadVetor(num1, vet);
		tem1.start();
		Thread tem2 = new ThreadVetor(num2, vet);
		tem2.start();
		
				
	}

}
