package org.example;

public class Cosplayer extends Persona implements Interactivable {
    private int cantidadTrajes;
    private EstiloCosplay estiloPreferido;

    public Cosplayer(String nombre, String paisOrigen, int edad, int cantidadTrajes, EstiloCosplay estiloPreferido) {
        super(nombre, paisOrigen, edad);
        this.cantidadTrajes = cantidadTrajes;
        this.estiloPreferido = estiloPreferido;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("INFO");
        System.out.println("Nombre: "+nombre);
        System.out.println("Cantidad de trajes: "+cantidadTrajes);
        System.out.println("Estilo favorito: "+estiloPreferido);
        // TODO: Completar lógica método (imprimir datos base de Persona y específicos de Cosplayer)
    }

    @Override
    public void realizarPresentacion() {

        int tiempoEstimado = 30 + (cantidadTrajes - 1) * 15;

        System.out.println(" PRESENTACIÓN DE COSPLAYER ");
        System.out.println(nombre + " realiza su presentacion con estilo " + estiloPreferido);
        System.out.println("Tiempo estimado de preparación: " + tiempoEstimado + " minutos");
        System.out.println("Cuenta con " + cantidadTrajes + " trajes para el evento");
    }

    // Getters y Setters
    public int getCantidadTrajes() { return cantidadTrajes; }
    public void setCantidadTrajes(int cantidadTrajes) { this.cantidadTrajes = cantidadTrajes; }
    public EstiloCosplay getEstiloPreferido() { return estiloPreferido; }
    public void setEstiloPreferido(EstiloCosplay estiloPreferido) { this.estiloPreferido = estiloPreferido; }
}
