package lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Lambda2 {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>(Arrays.asList(34,41,61,06,19));
		ciftKareMax(list);
		System.out.println();
		System.out.println("******");
		toplaEl1(list);
		System.out.println();
		System.out.println("******");
		toplaEl2(list);
		System.out.println();
		System.out.println("******");
		carpEl1(list);
		System.out.println();
		System.out.println("******");
		carpEl2(list);
		System.out.println();
		System.out.println("******");
		min1(list);
		System.out.println();
		System.out.println("******");
		min2(list);
		System.out.println();
		System.out.println("******");
		min3(list);
		

	}

	private static void min3(List<Integer> list) {
		int min =list.stream().reduce(Integer.MAX_VALUE,(x,y)-> x<y ? x:y) ;
		System.out.println(min);
	}

	private static void min2(List<Integer> list) {
		Optional<Integer> min = list.stream().reduce(Math::min);
		System.out.println(min);
	}

	private static void min1(List<Integer> list) {
		Optional<Integer> min=list.stream().reduce(Integer::min);
		System.out.println(min);
		
	}

	private static void carpEl2(List<Integer> list) {
		int carpim =list.stream().filter(Lambda1::ciftBul).reduce(1,(x,y)->x*y);
		System.out.println(carpim);
	}

	private static void carpEl1(List<Integer> list) {
		Optional<Integer> carpim=list.stream().filter(Lambda1::ciftBul).reduce(Math::multiplyExact);
		System.out.println(carpim);
		
	}

	private static void toplaEl2(List<Integer> list) {
		Optional<Integer> topla =list.stream().reduce(Math::addExact);
		System.out.println(topla);
		
	}

	private static void toplaEl1(List<Integer> list) {
		int toplam=list.stream().reduce(0, (x,y)-> x + y) ;
		System.out.println(toplam);
		
	}

	private static void ciftKareMax(List<Integer> list) {
		Optional<Integer> ciftKareMax=list.stream().filter(Lambda1::ciftBul).map(t-> t*t).reduce(Math::max);
		System.out.println(ciftKareMax);
		
	}

}
