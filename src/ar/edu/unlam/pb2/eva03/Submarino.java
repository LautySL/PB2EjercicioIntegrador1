package ar.edu.unlam.pb2.eva03;

public class Submarino extends Vehiculo implements Acuatico {

	public Double profundidad;
	
	public Submarino(Integer codigo, String nombre) {
		super(codigo, nombre);
		this.profundidad = 0.0;
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
		return false;
	}
	
	@Override
	public Double getProfundidad() {
		return profundidad;
	}

}
