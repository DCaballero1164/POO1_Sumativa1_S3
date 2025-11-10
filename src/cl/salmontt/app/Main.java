package cl.salmontt.app;

import cl.salmontt.model.Direccion;
import cl.salmontt.model.Empleado;
import cl.salmontt.model.Persona;

public class Main {
    public static void main(String[] args) {
//1- Se crea el primer Empleado:

        //Instancia 1: se crea el objeto direccion1 (de empleado1).
        Direccion direccion1 = new Direccion(
                "Calle Spooner",
                "31",
                "Santiago",
                "Chile",
                8320000
        );

        //Instancia 2: se crea el objeto Empleado.
        Empleado empleado1 = new Empleado(
                "Brian",
                "Griffin",
                123456789, //representa el rut o ID
                "bgriffin@planet.cl",
                912345678,
                direccion1,
                "Ventas",
                "Vendedor",
                800000.0
        );

//2- Se crea una Persona (Cliente):
        //Instancia 3: se crea el objeto dirCliente1 (de persona1).
        Direccion dirCliente1 = new Direccion(
                "Calle Evergreen",
                "742",
                "Viña del Mar",
                "Chile",
                2520000
        );

        //Instancia 4: se crea un objeto de Persona (ej: para representar a un cliente).
        Persona persona1 = new Persona(
                "Joe",
                "Swanson",
                132456789, //representa el rut o ID
                "joesw@gmail.cl",
                891234567,
                dirCliente1
        );

//3- Se crea el segundo Empleado:
        //Instancia 5: se crea el objeto direccion2 (de empleado2).
        Direccion direccion2 = new Direccion(
                "Avenida Planet Express",
                "330",
                "Santiago",
                "Chile",
                8320000
        );

        //Instancia 6: se crea el objeto empleado2.
        Empleado empleado2 = new Empleado(
                "Charles Montgomery",
                "Burns",
                124356789, //representa el rut o ID
                "montyburns@plantnu.com",
                912345887,
                direccion2,
                "Finanzas",
                "Contador",
                1000000.0

        );
        //Se muestra por consola metodos toString
        System.out.println("\n    Prueba 1: empleados y clientes en SALMONTT    ");
        System.out.println("--------------------------------------------------\n");
        System.out.println("Se muestra el empleado1 (Brian Griffin)\n");
        System.out.println(empleado1.toString());
        System.out.println("");
        System.out.println(" Se muestra la persona1 (Joe Swanson) \n");
        System.out.println(persona1.toString());
        System.out.println("");
        System.out.println("Se muestra el empleado2 (C. Mongomery Bruns)\n");
        System.out.println(empleado2.toString());
        System.out.println("\n");
        System.out.println("            Prueba 2: Getters/Setters            ");
        System.out.println("-------------------------------------------------\n");
        System.out.println("Se muestra la dirección del empleado1 (Brian Griffin)\n");
        System.out.println(empleado1.getDireccion());
        System.out.println("\nSe sube el sueldo a "+empleado2.getNombres() + " " + empleado2.getApellidos()+"\n");
        System.out.println("El sueldo anterior de " + empleado2.getNombres() + " " + empleado2.getApellidos() + " es: " + String.format("%.0f",empleado2.getSueldo()) + "\n");
        double aumentoSueldo = 200000.0;
        double nuevoSueldo = empleado2.getSueldo() + aumentoSueldo;
        empleado2.setSueldo(nuevoSueldo);
        System.out.println("El nuevo de sueldo de " + empleado2.getNombres() + " " + empleado2.getApellidos() + " es: " + String.format("%.0f",empleado2.getSueldo()) + "\n");
    }
}