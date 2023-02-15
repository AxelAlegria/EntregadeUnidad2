package tareaUnidad2;

import java.util.Scanner;
public class Ejercicio_2_17 {

	public static void main(String[] args) {
	    try (Scanner entrada = new Scanner(System.in)) {
			System.out.print("Escriba el primer numero entero: ");
			int num1 = entrada.nextInt();
			System.out.print("Escriba el segundo numero entero: ");
			int num2 = entrada.nextInt();
			System.out.print("Escriba el tercer numero entero: ");
			int num3 = entrada.nextInt();
			int suma = num1 + num2 + num3;
			int promedio = suma / 3;
			int producto = num1 * num2 * num3;
			int menor = Math.min(Math.min(num1, num2), num3);
			int mayor = Math.max(Math.max(num1, num2), num3);
			System.out.println("Suma: " + suma);
			System.out.println("Promedio: " + promedio);
			System.out.println("Producto: " + producto);
			System.out.println("Menor: " + menor);
			System.out.println("Mayor: " + mayor);
			if ( num1 == num2)
			if	(num1 == num3)
			if (num2 == num3)	
				System.out.printf( "El numero %d es igual al numero %d\n", num1, num2, num3);
		}
	    	}
}