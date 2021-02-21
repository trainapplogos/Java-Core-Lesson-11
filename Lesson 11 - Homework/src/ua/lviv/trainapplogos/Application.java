package ua.lviv.trainapplogos;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class Application {
	public static void main(String[] args) {
		Integer [] arrInt = new Integer[10];
		Random r = new Random();
		
//		Arrays.fill(arrInt, r.nextInt(100));
		for (int i = 0; i < arrInt.length; i++) {
			arrInt[i] = r.nextInt(100);
		}
	
		System.out.println("[*** Task1: ***]");
		System.out.println("> Unsorted array:");
		System.out.println("  " + Arrays.toString(arrInt));
		
		System.out.println("> Sorted array in ascending order:");
		Arrays.sort(arrInt); //sort in ascending order
		System.out.println("  " + Arrays.toString(arrInt));
		
		System.out.println("> Sorted array in descending order:");
		Arrays.sort(arrInt, Collections.reverseOrder()); //using Comparator: Collections.reverseOrder() 
		System.out.println("  " + Arrays.toString(arrInt));

		System.out.println("\n[*** Task2: ***]");
		
		int arrbound1 = r.nextInt(50);
		int arrbound2 = r.nextInt(50);
		Car [][] arrcars = new Car [arrbound1][arrbound2];
		
	
		for (int i = 0; i < arrbound1; i++) {
			for (int j = 0; j < arrbound2; j++) {
				arrcars[i][j] = new Car(getRandomValueOfRange(70, 350), getRandomValueOfRange(1930, 2020));
			}
		}
		
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			System.out.println("\n----------------------------[Menu]----------------------------");
			System.out.println("> Choose action:");
			System.out.println("  [1]: Output all elements");
			System.out.println("  [2]: Autofuill array with identical object Car");
			
			String menuitem = sc.next();
			if (menuitem.equals("1")) {
				System.out.println(Arrays.deepToString(arrcars));
			} else if (menuitem.equals("2")) {
				for (int i = 0; i < arrbound1; i++) {
					Arrays.fill(arrcars[i], new Car(230, 2020)); //Car(r.nextInt(300), getRandomValueOfRange(1930, 2020))
					System.out.println(Arrays.deepToString(arrcars));
				}
			} else {
				System.out.println("Press 1 or 2 to choose menu item");
			}
		}
	}
	
	public static int getRandomValueOfRange (int min, int max) {
		if (min >= max) {
			throw new IllegalArgumentException("min value must be smaller than max value");
		}
		
		Random r = new Random();
		return r.nextInt(max - min + 1) + min;
	}
}
