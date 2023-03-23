package padroesProjetoJava.singleton;


/**
 * Singleton "Lazy Holder"
 * @author anabarros
 *
 */
public class SingletonLazyHolder {
	
	private static class InstanciaHolder{
	public static SingletonLazyHolder instancia = new SingletonLazyHolder();
	
	private void SingletonLazyHolder() {
	
	}
	
	
}

	public static SingletonLazyHolder getInstancia() {
		// TODO Auto-generated method stub
		return InstanciaHolder.instancia;
	}
}