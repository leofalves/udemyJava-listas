package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<String> list = new ArrayList<>();
		
		list.add("Leo");
		list.add("Elaine");
		list.add("Clara");
		list.add("Manuela");
		
		for (String x : list) {
			System.out.println(x);
		}
		System.out.println("-----------------------------------------------");
		
		list.remove(1);
		list.remove("Leo");
		for (String x : list) {
			System.out.println(x);
		}
		System.out.println("-----------------------------------------------");
		
		
		list.add("João");
		list.add("José");
		for (String x : list) {
			System.out.println(x);
		}
		System.out.println("-----------------------------------------------");
		
		list.removeIf(x -> x.charAt(0)=='J');
		for (String x : list) {
			System.out.println(x);
		}
		System.out.println("-----------------------------------------------");
		
		System.out.println("Index of Clara: " + list.indexOf("Clara"));
		System.out.println("Index of John: " + list.indexOf("John"));
		
		list.add("João");
		list.add("José");
		
		// Filtrando uma lista e jogando em outra
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'J').collect(Collectors.toList());

		System.out.println("------------ LISTA PRINCIPAL -----------------------------------");
		for (String x : list) {
			System.out.println(x);
		}
		
		
		System.out.println("------------ LISTA RESULT  -----------------------------------");
		for (String x : result) {
			System.out.println(x);
		}
		
		System.out.println("------------ FIND FIRST  -----------------------------------");
		
		String name = list.stream().filter(x -> x.charAt(0) == 'M').findFirst().orElse(null);
		
		System.out.println(name);
		
	
	}
}
