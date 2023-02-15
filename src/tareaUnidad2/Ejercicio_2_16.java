package tareaUnidad2;
import java.util.Scanner;
public class Ejercicio_2_16 {

	public static void main( String args[] )
	{       // Abre el metodo main
	try (Scanner entrada = new Scanner(System.in)) {
		int numero1;
		int numero2;
		 
		System.out.println("\nIntroduzca un entero: ");
		numero1 = entrada.nextInt();
		 
		System.out.println("\nIntroduzca un segundo entero: ");
		numero2 = entrada.nextInt();
		 
		System.out.printf("El mayor es: %d\n", Math.max(numero1, numero2));
		System.out.printf("El menor es: %d\n", Math.min(numero1, numero2));
		 
		if ( numero1 == numero2 )
		System.out.printf( "\nEl numero %d es igual al numero %d\n", numero1, numero2);
	}
	}
	
}