package view;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.concurrent.Semaphore;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import controller.ThreadCorrida;


public class Tela extends JFrame implements ActionListener
{
	private static final long serialVersionUID = 1L;
	JLabel lFundo = new JLabel(new ImageIcon(getClass().getResource("pista2.png")));
	JLabel l1 = new JLabel(new ImageIcon(getClass().getResource("Y1.png")));
	JLabel l2 = new JLabel(new ImageIcon(getClass().getResource("Y1.png")));
	JLabel l3 = new JLabel(new ImageIcon(getClass().getResource("Y2.png")));
	JLabel l4 = new JLabel(new ImageIcon(getClass().getResource("Y2.png")));
	JLabel l5 = new JLabel(new ImageIcon(getClass().getResource("Y3.png")));
	JLabel l6 = new JLabel(new ImageIcon(getClass().getResource("Y3.png")));
	JLabel l7 = new JLabel(new ImageIcon(getClass().getResource("Y4.png")));
	JLabel l8 = new JLabel(new ImageIcon(getClass().getResource("Y4.png")));
	JLabel l9 = new JLabel(new ImageIcon(getClass().getResource("Y5.png")));
	JLabel l10 = new JLabel(new ImageIcon(getClass().getResource("Y5.png")));
	JLabel l11 = new JLabel(new ImageIcon(getClass().getResource("Y6.png")));
	JLabel l12= new JLabel(new ImageIcon(getClass().getResource("Y6.png")));
	JLabel l13= new JLabel(new ImageIcon(getClass().getResource("Y7.png")));
	JLabel l14= new JLabel(new ImageIcon(getClass().getResource("Y7.png")));
	
	JLabel lbl1= new JLabel("1°");
	JLabel lbl2= new JLabel("2°");
	JLabel lbl3= new JLabel("3°");
	JLabel lbl4= new JLabel("4°");
	JLabel lbl5= new JLabel("5°");
	JLabel lbl6= new JLabel("6°");
	JLabel lbl7= new JLabel("7°");
	JLabel lbl8= new JLabel("8°");
	JLabel lbl9= new JLabel("9°");
	JLabel lbl10= new JLabel("10°");
	JLabel lbl11= new JLabel("11°");
	JLabel lbl12= new JLabel("12°");
	JLabel lbl13= new JLabel("13°");
	JLabel lbl14= new JLabel("14°");
	
	JTextField jt1=new JTextField(55);
	JTextField jt2=new JTextField(55);
	JTextField jt3=new JTextField(55);
	JTextField jt4=new JTextField(55);
	JTextField jt5=new JTextField(55);
	JTextField jt6=new JTextField(55);
	JTextField jt7=new JTextField(55);
	JTextField jt8=new JTextField(55);
	JTextField jt9=new JTextField(55);
	JTextField jt10=new JTextField(55);
	JTextField jt11=new JTextField(55);
	JTextField jt12=new JTextField(55);
	JTextField jt13=new JTextField(55);
	JTextField jt14=new JTextField(55);
	
	
	
	int op=1;
	Semaphore semaforo1 = new Semaphore (5);
	Semaphore semaforoE1 = new Semaphore (1);
	Semaphore semaforoE2 = new Semaphore (1);
	Semaphore semaforoE3 = new Semaphore (1);
	Semaphore semaforoE4 = new Semaphore (1);
	Semaphore semaforoE5 = new Semaphore (1);
	Semaphore semaforoE6 = new Semaphore (1);
	Semaphore semaforoE7 = new Semaphore (1);

	static int posx=0;
	
	JButton jb=new JButton("INICIAR");
	
	
	//CONSTRUTOR DA CLASS
	public Tela()
	{  
		jb.addActionListener(this);
		editarJanela();
		editarComponentes();
	}
	
	public void actionPerformed(ActionEvent e)
	{
		jb.setEnabled(false);
			
		for(op=1;op<=14;op++)
		{
			
			ThreadCorrida thread = new ThreadCorrida(l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14,posx,op,jb,semaforo1,semaforoE1,semaforoE2,semaforoE3,semaforoE4,semaforoE5,semaforoE6,semaforoE7,jt1,jt2,jt3,jt4,jt5,jt6,jt7,jt8,jt9,jt10,jt11,jt12,jt13,jt14);
			thread.start();
		}		
			
		
	}
	
	public void editarJanela()
	{			
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(1200, 640);
		setLocationRelativeTo(null);
		setVisible(true);
		setLayout(null);
	}
	
	public void editarComponentes()
	{
		setLayout(null);
		jb.setBounds(50, 550, 100, 30);
		add(jb);
		
		l1.setBounds(238,540,50,50);
		add(l1);
		l2.setBounds(288,540,50,50);
		add(l2);
		l3.setBounds(338,540,50,50);
		add(l3);
		l4.setBounds(388,540,50,50);
		add(l4);
		l5.setBounds(438,540,50,50);
		add(l5);
		l6.setBounds(488,540,50,50);
		add(l6);
		l7.setBounds(538,540,50,50);
		add(l7);
		l8.setBounds(588,540,50,50);
		add(l8);
		l9.setBounds(638,540,50,50);
		add(l9);
		l10.setBounds(688,540,50,50);
		add(l10);
		l11.setBounds(738,540,50,50);
		add(l11);
		l12.setBounds(788,540,50,50);
		add(l12);
		l13.setBounds(838,540,50,50);
		add(l13);
		l14.setBounds(888,540,50,50);
		add(l14);
		
		
		
		lbl1.setBounds(20,60,50,50);
		add(lbl1);
		lbl2.setBounds(20,90,50,50);
		add(lbl2);
		lbl3.setBounds(20,120,50,50);
		add(lbl3);
		lbl4.setBounds(20,150,50,50);
		add(lbl4);
		lbl5.setBounds(20,180,50,50);
		add(lbl5);
		lbl6.setBounds(20,210,50,50);
		add(lbl6);
		lbl7.setBounds(20,240,50,50);
		add(lbl7);
		lbl8.setBounds(20,270,50,50);
		add(lbl8);
		lbl9.setBounds(20,300,50,50);
		add(lbl9);
		lbl10.setBounds(20,330,50,50);
		add(lbl10);
		lbl11.setBounds(20,360,50,50);
		add(lbl11);
		lbl12.setBounds(20,390,50,50);
		add(lbl12);
		lbl13.setBounds(20,420,50,50);
		add(lbl13);
		lbl14.setBounds(20,450,50,50);
		add(lbl14);
		
		jt1.setBounds(40,75,120,20);
		add(jt1);
		jt2.setBounds(40,105,120,20);
		add(jt2);
		jt3.setBounds(40,135,120,20);
		add(jt3);
		jt4.setBounds(40,165,120,20);
		add(jt4);
		jt5.setBounds(40,195,120,20);
		add(jt5);
		jt6.setBounds(40,225,120,20);
		add(jt6);
		jt7.setBounds(40,255,120,20);
		add(jt7);
		jt8.setBounds(40,285,120,20);
		add(jt8);
		jt9.setBounds(40,315,120,20);
		add(jt9);
		jt10.setBounds(40,345,120,20);
		add(jt10);
		jt11.setBounds(40,375,120,20);
		add(jt11);
		jt12.setBounds(40,405,120,20);
		add(jt12);
		jt13.setBounds(40,435,120,20);
		add(jt13);
		jt14.setBounds(40,465,120,20);
		add(jt14);
		

		
		
		
		
		
		
		lFundo.setBounds(0, 0,1200,600);
		add(lFundo);
		

	}
	

	public static void main(String args[])
	{	
		new Tela();		
	}


}