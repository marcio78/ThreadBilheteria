package controller;

import java.util.concurrent.Semaphore;

public class Thread1 extends Thread {
	
	private int idSistema;
	private static int posCompra;
	private static int posValidacao;
	private int processoTotal;
	
	public Thread1(int idSistema) {
		this.setIdSistema(idSistema);
		
		
	}

	public Thread1(int idSistema2, Semaphore semaforo) {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void run() {
		loginSistema();
		processoCompra();
		validacaoCompra();
		
	}

	private void loginSistema() {
		setProcessoTotal((int) ((Math.random() * 1001) + 1000));
		int processoTotal1 = 0;
		int tempo = 1000;
		int distanciaTotal = 0;
		while (processoTotal1 == distanciaTotal) {
			processoTotal1 += processoTotal1;
			try {
				sleep(tempo);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("#" + idSistema + "já demorou" + processoTotal1 + "m.");
		
		
		}
	}

	private void processoCompra() {
		posCompra++;
		System.out.println("#" + idSistema + "foi a" + posCompra + "o. efetuada");
		
		
	}

	private void validacaoCompra() {
		
		posValidacao++;
		System.out.println("#" + idSistema + "foi a" + posValidacao + "o. efetuada");
		
		
	}

	public int getIdSistema() {
		return idSistema;
	}

	public void setIdSistema(int idSistema) {
		this.idSistema = idSistema;
	}

	public static int getPosCompra() {
		return posCompra;
	}

	public static void setPosCompra(int posCompra) {
		Thread1.posCompra = posCompra;
	}

	public static int getPosValidacao() {
		return posValidacao;
	}

	public static void setPosValidacao(int posValidacao) {
		Thread1.posValidacao = posValidacao;
	}

	public int getProcessoTotal() {
		return processoTotal;
	}

	public void setProcessoTotal(int processoTotal) {
		this.processoTotal = processoTotal;
	}

}
