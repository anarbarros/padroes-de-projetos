package padroesProjetoJava.singleton;


/**
 * Singleton "apressado"
 * @author anaro
 *
 */
public class SingletonEager {
	private static SingletonEager instancia = new SingletonEager();
	
	private SingletonEager() {
		super();
	}
	
	public static SingletonEager getInstancia() {
		return instancia;
	}
}
