package br.com.executavel;

public class JavaThread  implements Runnable{
	
	
	private String nome;
	private int tempo;
	
	public JavaThread(String nome, int tempo) {
		this.nome = nome;
		this.tempo = tempo;
		new Thread(this, nome).start();
		
	}

	@Override
	public void run() {
		
		try {
		for (int i = 0; i < 6; i++) {
			System.out.println(nome + " contador " + i);
			Thread.sleep(tempo);
		}
		}catch (InterruptedException e) {

			e.printStackTrace();
		}
		System.out.println(nome + " terminou a execução");
	}	
	

	public static void main(String[] args) {
		JavaThread num = new JavaThread("#1", 1500);
		JavaThread num2 = new JavaThread("#2", 2800);
		
		
	}
}


