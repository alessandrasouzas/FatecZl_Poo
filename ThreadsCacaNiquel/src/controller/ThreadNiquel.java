package controller;

import javax.swing.JLabel;

public class ThreadNiquel extends Thread {

	private int i;
	private JLabel lb1;
	private JLabel lb2;
	private JLabel lb3;

	public ThreadNiquel(int i, JLabel lb1, JLabel lb2, JLabel lb3) {
		this.i = i;
		this.lb1 = lb1;
		this.lb2 = lb2;
		this.lb3 = lb3;
	}

	public void run() {
		valendo();
	}

	public void valendo() {
		int contador = 0;
		int giro = (int) (Math.random() * 151) + 0;
		
		while (contador < giro) {
			int a = (int) (Math.random() * 7) + 1;

			switch (i) {
			case 1:
				lb1.setText(String.valueOf(a));
				break;
			case 2:
				lb2.setText(String.valueOf(a));
				break;
			case 3:
				lb3.setText(String.valueOf(a));
				break;
			default:
				break;

			}

			try {
				Thread.sleep(10);

			} catch (Exception e) {}

			contador ++;
		}

	}
}
