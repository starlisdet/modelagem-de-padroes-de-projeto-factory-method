package app;

public class Logistica {
	public static void main(String[] args) {
		FabricaTransporte fabricaCaminhao = new FabricaCaminhao(); // implementa subclasses de FabricaTransporte
		FabricaTransporte fabricaNavio = new FabricaNavio();
		
		Transporte caminhao = fabricaCaminhao.criarTransporte(); // implementa métodos de subclasse fabricaCaminhao
		caminhao.entregar();
		
		Transporte navio = fabricaNavio.criarTransporte(); // implementa métodos de subclasse fabricaNavio
		navio.entregar();
	}

}
