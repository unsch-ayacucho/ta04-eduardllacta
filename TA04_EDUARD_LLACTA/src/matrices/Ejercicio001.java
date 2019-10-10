
package matrices;

public class Ejercicio001 {

    
    public static void main(String[] args) throws InterruptedException{
                
        
        //DECLARANDO E INICINIALIZANDO LAS VARIALBES LISTA
        int[][]numero = new int[6][10];
        int fila;
        int columna;
        
        int minimo = Integer.MIN_VALUE;
        int fila_minimo = 0;
        int columna_minimo = 0;
        
        int maximo = Integer.MAX_VALUE;
        int fila_maximo = 0;
        int columna_maximo = 0;
        
        System.out.print("\n      ");
        for(columna = 0; columna<10;columna++){
            System.out.print("   " + columna + "  ");
        }
        System.out.println();
        
        System.out.print("    ┌");
        
        for (columna= 0; columna<10;columna++){
            System.out.print("──────");
        }
        System.out.println("┐");
        
        for (fila=0;fila<6;fila++){
            System.out.print("  " + fila + " │");
            for(columna=0;columna<10;columna++){
                numero[fila][columna]=(int)(Math.random()*1001);
                System.out.printf("%5d ", numero[fila][columna]);
                Thread.sleep(100);
                
                // calculando el minimo y guardando las coordenasdas
                if(numero[fila][columna]>minimo){
                    minimo=numero[fila][columna];
                    fila_minimo=fila;
                    columna_minimo=columna;
                }
                if(numero[fila][columna]>maximo){
                    maximo = numero[fila][columna];
                    fila_maximo = fila;
                    columna_maximo = columna;
                }
            }
            System.out.println("│");                
        }
        System.out.print("    └");
        for (columna = 0;columna<10;columna++){
            System.out.print("──────");
        }
        
        System.out.println("┘\n\nEl máximo es " + maximo + " y está en la fila " + fila_maximo + ", columna " + columna_maximo);
        System.out.println("El mínimo es " + minimo + " y está en la fila " + fila_minimo + ", columna " + columna_minimo);
    }
}