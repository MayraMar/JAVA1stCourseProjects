package sincro;
import java.util.Date;
public class Programa {
    public static void main(String[] args) {
        int num= 10;
        System.out.println("Hola Mundo. El numero es " + num);
        int num2=3;
        int resto;
        resto=num%num2;
        if (resto==1){System.out.println("Los numeros NO son divisibles");

        } else System.out.println("Los numeros son divisibles");

        Integer n1=1;
        Integer n2=30;
        int comparacion=n2.compareTo(n1);
        System.out.println(comparacion);


        Date fecha= new Date();
        System.out.println(fecha.toString());
        Date fechaFido=new Date(120,5,9);
        System.out.println(fechaFido.toString());

        String nombre="Mayra";
        String yo="Mayra";
        String isa="Maya";
        System.out.println(nombre.equals(yo));
        System.out.println(nombre.equals(isa));



    }

}