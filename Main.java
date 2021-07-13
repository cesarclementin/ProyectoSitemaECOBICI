package PaquetePersona;

public class Main {

	public static void main(String[] args) {

		Persona persona1 = new Persona("Pablo Cantarino", 20, (float) 1.80);
		persona1.miNombre();
		System.out.println("La edad es:"+persona1.obtenerEdad());
		persona1.miEdad();
		persona1.miAltura();
		persona1.miSueldo(20000);
		persona1.obtenerSueldo();
        Persona persona2 = new Persona("Carlos Santana", 15, (float) 1.60); 
		persona2.miNombre();
		System.out.println("La edad es:"+persona2.obtenerEdad());
		persona2.miEdad();
		persona2.miAltura();
		persona2.miSueldo(5000);
		persona2.obtenerSueldo();
	}

}
