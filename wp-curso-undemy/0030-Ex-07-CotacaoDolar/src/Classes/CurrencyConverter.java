package Classes;

public class CurrencyConverter {
	public static final double JUROS = 0.06;
	public double dolar;
	public double reais;

	public static double cotacao(double dolar, double reais) {
		return JUROS * dolar * reais;
	}

}
