package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.concurrent.Semaphore;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import controller.ThreadCruzamento;

public class Tela extends JFrame implements ActionListener{
	
	private static final long serialVersionUID = 1L;
	JLabel carBlue = new JLabel(new ImageIcon(getClass().getResource("carroblue.png")));
	JLabel carRed = new JLabel(new ImageIcon(getClass().getResource("carrored.png")));
	JLabel carYellow = new JLabel(new ImageIcon(getClass().getResource("carroyellow.png")));
	JLabel carGreen = new JLabel(new ImageIcon(getClass().getResource("carrogreen.png")));
	JLabel rua = new JLabel(new ImageIcon(getClass().getResource("rua.png")));
	JButton btnIniciar = new JButton("Iniciar");
	
	public Tela() {
		
		editJframe();
		editComponentes();
	}

	public void editJframe() {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(800, 800);
		setLocationRelativeTo(null);
		setVisible(true);
		setLayout(null);
		rua.setBounds(0, 0, 800, 800);
	}

	public void editComponentes() {
		btnIniciar.setBounds(60, 60, 90, 30);
		add(btnIniciar);
		
		carBlue.setBounds(365, 740, 34, 70);
		add(carBlue);
		
		carRed.setBounds(400, -5, 36, 70);
		add(carRed);
		
		carYellow.setBounds(-5, 400, 70, 34);
		add(carYellow);
				
		carGreen.setBounds(740, 360, 70, 36);
		add(carGreen);
		
		add(rua);		
		btnIniciar.addActionListener(this);		
	}
		
	public static void main(String[] args) {
		new Tela();
	}
	
	public void actionPerformed(ActionEvent e) {
		int permissoes = 1;		
		Semaphore semaforo = new Semaphore (permissoes);
		for(int idCar = 1; idCar <= 4; idCar++) {
			ThreadCruzamento tCar = new ThreadCruzamento(idCar, semaforo, carBlue, carRed, carYellow, carGreen);
			tCar.start();			
		}
	}

}
