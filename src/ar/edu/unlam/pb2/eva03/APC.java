package ar.edu.unlam.pb2.eva03;

public class APC extends Vehiculo implements Terrestre, Acuatico {
	
	private Double profundidad, velocidad;
	
	public APC (Integer codigo, String nombre) {
		super (codigo, nombre);
		this.profundidad = 0.0;
		this.velocidad = 0.0;
	}

	@Override
	public Boolean esTerrestre() {
		return true;
	}

	@Override
	public Boolean esAcuatico() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public Boolean esVolador() {
		// TODO Auto-generated method stub
		return false;
	}
	
	@Override
	public Double getProfundidad() {
		return profundidad;
	}
	
	@Override
	public Double getVelocidad() {
		return this.velocidad;
	}
	
}
