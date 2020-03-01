import java.io.IOException;
import java.util.Scanner;

public class Main {

	static int[] arrayInt1;
	static int[] arrayInt2;
	static int[] arrayInt3;
	static String[] arreglo;

	public static void main(String[] args) throws IOException {

		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int opcion = 0;
		int witchArray;
		int arregloA;
		int arregloB;

		while (opcion != -1) {
			Runtime.getRuntime().exec("clear");
			
			System.out.println("\nplease enter the number of the option you would like to use: \n");
			System.out.println("1.enter the 3 strings.");
			System.out.println("2.display strings legth.");
			System.out.println("3.concatenate strings.");
			System.out.println("4. chose 1 caracter of 1 string.");
			System.out.println("5.enter 2 real numbers and display its division.");
			System.out.println("6.display the division and the residue of both numbers.");
			System.out.println("7.enter the 3 arrays of int numbers");
			System.out.println("8.display the int arrays.");
			System.out.println("9.display the avarage of this arrays.");
			System.out.println("10. display the higher value of one array.");
			System.out.println("11.display the union of the 3 int arrays.");
			System.out.println("12.display the union of the 3 arrays with out the repeated values.");
			System.out.println("13.display the interception of the arrays.");
			System.out.println("14.enter 2 of the 3 arrays and chose what math operation would you like to do.");
			System.out.println("15.display the buble method .\n");

			System.out.print("enter option: ");
			opcion = sc.nextInt();

			switch (opcion) {

			case 1:
				enterCadenas();
				presioneUnaTeclaParaContinuar();
				break;

			case 2:
				if (arreglo == null) {
					enterCadenas();
				}
				longitudCadena();
				presioneUnaTeclaParaContinuar();
				break;

			case 3:
				if (arreglo == null) {
					enterCadenas();
				}
				concatenarCadenas();
				presioneUnaTeclaParaContinuar();
				break;

			case 4:
				if (arreglo == null) {
					enterCadenas();
				}
				caracterCadena();
				presioneUnaTeclaParaContinuar();
				break;

			case 5:
				numerosReales();
				presioneUnaTeclaParaContinuar();
				break;

			case 6:
				divisionResiduo();
				presioneUnaTeclaParaContinuar();
				break;

			case 7:
				arregloEnteros();
				presioneUnaTeclaParaContinuar();
				break;

			case 8:
				if (arrayInt1 == null) {
					arregloEnteros();
				}
				desplegarArreglos();
				break;

			case 9:
				if (arrayInt1 == null) {
					arregloEnteros();
				}
				promedioArreglo(arrayInt1, arrayInt2, arrayInt3);
				presioneUnaTeclaParaContinuar();
				break;

			case 10:
				if (arrayInt1 == null) {
					arregloEnteros();
				}
				mayorValor(arrayInt1, arrayInt2, arrayInt3);
				presioneUnaTeclaParaContinuar();
				break;

			case 11:
				if (arrayInt1 == null) {
					arregloEnteros();
				}
				arregloTotalM();
				presioneUnaTeclaParaContinuar();
				break;

			case 12:
				if (arrayInt1 == null) {
					arregloEnteros();
				}
				int[] arregloTemporal = arregloTotalM();
				arregloTotalSinRepetidos(arregloTemporal);
				presioneUnaTeclaParaContinuar();
				break;

			case 13:
				if (arrayInt1 == null) {
					arregloEnteros();
				}
				intercepcionArreglos();
				presioneUnaTeclaParaContinuar();
				break;

			case 14:
				if (arrayInt1 == null) {
					arregloEnteros();
				}
				System.out.println("please enter 1 of the 2 arrays for the math operation");
				arregloA = sc.nextInt();
				System.out.println("please enter 2 of the 2 arrays for the math operation");
				arregloB = sc.nextInt();
				if (arregloA == 1 && arregloB == 2 && arrayInt1.length == arrayInt2.length) {
					arregloTotalOperacion(arrayInt1, arrayInt2);
				} else if (arregloA == 1 && arregloB == 3 && arrayInt1.length == arrayInt3.length) {
					arregloTotalOperacion(arrayInt1, arrayInt3);
				} else if (arregloA == 2 && arregloB == 3 && arrayInt2.length == arrayInt3.length) {
					arregloTotalOperacion(arrayInt2, arrayInt3);
				}
				presioneUnaTeclaParaContinuar();
				break;
			case 15: 
				if (arrayInt1 == null) {
					arregloEnteros();
				}
				burbuja();
				presioneUnaTeclaParaContinuar();
				break;

			}

		}
	}

	public static void presioneUnaTeclaParaContinuar() {
		System.out.println("\n please enter key to continue.....");
		Scanner sc = new Scanner(System.in);
		sc.nextLine();
	}

	/**
	 * this method allows the user to enter 3 strings
	 * 
	 * @param arreglo must be initialized the user added 3 strings in the array
	 *                called arreglo
	 */
	public static void enterCadenas() {
		Scanner sc = new Scanner(System.in);

		arreglo = new String[3];
		System.out.println("please enter the string of caracters 1");
		arreglo[0] = sc.nextLine();

		System.out.println("porfavor ingrese la cadena de caracteres 2");
		arreglo[1] = sc.nextLine();

		System.out.println("porfavor ingrese la cadena de caracteres 3");
		arreglo[2] = sc.nextLine();
		
	}

	/**
	 * this method allows the user to display the length of the string enter in the
	 * array
	 * 
	 * @param arreglo is the array of string to consult the length the program
	 *                display the length of the string inside the array
	 */
	public static void longitudCadena() {
		for (int i = 0; i < arreglo.length; i++) {
			System.out.println("la longitud de la cadena " + (i + 1) + "es: " + arreglo[i].length());
		}
		
	}

	/**
	 * this method concatenate the strings
	 * 
	 * @param arreglo     must be initialized
	 * @param cadenaConca must be initialized the program displays the 3 strings
	 *                    concatenated
	 */
	public static void concatenarCadenas() {
		String cadenaConca = "";
		for (int i = 0; i < arreglo.length; i++) {
			cadenaConca += arreglo[i];
		}
		System.out.println(cadenaConca);
		
	}

	/**
	 * this method allows the user to choose 1 of the 3 strings in the array and
	 * then choose 1 character of the string already chosen
	 * 
	 * @param arreglo          string where is going to search for the character
	 * @param posicionArreglo  where its going to star searching
	 * @param tamanioCadena    must be int
	 * @param posicionCaracter must be initialized
	 * @param f                must be initialized the program displays the
	 *                         character in the position chosen by the user
	 */
	public static void caracterCadena() {
		Scanner sc = new Scanner(System.in);
		int posicionArreglo;

		System.out.println("por favor ingrese la posicion del caracter del arreglo que desea conocer");
		posicionArreglo = sc.nextInt();
		sc.nextLine();

		for (int i = 0; i < arreglo.length; i++) {
			if (posicionArreglo > arreglo[i].length()) {
				System.out.println(
						"the position" + posicionArreglo + " in array " + (i + 1) + " by the user is not correct");
			} else {
				System.out.println("the character in array " + (i + 1) + " is: " + arreglo[i].charAt(posicionArreglo));
			}

		}
		
	}

	public static void numerosReales() {
		Scanner sc = new Scanner(System.in);
		double numero1, numero2;
		double divisionNumeros;
		numero1 = pedirNumero("please enter the first real number bigger than 0");
		numero2 = pedirNumero("please enter the second real number bigger than 0");
		divisionNumeros = numero1 / numero2;
		System.out.println("the division of both numbers is: " + divisionNumeros);
		
	}

	public static double pedirNumero(String mensaje) {
		Scanner sc = new Scanner(System.in);
		double numero;
		do {
			System.out.println(mensaje);
			numero = sc.nextDouble();
			sc.nextLine();
		} while (numero <= 0);
		return numero;
	}

	public static void divisionResiduo() {
		Scanner sc = new Scanner(System.in);
		double numero1, numero2;
		double divisionNumeros;
		int residuoNumeros;
		numero1 = pedirNumero("please enter the first real number bigger than 0");
		numero2 = pedirNumero("please enter the second real number bigger than 0");
		divisionNumeros = numero1 / numero2;
		residuoNumeros = (int) (numero1 % numero2);
		System.out.println("the division of the numbers is: " + divisionNumeros + " the residue of the numbers is: "
				+ residuoNumeros);
		
	}

	public static void arregloEnteros() {
		Scanner sc = new Scanner(System.in);
		int sizeArrayInt1;
		int sizeArrayInt2;
		int sizeArrayInt3;
		System.out.print("\nplease enter the size of the array number1: ");
		sizeArrayInt1 = sc.nextInt();
		sc.nextLine();
		arrayInt1 = new int[sizeArrayInt1];
		System.out.println("please enter the data in the array number 1");
		for (int i = 0; i < sizeArrayInt1; i++) {
			arrayInt1[i] = sc.nextInt();
			sc.nextLine();
		}
		System.out.print("\nplease enter the size of the array number2: ");
		sizeArrayInt2 = sc.nextInt();
		sc.nextLine();
		arrayInt2 = new int[sizeArrayInt2];
		System.out.println("please enter the data in the array number 2");
		for (int i = 0; i < sizeArrayInt2; i++) {
			arrayInt2[i] = sc.nextInt();
			sc.nextLine();
		}

		System.out.print("\nplease enter the size of the array number3: ");
		sizeArrayInt3 = sc.nextInt();
		sc.nextLine();
		arrayInt3 = new int[sizeArrayInt3];
		System.out.println("please enter the data in the array number 3");
		for (int i = 0; i < sizeArrayInt3; i++) {
			arrayInt3[i] = sc.nextInt();
			sc.nextLine();
		}

		
	}

	public static void desplegarArreglos() {
		int i;
		for (i = 0; i < arrayInt1.length; i++) {
			System.out.print(arrayInt1[i] + "|");
		}
		System.out.println();
		for (i = 0; i < arrayInt2.length; i++) {
			System.out.print(arrayInt2[i] + "|");
		}
		System.out.println();
		for (i = 0; i < arrayInt3.length; i++) {
			System.out.print(arrayInt3[i] + "|");
		}
		System.out.println();
		
	}

	public static void promedioArreglo(int[] arrayInt1, int[] arrayInt2, int[] arrayInt3) {
		Scanner sc = new Scanner(System.in);
		double suma1 = 0, suma2 = 0, suma3 = 0;
		double promedio1, promedio2, promedio3;
		// Se hace la suma
		for (int x = 0; x < arrayInt1.length; x++) {
			suma1 += arrayInt1[x];
		}
		// Se calcula el promedio
		promedio1 = suma1 / arrayInt1.length;

		// Se hace la suma
		for (int x = 0; x < arrayInt2.length; x++) {
			suma2 += arrayInt2[x];
		}
		// Se calcula el promedio
		promedio2 = suma2 / arrayInt2.length;

		// Se hace la suma
		for (int x = 0; x < arrayInt3.length; x++) {
			suma3 += arrayInt3[x];
		}
		// Se calcula el promedio
		promedio3 = suma3 / arrayInt3.length;

		System.out.println("the avarage of array 1 is: " + promedio1);
		System.out.println("the avarage of array 2 is: " + promedio2);
		System.out.println("the avarage of array 3 is: " + promedio3);

		
	}

	public static void mayorValor(int[] arrayInt1, int[] arrayInt2, int[] arrayInt3) {
		Scanner sc = new Scanner(System.in);
		int numeroMayor1 = 0,numeroMayor2 = 0,numeroMayor3 = 0;

		numeroMayor1 = arrayInt1[0];
		for (int i = 0; i < arrayInt1.length; i++) {
			if (arrayInt1[i] > numeroMayor1) {
				numeroMayor1 = arrayInt1[i];
			}
		}
		numeroMayor2 = arrayInt2[0];
		for (int i = 0; i < arrayInt2.length; i++) {
			if (arrayInt2[i] > numeroMayor2) {
				numeroMayor2 = arrayInt2[i];
			}
		}
		numeroMayor3 = arrayInt3[0];
		for (int i = 0; i < arrayInt3.length; i++) {
			if (arrayInt3[i] > numeroMayor3) {
				numeroMayor3 = arrayInt3[i];
			}
		}
		
		System.out.println("el mayor elemento del arreglo 1 es: " + numeroMayor1);
		System.out.println("el mayor elemento del arreglo 2 es: " + numeroMayor2);
		System.out.println("el mayor elemento del arreglo 3 es: " + numeroMayor3);

		
	}

	public static void arregloTotalOperacion(int[] arregloA, int[] arregloB) {
		Scanner sc = new Scanner(System.in);
		int mathOperation;
		System.out.println(
				"please enter the math operation that you would like to use: \n"
				+ "1.sum \n"
				+ "2.substraction \n"
				+ " 3.multiplication \n");
		System.out.print("option: ");
		mathOperation = sc.nextInt();
		String nameMathOperation = "";
		int[] arregloResultante = null;
		switch (mathOperation) {
		case 1:
			nameMathOperation = "sum";
			arregloResultante = new int[arregloA.length];
			for (int i = 0; i < arregloA.length; i++) {
				arregloResultante[i] = arregloA[i] + arregloB[i];
			}

			break;

		case 2:
			nameMathOperation = "substraction";
			arregloResultante = new int[arregloA.length];
			for (int i = 0; i < arregloA.length; i++) {
				arregloResultante[i] = arregloA[i] - arregloB[i];
			}

			break;

		case 3:
			nameMathOperation = "multiplication";
			arregloResultante = new int[arregloA.length];
			for (int i = 0; i < arregloA.length; i++) {
				arregloResultante[i] = arregloA[i] * arregloB[i];
			}

			break;
		}
		if (arregloResultante == null) {

		} else {
			System.out.println("the " + nameMathOperation + " of the arrays is: ");
			System.out.print("[ ");
			for (int i = 0; i < arregloResultante.length; i++) {
				System.out.print(arregloResultante[i] + ", ");
			}
			System.out.print("]");

		}
		
	}

	public static int[] arregloTotalM() {
		int tamanoArregloTotal = arrayInt1.length + arrayInt2.length + arrayInt3.length;
		int[] arregloTotal = new int[tamanoArregloTotal];

		for (int i = 0; i < arrayInt1.length; i++) {
			arregloTotal[i] = arrayInt1[i];
		}
		for (int j = 0; j < arrayInt2.length; j++) {
			arregloTotal[j + arrayInt1.length] = arrayInt2[j];
		}
		for (int k = 0; k < arrayInt3.length; k++) {
			arregloTotal[k + arrayInt2.length + arrayInt1.length] = arrayInt3[k];
		}
		System.out.println("the union of the 3 arrays is: ");
		System.out.print("[ ");
		for (int i = 0; i < arregloTotal.length; i++) {
			System.out.print(arregloTotal[i] + " | ");
		}
		System.out.print("]");
		return arregloTotal;
	}

	public static void arregloTotalSinRepetidos(int[] arregloTotal) {
		int valorMarca;
		int contador = 0;
		int numeroMayor = arregloTotal[0];
		for (int i = 0; i < arregloTotal.length; i++) {
			if (arregloTotal[i] > numeroMayor) {
				numeroMayor = arregloTotal[i];
			}
		}
		valorMarca = numeroMayor + 1;
		for (int i = 0; i < arregloTotal.length; i++) {
			for (int j = i + 1; j < arregloTotal.length; j++) {
				if (arregloTotal[i] == arregloTotal[j] && arregloTotal[j] != valorMarca) {
					arregloTotal[j] = valorMarca;
					contador++;
				}
			}
		}
		int[] arregloTotalSinRepetidos = new int[arregloTotal.length - contador];
		int k = 0;
		for (int i = 0; i < arregloTotal.length; i++) {
			if (arregloTotal[i] != valorMarca) {
				arregloTotalSinRepetidos[k] = arregloTotal[i];
				k++;
			}
		}
		System.out.println(arregloTotalSinRepetidos.length);
		for (int i = 0; i < arregloTotalSinRepetidos.length; i++) {
			System.out.println("the array with out the repeated" + arregloTotalSinRepetidos[i]);
		}
		

	}

	public static void intercepcionArreglos() {
		int tamanioTotal = arrayInt1.length + arrayInt2.length + arrayInt3.length;
		int[] arregloIntercepcion = new int[tamanioTotal];
		boolean bandera1 = false;
		boolean bandera2 = false;

		for (int i = 0; i < arrayInt1.length && bandera1 == false; i++) {
			for (int j = 0; j < arrayInt2.length; j++) {
				if (arrayInt1[1] == arrayInt2[j]) {
					bandera1 = true;
				}
			}
			if (bandera1 == true) {
				for (int l = 0; l < arrayInt3.length; l++) {
					if (arrayInt1[i] == arrayInt3[l]) {
						for (int k = 0; k < arregloIntercepcion.length; k++) {
							if (arrayInt1[i] == arregloIntercepcion[i]) {
								bandera2 = true;
							}
							if (bandera2 == true) {
								arrayInt1[i] = arregloIntercepcion[i];
							}
						}
					}
				}
			}
		}
		for (int e = 0; e < arregloIntercepcion.length; e++) {
			System.out.println("the interception of the 3 array is: " + arregloIntercepcion[e]);
		}
		
	}
	
	public static void ordernarArreglo(int[] arreglo) {
		int temp;
		for (int i = arreglo.length; i > 0; i--) {
			for (int j = 0; j < i - 1; j++) {
				if (arreglo[j] > arreglo[j + 1]) {
					temp = arreglo[j];
					arreglo[j] = arreglo[j + 1];
					arreglo[j + 1] = temp;
				}
			}
		}
	}
	public static void burbuja() {
		Scanner sc = new Scanner(System.in);
		int witchArray;
		System.out.println("please enter the array that you woould like to use");
		System.out.print("number array: ");
		witchArray = sc.nextInt();
		switch(witchArray) {
		case 1:
			ordernarArreglo(arrayInt1);
			for (int k = 0; k < arrayInt1.length; k++) {
				System.out.println("the array1 with the buble method is: " + arrayInt1[k]);
			}
			break;
		case 2:
			ordernarArreglo(arrayInt2);
			for (int k = 0; k < arrayInt2.length; k++) {
				System.out.println("the array1 with the buble method is: " + arrayInt2[k]);
			}
			break;
		case 3:
			ordernarArreglo(arrayInt2);
			for (int k = 0; k < arrayInt3.length; k++) {
				System.out.println("the array1 with the buble method is: " + arrayInt3[k]);
			}
			break;
		}
		
	}
}