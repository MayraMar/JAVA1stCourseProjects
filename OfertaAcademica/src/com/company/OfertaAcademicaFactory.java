package com.company;

public class OfertaAcademicaFactory {
    private static OfertaAcademicaFactory instance;
    private OfertaAcademicaFactory(){};
    public static OfertaAcademicaFactory getInstance(){
        if (instance==null){
            instance = new OfertaAcademicaFactory();
        }
        return instance;
    }
    public OfertaAcademica newOferta (String tipo) throws Exception {
        OfertaAcademica nueva=null;
        String curso="Curso";
        String intensivo="Programa Intensivo";

        if(!(tipo.equals(curso))){
            if (!(tipo.equals(intensivo))){
                throw new Exception("No existe el tipo de oferta académica: "+tipo);
            }
        }
        switch (tipo){
            case "Curso":
                nueva=new Curso();
                break;
            case "Programa Intensivo":
                nueva=new ProgramaIntensivo();
                break;
           /* default:
                throw new Exception("No existe el tipo de oferta académica: "+tipo);*/
        }

        return nueva;
    }
}
