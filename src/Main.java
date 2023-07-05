import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        EXTERNA:
       while(true){
        System.out.println("CONVERSOR DE MONEDA");
        System.out.println("1 - Soles Peruanos a Dolares\n"
         + "2 - Pesos Mexicanos  a Dolares \n"
         + "3 - Pesos Colombianos a Dolares \n"
         + "4 - Salir");
         System.out.println("INGRESE UNA OPCION");
         Scanner leer = new Scanner(System.in);
         char opcion = leer.next().charAt(0);

         switch(opcion){
            case '1':
            convertir(3.63,"Soles Peruanos");
            break;
            case '2' :
            convertir(17.00,"Pesos Mexicanos");
            break;
            case '3' :
            convertir(4130.50," Pesos Colombianos");
            break;
            case '4':
            System.out.println("CERRANDO PROGRAMA");
            break EXTERNA;
            default:
            System.out.println("OPCION INCORRECTA");
            break;

         }
       } 
    
    }

    static void convertir(double valorDolar, String pais){
      Scanner leer = new Scanner(System.in);
      System.out.printf("Ingrese La Cantidad de %s :" , pais);
      double CantidadMoneda = leer.nextDouble();

      Double dolares = CantidadMoneda / valorDolar;
        dolares = (double) Math.round(dolares * 100d) / 100;
        System.out.println("-------------------------------------");
        System.out.println("|     tienes $  " + dolares + "  Dolares   |");
        System.out.println("-------------------------------------");

    }
}
