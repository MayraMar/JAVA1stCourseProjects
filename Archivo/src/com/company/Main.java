package com.company;

public class Main {

    public static void main(String[] args) {
        try {
            Archivo texto = new Texto("Novela");
            Archivo imagen = new Imagen("Postal");
            Archivo bailando = new Video("Bailando");
            Archivo jugando = new Video("Jugando");
            Archivo cantando = new Video("Cantando");
            Archivo carpetaVideos = new Carpeta("CarpetaVideos");
            Archivo carpetaVacia = new Carpeta("Empty");
            Archivo carpetaTextos = new Carpeta("Textos");
            ((Carpeta) carpetaTextos).addArchivo(texto);
            ((Carpeta) carpetaVideos).addArchivo(bailando);
            ((Carpeta) carpetaVideos).addArchivo(jugando);
            ((Carpeta) carpetaVideos).addArchivo(cantando);
            ArchivoComposite sistema = new ArchivoComposite();
            sistema.addArchivo(carpetaVacia);
            sistema.addArchivo(carpetaTextos);
            sistema.addArchivo(carpetaVideos);
            sistema.addArchivo(imagen);
            sistema.getNombre();
        } catch (Exception exception) {
            System.err.println(exception.getMessage());
        } finally {
            System.out.println("\n****     Proceso finalizado     ****");
        }
    }
}
