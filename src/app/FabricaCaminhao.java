package app;

public class FabricaCaminhao implements FabricaTransporte { // FabricaCaminhão implementa interface de FabricaTransporte
	@Override
	public Transporte criarTransporte() { // puxa método criarTransporte da interface Transporte
		return new Caminhao(); // retorna nova classe Caminhão
	}

}
