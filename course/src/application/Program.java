package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Room;




public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Room[] vectRooms = new Room[10];
		
		System.out.print("How many rooms will be rented? ");
		int qtdInquilinos = sc.nextInt();
		System.out.println();
		
		for(int i = 0; i < qtdInquilinos; i++) {
			int cont = i + 1;
			System.out.println("Rent #" + cont);
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.nextLine();
			System.out.print("Room: ");
			int numeroQuarto = sc.nextInt();
			System.out.println();
			
			vectRooms[numeroQuarto] = new Room(name, email);
		}
		
		System.out.println();
		System.out.println("Busy rooms:");
		
		for(int i = 0; i < vectRooms.length; i++) {
			if( vectRooms[i] != null) {
				System.out.println(i + ": " + vectRooms[i].getName() + ", "
						+ vectRooms[i].getEmail());
			}
		}

		sc.close();
	}

}
