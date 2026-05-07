package Tarea_pendiente;
class Rural extends Localizacion {
    private double latitud;
    private double longitud;
    private double altitud;

    public Rural(String pais, String provincia, String municipio,
                 double latitud, double longitud, double altitud) {
        super(pais, provincia, municipio);
        this.latitud = latitud;
        this.longitud = longitud;
        this.altitud = altitud;
    }

    // Método 1
    public void mostrarCoordenadas() {
        System.out.println("Latitud: " + latitud + ", Longitud: " + longitud + ", Altitud: " + altitud);
    }

    // Método 2
    public double obtenerAltitud() {
        return altitud;
    }

    // Método 3
    @Override
    public String tipoZona() {
        return "Zona rural";
    }
}