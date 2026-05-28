package org.example;

public class Categoria {
    private String nombre;
    private int numeroCuposMaximos;
    private double popularidadEstimada;

    public Categoria(String nombre, int numeroCuposMaximos, double popularidadEstimada) {
        this.nombre = nombre;
        this.numeroCuposMaximos = numeroCuposMaximos;
        this.popularidadEstimada = popularidadEstimada;
    }

    public void mostrarInformacion() {
        System.out.println("--- CATEGORIA "+nombre+" ---");
        System.out.println("Nombre de la categoria: "+nombre);
        System.out.println("Cupos maximos: "+numeroCuposMaximos);
        System.out.println("Popularidad: "+popularidadEstimada);
        System.out.println("----------------------------");
    }
}
