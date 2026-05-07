package Tarea_pendiente;
class Industrial extends Localizacion {
    private int numeroFabrica;
    private String nombre;
    private String zonaPoligono;

    public Industrial(String pais, String provincia, String municipio,
                      int numeroFabrica, String nombre, String zonaPoligono) {
        super(pais, provincia, municipio);
        this.numeroFabrica = numeroFabrica;
        this.nombre = nombre;
        this.zonaPoligono = zonaPoligono;
    }

    // Método 1
    public void mostrarFabrica() {
        System.out.println("Fábrica Nº: " + numeroFabrica + ", Nombre: " + nombre);
    }

    // Método 2
    public String obtenerZonaPoligono() {
        return zonaPoligono;
    }

    // Método 3
    @Override
    public String tipoZona() {
        return "Zona industrial";
    }
}