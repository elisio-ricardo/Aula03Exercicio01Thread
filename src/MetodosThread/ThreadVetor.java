package MetodosThread;

public class ThreadVetor extends Thread {

	private int num;
	private int[] vet;

	public ThreadVetor(int num, int[] vet) {
		this.num = num;
		this.vet = vet;
	}

	@Override
	public void run() {
		tempofor();
		tempoforeach();
	}

	private void tempofor() {
		if (num == 1) {
			double tempoInicial = System.nanoTime();
			for (int i = 0; i < vet.length; i++) {
			}
			double tempoFinal = System.nanoTime();
			double tempoTotal = tempoFinal - tempoInicial;
			// tempoTotal ns = 10^-9 s
			tempoTotal = tempoTotal / Math.pow(10, 9);
			System.out.println("TID # " + getId() + " ==> Tempo for " + tempoTotal);
		}
	}
	private void tempoforeach() {
		if (num == 2) {
			double tempoInicial = System.nanoTime();
			for (int numero : vet) {
			}
			double tempoFinal = System.nanoTime();
			double tempoTotal = tempoFinal - tempoInicial;
			// tempoTotal ns = 10^-9 s
			tempoTotal = tempoTotal / Math.pow(10, 9);
			System.out.println("TID # " + getId() + " ==> Tempo ForEach " + tempoTotal);
			;
		}
	}
}
