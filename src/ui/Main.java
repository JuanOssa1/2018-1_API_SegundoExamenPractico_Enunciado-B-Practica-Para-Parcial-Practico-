package ui;
import model.*;
import java.util.Scanner;
import java.util.ArrayList;
public class Main{
	
	private Scanner dataRead;
	private Club happyclub;
	
	public Main(){
		init();
	}
	public static void main(String args[]){
		Main m = new Main();
		m.menu(0);
	}
	public void init(){
		dataRead = new Scanner(System.in);
		happyclub = new Club("happyclub", 1999);
		happyclub.afiliarDeportista("Juan", "Ossa", 2005, Deportista.TI, "123456", 2);
		happyclub.afiliarDeportista("Juan", "Urrea", 2005, Deportista.TI, "123456", 2);
		happyclub.afiliarDeportista("Juan", "Insuasty", 2005, Deportista.TI, "123456", 2);
		happyclub.afiliarDeportista("Isabella", "Benavides", 2005, Deportista.TI, "123456", 2);
		happyclub.afiliarDeportista("Julian", "Insuasty", 2005, Deportista.TI, "123456", 2);
		happyclub.afiliarDeportista("Jose", "Ossa", 2005, Deportista.TI, "123456", 2);
		
		
	}
	public void menu(int myOption){
		int opcion = myOption;
		if(opcion == 0 ){
			
			mostrarMenu();
			opcion = dataRead.nextInt();
			dataRead.nextLine();
		}
		
		
		if(opcion == 1){
			System.out.println("AFILIAR DEPORTISTA");
			System.out.println("Igrese el nombre del deportista");
			String nombre = dataRead.nextLine();
			System.out.println("Ingrese el apellido del deportista");
			String apellido = dataRead.nextLine();
			System.out.println("Ingrese el anio de nacimiento del deportista");
			int anioDeNacimiento = dataRead.nextInt();dataRead.nextLine();
			System.out.println("Ingrese " + Deportista.TI+ " " + Deportista.CC+ " " + Deportista.CE+ " " + Deportista.PAS);
			String tipoDeId = dataRead.nextLine();
			System.out.println("Ingrese el numero del id sin puntos ni comas");
			String numeroDeId = dataRead.nextLine();
			System.out.println("Ingrese 1 Para sexo femenino o 2 Para sexo maculino");
			int sexo = dataRead.nextInt();dataRead.nextLine();
			//Deportista deportista = new Deportista(nombre, apellido, anioDeNacimiento, tipoDeId, numeroDeId, sexo);
			happyclub.afiliarDeportista(nombre, apellido, anioDeNacimiento, tipoDeId, numeroDeId, sexo);
			
		}
		else if(opcion == 2){
			System.out.println("LISTAR DEPORTISTAS");
			System.out.println("Ingrese la edad minima que quiere listar en numeros");
			int edadMinima = dataRead.nextInt();dataRead.nextLine();
			System.out.println("Ingrese la edad maxima que quiere listar en numeros");
			int edadMaxima = dataRead.nextInt();dataRead.nextLine();
			System.out.println(happyclub.listarDeportistas(edadMinima, edadMaxima));
		}
		
		else if(opcion == 3){
			System.out.println("DINERO EN LA CAJA DEL CLUB");
			System.out.println("Dinero en caja: " + happyclub.calcularIngresos());
		}
		menu(0);
	}
	public void mostrarMenu(){
		//int opcion = 0;
		System.out.println("1. Afiliar deportista");
		System.out.println("2. Listar deportista por rango de edad");
		System.out.println("3. Consultar dinero en caja del club");
		//opcion = dataRead.nextInt();
	}
}