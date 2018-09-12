public class 4_Promedios_Condicionales{
  public static void main(String args[]){

    int Matematicas = 66;
    int Biologia =    50;
    int Psicologia =  49;
    int Fisica =      55;
    int EFisica =     90;
    int Historia =    40;

    float Promedio = (Matematicas + Biologia + Psicologia + Fisica + EFisica + Historia) / 6;

    System.out.println("\n\n Acta de Notas Finales (Version 0.1)\n========================================\n");
    System.out.println("   MATERIA  |  NOTA");
    System.out.println("\n Matematicas:   66\n Biologia:      50\n Psicologia:    49");
    System.out.println(" Fisica:        55\n E_Fisica:      90\n Historia:      40");
    System.out.println("\n========================================");

    if (Promedio >= 51){
      System.out.println("\n Promedio: " + Promedio + " (Aprobado)");

  } else {
      System.out.println("\n Promedio: " + Promedio + " (Reprobado)");
  }
 }
}
