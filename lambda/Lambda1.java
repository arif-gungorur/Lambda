package lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Lambda1 {

	public static void main(String[] args) {
		List <Integer> list = new ArrayList<>(Arrays.asList(54,53,7,87,5,90,11)) ;
		printElfunctional(list);
		System.out.println();
		System.out.println("******");
		printElfunctional1(list);
		System.out.println();
		System.out.println("******");
		printCiftElFunctional1(list);
		System.out.println();
		System.out.println("******");
		printCiftElFunctional2(list);
		System.out.println();
		System.out.println("******");
		printCiftAltmısKucukCift(list);
		System.out.println();
		System.out.println("******");
		printTekYirmidenBuyuk(list);
		System.out.println();
		System.out.println("******");
		ciftKarePrint(list);
		System.out.println();
		System.out.println("******");
		kupBirdenFazlaTek(list);
		System.out.println();
		System.out.println("******");
		karakokCiftfunctional(list);
		System.out.println();
		System.out.println("******");
		maxElfunctional(list);
		
		

	}
	
	private static void maxElfunctional(List<Integer> list) {
		Optional<Integer> maxEl=list.stream().reduce(Math::max);
		System.out.println(maxEl);
		
	}

	public static void karakokCiftfunctional(List<Integer> list) {
		list.
			stream().
			filter(Lambda1::ciftBul).
			map(Math::sqrt).
			forEach(t-> System.out.print(t + " "));
		
	}

	public static void kupBirdenFazlaTek(List<Integer> list) {
		list.
			stream().
			filter(t-> t%2==1).
			map(t-> (t*t*t)+1).
			forEach(Lambda1::printEl);
		
	}

	public static void ciftKarePrint(List<Integer> list) {
		list.
			stream().
			filter(Lambda1::ciftBul).
			map(t-> t*t).
			forEach(Lambda1::printEl);
		
	}

	public static void printTekYirmidenBuyuk(List<Integer> list) {
		list.stream().filter(t-> t%2==1 || t> 20).forEach(Lambda1::printEl);
		
	}

	public static void printCiftAltmısKucukCift(List<Integer> list) {
		list.stream().filter(t-> t%2==0 & t < 60 ).forEach(Lambda1::printEl);
		
	}

	public static void printCiftElFunctional2(List<Integer> list) {
		list.stream().filter(Lambda1::ciftBul).forEach(Lambda1::printEl);
		
	}

	public static boolean ciftBul(int i) {
	
	return i%2 ==0;
	
	}

	public static void printCiftElFunctional1(List<Integer> list) {
		list.stream().filter(t->t%2==0).forEach(Lambda1::printEl);
		
	}

	public static void printElfunctional1(List<Integer> list) {
		list.stream().forEach(Lambda1::printEl);
		
	}

	public static void printElfunctional(List<Integer> list) {
		list.stream().forEach(t-> System.out.println(t +" "));
		
	}
	
	public static void printEl (int t) {
		System.out.print(t + " ");
		
	}
	

}
