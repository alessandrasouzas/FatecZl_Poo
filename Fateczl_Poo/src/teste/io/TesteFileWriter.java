package teste.io;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class TesteFileWriter {
	public static void main(String[] args) {
		File f = new File("K:/arquivo.txt");
		System.out.println("Pode gravar : \n" + f.canWrite());
		try {
			FileWriter fw = new FileWriter( f );
			fw.write("Antonio");
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("Fim do programa");
	}
}
