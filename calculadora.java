package ejercicios.poo.java;

import java.util.Scanner;

public class Calculadora {
    
public class Principal {
    public static void main(String[] args) {
        Scanner Tomardatos = new Scanner(System.in);
        Calculadora objcalculadora = new Calculadora();
        boolean continuar = true;
        
        while (continuar) {
            System.out.println("Introduzca el primer número: ");
            double num1 = Tomardatos.nextDouble();
            System.out.println("Introduzca el segundo número: ");
            double num2 = Tomardatos.nextDouble();
            System.out.println("Seleccione una operación (+, -, *, /): ");
            char operacion = Tomardatos.next().charAt(0);
            double resultado = 0;
            boolean operacionValida = true;
            
            switch (operacion) {
                case '+':
                    resultado = objcalculadora.sumar(num1, num2);
                    break;
                case '-':
                    resultado = objcalculadora.restar(num1, num2);
                    break;
                case '*':
                    resultado = objcalculadora.multiplicar(num1, num2);
                    break;
                case '/':
                    try {
                        resultado = objcalculadora.dividir(num1, num2);
                    } catch (ArithmeticException e) {
                        System.out.println(e.getMessage());
                        operacionValida = false;
                    }
                    break;
                default:
                    System.out.println("Operación no válida. Por favor, seleccione una operación válida.");
                    operacionValida = false;
            }
            
            if (operacionValida) {
                System.out.println("El resultado es: " + resultado);
            }
            
            System.out.println("¿Desea realizar otro cálculo? (s/n): ");
            char respuesta = Tomardatos.next().charAt(0);
            if (respuesta != 's' && respuesta != 'S') {
                continuar = false;
            }
        }
        
        System.out.println("Gracias por usar la calculadora. ¡Hasta luego!");
        Tomardatos.close();
    }
}
public class Calculadora {
    public double sumar(double num1, double num2) {
        return num1 + num2;
    }
    
    public double restar(double num1, double num2) {
        return num1 - num2;
    }
    
    public double multiplicar(double num1, double num2) {
        return num1 * num2;
    }
    
    public double dividir(double num1, double num2) {
        if (num2 == 0) {
            throw new ArithmeticException("No se puede dividir por cero.");
        }
        return num1 / num2;
    }
}

}
