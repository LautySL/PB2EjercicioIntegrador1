package ar.edu.unlam.pb2.eva03;

public class Portavion extends Vehiculo implements Acuatico{

	public Portavion(Integer codigo, String nombre) {
		super(codigo, nombre);
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

}
