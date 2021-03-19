package view;

import java.util.concurrent.Semaphore;
import controller.Thread1;

public class Thread2 {

	public static void main(String[] args) {
		
		int permissoes = 3;
		Semaphore semaforo = new Semaphore(permissoes);
		for (int idSistema = 0; idSistema < 299; idSistema++) {
			Thread Thread1 = new Thread1(idSistema, semaforo);
			
			Thread1.start();
		}
		

	}

}
