package padroesProjetoJava.strategy;

public class Robot {
		private Comportamento strategy;

		public void setStrategy(Comportamento strategy) {
			this.strategy = strategy;
		}
		
		public void mover() {
			strategy.mover();
		}

}
