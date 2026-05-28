package org.example;

public class Artista extends Persona implements Interactivable {
    private String marcaTableta;
    private int cantidadArtbooksPublicados;

    public Artista(String nombre, String paisOrigen, int edad, String marcaTableta, int cantidadArtbooksPublicados) {
        super(nombre, paisOrigen, edad);
        this.marcaTableta = marcaTableta;
        this.cantidadArtbooksPublicados = cantidadArtbooksPublicados;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("INFO");
        System.out.println("Persona: "+nombre);
        System.out.println("Marca de la tablet:"+marcaTableta);
        System.out.println("Cantidad de proyectos: "+cantidadArtbooksPublicados);
        // TODO: Completar lógica método (imprimir datos base de Persona y específicos de Artista)
    }

    @Override
    public void realizarPresentacion() {
        System.out.println("PRESENTACION DE ARTISTA");
        System.out.println(nombre + " mueotra su portafolio digital dibujado con tableta " + marcaTableta );
        System.out.println("Ha publicado " + cantidadArtbooksPublicados + " artbook disponibles en el evento");
    }

}
