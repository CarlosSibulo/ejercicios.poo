package ejercicios.poo;


public class control_acceso_tienda {
    public class usuario{
        private boolean tieneMembresia;
        private boolean esEmpleado;
        
        public Usuario(boolean tieneMembresia,boolean es Empleado){
            this.tieneMembresia = tieneMembresia;
            this.esEmpleado = esEmpleado;
        }
        public boolean tieneMembresia(){
            tieneMembresia = objTienwMembresia.nextInt();
            return tieneMembresia;
    }
    
}
    class tienda{
        private localtime horaApertura;
        private localtime horaCierre;
        
        public Tienda(LocalTime horaApertura,LocalTime horaCierre){
            this.horaApertura = horaApertura;
            this.horaCierre = horaCierre;
        }
        public boolean estaAbierta(){
            localTime ahora = LocalTime.now();
            return !ahora.isBefore(horaApertura)&& !ahora.isAfter(horaCierre);
        }
        
        public boolean permitirAcceso(usuario usuario){
            if(usuario.esEmpleado()){
                return true;
            }
            else if(usuario.tieneMembresia() && estaAbierta()){
                return true;
            }
            else {
                return false
            }
        }
    }
public class ControlDeAcceso{
    public static void main(String[]args){
        Tienda tienda = new tienda(LocalTime.of(9,0), LocalTime.of(18,0));
        
        Usuario cliente = new Usuario(true,false);
        Usuario empleado = new Usuario(false,true);
        
        System.out.println("Permitir acceso al cliente:" + tienda.permitirAcceso(cliente));
        System.out.println("Permitir acceso al empleado:"+ tienda.permitirAcceso(empleado));
    }
}
