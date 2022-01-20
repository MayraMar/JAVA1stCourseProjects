package com.company;

public class Main {

    public static void main(String[] args) {

            Institucion uba = new Institucion("UBA");
        try {
            OfertaAcademica cursoProba = OfertaAcademicaFactory.getInstance().newOferta("Curso");

            OfertaAcademica cursoEstadistica = OfertaAcademicaFactory.getInstance().newOferta("Curso");

             OfertaAcademica cursooEstadistica = OfertaAcademicaFactory.getInstance().newOferta("Cursoo");



            OfertaAcademica programaPyE = OfertaAcademicaFactory.getInstance().newOferta("Programa Intensivo");

            uba.agregarOferta(cursoEstadistica);
            uba.agregarOferta(cursoProba);
            uba.agregarOferta(programaPyE);
            addDataCurso(cursoProba, "Probabilidad", "Probabilidad", 16.0, 2.0, 1.0);
            addDataCurso(cursoEstadistica, "Estadistica", "Estadistica", 16.0, 2.0, 2.0);

                addDataPrograma(programaPyE, "Programa Intensivo de Probabilidad y Estadistica", ".", 10.0);


            //System.out.println(cursoProba);
            ((ProgramaIntensivo) programaPyE).addOfertaAcademica(cursoProba);
            ((ProgramaIntensivo) programaPyE).addOfertaAcademica(cursoEstadistica);
            //System.out.println(programaPyE);
            uba.generarInforme();

        }
        catch (Exception e){
            System.err.println(e.getMessage());

        }
    }
    public static void addDataCurso(OfertaAcademica oferta, String nombre, String descripcion, Double cargaHoraria, Double duracionMes, Double valorHora){
        oferta.setNombre(nombre);
        oferta.setDescripcion(descripcion);
        Curso curso=null;
        if (oferta instanceof Curso){
            curso = (Curso) oferta;

        curso.setCargaHorariaMes(cargaHoraria);
        curso.setDuracionMes(duracionMes);
        curso.setValorHora(valorHora);
        }
    }
    public static void addDataPrograma (OfertaAcademica oferta, String nombre, String descripcion, Double descuento){
        oferta.setNombre(nombre);
        oferta.setDescripcion(descripcion);
        ProgramaIntensivo programa=null;
        if (oferta instanceof ProgramaIntensivo){
            programa = (ProgramaIntensivo) oferta;
            programa.setPorcentajeDescuento(descuento);
        }
    }
}
