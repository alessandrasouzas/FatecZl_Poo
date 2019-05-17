/*
 Faça um programa que pergunte uma serie de nomes para o usuario e conforme o usuario vai digitando os nomes e teclando enter
 o programa vai gravando estes nomes no arquivo C:/texto.txt.
 O sistema vai pedir para o usuario digitar os nomes ate que ele digite um nome igual a "sair".
 Desafio: Modifique o programa convertendo caracteres lidos "I","Z", "E","A",S, G, T, B, q, O para os numeros 1,2,3,4,5,6,7,8,9,0. 
 E grave no arquivo os numeros ao inves das letras.
 */

package teste.io;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

class Converte_Grava {

	public static void main(String[] args) {
		Converte_Grava cg = new Converte_Grava();
		cg.gravarTexto();
		cg.lerTexto();
	}

	public void gravarTexto() {

		Scanner scan = new Scanner(System.in);
		String nome = "a";
		String novoNome;

		String[] Troca = new String[10];
		Troca[0] = "i";
		Troca[1] = "z";
		Troca[2] = "e";
		Troca[3] = "a";
		Troca[4] = "s";
		Troca[5] = "g";
		Troca[6] = "t";
		Troca[7] = "b";
		Troca[8] = "q";
		Troca[9] = "o";

		System.out.println("Digite seu nome:");

		try {
			//Especifique o caminho
			FileWriter f = new FileWriter("K:/Texto.txt");
			BufferedWriter bf = new BufferedWriter(f);

			while (!nome.equalsIgnoreCase("sair")) {
				nome = scan.nextLine();
				novoNome = nome;

				if (nome.equalsIgnoreCase("sair")) {
					System.out.println("Fim da gravação");
				} else {
					for (int i = 0; i < Troca.length; i++) {
						if (novoNome.contains(Troca[i])) {
							novoNome = novoNome.replace(Troca[i], Integer.toString(i));
						}
					}
					bf.write(novoNome);
					bf.newLine();
				}
			}

			bf.flush();
			bf.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void lerTexto() {
		//Especifique o caminho
		File f = new File("K:/Texto.txt");
		try {
			FileReader fr = new FileReader(f);
			int i = 0;
			while (fr.ready()) {
				i = fr.read();
				System.out.print((char) i);
			}
			fr.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("\nFim da leitura");
	}

}
