import java.util.Scanner;

public class Reserva {
    private Cadena nombre;
    
   public void mostrarReservas(){
if (reservas.isEmpty()){
System.out.println("No hay reservas realizadas.");
}else{
    Iterable<Reserva> reservas = null;
for(Reserva reserva : reservas){
        boolean Reserva = false;
System.out.println(Reserva);
}
}
}
}
import java.util.Scanner;

public class Reserva{
public static void main(String[]args){
Scanner scanner = new Scanner(System.in);
SistemaReserva Reserva = new SistemaReserva();
//Menu principal

while(true){
System.out.println("Sistema de Rservas");
System.out.println("1. Realizar Reservas");
System.out.println("2. Mostrar Reservas");
System.out.println("3. Salir");
System.out.print("Elige una opcion:");
int opcion = Scanner.nextInt();
scanner.nextLine(); //Limpiar el buffer
    switch (opcion){
    case 1:
        //Solicitar datos del cliente y fecha de reserva
        
        System.out.print("Ingresa tu nombre:");
        String nombreCliente = scanner.nextline();
        System.out.print("Ingresa la fecha de la reserva (ej.25/02/2025):");
        String fechaReserva = scanner.nextline();
        
        Cliente cliente = new Cliente(nombreCliente);
        sistema.agregarReserva(cliente, fechaReserva);
        System.out.println("Reserva realizada con exito.");
        break;
    case 2:
        //Mostrar todas las reservas
        sistema.mostrarReservas();
        break;
     case 3:
        //Salir
        System.out.println("¡Gracias por usar el sistema de Reservas!");
        scanner.close();
         System.exit(0);
        break;
        
    default:
          System.out.println("opcion no valida.");
          break;
    }
}
}
}
