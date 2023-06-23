package ar.edu.unlam.pb2.eva03;

public class Barco extends Vehiculo implements Acuatico {

	public Barco(Integer codigo, String nombre) {
		super(codigo, nombre);
	}

	@Override
	public Boolean esTerrestre() {
		return false;
	}

	@Override
	public Boolean esAcuatico() {
		return true;
	}

	@Override
	public Boolean esVolador() {
		return false;
	}

}
