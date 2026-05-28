package org.example;

import java.util.ArrayList;
import java.util.List;

public class Agrupacion {
    private String nombreGrupo;
    private List<Persona> miembros; // Relación de agregación (acepta Cosplayers y Artistas por Polimorfismo)
    private Categoria categoriaPrincipal;

    public Agrupacion(String nombreGrupo, Categoria categoriaPrincipal) {
        this.nombreGrupo = nombreGrupo;
        this.categoriaPrincipal = categoriaPrincipal;
        this.miembros = new ArrayList<>();
    }

    public void agregarMiembro(Persona persona) {
        miembros.add(persona);
    }

    public void eliminarMiembro(Persona persona) {
        miembros.remove(persona);
    }

    public void mostrarInformacion() {
        System.out.println("\n--- AGRUPACION "+nombreGrupo+" ---");
        System.out.println("Nombre del grupo: "+nombreGrupo);
        System.out.println("Miembros: "+getMiembros());
        System.out.println("Categoria: "+categoriaPrincipal);
        System.out.println("---------------------------");
    }

    // Getters y Setters
    public List<Persona> getMiembros() { return miembros; }
}
