public class SistemaAdministracionVehiculos {
    public static void main(String[] args) {
        Vehiculo[] vehiculos = new Vehiculo[3];
        vehiculos[0] = new Auto(50.0);
        vehiculos[1] = new Moto(15.0);
        vehiculos[2] = new Camion(150.0);

        for (Vehiculo vehiculo : vehiculos) {
            vehiculo.encender();
            System.out.println("Capacidad de combustible: " + vehiculo.capacidadCombustible());
            vehiculo.frenar();
            vehiculo.apagar();
            System.out.println();
        }
    }
}
