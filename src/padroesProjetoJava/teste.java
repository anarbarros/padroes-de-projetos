package padroesProjetoJava;

import padroesProjetoJava.singleton.SingletonEager;
import padroesProjetoJava.singleton.SingletonLazy;
import padroesProjetoJava.singleton.SingletonLazyHolder;
import padroesProjetoJava.strategy.Comportamento;
import padroesProjetoJava.strategy.ComportamentoAgressivo;
import padroesProjetoJava.strategy.ComportamentoDefensivo;
import padroesProjetoJava.strategy.ComportamentoNormal;
import padroesProjetoJava.strategy.Robot;

public class teste {

	public static void main(String[] args) {
		//Testes Singleton
		SingletonLazy lazy = SingletonLazy.getInstancia();
		System.out.println(lazy);
		lazy = SingletonLazy.getInstancia();
		System.out.println(lazy);
		
		System.out.println("--");
		SingletonEager eager = SingletonEager.getInstancia();
		System.out.println(eager);
		eager = SingletonEager.getInstancia();
		System.out.println(eager);
		
		System.out.println("--");
		SingletonLazyHolder holder = SingletonLazyHolder.getInstancia();
		System.out.println(holder);
		holder = SingletonLazyHolder.getInstancia();
		System.out.println(holder);
		
		System.out.println("--");
		// Comportamento Robo
		Comportamento normal = new ComportamentoNormal();
		Comportamento defensivo = new ComportamentoDefensivo();
		Comportamento agressivo = new ComportamentoAgressivo();
		
		Robot robo = new Robot();
		robo.setStrategy(agressivo);
		robo.mover();
		robo.mover();
		robo.setStrategy(defensivo);
		robo.mover();
	}

}
