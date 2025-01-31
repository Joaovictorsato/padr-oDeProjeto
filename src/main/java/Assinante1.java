
import java.util.Observable;
import java.util.Observer;

class Assinante1 implements Observer {
	
	
	int edicaoNovaRevista;
	
	public Assinante1(Observable revistaInformatica) {
		revistaInformatica.addObserver(this);
	}
	
	@Override
	public void update(Observable revistaInfSubject, Object arg1) {
		if (revistaInfSubject instanceof RevistaInformatica revistaInformatica) {
			edicaoNovaRevista = revistaInformatica.getEdicao();
			System.out.println("Atenção, já chegou a mais uma edição da Revista Informatica. " +
					"Esta é a sua edição número: " + edicaoNovaRevista);
		}
	}	
}