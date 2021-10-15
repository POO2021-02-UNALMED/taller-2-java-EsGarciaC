package test;

public class Auto {

	String modelo;
	int precio;
	Asiento[] asientos;
	String marca;
	Motor motor;
	int registro;
	static int cantidadCreados;
	
	public int cantidadAsientos() {
		int x = 0;
		for(int i = 0; i < asientos.length; i++){
			if (asientos[i] instanceof Asiento) {
				x++;
			}
		}
		return x;
	}
	
	public String verificarIntegridad() {
		String result = null;
		for(int i = 0; i < asientos.length; i++) {
			if(asientos[i] instanceof Asiento) {
				if (registro != asientos[i].registro || registro != motor.registro) {
					result = "Las piesas no son originales";
					break;
				}
				else {
					result = "Auto original";
				}
			}
		}
		return result;
	}
}
