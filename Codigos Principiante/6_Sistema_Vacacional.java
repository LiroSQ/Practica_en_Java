import java.util.Scanner;

public class 6_Sistema_Vacacional {

    public static void main(String args[]) {
        System.out.println("\n======================================\n  Sistema Vacacional (Version 0.3.1)\n======================================");
        System.out.println(" (#1) Escriba su Nombre Completo: \n ");
        Scanner Entrada = new Scanner(System.in);
        String Nombre = Entrada.nextLine();
        System.out.println("\n\n (#2) Escriba su *Numero* Clave de Trabajo: \n");
        System.out.println("1) Marketing\n2) Gerente\n3) Limpieza\n !Solo escriba el numero de inciso!\n");
        int Clave = Entrada.nextInt();
        System.out.println("\n\n (#3) ¿Cuantos años de Servicio actualmente tiene usted en la Empresa?");
        System.out.println("\nElija una opcion: \n\n1) Menos de 1 año\n2) 1 año \n3) 2 años\n4) 3 años\n5) 4 años\n6) 5 años\n7) 6 años o mas...\n !Solo escriba el numero de inciso!\n");
        int Servicio = Entrada.nextInt();
        if (Clave == 1) {
            if (Servicio == 1) {
                System.out.println("\n=================================================================================\n (!) " + Nombre + " Tienes derecho a -> 7 dias de Vacaciones.\n=================================================================================\n");
            } else if (Servicio == 2) {
                System.out.println("\n=================================================================================\n (!) " + Nombre + " Tienes derecho a -> 10 dias de Vacaciones.\n=================================================================================\n");
            } else if (Servicio == 3) {
                System.out.println("\n=================================================================================\n (!) " + Nombre + " Tienes derecho a -> 15 dias de Vacaciones.\n=================================================================================\n");
            } else if (Servicio == 4) {
                System.out.println("\n=================================================================================\n (!) " + Nombre + " Tienes derecho a -> 20 dias de Vacaciones.\n=================================================================================\n");
            } else if (Servicio == 5) {
                System.out.println("\n=================================================================================\n (!) " + Nombre + " Tienes derecho a -> 30 dias de Vacaciones.\n=================================================================================\n");
            } else if (Servicio == 6) {
                System.out.println("\n=================================================================================\n (!) " + Nombre + " Tienes derecho a -> 40 dias de Vacaciones.\n=================================================================================\n");
            } else if (Servicio == 7) {
                System.out.println("\n=================================================================================\n (!) " + Nombre + " Tienes derecho a -> 50 dias de Vacaciones.\n=================================================================================\n");
            } else {
                System.out.println(" (X) Error: No se ingreso bien el tiempo de Servicio Marketing, en la Empresa.");
            }
        } else if (Clave == 2) {
            if (Servicio == 1) {
                System.out.println("\n=================================================================================\n (!) " + Nombre + " Tienes derecho a -> 5 dias de Vacaciones.\n=================================================================================\n");
            } else if (Servicio == 2) {
                System.out.println("\n=================================================================================\n (!) " + Nombre + " Tienes derecho a -> 7 dias de Vacaciones.\n=================================================================================\n");
            } else if (Servicio == 3) {
                System.out.println("\n=================================================================================\n (!) " + Nombre + " Tienes derecho a -> 10 dias de Vacaciones.\n=================================================================================\n");
            } else if (Servicio == 4) {
                System.out.println("\n=================================================================================\n (!) " + Nombre + " Tienes derecho a -> 15 dias de Vacaciones.\n=================================================================================\n");
            } else if (Servicio == 5) {
                System.out.println("\n=================================================================================\n (!) " + Nombre + " Tienes derecho a -> 20 dias de Vacaciones.\n=================================================================================\n");
            } else if (Servicio == 6) {
                System.out.println("\n=================================================================================\n (!) " + Nombre + " Tienes derecho a -> 25 dias de Vacaciones.\n=================================================================================\n");
            } else if (Servicio == 7) {
                System.out.println("\n=================================================================================\n (!) " + Nombre + " Tienes derecho a -> 32 dias de Vacaciones.\n=================================================================================\n");
            } else {
                System.out.println(" (X) Error: No se ingreso bien el tiempo de Servicio Gerente, en la Empresa.");
            }
        } else if (Clave == 3) {
            if (Servicio == 1) {
                System.out.println("\n=================================================================================\n (!) " + Nombre + " Tienes derecho a -> 5 dias de Vacaciones.\n=================================================================================\n");
            } else if (Servicio == 2) {
                System.out.println("\n=================================================================================\n (!) " + Nombre + " Tienes derecho a -> 7 dias de Vacaciones.\n=================================================================================\n");
            } else if (Servicio == 3) {
                System.out.println("\n=================================================================================\n (!) " + Nombre + " Tienes derecho a -> 10 dias de Vacaciones.\n=================================================================================\n");
            } else if (Servicio == 4) {
                System.out.println("\n=================================================================================\n (!) " + Nombre + " Tienes derecho a -> 15 dias de Vacaciones.\n=================================================================================\n");
            } else if (Servicio == 5) {
                System.out.println("\n=================================================================================\n (!) " + Nombre + " Tienes derecho a -> 20 dias de Vacaciones.\n=================================================================================\n");
            } else if (Servicio == 6) {
                System.out.println("\n=================================================================================\n (!) " + Nombre + " Tienes derecho a -> 30 dias de Vacaciones.\n=================================================================================\n");
            } else if (Servicio == 7) {
                System.out.println("\n=================================================================================\n (!) " + Nombre + " Tienes derecho a -> 40 dias de Vacaciones.\n=================================================================================\n");
            } else {
                System.out.println(" (X) Error: No se ingreso bien el tiempo de Servicio Limpieza, en la Empresa.");
            }
        } else {
            System.out.println(" (X) Error: No se introdujo su clave de trabajo de forma correcta!\n Asegurese de solo introducir un numero: 1 - 3");
        }

        System.out.println("\n--------------------------------------------\n   Autor: Ernesto M. Salvatierra Quispe\n--------------------------------------------");
    }
}
