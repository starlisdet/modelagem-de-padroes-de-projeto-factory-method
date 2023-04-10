package app;

public class FabricaNavio implements FabricaTransporte { // FabricaNavio implementa FabricaTransporte
	@Override
	public Transporte criarTransporte() { // puxa método criarTransporte da interface Transporte
		return new Navio(); // retorna nova classe Navio
	}

}
