package controller;

import javax.swing.JLabel;

public class ThreadCorridaSapo extends Thread {

	private int i;
	private JLabel lSapoVerde;
	private JLabel lSapoAzul;
	private JLabel lSapoRoxo;
	private JLabel lSapoAmarelo;
	private JLabel lSapoMarrom;

	private int pulo = 0; // pulo do sapo em cm
	private int pulos = 0; // qnt pulos dados na corrida
	private static int colocacao = 0; // colocação do sapo ao final da corrida
	private final static int pulo_Maximo = 50; // pulo max em cm que um sapo pode dar
	private int distanciaTotalCorrida = 1100;
	private int distCorrida = 0;

	// CONSTRUTOR
	public ThreadCorridaSapo(int i, JLabel lSapoAmarelo, JLabel lSapoAzul, JLabel lSapoVerde, JLabel lSapoRoxo,
			JLabel lSapoMarrom) {

		this.i = i;
		this.lSapoAmarelo = lSapoAmarelo;
		this.lSapoAzul = lSapoAzul;
		this.lSapoVerde = lSapoVerde;
		this.lSapoRoxo = lSapoRoxo;
		this.lSapoMarrom = lSapoMarrom;
	}

	public void run() {
		sapoPulando();

		try {
			Thread.sleep(2000);
		} catch (Exception e) {}

		colocacao++;
		System.out.println("\nSapo #" + i + " foi o " + colocacao + " a chegar com " + pulos + " pulos");

	}

	public void sapoPulando() {
		while (distCorrida < distanciaTotalCorrida) {
			pulos++;
			pulo = (int) (Math.random() * pulo_Maximo);
			distCorrida += pulo;

			try {
				sleep(150);
			} catch (InterruptedException e) {
			}

			switch (i) {
			case 1:
				lSapoAmarelo.setBounds(distCorrida, 50, 144, 83);
				System.out.println("Sapo Amarelo pulou " + pulo + "cm e já percorreu " + distCorrida + " cm");
				break;
			case 2:
				lSapoAzul.setBounds(distCorrida, 150, 144, 83);
				System.out.println("Sapo Azul pulou " + pulo + "cm e já percorreu " + distCorrida + " cm");
				break;
			case 3:
				lSapoVerde.setBounds(distCorrida, 250, 144, 83);
				System.out.println("Sapo Verde pulou " + pulo + "cm e já percorreu " + distCorrida + " cm");
				break;
			case 4:
				lSapoRoxo.setBounds(distCorrida, 350, 144, 83);
				System.out.println("Sapo Roxo pulou " + pulo + "cm e já percorreu " + distCorrida + " cm");
				break;
			case 5:
				lSapoMarrom.setBounds(distCorrida, 450, 144, 83);
				System.out.println("Sapo Marrom pulou " + pulo + "cm e já percorreu " + distCorrida + " cm");
				break;
			default:
				break;
			}

		}

	}

}
