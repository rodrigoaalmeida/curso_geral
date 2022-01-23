package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;


public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Student student = new Student();
		
		System.out.println("Informe o nome do aluno: ");
		student.name = sc.nextLine();
		System.out.println("Informe as notas dos tres trimenstres: ");
		student.primeiroTrimenstre = sc.nextDouble();
		student.segundoTrimenstre = sc.nextDouble();
		student.terceiroTrimenstre = sc.nextDouble();
		
		System.out.println();
		System.out.printf("FINAL GRADE = %.2f%n", student.calcularNota());
		System.out.println(student.testeResultado());
		
		sc.close();
	}

}
