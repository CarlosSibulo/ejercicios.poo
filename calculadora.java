public class calculadoraBasica{
    static Scanner entrada = new Scanner(System.in);
    
    public static void main (String[]args)
            int opcion;
            float n1,n2;
            
            System.out.print("favor ingresar el primer numero:");
            n1 = entrada.nexfloat();
            System.out.print("favor ingresar el segundo numero:");
            n2 = entrada.nextfloat();
            
            System.out.print("Menu/n1. Sumar/n2. Restar/n3. Multiplicar/n4. Dividir/n5. Modulo/n6. Potencia/n7. Raizcuadrada/n8. Raizcubica/n9. Salir/n");
            opcion = entrada.nextInr();
            
            if(opcion ==1)
               System.out.print("/n" + (n1 + n2));
               else if(opcion==2)
                    System.out.print("/n" + (n1 - n2));
                    else if(opcion==3)
                         System.out.print("/n" + (n1 * n2));
                         else if(opcion==4)
                             System.out.print("/n" + (n1 / n2));
                             else if(opcion==5)
                                 System.out.print("/n" + (n1 % n2));
                                 else if(opcion==6)
                                    System.out.print("/n" + Math.pow(n1 , n2 ));
                                    else if(opcion==7)
                                       System.out.print("/n" + Math.sqrt(n1)+" "Math.sqrt(n2));
                                       else if(opcion==8)
                                           System.out.print("/n" + Math.pow(n1, (0,33)) +" "+Math.pow(n2 , (0.33)));
            
            
}
