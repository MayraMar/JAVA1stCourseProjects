package funciones;

public class funciones {
    public static void main(String[] args) {
        boolean resultado;
        resultado=esDivisor(10,3);
        System.out.println(resultado);
    }

    public static boolean esDivisor(int numero,int divisor){
        if (numero % divisor == 0) {
            return true;
        } else return false;
    };


}
