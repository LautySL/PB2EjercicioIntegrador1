package ar.edu.unlam.pb2.eva03.test;

import static org.junit.Assert.*;

import ar.edu.unlam.pb2.eva03.*;

public class Test {

	@org.junit.Test
	public void queSePuedaCrearUnVehiculoVolador() {
		Vehiculo avion = new Avion (1, "AN-210");
		
		Double alturaEsperada = 0.0;
		Double alturaDelAvion = avion.getAltura();
		
		assertEquals(alturaEsperada, alturaDelAvion);
	}
	
	@org.junit.Test
	public void queSePuedaCrearUnObjetoTerrestre() {
		Vehiculo tanque = new Tanque (1, "Mark IV");
		
		Double velocidadEsperada = 0.0;
		Double velocidadDelTanque = tanque.getVelocidad();
		
		assertEquals(velocidadEsperada, velocidadDelTanque);
	}
	
	@org.junit.Test
	public void queSePuedaCrearUnObjetoAcuatico() {
		Vehiculo submarino = new Submarino (1, "ARA-San Juan");
		
		Double profundidadEsperada = 0.0;
		Double profundidadDelSubmarino = submarino.getProfundidad();
		
		assertEquals(profundidadEsperada, profundidadDelSubmarino);
	}
	
	@org.junit.Test
	public void queSePuedaCrearUnObjetoAnfibio() {
		Vehiculo APC = new APC (1,"LARC-5");
		
		Double velocidadEsperada = 0.0;
		Double profundidadEsperada = 0.0;
		Double velocidadDelAPC = APC.getVelocidad();
		Double profundidadDelAPC = APC.getProfundidad();
		
		assertEquals(profundidadEsperada, profundidadDelAPC);
		assertEquals(velocidadEsperada, velocidadDelAPC);
	}
	
	@org.junit.Test
	public void queSePuedaCrearUnHidroavion() {
		Vehiculo hidroavion = new Hidroavion (1, "AG600");
		
		Double velocidadEsperada = 0.0;
		Double profundidadEsperada = 0.0;
		Double velocidadDelHidroavion = hidroavion.getVelocidad();
		Double profundidadDelHidroavion = hidroavion.getProfundidad();
		
		assertEquals(profundidadEsperada, profundidadDelHidroavion);
		assertEquals(velocidadEsperada, velocidadDelHidroavion);
	}
	
	@org.junit.Test
	public void queSePuedaArmarElConvoy() {
		FuerzaArmada fuerzaAereaArgentina = new FuerzaArmada();
		
		fuerzaAereaArgentina.agregarVehiculo(new Avion (1, "AN-210"));
		fuerzaAereaArgentina.agregarVehiculo(new Submarino(1, "ARA-San Juan"));
		fuerzaAereaArgentina.agregarVehiculo(new APC (1,"LARC-5"));
		fuerzaAereaArgentina.agregarVehiculo(new Hidroavion (1, "AG600"));
		
		assertEquals (4, fuerzaAereaArgentina.getCapacidadDeDefensa());
	}
	
	@org.junit.Test
	public void queSePuedaArmarUnaBatalla() {
		FuerzaArmada fuerzaAereaArgentina = new FuerzaArmada();
		
		fuerzaAereaArgentina.crearBatalla("Guerra", TipoDeBatalla.AEREA, 100.5, 20.3);
		
		assertEquals(100.5,fuerzaAereaArgentina.getBatallaPorNombre("Guerra").getLatitud(),0.01);
		assertEquals(20.3,fuerzaAereaArgentina.getBatallaPorNombre("Guerra").getLongitud(),0.01);
	}
	
	@org.junit.Test
	public void queSePuedaPresentarLaBatalla() throws Exception {
		FuerzaArmada fuerzaAereaArgentina = new FuerzaArmada();
		
		Vehiculo tanque = new Tanque (1, "Mark IV");
		Vehiculo camion = new Camion (2, "T-72");
		
		fuerzaAereaArgentina.agregarVehiculo(camion);
		fuerzaAereaArgentina.agregarVehiculo(tanque);
		
		fuerzaAereaArgentina.crearBatalla("Guerra", TipoDeBatalla.TERRESTRE, 100.5, 20.3);
		
		Batalla batalla = fuerzaAereaArgentina.getBatallaPorNombre("Guerra");
		
		assertTrue(fuerzaAereaArgentina.enviarVehiculoALaBatalla(batalla, camion));
		assertTrue(fuerzaAereaArgentina.enviarVehiculoALaBatalla(batalla, tanque));
	}
	
	@org.junit.Test
	public void queSePuedaPresentarUnaBatallaNaval() throws Exception {
		FuerzaArmada fuerzaAereaArgentina = new FuerzaArmada();

		Submarino submarino = new Submarino(8, "A-10");
		Portaviones portaviones = new Portaviones(9, "A-10");
		Hidroavion hidroavion = new Hidroavion(12, "A-10");
		
		fuerzaAereaArgentina.agregarVehiculo(hidroavion);
		fuerzaAereaArgentina.agregarVehiculo(portaviones);
		fuerzaAereaArgentina.agregarVehiculo(submarino);

		fuerzaAereaArgentina.crearBatalla("Pacifico", TipoDeBatalla.ACUATICA, 200.5, 45.8);
		
		Batalla batalla = fuerzaAereaArgentina.getBatallaPorNombre("Pacifico");

		assertTrue(fuerzaAereaArgentina.enviarVehiculoALaBatalla(batalla, submarino));
		assertTrue(fuerzaAereaArgentina.enviarVehiculoALaBatalla(batalla, portaviones));
		assertTrue(fuerzaAereaArgentina.enviarVehiculoALaBatalla(batalla, hidroavion));
	}
	
	@org.junit.Test (expected = VehiculoIncompatibleException.class)
	public void queSeNoSePuedaEnviarAUnaBatallaEnTierraUnBarco() throws Exception {
		FuerzaArmada fuerzaAereaArgentina = new FuerzaArmada();

		Tanque tanque = new Tanque(5, "Renault FT");
		Camion camion = new Camion(6, "T-72");
		Destructor destructor = new Destructor(11, "A-10");
		
		fuerzaAereaArgentina.agregarVehiculo(tanque);
		fuerzaAereaArgentina.agregarVehiculo(camion);
		fuerzaAereaArgentina.agregarVehiculo(destructor);

		fuerzaAereaArgentina.crearBatalla("San Lorenzo", TipoDeBatalla.TERRESTRE, 100.5, 20.3);
		
		Batalla batalla = fuerzaAereaArgentina.getBatallaPorNombre("San Lorenzo");
		
		assertTrue(fuerzaAereaArgentina.enviarVehiculoALaBatalla(batalla, destructor));
	}
	
	@org.junit.Test (expected = VehiculoInexistenteException.class)
	public void queSeNoSePuedaEnviarAUnaBatallaUnVehiculoQueNoExista() throws Exception {
		FuerzaArmada fuerzaAereaArgentina = new FuerzaArmada();

		Tanque tanque = new Tanque(5, "Renault FT");
		Camion camion = new Camion(6, "T-72");
		
		fuerzaAereaArgentina.agregarVehiculo(tanque);

		fuerzaAereaArgentina.crearBatalla("San Lorenzo", TipoDeBatalla.TERRESTRE, 100.5, 20.3);
		
		Batalla batalla = fuerzaAereaArgentina.getBatallaPorNombre("San Lorenzo");

		assertFalse(fuerzaAereaArgentina.enviarVehiculoALaBatalla(batalla, camion));
	}
}
