package app;

public class Logistica {
	public static void main(String[] args) {
		FabricaTransporte fabricaCaminhao = new FabricaCaminhao(); // implementa subclasses de FabricaTransporte
		FabricaTransporte fabricaNavio = new FabricaNavio();
		
		Transporte caminhao = fabricaCaminhao.criarTransporte(); // implementa m�todos de subclasse fabricaCaminhao
		caminhao.entregar();
		
		Transporte navio = fabricaNavio.criarTransporte(); // implementa m�todos de subclasse fabricaNavio
		navio.entregar();
	}

}
