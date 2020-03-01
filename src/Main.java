import java.io.IOException;
import java.util.Scanner;

public class Main {

	static int[] arrayInt1;
	static int[] arrayInt2;
	static int[] arrayInt3;
	static String[] arreglo;

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);

		int opcion = 0;
		int witchArray;
		

		while (opcion != -1) {
			//======Este comando sirve para limpiar la consola 
			System.out.print("\033[H\033[2J");
			System.out.flush();
			//===================================
			
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
				arregloTotalConcatenado();
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
				arreglosOperaciones();
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

	/**
	 * this method wait for press a key to continue
	 */
	public static void presioneUnaTeclaParaContinuar() {
		System.out.println("\n please enter key to continue.....");
		Scanner sc = new Scanner(System.in);
		sc.nextLine();
	}

	/**
	 * this method allows the user to enter 3 strings
	 * for use later in the program
	 * 
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
	 * this method allows the user to display the length of each string enter in the
	 * array
	 * 
	 */
	public static void longitudCadena() {
		for (int i = 0; i < arreglo.length; i++) {
			System.out.println("la longitud de la cadena " + (i + 1) + " es: " + arreglo[i].length());
		}
		
	}

	/**
	 * this method concatenate the strings in the array 
	 * 
	 */
	public static void concatenarCadenas() {
		String cadenaConca = "";
		for (int i = 0; i < arreglo.length; i++) {
			cadenaConca += arreglo[i];
		}
		System.out.println(cadenaConca);
		
	}

	/**
	 * this method request to the user for a number position in strings
	 * then show 1 character of the each string in array
	 * 
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

	/**
	 * this method request to the user for a two numbers for division
	 */
	public static void numerosReales() {
		Scanner sc = new Scanner(System.in);
		double numero1, numero2;
		double divisionNumeros;
		numero1 = pedirNumero("please enter the first real number bigger than 0");
		numero2 = pedirNumero("please enter the second real number bigger than 0");
		divisionNumeros = numero1 / numero2;
		System.out.println("the division of both numbers is: " + divisionNumeros);
		
	}

	/**
	 * this method show message and the request for a number 
	 * @param message for display to user
	 * @return
	 */
	public static double pedirNumero(String message) {
		Scanner sc = new Scanner(System.in);
		double numero;
		do {
			System.out.println(message);
			numero = sc.nextDouble();
			sc.nextLine();
		} while (numero <= 0);
		return numero;
	}

	/**
	 * this method request two numbers then calculate division and show the residue of numbers
	 */
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
	/**
	 * this method request for create three arrays of integer numbers 
	 */
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
	
	/**
	 * this method show the integer arrays 
	 */
	public static void desplegarArreglos() {
		mostrarArreglo(arrayInt1);
		System.out.println();
		mostrarArreglo(arrayInt2);
		System.out.println();
		mostrarArreglo(arrayInt3);
		System.out.println();
		
	}
	/**
	 * this method calculate the average of each array
	 * @param arrayInt1 array of integers 1
	 * @param arrayInt2 array of integers 2
	 * @param arrayInt3 array of integers 3
	 */
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
	
	/**
	 * this method show the higher number in each array 
	 * @param arrayInt1 array of integers 1
	 * @param arrayInt2 array of integers 2
	 * @param arrayInt3 array of integers 3
	 */
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
	/**
	 * this method request for two numbers of array for operate them
	 */
	public static void arreglosOperaciones() {
		Scanner sc = new Scanner(System.in);
		int arregloA;
		int arregloB;
		System.out.print("please enter 1 of the 2 arrays for the math operation: ");
		arregloA = sc.nextInt();
		System.out.print("please enter 2 of the 2 arrays for the math operation: ");
		arregloB = sc.nextInt();
		if (arregloA == 1 && arregloB == 2 && arrayInt1.length == arrayInt2.length) {
			arregloTotalOperacion(arrayInt1, arrayInt2);
		} else if (arregloA == 1 && arregloB == 3 && arrayInt1.length == arrayInt3.length) {
			arregloTotalOperacion(arrayInt1, arrayInt3);
		} else if (arregloA == 2 && arregloB == 3 && arrayInt2.length == arrayInt3.length) {
			arregloTotalOperacion(arrayInt2, arrayInt3);
		}
	}
	
	/**
	 * this method operate two arrays requesting the operation 
	 * @param arregloA
	 * @param arregloB
	 */
	public static void arregloTotalOperacion(int[] arregloA, int[] arregloB) {
		Scanner sc = new Scanner(System.in);
		int mathOperation;
		System.out.println(
				"please enter the math operation that you would like to use: \n"
				+ " 1.sum \n"
				+ " 2.substraction \n"
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
			mostrarArreglo(arregloResultante);
			System.out.print("[ ");
			
		}
		
	}
	/**
	 * this method show the concatenates arrays in one
	 */
	public static void arregloTotalConcatenado(){
		int[] arregloTotal = arregloTotalM();
		System.out.println("the union of the 3 arrays is: ");
		mostrarArreglo(arregloTotal);		
	}
	/**
	 * this method concatenates the arrays in one 
	 * @return
	 */
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
		
		return arregloTotal;
	}
	/**
	 * this method show an array with unique values, taking each array of integers and concatenating them  
	 * @param arregloTotal
	 */
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
		System.out.println("the array with out the repeated: ");
		mostrarArreglo(arregloTotalSinRepetidos);
			

	}
	
	/**
	 * this method show the numbers intercepts in arrays 
	 */
	public static void intercepcionArreglos() {
		int tamanioTotal = arrayInt1.length + arrayInt2.length + arrayInt3.length;
		int[] arregloIntercepcion = new int[tamanioTotal];
		boolean bandera1 = false;
		boolean bandera2 = false;

		for (int i = 0; i < arrayInt1.length && bandera1 == false; i++) {
			for (int j = 0; j < arrayInt2.length; j++) {
				if (arrayInt1[i] == arrayInt2[j]) {
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
	
	/**
	 * this method order a array with algorithm bubble  
	 * @param arreglo array to order
	 */
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
	
	/**
	 * this method request a number of array to order with algorithm bubble  
	 */
	public static void burbuja() {
		Scanner sc = new Scanner(System.in);
		int witchArray;
		System.out.println("please enter the array that you woould like to use");
		System.out.print("number array: ");
		witchArray = sc.nextInt();
		switch(witchArray) {
		case 1:
			ordernarArreglo(arrayInt1);
			System.out.println("the array1 with the bubble method is: ");
			mostrarArreglo(arrayInt1);
			
			break;
		case 2:
			ordernarArreglo(arrayInt2);
			System.out.println("the array2 with the bubble method is: ");
			mostrarArreglo(arrayInt2);
			break;
		case 3:
			ordernarArreglo(arrayInt3);
			System.out.println("the array3 with the bubble method is: ");
			mostrarArreglo(arrayInt3);
			
			break;
		}
		
	}
	
	/**
	 * 
	 * @param arreglo
	 */
	public static void mostrarArreglo(int[] arreglo) {
		String datos = "[ ";
		for (int k = 0; k < arreglo.length; k++) {
			datos += arreglo[k]+ ", ";
		}
		datos = datos.substring(0, datos.length()-1);
		datos += " ]";
		System.out.println(datos);
	}
}