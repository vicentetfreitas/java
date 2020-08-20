import java.util.Locale;

//import java.util.Locale;

public class Main {

	public static void main(String[] args) {

		String product1 = "Computer";
		int age = 28;
		int code = 5290;
		
		char gender = 'M';
		
		double price1 = 2100.0;
		double measure = 53.234567;
		
		System.out.println("Products: ");
		System.out.printf("%s, wich price is R$%.2f%n",product1,price1);
		System.out.printf("Record: %d years old, %d and gender: %c%n",age, code, gender);
		System.out.printf("Measue with eight decimal place: %.8f%n",measure);
		System.out.printf("Rouded (Three decimal place): %.3f%n",measure);
		Locale.setDefault(Locale.US);
		System.out.printf("US decimal point: %.3f%n", measure);

	}

}
