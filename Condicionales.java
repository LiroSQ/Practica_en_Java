import java.util.Scanner;

public class Condicionales {
  public static void main(String args[]) {

   System.out.println("\n\n\n                    ===============================================\n                      Calculadora Pre-Basica - (Version 0.3.2)");
   System.out.println("                     (@) Autor: Ernesto Miguel Salvatierra Quispe\n                    ===============================================");
   System.out.println(" (?) Tiene que ingresar 2 numeros, para efectuar una operacion aritmetica.");

   Scanner Valor = new Scanner(System.in);

   System.out.println("\n (#1) Ingrese el primer numero: ");
   int N1 = Valor.nextInt();

   System.out.println("\n (#2) Ingrese el segundo numero: ");
   int N2 = Valor.nextInt();

   System.out.println("\n\n\n\n\n\n\n\n\n\n (!) Elija un numero de opcion, para la operacion que desea emplear con los numeros:  " + N1 + " y " + N2);
   System.out.println("\n     =====================");
   System.out.println("      (1): " + N1 + " + " + N2);
   System.out.println("\n      (2): " + N1 + " - " + N2);
   System.out.println("\n      (3): " + N1 + " x " + N2);
   System.out.println("\n      (4): " + N1 + " / " + N2);
   System.out.println("     =====================");
   
   System.out.println("\n (#) Escriba una opcion (Numero de arriba en parentesis): ");
   int Opcion = Valor.nextInt();

   if (Opcion == 1) {
    int Suma = N1 + N2;
    System.out.println("\n (1) El resultado de: " + N1 + " + " + N2 + " = " + Suma);
   }

    else if (Opcion == 2) {
     int Resta = N1 - N2;
     System.out.println("\n (2) El resultado de: " + N1 + " - " + N2 + " = " + Resta);
    }

     else if (Opcion == 3) {
       int Multiplicacion = N1 * N2;
       System.out.println("\n (3) El resultado de: " + N1 + " x " + N2 + " = " + Multiplicacion);
     }

       else if (Opcion == 4) {
        int Division = N1 / N2;
        System.out.println("\n (4) El resultado de: " + N1 + " / " + N2 + " = " + Division);
      }
      
        else {
         System.out.println("\n (X) Error: Usted no ha elegido una opcion (1, 2, 3 o 4), reintentar otra vez...");
       }
 }
}