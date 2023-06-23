package ar.edu.unlam.pb2.eva03;

public class Tanque extends Vehiculo implements Terrestre {

	public Double velocidad;
	
	public Tanque(Integer codigo, String nombre) {
		super(codigo, nombre);
		this.velocidad = 0.0;
	}

	@Override
	public Boolean esTerrestre() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public Boolean esAcuatico() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Boolean esVolador() {
		// TODO Auto-generated method stub
		return false;
	}
	
	@Override
	public Double getVelocidad() {
		return this.velocidad;
	}
}
