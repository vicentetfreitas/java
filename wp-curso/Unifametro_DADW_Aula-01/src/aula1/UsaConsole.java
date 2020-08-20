package aula1;

public class UsaConsole {
	public static void main(String[] argas) {
		ConsoleDeVideoGame c1 = new ConsoleDeVideoGame();
		c1.setVoltagem(110);
		c1.setFabricante("Sony");

		ConsoleDeVideoGame c2 = new ConsoleDeVideoGame();
		c2.setPeso(3000.0);

		System.out.println(c1.getVoltagem());
	}
}
