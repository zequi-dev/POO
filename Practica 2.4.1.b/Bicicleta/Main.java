public class Main {
    public static void main(String[] args) {
        Bicicleta bicicleta = new Bicicleta("Giant", "Defy", 2021, "Carbono", 26, 26);

        // Mostrar información de la bicicleta y sus componentes
        System.out.println("Marca: " + bicicleta.getMarca());
        System.out.println("Modelo: " + bicicleta.getModelo());
        System.out.println("Año: " + bicicleta.getAno());
        System.out.println("Material del cuadro: " + bicicleta.getCuadro().getMaterial());
        System.out.println("Diámetro de la rueda delantera: " + bicicleta.getRuedaDelantera().getDiametro());
        System.out.println("Diámetro de la rueda trasera: " + bicicleta.getRuedaTrasera().getDiametro());
    }
}
