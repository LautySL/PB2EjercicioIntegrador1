package ar.edu.unlam.pb2.eva03;

public class VehiculoInexistenteException extends Exception{
	
	public VehiculoInexistenteException() {
		super("El vehículo no se puede enviar al campo de batalla. No existe.");
	}
	
}
