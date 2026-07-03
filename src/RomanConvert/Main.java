package RomanConvert;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		while (true) {

			System.out.println("Digite um numero Romano: ");
			String input = sc.nextLine();

			if (input.equalsIgnoreCase("sair")) {
				System.out.println("Encerrando");
				break;
			}

			int resultado = RomanConvertt.romanToInt(input);
			System.out.println("Resultado: " + resultado);

		}
		sc.close();

	}
}
