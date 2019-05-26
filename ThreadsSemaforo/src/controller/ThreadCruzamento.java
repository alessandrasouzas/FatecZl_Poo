package controller;

import java.util.concurrent.Semaphore;

import javax.swing.JLabel;

public class ThreadCruzamento extends Thread {

	private int idCar;
	private Semaphore semaforo;
	private JLabel carBlue;
	private JLabel carRed;
	private JLabel carYellow;
	private JLabel carGreen;

	int posicaoBlue = 740;
	int posicaoRed = -5;
	int posicaoYellow = -5;
	int posicaoGreen = 740;

	private static int posChegada = 0;
	private static int posSaida = 0;
	private String nome;

	public ThreadCruzamento(int idCar, Semaphore semaforo, JLabel carBlue, JLabel carRed, JLabel carYellow,
			JLabel carGreen) {

		this.idCar = idCar;
		this.semaforo = semaforo;
		this.carBlue = carBlue;
		this.carRed = carRed;
		this.carYellow = carYellow;
		this.carGreen = carGreen;
	}

	public void run() {

		carroAnda();	
		try {
			semaforo.acquire();
			carroSai();
			
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		} finally {
			semaforo.release();
		}

	}

	public void carroAnda() {
		int distFinal = 288;
		int deslocamento;
		int distPercorrida = 0;
		int tempo = 40;
		

		while (distPercorrida < distFinal) {
			deslocamento = (int) (Math.random() * 8) + 10;
			distPercorrida += deslocamento;

			try {
				Thread.sleep(tempo);

			} catch (Exception e) {
			}

			switch (idCar) {

			case 1:
				nome = "Carro Azul";
				posicaoBlue -= deslocamento;
				carBlue.setBounds(365, posicaoBlue, 34, 70);
				break;

			case 2:
				nome = "Carro Vermelho";
				posicaoRed += deslocamento;
				carRed.setBounds(400, posicaoRed, 34, 70);
				break;

			case 3:
				nome = "Carro Amarelo";
				posicaoYellow += deslocamento;
				carYellow.setBounds(posicaoYellow, 400, 70, 34);
				break;

			case 4:
				nome = "Carro Verde";
				posicaoGreen -= deslocamento;
				carGreen.setBounds(posicaoGreen, 360, 70, 34);
				break;
			default:
				break;
			}

		}
		posChegada++;
		System.out.println("O " + nome + " foi o " + posChegada + "º a chegar.");

	}

	public void carroSai() {
		
		int distFinal = 550;
		int distPercorrida = 0;
		int tempo = 30;

		while (distPercorrida < distFinal) {
			int deslocamento = (int) (Math.random() * 8) + 10;
			distPercorrida += deslocamento;

			try {
				Thread.sleep(tempo);

			} catch (Exception e) {
			}

			switch (idCar) {

			case 1:
				posicaoBlue -= deslocamento;
				carBlue.setBounds(365, posicaoBlue, 34, 70);
				break;

			case 2:
				posicaoRed += deslocamento;
				carRed.setBounds(400, posicaoRed, 34, 70);
				break;

			case 3:
				posicaoYellow += deslocamento;
				carYellow.setBounds(posicaoYellow, 400, 70, 34);
				break;

			case 4:
				posicaoGreen -= deslocamento;
				carGreen.setBounds(posicaoGreen, 360, 70, 34);
				break;
			default:
				break;
			}

		}
		posSaida++;
		System.out.println("O " + nome + " foi o " + posSaida + "º a sair");

	}
}
