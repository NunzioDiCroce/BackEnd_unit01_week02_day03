package Esercizio1_Package;

// - - - - - - - - - - Thread creation by Runnable interface
public class FirstThread implements Runnable {

	// - - - - - - - - - - attributes definition
	String nome;
	String simbolo;
	int intervallo;

	public FirstThread(String _nome, String _simbolo, int _intervallo) {
		this.nome = _nome;
		this.simbolo = _simbolo;
		this.intervallo = _intervallo;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 10; i++) {
			System.out.println(this.nome + " " + simbolo);
			try {
				Thread.sleep(intervallo);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
