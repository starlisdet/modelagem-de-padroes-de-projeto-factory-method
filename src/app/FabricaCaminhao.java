package app;

public class FabricaCaminhao implements FabricaTransporte { // FabricaCaminh�o implementa interface de FabricaTransporte
	@Override
	public Transporte criarTransporte() { // puxa m�todo criarTransporte da interface Transporte
		return new Caminhao(); // retorna nova classe Caminh�o
	}

}
