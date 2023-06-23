package ar.edu.unlam.pb2.eva03;

public class Destructor extends Vehiculo implements Acuatico {

	public Destructor(Integer codigo, String nombre) {
		super(codigo, nombre);
		// TODO Auto-generated constructor stub
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
