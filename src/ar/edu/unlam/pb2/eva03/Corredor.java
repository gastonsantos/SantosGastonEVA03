package ar.edu.unlam.pb2.eva03;

import ar.edu.unlam.pb2.eva03.interfaces.ICorredor;

public class Corredor extends Deportista implements ICorredor{
	
	private Integer CantidadDeKilometrosEntrenados;
	private Integer DistanciaPreferida;
	
	public Corredor(Integer numeroDeSocio, String nombre, Integer CantidadDeKilometrosEntrenados) {
		super(numeroDeSocio, nombre);
		this.CantidadDeKilometrosEntrenados = CantidadDeKilometrosEntrenados;
	}

	

	public Integer getDistanciaPreferida() {
		return DistanciaPreferida;
	}



	public void setDistanciaPreferida(Integer distanciaPreferida) {
		DistanciaPreferida = distanciaPreferida;
	}



	public Integer getCantidadDeKilometrosEntrenados() {
		return CantidadDeKilometrosEntrenados;
	}


	public void setCantidadDeKilometrosEntrenados(Integer cantidadDeKilometrosEntrenados) {
		CantidadDeKilometrosEntrenados = cantidadDeKilometrosEntrenados;
	}
	
	
	

	
	
}
