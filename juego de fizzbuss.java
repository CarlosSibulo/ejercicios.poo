package ejercicios.poo;

public class Juego_FizzBuzz {
    public class FizzBuzz {
    public String calcular(int numero) {
        if (numero % 3 == 0 && numero % 5 == 0) {
            return "FizzBuzz";
        } else if (numero % 3 == 0) {
            return "Fizz";
        } else if (numero % 5 == 0) {
            return "Buzz";
        } else {
            return Integer.toString(numero);
        }
    }
}
public class Principal {
    public static void main(String datofizzBuzz) {
        FizzBuzz datofizzBuzz = new FizzBuzz();
        
        for (int i = 1; i <= 100; i++) {
            System.out.println(datofizzBuzz.calcular(i));
        }
    }
}

}
