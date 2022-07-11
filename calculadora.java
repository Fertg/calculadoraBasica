import java.util.Scanner;

public class calculadora {	
	public static void main(String[] args) {

	int opcion=0; //Opcion 
	Scanner sc=new Scanner(System.in); //Clase para capturar parametros desde el teclado
	do {
	
	System.out.println("--------------Calculadora---------- ");
	System.out.println("Introduzca la opción: ");
	System.out.println("1: Suma.");
	System.out.println("2: Resta. ");
	System.out.println("3: División.");
	System.out.println("4: Multiplicación.");
	System.out.println("...........................");
	System.out.println("0: Salir del programa. ");
	
	opcion=Integer.parseInt(sc.nextLine()); //pasamos a entero los parametros de entrada para la opcion
	
	if(opcion<0 || opcion >4) { // si no es una opcion entre 1 y 4
		System.out.println("Opcion no válida vuelva a elegir la opción");
	}else if(opcion!=0){
		
		float operando1, operando2;
		System.out.println("Introduzca el primer operando ");
		operando1=Float.parseFloat(sc.nextLine());
		System.out.println("Introduzca el segundo operando ");
		operando2=Float.parseFloat(sc.nextLine());
		switch (opcion) {
		case 1: { //switch para elegir la opcion que se le pasa por teclado
			System.out.println("El resultado es: "+(operando1+operando2));
			break;
		}case 2: {
			System.out.println("El resultado es: "+(operando1-operando2));
			break;
		}case 3: {
			System.out.println("El resultado es: "+(operando1/operando2));
			break;
		}case 4: {
			System.out.println("El resultado es: "+(operando1*operando2));
			break;
		  }	
	   }
	}
	}while(opcion!=0) ;
	sc.close();
	System.err.println("Saliendo del programa.........");
	}

}
