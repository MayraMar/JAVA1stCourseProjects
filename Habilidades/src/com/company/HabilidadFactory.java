package com.company;

public class HabilidadFactory {
    private static HabilidadFactory instance;
    private HabilidadFactory(){};
    public static HabilidadFactory getInstance(){
        if(instance==null){
            instance=new HabilidadFactory();
        }
        return instance;
    }
    public Habilidad nuevaHabilidad (String tipo)  throws Exception{

        switch (tipo) {
            case "Simple":
                return new HabilidadSimple();
            case "Combinada":
                return new HabilidadCombinada();
            default:
                throw new Exception("No es posible crear una habilidad del tipo: "+tipo);
        }

    }


}
