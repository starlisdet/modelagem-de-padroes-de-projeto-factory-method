package app;

public class Caminhao implements Transporte { // classe Caminh�o implementa interface Transporte
	@Override
	public void entregar() { // puxa m�todo entregar da interface Transporte
		System.out.println("Entregando por caminh�o..."); // mensagem do m�todo
	}

}