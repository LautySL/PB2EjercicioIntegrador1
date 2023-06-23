package ar.edu.unlam.pb2.eva03;

public class Hidroavion extends Vehiculo implements Volador, Acuatico {
	
	private Double profundidad, velocidad;
	
	public Hidroavion(Integer codigo, String nombre) {
		super (codigo, nombre);
		this.profundidad = 0.0;
		this.velocidad = 0.0;
	}
	
	public Double getProfundidad() {
		return profundidad;
	}

	public Double getVelocidad() {
		return velocidad;
	}

	@Override
	public Boolean esTerrestre() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Boolean esAcuatico() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public Boolean esVolador() {
		// TODO Auto-generated method stub
		return true;
	}


}
