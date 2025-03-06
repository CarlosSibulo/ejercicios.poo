package luces_automatico;
import java.util.Random;
import java.util.concurrent.TimeUnit;


public class luces_automatico {
    private static final Random datoRandom = new Random();
    
    public static void main(String[]args) throws InterruptedException{
        while (true){
            double luces = leerSensor();
            System.out.println("luces actual: 10", double luces);
            
            if(luces<10){
                String estado = "luces activadas";
            } else if (luces <=15){
                String estado = "luces inactivas";
            }else {
                String estado = "sensor activado";
            }
            
            try{
                TimeUnit.SECONDS.sleep(5); //Espera 5 segundos antes de la proxima lectura
            }catch(InterruptedException){
                thread.currentThread().interrupt();
                System.err.println("Error: "+ e.getMessage());
            }
        }
    }
    private static double leerSensor() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    return 0 + (15 - 0) * random.nexDouble(); //Genera unas luces entre 0 y 15

  }
