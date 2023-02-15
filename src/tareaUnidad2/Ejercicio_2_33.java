package tareaUnidad2;
import java.util.Scanner;
public class Ejercicio_2_33 {

	public static void main(String[] args) {
	    try (Scanner input = new Scanner(System.in)) {
			System.out.print("Ingrese su peso en kilogramos: ");
			double peso = input.nextDouble();
			System.out.print("Ingrese su altura en metros: ");
			double altura = input.nextDouble();
			double bmi = peso / (altura * altura);
			System.out.println("Su indice de masa corporal es: " + bmi );
			
if (bmi > 30 ) {
   System.out.println(   "Usted esta Obeso" );
}
else if (bmi<30&&bmi>25 ) {
   System.out.println("Usted tiene Sobre Peso");
   
}else if (bmi < 25 && bmi >18.5 ) {
			System.out.println("Usted tiene el Peso Normal");
}else if (bmi <= 18.5) {
			System.out.println("Usted tiene Bajo Peso");
}
		}
	    
	    System.out.println("\nSegun el Departamento de Salud y Servicios Humanos/Instituto Nacional de Salud:");
	    System.out.println("BMI Valores");
	    System.out.println("Bajo peso: menos de 18.5");
	    System.out.println("Normal:entre 18.5 y 24.9");
	    System.out.println("Sobrepeso: entre 25 y 29.9");
	    System.out.println("obeso: 30 o mas");

}
}