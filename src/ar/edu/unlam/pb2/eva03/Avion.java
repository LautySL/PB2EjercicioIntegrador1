package ar.edu.unlam.pb2.eva03;

public class Avion extends Vehiculo implements Volador {
	
	public Avion (Integer codigo, String nombre) {
		super (codigo, nombre);
	}

	@Override
	public Boolean esTerrestre() {
		return false;
	}

	@Override
	public Boolean esAcuatico() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Boolean esVolador() {
		// TODO Auto-generated method stub
		return true;
	}

}
