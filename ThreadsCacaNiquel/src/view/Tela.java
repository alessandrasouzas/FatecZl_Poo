package view;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import controller.ThreadNiquel;

public class Tela extends JFrame implements ActionListener {

	JLabel niquel = new JLabel(new ImageIcon(getClass().getResource("niquel.png")));
	JLabel lb1 	= new JLabel();
	JLabel lb2 	= new JLabel();
	JLabel lb3 	= new JLabel();	
	
	JButton btnIniciar = new JButton("Jogar");

	public static void main(String[] args) {
		new Tela();
	}
	
	public Tela() {
		EditJframe();
		EditComponentes();
	}

	private void EditComponentes() {

		btnIniciar.setBounds(335, 430, 90, 40);
		add(btnIniciar);
		
		lb1.setFont(new Font("Tahoma", Font.BOLD, 90));
		lb1.setBounds(200, 176, 142, 201);
		add(lb1);
		
		lb2.setFont(new Font("Tahoma", Font.BOLD, 90));
		lb2.setBounds(350, 176, 142, 201);
		add(lb2);
		
		lb3.setFont(new Font("Tahoma", Font.BOLD, 90));
		lb3.setBounds(510, 176, 142, 201);
		add(lb3);

		add(niquel);
		btnIniciar.addActionListener(this);
	}

	public void EditJframe() {

		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(800, 600);
		setLocationRelativeTo(null);
		setVisible(true);
		setLayout(null);
		niquel.setBounds(110, 60, 541, 353);
	}
	
	public void actionPerformed(ActionEvent arg0) {
		for (int i = 1; i <= 3; i++) {
			ThreadNiquel thread = new ThreadNiquel(i, lb1, lb2, lb3);
			thread.start();

		}
	}
}
