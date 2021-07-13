package PaquetePersona;

public class Persona {
	String nombre;
	int edad;
	float altura;
	double sueldo;

	public Persona(String nombre, int edad, float altura) {
		this.nombre = nombre;
		this.edad = edad;
		this.altura = altura;
	}

	public String miNombre() {
		System.out.println("El nombre es:" + nombre);
		return nombre;
	}

	public void miEdad() {
		if (edad < 18) {
			System.out.println("Es menor de edad");
		} else {
			System.out.println("Es un adulto");
		}
	} 
	public int obtenerEdad() {
		return edad;
	}

	public float miAltura() {
		System.out.println("La altura es:" + altura);
		return altura;
	}

	public void miSueldo(double sueldo) {
		if (sueldo < 100) {
			this.sueldo = 0.0;
		} else {
			this.sueldo = sueldo;
		}
	}
	public double obtenerSueldo() {
		System.out.println("El sueldo es:" + sueldo);
		return sueldo;
	}
}