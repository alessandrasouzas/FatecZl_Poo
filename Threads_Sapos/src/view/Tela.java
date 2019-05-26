package view;

import controller.ThreadCorridaSapo;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Tela extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;

	JLabel lLagoa = new JLabel(new ImageIcon(getClass().getResource("lagoa.jpg")));
	JButton btnIniciar = new JButton("Ready ?");

	JLabel lBandeira = new JLabel(new ImageIcon(getClass().getResource("bandeirada.png")));
	JLabel lSapoVerde = new JLabel(new ImageIcon(getClass().getResource("verde.png")));
	JLabel lSapoAzul = new JLabel(new ImageIcon(getClass().getResource("azul.png")));
	JLabel lSapoRoxo = new JLabel(new ImageIcon(getClass().getResource("roxo.png")));
	JLabel lSapoAmarelo = new JLabel(new ImageIcon(getClass().getResource("amarelo.png")));
	JLabel lSapoMarrom = new JLabel(new ImageIcon(getClass().getResource("marrom.png")));

	public Tela() {
		EditJframe();
		EditComponentes();
	}

	public void EditJframe() {

		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(1290, 650);
		setLocationRelativeTo(null);
		setVisible(true);
		setLayout(null);
		lLagoa.setBounds(0, -200, 1290, 800);
	}

	public void EditComponentes() {

		lSapoAmarelo.setBounds(0, 50, 144, 83);
		add(lSapoAmarelo);

		lSapoAzul.setBounds(0, 150, 144, 83);
		add(lSapoAzul);

		lSapoVerde.setBounds(0, 250, 144, 83);
		add(lSapoVerde);

		lSapoRoxo.setBounds(0, 350, 144, 83);
		add(lSapoRoxo);

		lSapoMarrom.setBounds(0, 450, 144, 83);
		add(lSapoMarrom);

		lBandeira.setBounds(1180, 500, 112, 96);
		add(lBandeira);

		btnIniciar.setBounds(580, 550, 89, 23);
		add(btnIniciar);

		add(lLagoa);

		btnIniciar.addActionListener(this);
	}

	public static void main(String[] args) {
		new Tela();
	}

	public void actionPerformed(ActionEvent e) {
		/* colocando sapos na corrida */
		btnIniciar.setText("GO !");
		for (int i = 1; i <= 5; i++) {
			ThreadCorridaSapo thread = new ThreadCorridaSapo(i, lSapoAmarelo, lSapoAzul, lSapoVerde, lSapoRoxo,
					lSapoMarrom);
			thread.start();
		}
		// btnIniciar.setEnabled(false);
	}

}