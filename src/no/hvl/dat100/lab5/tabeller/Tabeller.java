package no.hvl.dat100.lab5.tabeller;

public class Tabeller {

	// a)
	public static void skrivUt(int[] tabell) {

		for (int i = 0; i < tabell.length; i++) {
			System.out.println(tabell[i]);
			System.out.println(summer(tabell));

		}

	}

	// b)
	public static String tilStreng(int[] tabell) {
		String tall1 = "";
		String tall2 = "";
		String tall3 = "";
		tall1 += "[";
		tall2 += "]";
		tall3 += ",";
		for (int i = 0; i < tabell.length; i += 1) {
			if (i < tabell.length - 1) {
				tall1 = tall1 + tabell[i] + ",";
			} else {
				tall1 = tall1 + tabell[i];
			}

		}

		tall1 += tall2;
		System.out.println(tall1);

		return tall1;

	}

	// c)
	public static int summer(int[] tabell) {

//		int sum = 0;
//		for (int i = 0; i < tabell.length; i++) {
//
//			sum = (sum + tabell[i]);
//	}
//		return sum;

//		int sum = 0;
//	
//		
//				for (int tall : tabell) {
//					sum = sum + tall ;
//				}
//		
//					return sum;
//					
//				}
//			

		int sum = 0;
		int i = 0;
		while (i < tabell.length) {
			sum = sum + tabell[i];
			i++;
		}
		return sum;
	}

	// public static int summer2(int[] tabell) {
//int sum = 0;
//int i = 0;
	// for (int tall : tabell) {
	// sum = (sum + tabell[i]);
	// }
	// i++;
	// return sum;

	// }

	// d)
	public static boolean finnesTall(int[] tabell, int tall) {

		boolean funnet = false;
		int i = 0;
		while (i < tabell.length && (!funnet)) {
			if (tabell[i] == tall) {
				funnet = true;

			}
			i++;

		}
		return funnet;
	}

	// e)
	public static int posisjonTall(int[] tabell, int tall) {
		int i = 0;

		for (i = 0; i < tabell.length; i++) {
			if (tabell[i] == tall) {

				return i;
			}

		}
		return -1;
	}

	// f)
	public static int[] reverser(int[] tabell) {

		int[] nyTab = new int[tabell.length];
		int j = tabell.length;

		for (int i : tabell) {
			j--;
			nyTab[j] = i;
		}

		return nyTab;
	}

	// g)
	public static boolean erSortert(int[] tabell) {

		int i = 0;
		boolean sortert = true;

		while (sortert && i < tabell.length - 1) {
			sortert = tabell[i] <= tabell[i + 1];
			i++;
		}
		return sortert;
	}

	// h)
	public static int[] settSammen(int[] tabell1, int[] tabell2) {
		int[] sammen = new int[tabell1.length + tabell2.length];
		int i = 0;
		int j = 0;
		for (i = 0; i < tabell1.length; i++) {
			sammen[j] = tabell1[i];
			j++;
		}
		j = i;
		for (i = 0; i < tabell2.length; i++) {
			sammen[j] = tabell2[i];
			j++;
		}
		return sammen;
	}
}
