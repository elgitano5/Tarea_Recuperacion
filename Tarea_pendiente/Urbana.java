package Tarea_pendiente;
class Urbana extends Localizacion {
    private String calle;
    private int numero;
    private int planta;

    public Urbana(String pais, String provincia, String municipio,
                  String calle, int numero, int planta) {
        super(pais, provincia, municipio);
        this.calle = calle;
        this.numero = numero;
        this.planta = planta;
    }

    // Método 1
    public void mostrarDireccion() {
        System.out.println("Calle: " + calle + ", Nº: " + numero + ", Planta: " + planta);
    }

    // Método 2
    public String obtenerCalle() {
        return calle;
    }

    // Método 3
    @Override
    public String tipoZona() {
        return "Zona urbana";
    }
}