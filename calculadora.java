package ejerciciosjava;

import java.util.Scanner;

/**
 *
 * @author SENA
 */
public class calculadora {
    
    public int sumar(int num1, int num2){
        return num1+num2;
    }
    public int resta(int num1, int num2){
    
        return num1-num2;
    }
    public int multiplicacion(int num1, int num2){
    
        return num1*+num2;
    }
    public int divicion(int num1, int num2){
    
        return num1/num2;
    }
    
    public void eleccion(){
        Scanner respuesta = new Scanner(System.in);
        System.out.println("elija el numero 1");
        int dato=respuesta.nextInt();
        System.out.println("elija el numero 2");
        int dato2= respuesta.nextInt();
        String eleccion = respuesta.next();
        System.out.println("Que desea hacer");
        String Stringeleccion = respuesta.next();
        switch(eleccion){
            case "+":
                
                sumar(dato, dato2);
            case "-":
                
                resta(dato, dato2);
            case "*":
                multiplicacion(dato, dato2);
                
            case"/":
                divicion(dato, dato2);
        }
    }
}
package ejerciciosjava;

/**
 *
 * @author SENA
 */
public class EjerciciosJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        calculadora ejercico = new calculadora();
        ejercico.eleccion();
    }
    
}
