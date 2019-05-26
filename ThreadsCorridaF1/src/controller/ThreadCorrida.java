package controller;

import java.util.Random;
import java.util.concurrent.Semaphore;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class ThreadCorrida extends Thread 
{
	
	private JLabel l1;
	private JLabel l2;
	private JLabel l3;
	private JLabel l4;
	private JLabel l5;
	private JLabel l6;
	private JLabel l7;
	private JLabel l8;
	private JLabel l9;
	private JLabel l10;
	private JLabel l11;
	private JLabel l12;
	private JLabel l13;
	private JLabel l14;
	private int posx,op;
	private JButton jb;
	private Semaphore semaforo1;
	private Semaphore semaforoE1;
	private Semaphore semaforoE2;
	private Semaphore semaforoE3;
	private Semaphore semaforoE4;
	private Semaphore semaforoE5;
	private Semaphore semaforoE6;
	private Semaphore semaforoE7;
	private JTextField jt1;
	private JTextField jt2;
	private JTextField jt3;
	private JTextField jt4;
	private JTextField jt5;
	private JTextField jt6;
	private JTextField jt7;
	private JTextField jt8;
	private JTextField jt9;
	private JTextField jt10;
	private JTextField jt11;
	private JTextField jt12;
	private JTextField jt13;
	private JTextField jt14;
	static int contGeral=0;
	static int v1[]=new int [14];
	static int v2[]=new int [14];
	static int v3[]=new int [14];
	static int mv[]=new int [14];
	static int carro[]=new int [14];
	


	// CONSTRUTOR
	public ThreadCorrida(JLabel l1,JLabel l2,JLabel l3,JLabel l4,JLabel l5,JLabel l6,JLabel l7,JLabel l8,JLabel l9,JLabel l10,JLabel l11,JLabel l12,JLabel l13,JLabel l14,int posx,int op,JButton jb,Semaphore semaforo1,Semaphore semaforoE1,Semaphore semaforoE2,Semaphore semaforoE3,Semaphore semaforoE4,Semaphore semaforoE5,Semaphore semaforoE6,Semaphore semaforoE7,JTextField jt1,JTextField jt2,JTextField jt3,JTextField jt4,JTextField jt5,JTextField jt6,JTextField jt7,JTextField jt8,JTextField jt9,JTextField jt10,JTextField jt11,JTextField jt12,JTextField jt13,JTextField jt14) 
	{
		this.l1 = l1;
		this.l2 = l2;
		this.l3 = l3;
		this.l4 = l4;
		this.l5 = l5;
		this.l6 = l6;
		this.l7 = l7;
		this.l8 = l8;
		this.l9 = l9;
		this.l10 = l10;
		this.l11 = l11;
		this.l12 = l12;
		this.l13 = l13;
		this.l14 = l14;
		this.posx = posx;

		this.op = op;
		this.jb = jb;
		this.semaforo1=semaforo1;
		this.semaforoE1=semaforoE1;
		this.semaforoE2=semaforoE2;
		this.semaforoE3=semaforoE3;
		this.semaforoE4=semaforoE4;
		this.semaforoE5=semaforoE5;
		this.semaforoE6=semaforoE6;
		this.semaforoE7=semaforoE7;
		
		this.jt1=jt1;
		this.jt2=jt2;
		this.jt3=jt3;
		this.jt4=jt4;
		this.jt5=jt5;
		this.jt6=jt6;
		this.jt7=jt7;
		this.jt8=jt8;
		this.jt9=jt9;
		this.jt10=jt10;
		this.jt11=jt11;
		this.jt12=jt12;
		this.jt13=jt13;
		this.jt14=jt14;
		
		
	}

	public void run() 
	{

		try {
			
			if(op==1||op==2)
			{
				semaforoE1.acquire();
			}
			
			if(op==3||op==4)
			{
				semaforoE2.acquire();
			}
			
			if(op==5||op==6)
			{
				semaforoE3.acquire();
			}
			
			if(op==7||op==8)
			{
				semaforoE4.acquire();
			}
			
			if(op==9||op==10)
			{
				semaforoE5.acquire();
			}
			
			if(op==11||op==12)
			{
				semaforoE6.acquire();
			}
			
			if(op==13||op==14)
			{
				semaforoE7.acquire();
			}
			
			semaforo1.acquire();
			carroAndando();
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		} finally {
			
			
			semaforoE1.release();
			semaforoE2.release();
			semaforoE3.release();
			semaforoE4.release();
			semaforoE5.release();
			semaforoE6.release();
			semaforoE7.release();
			semaforo1.release();
	
		}
	}
	
	
	public void carroAndando()
	{

		int contVoltas=0,contAceleracao=0;
		int tempoVolta=0;
		int distFinal = 900;
		
		
		jt1.setText("");
		jt2.setText("");
		jt3.setText("");
		jt4.setText("");
		jt5.setText("");
		jt6.setText("");
		jt7.setText("");
		jt8.setText("");
		jt9.setText("");
		jt10.setText("");
		jt11.setText("");
		jt12.setText("");
		jt13.setText("");
		jt14.setText("");
		
		
		while(contVoltas<3)
		{
			
			int distPercorrida = 0;
			int tempo = 35;
			posx=170;

	
			while (distPercorrida < distFinal) 
			{
				Random gerador = new Random();
				int deslocamento = gerador.nextInt(30);
				
				distPercorrida += deslocamento;
				
				
				if(op==1)
				{
					if(posx==0&& contVoltas==0)
						System.out.println("CARRO "+op+" ENTROU NA PISTA");
					mudancaImagem();
					posx = posx + deslocamento;
					l1.setBounds(posx,10, 50, 50);
					contAceleracao=contAceleracao+1;
				}
				if(op==2)
				{
					if(posx==0&& contVoltas==0)
						System.out.println("CARRO "+op+" ENTROU NA PISTA");
					mudancaImagem();
					posx = posx + deslocamento;
					l2.setBounds(posx,45, 50, 50);
					contAceleracao=contAceleracao+1;
				}
				if(op==3)
				{
					if(posx==0&& contVoltas==0)
						System.out.println("CARRO "+op+" ENTROU NA PISTA");
					mudancaImagem();
					posx = posx + deslocamento;
					l3.setBounds(posx,80, 50, 50);
					contAceleracao=contAceleracao+1;
				}
				if(op==4)
				{
					if(posx==0&& contVoltas==0)
						System.out.println("CARRO "+op+" ENTROU NA PISTA");
					mudancaImagem();
					posx = posx + deslocamento;
					l4.setBounds(posx,115, 50, 50);
					contAceleracao=contAceleracao+1;
				}
				if(op==5)
				{
					if(posx==0&& contVoltas==0)
						System.out.println("CARRO "+op+" ENTROU NA PISTA");
					mudancaImagem();
					posx = posx + deslocamento;
					l5.setBounds(posx,150, 50, 50);
					contAceleracao=contAceleracao+1;
				}
				if(op==6)
				{
					if(posx==0&& contVoltas==0)
						System.out.println("CARRO "+op+" ENTROU NA PISTA");
					mudancaImagem();
					posx = posx + deslocamento;
					l6.setBounds(posx,185,50, 50);
					contAceleracao=contAceleracao+1;
				}
				if(op==7)
				{
					if(posx==0&& contVoltas==0)
						System.out.println("CARRO "+op+" ENTROU NA PISTA");
					mudancaImagem();
					posx = posx + deslocamento;
					l7.setBounds(posx,220,50, 50);
					contAceleracao=contAceleracao+1;
				}
				if(op==8)
				{
					if(posx==0&& contVoltas==0)
						System.out.println("CARRO "+op+" ENTROU NA PISTA");
					mudancaImagem();
					posx = posx + deslocamento;
					l8.setBounds(posx,255,50, 50);
					contAceleracao=contAceleracao+1;
				}
				if(op==9)
				{
					if(posx==0&& contVoltas==0)
						System.out.println("CARRO "+op+" ENTROU NA PISTA");
					mudancaImagem();
					posx = posx + deslocamento;
					l9.setBounds(posx,290,50, 50);
					contAceleracao=contAceleracao+1;
				}
				if(op==10)
				{
					if(posx==0&& contVoltas==0)
						System.out.println("CARRO "+op+" ENTROU NA PISTA");
					mudancaImagem();
					posx = posx + deslocamento;
					l10.setBounds(posx,325,50, 50);
					contAceleracao=contAceleracao+1;
				}
				if(op==11)
				{
					if(posx==0&& contVoltas==0)
						System.out.println("CARRO "+op+" ENTROU NA PISTA");
					mudancaImagem();
					posx = posx + deslocamento;
					l11.setBounds(posx,360,50, 50);
					contAceleracao=contAceleracao+1;
				}
				if(op==12)
				{
					if(posx==0&& contVoltas==0)
						System.out.println("CARRO "+op+" ENTROU NA PISTA");
					mudancaImagem();
					posx = posx + deslocamento;
					l12.setBounds(posx,395,50, 50);
					contAceleracao=contAceleracao+1;
				}
				if(op==13)
				{
					if(posx==0&& contVoltas==0)
						System.out.println("CARRO "+op+" ENTROU NA PISTA");
					mudancaImagem();
					posx = posx + deslocamento;
					l13.setBounds(posx,430,50, 50);
					contAceleracao=contAceleracao+1;
				}
				if(op==14)
				{
					if(posx==0&& contVoltas==0)
						System.out.println("CARRO "+op+" ENTROU NA PISTA");
					mudancaImagem();
					posx = posx + deslocamento;
					l14.setBounds(posx,465,50, 50);
					contAceleracao=contAceleracao+1;
				}

				try {Thread.sleep(tempo);} catch (Exception e) {}
			}
			contVoltas=contVoltas+1;
			tempoVolta=(contAceleracao*tempo);
			
			
			//MELHOR TEMPO DAS 3 VOLTAS DE CADA CARRO
			
			if(op==1)
			{
				carro[0]=1;
				if(contVoltas==1)
					v1[0]=tempoVolta;
				if(contVoltas==2)
					v2[0]=tempoVolta;
				if(contVoltas==3)
				{
					v3[0]=tempoVolta;
					if(v1[0]<v2[0])
						mv[0]=v1[0];
					else
						mv[0]=v2[0];
					if(v3[0]<mv[0])
						mv[0]=v3[0];	
				}
			}
			
			if(op==2)
			{
				carro[1]=2;
				if(contVoltas==1)
					v1[1]=tempoVolta;
				if(contVoltas==2)
					v2[1]=tempoVolta;
				if(contVoltas==3)
				{
					v3[1]=tempoVolta;
					if(v1[1]<v2[1])
						mv[1]=v1[1];
					else
						mv[1]=v2[1];
					if(v3[1]<mv[1])
						mv[1]=v3[1];	
				}
			}
			
			if(op==3)
			{
				carro[2]=3;
				if(contVoltas==1)
					v1[2]=tempoVolta;
				if(contVoltas==2)
					v2[2]=tempoVolta;
				if(contVoltas==3)
				{
					v3[2]=tempoVolta;
					if(v1[2]<v2[2])
						mv[2]=v1[2];
					else
						mv[2]=v2[2];
					if(v3[2]<mv[2])
						mv[2]=v3[2];	
				}
			}
			
			if(op==4)
			{
				carro[3]=4;
				if(contVoltas==1)
					v1[3]=tempoVolta;
				if(contVoltas==2)
					v2[3]=tempoVolta;
				if(contVoltas==3)
				{
					v3[3]=tempoVolta;
					if(v1[3]<v2[3])
						mv[3]=v1[3];
					else
						mv[3]=v2[3];
					if(v3[3]<mv[3])
						mv[3]=v3[3];	
				}
			}
			
			if(op==5)
			{
				carro[4]=5;
				if(contVoltas==1)
					v1[4]=tempoVolta;
				if(contVoltas==2)
					v2[4]=tempoVolta;
				if(contVoltas==3)
				{
					v3[4]=tempoVolta;
					if(v1[4]<v2[4])
						mv[4]=v1[4];
					else
						mv[4]=v2[4];
					if(v3[4]<mv[4])
						mv[4]=v3[4];	
				}
			}
			
			if(op==6)
			{
				carro[5]=6;
				if(contVoltas==1)
					v1[5]=tempoVolta;
				if(contVoltas==2)
					v2[5]=tempoVolta;
				if(contVoltas==3)
				{
					v3[5]=tempoVolta;
					if(v1[5]<v2[5])
						mv[5]=v1[5];
					else
						mv[5]=v2[5];
					if(v3[5]<mv[5])
						mv[5]=v3[5];	
				}
			}
			
			if(op==7)
			{
				carro[6]=7;
				if(contVoltas==1)
					v1[6]=tempoVolta;
				if(contVoltas==2)
					v2[6]=tempoVolta;
				if(contVoltas==3)
				{
					v3[6]=tempoVolta;
					if(v1[6]<v2[6])
						mv[6]=v1[6];
					else
						mv[6]=v2[6];
					if(v3[6]<mv[6])
						mv[6]=v3[6];	
				}
			}
			
			if(op==8)
			{
				carro[7]=8;
				if(contVoltas==1)
					v1[7]=tempoVolta;
				if(contVoltas==2)
					v2[7]=tempoVolta;
				if(contVoltas==3)
				{
					v3[7]=tempoVolta;
					if(v1[7]<v2[7])
						mv[7]=v1[7];
					else
						mv[7]=v2[7];
					if(v3[7]<mv[7])
						mv[7]=v3[7];	
				}
			}
			
			if(op==9)
			{
				carro[8]=9;
				if(contVoltas==1)
					v1[8]=tempoVolta;
				if(contVoltas==2)
					v2[8]=tempoVolta;
				if(contVoltas==3)
				{
					v3[8]=tempoVolta;
					if(v1[8]<v2[8])
						mv[8]=v1[8];
					else
						mv[8]=v2[8];
					if(v3[8]<mv[8])
						mv[8]=v3[8];	
				}
			}
			
			if(op==10)
			{
				carro[9]=10;
				if(contVoltas==1)
					v1[9]=tempoVolta;
				if(contVoltas==2)
					v2[9]=tempoVolta;
				if(contVoltas==3)
				{
					v3[9]=tempoVolta;
					if(v1[9]<v2[9])
						mv[9]=v1[9];
					else
						mv[9]=v2[9];
					if(v3[9]<mv[9])
						mv[9]=v3[9];	
				}
			}
			
			if(op==11)
			{
				carro[10]=11;
				if(contVoltas==1)
					v1[10]=tempoVolta;
				if(contVoltas==2)
					v2[10]=tempoVolta;
				if(contVoltas==3)
				{
					v3[10]=tempoVolta;
					if(v1[10]<v2[10])
						mv[10]=v1[10];
					else
						mv[10]=v2[10];
					if(v3[10]<mv[10])
						mv[10]=v3[10];	
				}
			}
			
			if(op==12)
			{
				carro[11]=12;
				if(contVoltas==1)
					v1[11]=tempoVolta;
				if(contVoltas==2)
					v2[11]=tempoVolta;
				if(contVoltas==3)
				{
					v3[11]=tempoVolta;
					if(v1[11]<v2[11])
						mv[11]=v1[11];
					else
						mv[11]=v2[11];
					if(v3[11]<mv[11])
						mv[11]=v3[11];	
				}
			}
			
			if(op==13)
			{
				carro[12]=13;
				if(contVoltas==1)
					v1[12]=tempoVolta;
				if(contVoltas==2)
					v2[12]=tempoVolta;
				if(contVoltas==3)
				{
					v3[12]=tempoVolta;
					if(v1[12]<v2[12])
						mv[12]=v1[12];
					else
						mv[12]=v2[12];
					if(v3[12]<mv[12])
						mv[12]=v3[12];	
				}
			}
			
			if(op==14)
			{
				carro[13]=14;
				if(contVoltas==1)
					v1[13]=tempoVolta;
				if(contVoltas==2)
					v2[13]=tempoVolta;
				if(contVoltas==3)
				{
					v3[13]=tempoVolta;
					if(v1[13]<v2[13])
						mv[13]=v1[13];
					else
						mv[13]=v2[13];
					if(v3[13]<mv[13])
						mv[13]=v3[13];	
				}
			}
				
				
				
				System.out.println("carro# "+op+" Volta# 0"+contVoltas+" Tempo# "+ tempoVolta );			
				tempoVolta=0;
				contAceleracao=0;
				if(contVoltas==3)
				{
					System.out.println("CARRO "+op+" SAIU DA PISTA E SUA MELHOR VOLTA TEVE O TEMPO DE: "+mv[op-1]);
					contGeral=contGeral+1;
				}
		}
		posicaoFinal();
		
		if(contGeral==14)
		{
			System.out.println("----------------------------------------------------------");
			for(int i=0;i<14;i++)
			{
				System.out.println("A MELHOR VOLTA DO CARRO 0"+carro[i]+"  FOI DE "+mv[i]+" MILESEGUNDOS");
				
				
			}
			System.out.println("----------------------------------------------------------");
			
			
	        int i,j,aux1,aux2;
	        for (i=0; i<=12;i++)
	        {
	            for(j=i+1;j<=13;j++)
	            {
	                if( mv[i]>mv[j])
	                {
	                    aux1=mv[i];
	                    aux2=carro[i];
	                  
	                    mv[i]=mv[j];
	                    carro[i]=carro[j];
	                    
	                    mv[j]=aux1;
	                    carro[j]=aux2;
	                 }
	             }
	         }
	        
			System.out.println("----------------------------------------------------------");
			for(i=0;i<14;i++)
			{
				System.out.println(i+1+ "° COLOCADO ,CARRO = " +carro[i]+"  COMO TEMPO DE : "+mv[i]+" MILESEGUNDOS");
				
				
			}
			System.out.println("----------------------------------------------------------");
			
			
			System.out.println("----------------------------------------------------------");
			for(i=0;i<14;i++)
			{
				System.out.println(i+1+ "° COLOCADO ,CARRO = " +carro[i]+"  COMO TEMPO DE : "+mv[i]+" MILESEGUNDOS");
				
				
			}
			System.out.println("----------------------------------------------------------");
			
			String a1,a2,a3,a4,a5,a6,a7,a8,a9,a10,a11,a12,a13,a14;
			a1= Integer.toString(carro[0]);
			a2= Integer.toString(carro[1]);
			a3= Integer.toString(carro[2]);
			a4= Integer.toString(carro[3]);
			a5= Integer.toString(carro[4]);
			a6= Integer.toString(carro[5]);
			a7= Integer.toString(carro[6]);
			a8= Integer.toString(carro[7]);
			a9= Integer.toString(carro[8]);
			a10= Integer.toString(carro[9]);
			a11= Integer.toString(carro[10]);
			a12= Integer.toString(carro[11]);
			a13= Integer.toString(carro[12]);
			a14= Integer.toString(carro[13]);
			jt1.setText("CARRO "+a1);
			jt2.setText("CARRO "+a2);
			jt3.setText("CARRO "+a3);
			jt4.setText("CARRO "+a4);
			jt5.setText("CARRO "+a5);
			jt6.setText("CARRO "+a6);
			jt7.setText("CARRO "+a7);
			jt8.setText("CARRO "+a8);
			jt9.setText("CARRO "+a9);
			jt10.setText("CARRO "+a10);
			jt11.setText("CARRO "+a11);
			jt12.setText("CARRO "+a12);
			jt13.setText("CARRO "+a13);
			jt14.setText("CARRO "+a14);
			
			jb.setEnabled(true);
			contGeral=0;
   
		}

	
	}

	public void mudancaImagem()
	{
		if(op==1)
			l1.setIcon(new ImageIcon(getClass().getResource("X1.png")));
		if(op==2)
			l2.setIcon(new ImageIcon(getClass().getResource("X1.png")));
		if(op==3)
			l3.setIcon(new ImageIcon(getClass().getResource("X2.png")));
		if(op==4)
			l4.setIcon(new ImageIcon(getClass().getResource("X2.png")));
		if(op==5)
			l5.setIcon(new ImageIcon(getClass().getResource("X3.png")));
		if(op==6)
			l6.setIcon(new ImageIcon(getClass().getResource("X3.png")));
		if(op==7)
			l7.setIcon(new ImageIcon(getClass().getResource("X4.png")));
		if(op==8)
			l8.setIcon(new ImageIcon(getClass().getResource("X4.png")));
		if(op==9)
			l9.setIcon(new ImageIcon(getClass().getResource("X5.png")));
		if(op==10)
			l10.setIcon(new ImageIcon(getClass().getResource("X5.png")));
		if(op==11)
			l11.setIcon(new ImageIcon(getClass().getResource("X6.png")));
		if(op==12)
			l12.setIcon(new ImageIcon(getClass().getResource("X6.png")));
		if(op==13)
			l13.setIcon(new ImageIcon(getClass().getResource("X7.png")));
		if(op==14)
			l14.setIcon(new ImageIcon(getClass().getResource("X7.png")));
	}
	

	
	
	public void posicaoFinal()
	{
		
		{
			l1.setIcon(new ImageIcon(getClass().getResource("Y1.png")));
			l1.setBounds(238,540,50,50);;
		}
		if(op==2)
		{
			l2.setIcon(new ImageIcon(getClass().getResource("Y1.png")));
			l2.setBounds(288,540,50,50);
		}
		if(op==3)
		{
			l3.setIcon(new ImageIcon(getClass().getResource("Y2.png")));
			l3.setBounds(338,540,50,50);
		}
		if(op==4)
		{
			l4.setIcon(new ImageIcon(getClass().getResource("Y2.png")));
			l4.setBounds(388,540,50,50);
		}
		if(op==5)
		{
			l5.setIcon(new ImageIcon(getClass().getResource("Y3.png")));
			l5.setBounds(438,540,50,50);
		}
		if(op==6)
		{
			l6.setIcon(new ImageIcon(getClass().getResource("Y3.png")));
			l6.setBounds(488,540,50,50);
		}
		if(op==7)
		{
			l7.setIcon(new ImageIcon(getClass().getResource("Y4.png")));
			l7.setBounds(538,540,50,50);
		}
		if(op==8)
		{
			l8.setIcon(new ImageIcon(getClass().getResource("Y4.png")));
			l8.setBounds(588,540,50,50);
		}
		if(op==9)
		{
			l9.setIcon(new ImageIcon(getClass().getResource("Y5.png")));
			l9.setBounds(638,540,50,50);
		}
		if(op==10)
		{
			l10.setIcon(new ImageIcon(getClass().getResource("Y5.png")));
			l10.setBounds(688,540,50,50);
		}
		if(op==11)
		{
			l11.setIcon(new ImageIcon(getClass().getResource("Y6.png")));
			l11.setBounds(738,540,50,50);
		}
		if(op==12)
		{
			l12.setIcon(new ImageIcon(getClass().getResource("Y6.png")));
			l12.setBounds(788,540,50,50);
		}
		if(op==13)
		{
			l13.setIcon(new ImageIcon(getClass().getResource("Y7.png")));
			l13.setBounds(838,540,50,50);
		}
		if(op==14)
		{
			l14.setIcon(new ImageIcon(getClass().getResource("Y7.png")));
			l14.setBounds(888,540,50,50);
		}

	
	}
}
