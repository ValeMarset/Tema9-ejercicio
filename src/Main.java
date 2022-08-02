public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.nombre= "Valentina";
        cliente.edad = 23;
        cliente.telefono= "099999999";
        cliente.credito= 123.4;

        System.out.println("El nombre del cliente es: " + cliente.nombre + ", su edad es: "
                + cliente.edad + ", su telefono es: " + cliente.telefono + " y su credito es: "
                + cliente.credito + " pesos.");

        Trabajador trabajador = new Trabajador();
        trabajador.nombre = "Jacinto";
        trabajador.edad= 34;
        trabajador.telefono= "098888888";
        trabajador.salario = 123000.5;


        System.out.println("El nombre del cliente es: " + trabajador.nombre + ", su edad es: "
                + trabajador.edad + ", su telefono es: " + trabajador.telefono + " y su salario es: "
                + trabajador.salario + " pesos.");
    }
}


class Persona{
    String nombre;
    int edad;
    String telefono;
}

class Cliente extends Persona {
    double credito;
}


class Trabajador extends Persona {
    double salario;
}
