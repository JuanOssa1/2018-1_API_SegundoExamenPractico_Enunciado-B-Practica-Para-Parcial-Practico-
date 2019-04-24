package model;
import java.util.ArrayList;
public class Club {
	public static final int COSTO_AFILIACION = 80000;
	public static final int EDAD_SIN_PAGO = 12;
	private String razonSocial;
	private int anioDeFundacion;
	private int dineroEnCaja;
	private ArrayList<Deportista> deportistas;
	
	public Club(String razonSocial, int anioDeFundacion){
		this.razonSocial = razonSocial;
		this.anioDeFundacion = anioDeFundacion;
		this.dineroEnCaja = dineroEnCaja;
		deportistas = new ArrayList<Deportista>();
	}
	public String getRazonSocial(){
		return razonSocial;
	}
	public int getAnioDeFundacion(){
		return anioDeFundacion;
	}
	public int getDineroEnCaja(){
		return dineroEnCaja;
	}
	public void setRazonSocial(String newRazonSocial){
		this.razonSocial = newRazonSocial;
	}
	public void setAnioDeFundacion(int newAnioDeFundacion){
		this.anioDeFundacion = newAnioDeFundacion;
	}
	public void setDineroEnCaja(int newDineroEnCaja){
		this.dineroEnCaja = newDineroEnCaja;
	}
	public void afiliarDeportista(String nombre, String apellido, int anioDeNacimiento, String tipoDeId, String numeroDeId, int sexo){
		//int centinel = -1;
		
		if(tipoDeId.equals(1)){
			tipoDeId = Deportista.TI;
		}
		else if(tipoDeId.equals(2)){
			tipoDeId = Deportista.CC;
		}
		else if (tipoDeId.equals(3)){
			tipoDeId = Deportista.CE;
		}
		else if (tipoDeId.equals(4)){
			tipoDeId = Deportista.PAS;
		}
		Deportista deportista = new Deportista(nombre, apellido, anioDeNacimiento, tipoDeId, numeroDeId, sexo);
		deportistas.add(deportista);
		/*
		for(int i = 0; i < deportistas.size() && centinel == -1; i++ ){
			if(deportistas.get(i)==null)
		}
		*/
	}
	public String listarDeportistas(int edadMinima, int edadMaxima)
	{
		String contador = "";
		for (int i = 0; i < deportistas.size(); i++)
		{
			if(deportistas.get(i).calcularEdad() > edadMinima && deportistas.get(i).calcularEdad() < edadMaxima)
			{
				contador += deportistas.get(i).getAll();
			}
		}
		return contador;
	}
	public int calcularIngresos(){
		int contador = 0;
		int total = 0;
		for (int i = 0; i < deportistas.size(); i++)
		{
			if(deportistas.get(i).calcularEdad() > EDAD_SIN_PAGO)
			{
				contador ++;
				total = contador*COSTO_AFILIACION;
			}
		}
		return total;
	}
}