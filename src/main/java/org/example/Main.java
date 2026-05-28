package org.example;


public class Main {
    public static void main(String[] args) {
        Categoria animeCat = new Categoria("Manga y Anime", 50, 9.5);
        Categoria arteCat = new Categoria("Ilustración Digital", 30, 8.0);
        Categoria gamesCat  = new Categoria("Videojuegos", 40, 8.7);

        Cosplayer cosplayer1 = new Cosplayer("Luis", "Chile", 20, 5, EstiloCosplay.ANIME);
        Artista artista1 = new Artista("Camila", "México", 22, "Wacom Intuos", 3);
        Artista   artista2   = new Artista("Rodrigo",   "Chile",  25, "Huion Kamvas",  7);
        Cosplayer cosplayer2 = new Cosplayer("Sofía",   "Perú",   23, 3, EstiloCosplay.VIDEOJUEGOS);


        Agrupacion comunidadAnime = new Agrupacion("Team Otaku UFRO", animeCat);
        Panel panelPrincipal = new Panel(animeCat, "15:30 hrs");

        panelPrincipal.agregarPanelista(cosplayer1);
        panelPrincipal.mostrarInformacion();

        cosplayer1.agregarCategoria(animeCat);
        cosplayer2.agregarCategoria(gamesCat);
        artista1.agregarCategoria(arteCat);
        artista2.agregarCategoria(arteCat);
        artista2.agregarCategoria(animeCat);


        Agrupacion teamOtaku  = new Agrupacion("Team Otaku UFRO", animeCat);
        teamOtaku.agregarMiembro(cosplayer1);
        teamOtaku.agregarMiembro(artista2);

        Agrupacion clubArte = new Agrupacion("Club Arte Digital", arteCat);
        clubArte.agregarMiembro(artista1);
        clubArte.agregarMiembro(artista2);





    }
}