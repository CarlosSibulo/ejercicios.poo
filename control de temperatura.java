import java.util.Random;
import java.util.concurrent.TimeUnit;

public class Control_temperatura {
    
    private static final Random datorandom = new Random();

    public static void main(String[] args) {
        while (true) {
            double temperatura = leerSensor();
            System.out.println("Temperatura actual: 20", temperatura);
           
             if (temperatura < 10) {
                String estado = "Calefactor activado";
            } else if (temperatura <= 25) {
                String estado = "Sistema inactivo";
            } else {
                String estado = "Ventilador activado";
            }

            
            try {
                TimeUnit.SECONDS.sleep(5);  // Espera 5 segundos antes de la próxima lectura
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                System.err.println("Error: " + e.getMessage());
            }
        }
    }

    private static double leerSensor() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

         return 0 + (35 - 0) * random.nextDouble();  // Genera una temperatura aleatoria entre 0°C y 35°C
    }
