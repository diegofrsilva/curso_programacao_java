package aula6.threads;

public class BarraDeProgresso implements Runnable {

	private Download download;

	public BarraDeProgresso(Download download) {
		this.download = download;
	}

	@Override
	public void run() {
		Object monitor = download.getMonitor();
		synchronized (download.getMonitor()) {
			try {
				monitor.wait();
				System.out.println("Terminou o download: "
						+ download.getNomeArquivo());
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
