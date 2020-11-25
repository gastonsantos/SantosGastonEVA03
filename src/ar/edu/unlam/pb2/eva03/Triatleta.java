package ar.edu.unlam.pb2.eva03;

import ar.edu.unlam.pb2.eva03.enumeradores.TipoDeBicicleta;
import ar.edu.unlam.pb2.eva03.interfaces.ICiclista;
import ar.edu.unlam.pb2.eva03.interfaces.ICorredor;
import ar.edu.unlam.pb2.eva03.interfaces.INadador;

public class Triatleta extends Deportista implements ICiclista, ICorredor, INadador{

	
	 private String DistanciaPreferida;
	 private TipoDeBicicleta TipoDeBicicleta;
	 
	public Triatleta(Integer numeroDeSocio, String nombre, String DistanciaPreferida, TipoDeBicicleta TipoDeBicicleta) {
		super(numeroDeSocio, nombre);
		this.DistanciaPreferida = DistanciaPreferida;
		this.TipoDeBicicleta = TipoDeBicicleta;
	}

	public String getDistanciaPreferida() {
		return DistanciaPreferida;
	}

	public void setDistanciaPreferida(String distanciaPreferida) {
		DistanciaPreferida = distanciaPreferida;
	}

	public TipoDeBicicleta getTipoDeBicicleta() {
		return TipoDeBicicleta;
	}

	public void setTipoDeBicicleta(TipoDeBicicleta tipoDeBicicleta) {
		TipoDeBicicleta = tipoDeBicicleta;
	}

	@Override
	public void setCantidadDeKilometrosEntrenados(Integer km) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Integer getCantidadDeKilometrosEntrenados() {
		// TODO Auto-generated method stub
		return null;
	}

	
	
	
	

	
	
}
