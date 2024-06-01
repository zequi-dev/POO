public class Main {
    public static void main(String[] args) {
        // Enlace dinámico: Uso de la clase base para referirse a objetos de subclases
        Vehiculo miVehiculo1 = new Automovil();
        Vehiculo miVehiculo2 = new Camion();
        Vehiculo miVehiculo3 = new Motocicleta();

        // Llamada a métodos sobre-escritos
        miVehiculo1.iniciarMotor();  // Output: El motor del automóvil ha sido iniciado.
        miVehiculo2.iniciarMotor();  // Output: El motor del camión ha sido iniciado.
        miVehiculo3.iniciarMotor();  // Output: El motor de la motocicleta ha sido iniciado.

        miVehiculo1.calcularConsumoCombustible();  // Output: Calculando el consumo de combustible del automóvil.
        miVehiculo2.calcularConsumoCombustible();  // Output: Calculando el consumo de combustible del camión.
        miVehiculo3.calcularConsumoCombustible();  // Output: Calculando el consumo de combustible de la motocicleta.

        // Llamada a métodos específicos de subclases
        ((Automovil) miVehiculo1).abrirMaletero();  // Output: El maletero del automóvil está abierto.
        ((Camion) miVehiculo2).cargarMercancia();  // Output: Cargando mercancía en el camión.
        ((Motocicleta) miVehiculo3).hacerCaballito();  // Output: La motocicleta está haciendo un caballito.
    }
}
