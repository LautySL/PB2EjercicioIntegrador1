package ar.edu.unlam.pb2.eva03;

import java.util.*;

public class FuerzaArmada {

	private Set <Vehiculo> convoy;
	private Map <String, Batalla> batallas;
	
	public FuerzaArmada () {
		this.convoy = new HashSet<>();
		this.batallas = new HashMap<>();
	}
	
	public int getCapacidadDeDefensa() {
		return this.convoy.size();
	}

	public Set<Vehiculo> getConvoy() {
		return convoy;
	}

	public void setConvoy(Set<Vehiculo> convoy) {
		this.convoy = convoy;
	}

	public Map <String, Batalla> getBatallas() {
		return batallas;
	}

	public void setBatallas(Map<String, Batalla> batallas) {
		this.batallas = batallas;
	} 
	
	public Boolean agregarVehiculo (Vehiculo vehiculoAAgregar) {
		return convoy.add(vehiculoAAgregar);
	}
	
	public Boolean enviarVehiculoALaBatalla (Batalla batalla, Vehiculo vehiculoAEnviar) throws VehiculoInexistenteException,VehiculoIncompatibleException {
		if (convoy.contains(vehiculoAEnviar)) {
			if (batalla.esCompatibleElVehiculo(vehiculoAEnviar)) {
				batalla.agregarVehiculoALaBatalla(vehiculoAEnviar);
				return true;
			} else throw new VehiculoIncompatibleException();
		} throw new VehiculoInexistenteException();
	}

	
	public void crearBatalla (String nombre, TipoDeBatalla tipo, Double latitud, Double longitud) {
		Batalla batalla = new Batalla (nombre, tipo, latitud, longitud);
		batallas.put(nombre, batalla);
	}
	
	public Batalla getBatallaPorNombre(String nombre) {
		return batallas.get(nombre);
	}
}
