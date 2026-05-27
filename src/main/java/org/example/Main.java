package org.example;


public class Main {
    public static void main(String[] args) {
        // 1. Instancias de objetos
        // Deben de cambiar estos objetos, creen los propios suyos, estos estan de referencia.

        Categoria mundoGeek = new Categoria("Mundo Geek", 30,9.0);
        Categoria arte = new Categoria("Dance Cover e Ilustracion Digital",20,8.5);

        Cosplayer cosplay = new Cosplayer("Esteban","Mexico",22,4, EstiloCosplay.VIDEOJUEGOS);

        Artista a1 = new Artista("Sofia","Argentina",19,"Huion",2);

        Agrupacion comunidadGeek = new Agrupacion("Team Otaku UFRO", mundoGeek);
        Panel panelPrincipal = new Panel(mundoGeek, "15:30 hrs");

        // --- SECCIÓN DE PRUEBAS ---
        // Ej: agregar personas a categorías, meter miembros a la agrupación, montar el panel y llamar a mostrarInformacion().


    }
}