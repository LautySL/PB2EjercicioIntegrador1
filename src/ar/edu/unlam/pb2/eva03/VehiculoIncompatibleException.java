package ar.edu.unlam.pb2.eva03;

public class VehiculoIncompatibleException extends Exception {
	
	public VehiculoIncompatibleException() {
		super("El veh�culo no es compatible en este tipo de batalla.");
	}
}
