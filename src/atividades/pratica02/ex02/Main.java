package atividades.pratica02.ex02;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("investimeto inicial: ");
		Double inicial = scan.nextDouble();
		
		System.out.println("taxa de rendimento: ");
		Double mes = scan.nextDouble();
		
		System.out.println("N�mero de m�s: ");
		Double taxa = scan.nextDouble();
		
		Redimentos investimento = new Redimentos(inicial, taxa, mes);
		
		System.out.println(investimento.rendimentoTotal());
		

	}

}
