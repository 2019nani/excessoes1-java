package Aplica;


import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatch {

	public static void main(String[] args) {
		metodo();
		System.out.println("fim do programa");
	}
	public static void metodo() {
		System.out.println("metodo inicio");
		metodo2();
		System.out.println("metodo fim");
	}
		public static void metodo2 () {
			System.out.println("metodo2 inicio");
			Scanner sc = new Scanner(System.in);
			try {
			String[] nome = sc.nextLine().split(" ");
			int posicao = sc.nextInt();
			System.out.println(nome[posicao]);
			}
			catch(ArrayIndexOutOfBoundsException a) {
				System.out.println("Posicao invalida");
				a.printStackTrace();
			}
			catch(InputMismatchException d) {
				System.out.println("digite verto meu");
				d.printStackTrace();
			}
			sc.close();
			System.out.println("metod2 fim");
		}
		
	

}
