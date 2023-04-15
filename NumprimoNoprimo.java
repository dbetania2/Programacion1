
import java.util.Scanner;

public class NumprimoNoprimo{

	 public NumprimoNoprimo() {
    }
	
	public static void main(String[] args) {
        	Scanner read = new Scanner(System.in);
        	int contPrimo = 0;
        	int contNoPrimo = 0;
		System.out.println("Ingrese un numero entero");
        	int num = read.nextInt();
		
		if (num % 2 == 0) {
                System.out.println("El numero " + num + " No Es primo " );
            	} else {
                System.out.println("El numero " + num + " Es primo " );

		
            }

        	for(int i = 0; i < num; ++i) {
            	if (i % 2 == 0) {
                ++contPrimo;
            	} else {
                ++contNoPrimo;
            }
        }

        System.out.println("cantidad de no primos " + contNoPrimo + " cantidad de primos " + contPrimo);
    }
	
}