package test;

public class Asiento {

	String color;
	int precio;
	int registro;
	
	public void cambiarColor(String color) {
		if(color == "verde" || color == "rojo" || color == "negro" || color == "blanco" || color == "amarillo") {
			this.color = color;
		}
	}
	
}
