package model;
public class Deportista{
	public static final int ANIOBASE = 2019;
	public static final String TI = "1. Tarjeta de identidad";
	public static final String CC = "2. Cedula de ciudadania";
	public static final String CE = "3. Cedula de extrangeria";
	public static final String PAS ="4. Pasaporte";
	public static final int FEMENINO = 1;
	public static final int MASCULINO = 2;
	private String nombre;
	private String apellido;
	private int anioNacimiento;
	private String tipoDeId;
	private String numeroDeId;
	private int sexo;
	public Deportista(String nombre, String apellido, int anioNacimiento, String tipoDeId, String numeroDeId, int sexo){
		this.nombre = nombre;
		this.apellido = apellido;
		this.anioNacimiento = anioNacimiento;
		this.tipoDeId = tipoDeId;
		this.numeroDeId = numeroDeId;
		this.sexo = sexo;
	}
	public int getAnioNacimiento(){
		return anioNacimiento;
	}
	public String getNombre()
	{
		return nombre;
	} 
	public String getApellido(){
		return apellido;
	}
	public int calcularEdad()
	{
		int edad = 0;
		edad = ANIOBASE - anioNacimiento;
		return edad;
	}
	public String getAll(){
		String x = " " + nombre + " " + apellido + "La edad es: " + calcularEdad() + " ";
		return x;
	}
}