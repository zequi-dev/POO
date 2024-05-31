public class ModalidadA {
    public static void main(String[] args) {
        Bicicleta bicicleta = new Bicicleta("Giant", "Defy", 2021);

        Bicicleta.Rueda ruedaDelantera = bicicleta.new Rueda(26);
        Bicicleta.Rueda ruedaTrasera = bicicleta.new Rueda(26);
        Bicicleta.Cuadro cuadro = bicicleta.new Cuadro("Carbono");

        // Mostrar información de la bicicleta y sus componentes
        System.out.println("Marca: " + bicicleta.getMarca());
        System.out.println("Modelo: " + bicicleta.getModelo());
        System.out.println("Año: " + bicicleta.getAno());
        System.out.println("Material del cuadro: " + cuadro.getMaterial());
        System.out.println("Diámetro de la rueda delantera: " + ruedaDelantera.getDiametro());
        System.out.println("Diámetro de la rueda trasera: " + ruedaTrasera.getDiametro());
    }
}