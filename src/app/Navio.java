package app;

public class Navio implements Transporte { // implementa interface Transporte
	@Override
	public void entregar() { // puxa m�todo entregar da interface Transporte
		System.out.println("Entregando por navio..."); // mensagem do m�todo
	}

}
