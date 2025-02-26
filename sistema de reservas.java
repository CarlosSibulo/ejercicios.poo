public class Cliente {
    private String nombre;

    // Constructor
    public Cliente(String nombre) {
        this.nombre = nombre;
    }

    // Métodos getter y setter
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    
    public String toString() {
        return "Cliente: " + nombre;
    }
}
public class Reserva {
    private String cliente;
    private String fecha;

    // Constructor
    public Reserva(String cliente, String fecha) {
        this.cliente = cliente;
        this.fecha = fecha;
    }

    // Métodos getter y setter
    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String toString() {
        return "Reserva [Cliente: " + cliente + ", Fecha: " + fecha + "]";
    }
}

import java.util.ArrayList;
import java.util.List;

public class SistemaReserva {
    private List<Reserva> reservas;

    // Constructor
    public SistemaReserva() {
        reservas = new ArrayList<>();
    }

    // Método para agregar una reserva
    public void agregarReserva(Cliente cliente, String fecha) {
        Reserva nuevaReserva = new Reserva(cliente.getNombre(), fecha);
        reservas.add(nuevaReserva);
    }

    // Método para mostrar todas las reservas
    public void mostrarReservas() {
        if (reservas.isEmpty()) {
            System.out.println("No hay reservas realizadas.");
        } else {
            for (Reserva reserva : reservas) {
                System.out.println(reserva);
            }
        }
    }
}
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SistemaReserva sistema = new SistemaReserva();

        // Menú principal
        while (true) {
            System.out.println("Sistema de Reservas");
            System.out.println("1. Realizar Reserva");
            System.out.println("2. Mostrar Reservas");
            System.out.println("3. Salir");
            System.out.print("Elige una opción: ");
            int opcion = scanner.nextInt();
            scanner.nextLine();  // Limpiar el buffer

            switch (opcion) {
                case 1:
                    // Solicitar datos del cliente y fecha de reserva
                    System.out.print("Ingresa tu nombre: ");
                    String nombreCliente = scanner.nextLine();
                    System.out.print("Ingresa la fecha de la reserva (ej. 25/02/2025): ");
                    String fechaReserva = scanner.nextLine();

                    Cliente cliente = new Cliente(nombreCliente);
                    sistema.agregarReserva(cliente, fechaReserva);
                    System.out.println("Reserva realizada con éxito.");
                    break;

                case 2:
                    // Mostrar todas las reservas
                    sistema.mostrarReservas();
                    break;

                case 3:
                    // Salir
                    System.out.println("¡Gracias por usar el sistema de reservas!");
                    scanner.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("Opción no válida.");
                    break;
            }
        }
    }
}
