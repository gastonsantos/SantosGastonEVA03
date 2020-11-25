package ar.edu.unlam.pb2.eva03;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import ar.edu.unlam.pb2.eva03.enumeradores.TipoDeEvento;

public class Club {

	
	private String nombre;
	private Set<Deportista> socios;
	private HashMap<String,Evento> competencias;
	private Integer CantidadSocios;
	
	
public Club(String nombre) {
		
	this.nombre = nombre;
	this.socios = new HashSet<Deportista>();
	this.competencias = new HashMap<String,Evento>();
	CantidadSocios= 0;
	}


public void crearEvento(TipoDeEvento tipoDeEvento, String nombre) {

	competencias.put(nombre,new Evento(tipoDeEvento));
}





public Boolean agregarDeportista(Deportista depor1) {
	
	return socios.add(depor1);
}


public Integer getCantidadSocios() {
	return socios.size();
}



public void setCantidadSocios(Integer cantidadSocios) {
	CantidadSocios = cantidadSocios;
}



public String getNombre() {
	return nombre;
}



public void setNombre(String nombre) {
	this.nombre = nombre;
}



public Set<Deportista> getSocios() {
	return socios;
}



public void setSocios(Set<Deportista> socios) {
	this.socios = socios;
}


public Boolean inscribirEnEvento(String string, Deportista celeste) throws NoEstaPreparado {
	Boolean inscribio = false;
	for(Entry<String, Evento> entry: competencias.entrySet()) {
		
		if(entry.getKey().equals(string)) {
			
		}
		
	}
	
	
}










	
	
	
	
	
}
