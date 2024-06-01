public class Vehiculo {
    // Métodos comunes
    public void iniciarMotor() {
        System.out.println("El motor del vehículo ha sido iniciado.");
    }

    public void detenerMotor() {
        System.out.println("El motor del vehículo ha sido detenido.");
    }

    public void calcularConsumoCombustible() {
        System.out.println("Calculando el consumo de combustible del vehículo.");
    }
}

public class Automovil extends Vehiculo {
    // Sobreescritura de métodos
    @Override
    public void iniciarMotor() {
        System.out.println("El motor del automóvil ha sido iniciado.");
    }

    @Override
    public void detenerMotor() {
        System.out.println("El motor del automóvil ha sido detenido.");
    }

    @Override
    public void calcularConsumoCombustible() {
        System.out.println("Calculando el consumo de combustible del automóvil.");
    }

    // Método específico
    public void abrirMaletero() {
        System.out.println("El maletero del automóvil está abierto.");
    }
}

public class Camion extends Vehiculo {
    // Sobreescritura de métodos
    @Override
    public void iniciarMotor() {
        System.out.println("El motor del camión ha sido iniciado.");
    }

    @Override
    public void detenerMotor() {
        System.out.println("El motor del camión ha sido detenido.");
    }

    @Override
    public void calcularConsumoCombustible() {
        System.out.println("Calculando el consumo de combustible del camión.");
    }

    // Método específico
    public void cargarMercancia() {
        System.out.println("Cargando mercancía en el camión.");
    }
}

public class Motocicleta extends Vehiculo {
    // Sobreescritura de métodos
    @Override
    public void iniciarMotor() {
        System.out.println("El motor de la motocicleta ha sido iniciado.");
    }

    @Override
    public void detenerMotor() {
        System.out.println("El motor de la motocicleta ha sido detenido.");
    }

    @Override
    public void calcularConsumoCombustible() {
        System.out.println("Calculando el consumo de combustible de la motocicleta.");
    }

    // Método específico
    public void hacerCaballito() {
        System.out.println("La motocicleta está haciendo un caballito.");
    }
}


