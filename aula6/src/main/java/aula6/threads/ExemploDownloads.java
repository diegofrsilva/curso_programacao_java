package aula6.threads;

public class ExemploDownloads {

	public static void main(String[] args) throws InterruptedException {
		Download downloadFilme = new Download("filme.avi", 10);
		Download downloadMusica = new Download("musica.mp3", 5);

		new Thread(new BarraDeProgresso(downloadFilme)).start();
		new Thread(new BarraDeProgresso(downloadMusica)).start();

		new Thread(downloadFilme).start();
		new Thread(downloadMusica).start();
	}
}
