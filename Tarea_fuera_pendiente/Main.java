package Tarea_fuera_pendiente;

// Las llamadas a atributos o metodos privados estan comentadas en el codigo.

public class Main {
    public static void main(String[] args) {

        // =====================
        // OBJETO RURAL
        // =====================
        System.out.println("Rural:");
        //Rural rural = new Rural("España", "Granada", "Loja", 37.1, -4.2, 600);

        // PUBLIC (OK)
        //rural.mostrarCoordenadas();

        // PACKAGE / PROTECTED (OK - mismo paquete)
        //System.out.println("País rural: " + rural.pais + "\n");

        // PRIVATE (ERROR)
        // System.out.println(rural.latitud);


        // =====================
        // OBJETO INDUSTRIAL
        // =====================
        System.out.println("Industrial:");
        //Industrial industrial = new Industrial("España", "Madrid", "Alcobendas", 200, "TechFactory", "Poligono Norte");

        // PUBLIC (OK)
        //industrial.mostrarFabrica();

        // PACKAGE / PROTECTED (OK)
        //System.out.println("Provincia industrial: " + industrial.provincia + "\n");

        // PRIVATE (ERROR)
        // System.out.println(industrial.nombre);


        // =====================
        // OBJETO URBANA
        // =====================
        System.out.println("Urbana:");
        //Urbana urbana = new Urbana("España", "Valencia", "Valencia", "Gran Vía", 10, 2);

        // PUBLIC (OK)
        //urbana.mostrarDireccion();

        // PACKAGE / PROTECTED (OK)
        //System.out.println("Municipio urbano: " + urbana.municipio + "\n");

        // PRIVATE (ERROR)
        // System.out.println(urbana.calle);


        // =====================
        // MENSAJE FINAL
        // =====================
        System.out.println("\nNo se puede acceder a nada ya que esta en un package diferente, para acceder a los public es necesario importar la clase en esta misma.");
    }
}