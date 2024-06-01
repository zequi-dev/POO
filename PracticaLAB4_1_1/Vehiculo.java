interface Vehiculo {
    void encender();
    void apagar();
    void frenar();
    double capacidadCombustible();
}

abstract class VehiculoBase implements Vehiculo {
    protected double capacidadCombustible;

    @Override
    public double capacidadCombustible() {
        return capacidadCombustible;
    }

    // Métodos comunes que pueden ser sobrescritos
    public abstract void encender();
    public abstract void apagar();
    public abstract void frenar();
}

class Auto extends VehiculoBase {
    public Auto(double capacidadCombustible) {
        this.capacidadCombustible = capacidadCombustible;
    }

    @Override
    public void encender() {
        System.out.println("El auto está encendido.");
    }

    @Override
    public void apagar() {
        System.out.println("El auto está apagado.");
    }

    @Override
    public void frenar() {
        System.out.println("El auto está frenando.");
    }
}

class Moto extends VehiculoBase {
    public Moto(double capacidadCombustible) {
        this.capacidadCombustible = capacidadCombustible;
    }

    @Override
    public void encender() {
        System.out.println("La moto está encendida.");
    }

    @Override
    public void apagar() {
        System.out.println("La moto está apagada.");
    }

    @Override
    public void frenar() {
        System.out.println("La moto está frenando.");
    }
}

class Camion extends VehiculoBase {
    public Camion(double capacidadCombustible) {
        this.capacidadCombustible = capacidadCombustible;
    }

    @Override
    public void encender() {
        System.out.println("El camión está encendido.");
    }

    @Override
    public void apagar() {
        System.out.println("El camión está apagado.");
    }

    @Override
    public void frenar() {
        System.out.println("El camión está frenando.");
    }
}

