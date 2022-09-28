package no.hvl.dat100.lab6.matriser;

public class Matriser {

	// a)
	public static void skrivUt(int[][] matrise) {
		for (int i = 0; i < matrise.length; i++) {

			for (int j = 0; j < matrise[i].length; j++) {
				System.out.println(matrise[i][j]);
			}

		}

	}

	// b)
	public static String tilStreng(int[][] matrise) {
		String retur = "";

		for (int[] tall : matrise) {
			for (int i : tall) {
				retur += i + " ";

			}
			retur += "\n";

		}
		System.out.println(retur);
		return retur;
	}

	// c)
	public static int[][] skaler(int tall, int[][] matrise) {
		int[][] matrise2 = new int[matrise.length][matrise[0].length];

        for(int i = 0; i < matrise2.length; i++) {

            for (int j = 0; j < matrise2[i].length; j++) {

                matrise2[i][j] = (matrise[i][j] * tall);


            }
        }

        return matrise2;
        }
		
	

	// d)
	public static boolean erLik(int[][] a, int[][] b) {
		boolean sant = true;
		int i = 0;
		int j = 0;
		int tall1;
		int tall2;
		int kol1;
		int kol2;

		tall1 = a.length;
		kol1 = a[1].length;

		tall2 = b.length;
		kol2 = b[1].length;

		if (tall1 != tall2 || kol1 != kol2) {
			sant = true;
		} else {
			for (i = 0; i < tall1; i++) {
				for (j = 0; j < kol1; j++) {
					if (a[i][j] != b[i][j]) {
						sant = false;
						break;
					}
				}
			}
		}
		return sant;
	}
	
	// e)
	public static int[][] speile(int[][] matrise) {

		// TODO
		throw new UnsupportedOperationException("speile ikke implementert");

	}

	// f)
	public static int[][] multipliser(int[][] a, int[][] b) {

		// TODO
		throw new UnsupportedOperationException("multipliser ikke implementert");

	}
}
