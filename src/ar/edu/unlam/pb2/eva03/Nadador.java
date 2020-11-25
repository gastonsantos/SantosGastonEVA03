package ar.edu.unlam.pb2.eva03;

import ar.edu.unlam.pb2.eva03.interfaces.INadador;

public class Nadador extends Deportista implements INadador {
	private String EstiloPreferido;

	public Nadador(Integer numeroDeSocio, String nombre, String EstiloPreferido) {
		super(numeroDeSocio, nombre);
		this.EstiloPreferido = EstiloPreferido;
	}

	public String getEstiloPreferido() {
		return EstiloPreferido;
	}

	public void setEstiloPreferido(String estiloPreferido) {
		EstiloPreferido = estiloPreferido;
	}

	
	
	


	
	
	
}
