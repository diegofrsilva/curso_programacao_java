package aula6.io;

import java.io.File;
import java.io.IOException;

public class ExemploFile {
	
	public static void main(String[] args) throws IOException {
		File file = new File("/home/java01/novoArquivo.txt");
		file.createNewFile();
	}
}
