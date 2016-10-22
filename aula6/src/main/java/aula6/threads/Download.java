package aula6.threads;

public class Download implements Runnable {

	private Object monitor;
	private String nomeArquivo;
	private int size;

	public Download(String nomeArquivo, int size) {
		this.monitor = new Object();
		this.nomeArquivo = nomeArquivo;
		this.size = size;
	}

	@Override
	public void run() {
		int i = 0;
		while (i < size) {
			System.out.println("Downloading: " + nomeArquivo + " " + i);
			esperar();
			i++;
		}
		synchronized (monitor) {
			monitor.notifyAll();
		}
	}

	private void esperar() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public Object getMonitor() {
		return monitor;
	}

	public String getNomeArquivo() {
		return nomeArquivo;
	}
}
