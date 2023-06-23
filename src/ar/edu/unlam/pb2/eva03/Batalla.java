package ar.edu.unlam.pb2.eva03;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Batalla {
	
	private String nombre;
	private Double latitud;
	private Double longitud;
	private TipoDeBatalla tipo;
	private Set <Vehiculo> vehiculosEnLaBatalla;
	
	public Batalla (String nombre, TipoDeBatalla tipo, Double latitud, Double longitud) {
		this.nombre = nombre;
		this.latitud = latitud;
		this.longitud = longitud;
		this.tipo = tipo;
		this.vehiculosEnLaBatalla = new HashSet <>();
	}
	
	public Boolean esCompatibleElVehiculo (Vehiculo vehiculo) {
		switch (this.tipo) {
		case TERRESTRE:
			return vehiculo instanceof Terrestre;
		case ACUATICA:
			return vehiculo.esAcuatico();
		case AEREA:
			return vehiculo.esVolador();
		default:
			return false;
		}
	}
	
	public Boolean agregarVehiculoALaBatalla (Vehiculo vehiculoAAgregar) {
		return this.vehiculosEnLaBatalla.add(vehiculoAAgregar);
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public Double getLatitud() {
		return latitud;
	}
	
	public void setLatitud(Double latitud) {
		this.latitud = latitud;
	}
	
	public Double getLongitud() {
		return longitud;
	}
	
	public void setLongitud(Double longitud) {
		this.longitud = longitud;
	}
	
	public TipoDeBatalla getTipo() {
		return tipo;
	}
	
	public void setTipo(TipoDeBatalla tipo) {
		this.tipo = tipo;
	}
	
	public Set<Vehiculo> getVehiculosEnLaBatalla() {
		return vehiculosEnLaBatalla;
	}
	
	public void setVehiculosEnLaBatalla(Set<Vehiculo> vehiculosEnLaBatalla) {
		this.vehiculosEnLaBatalla = vehiculosEnLaBatalla;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(nombre);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Batalla other = (Batalla) obj;
		return Objects.equals(nombre, other.nombre);
	}
		
}

