abstract class Localizacion {
    protected String pais;
    protected String provincia;
    protected String municipio;

    public Localizacion(String pais, String provincia, String municipio) {
        this.pais = pais;
        this.provincia = provincia;
        this.municipio = municipio;
    }

    // Método 1
    public void mostrarUbicacion() {
        System.out.println("País: " + pais);
        System.out.println("Provincia: " + provincia);
        System.out.println("Municipio: " + municipio);
    }

    // Método 2
    public String obtenerMunicipio() {
        return municipio;
    }

    // Método 3 (abstracto)
    public abstract String tipoZona();
}