package revisao;

public class RevisaoUm {

	public static void main(String[] args) {
		var f = 109;
		final var FC = 32;
		final var CC = 5.0/9.0;		
		double c = ((f - FC) * (CC));
		
		System.out.println("A temperatura em fahrenheit é: " + f +" A temperatura em celsius é " + c + "");
	}

}
