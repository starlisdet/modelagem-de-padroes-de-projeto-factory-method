package app;

public class Caminhao implements Transporte { // classe Caminhão implementa interface Transporte
	@Override
	public void entregar() { // puxa método entregar da interface Transporte
		System.out.println("Entregando por caminhão..."); // mensagem do método
	}

}