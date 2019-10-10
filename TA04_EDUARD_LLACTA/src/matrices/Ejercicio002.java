
package matrices;

import java.util.Scanner;
public class Ejercicio002 {

    
    public static void main(String[] args) {
        
        //DECLARANDO LA CLASE SCANNER
        Scanner teclado = new Scanner (System.in);
        
        // DECLARAN E INICIALIZANDO UNA MATRIZ
        int [][]numero = new int[4][5];//una lista 4x5
        
        // declarando variable fila ,columna y las sumas de filas y columnas y la suma total
        int fila,columna,suma_fila,suma_columna,suma_total=0;
        
        // PIDIENDO AL USUARIO QIE ESCRIBA NUMEROS ENTEROS EN LA LISTA
        System.out.println("ESCRIBA NUMEROS ENTEROS EN LA SIGUIENTE LISTA: ");
        for(fila=0;fila<4;fila++){
            
            for(columna=0;columna<5;columna++){
            
            System.out.print("Fila " + fila + ", columna " + columna + ": ");
            // DECLARANDO UNA VARIABLE PARA ALMACENAR EL VALOR QUE FUE ESCRITO POR EL USUARIO
            numero[fila][columna]=teclado.nextInt();
            
            }
        }
        
        //MOSTRANDO LOS DATOS Y LAS SUMAS PARCIALES DE LAS FILAS
        
        for(fila=0;fila<4;fila++){
            suma_fila=0;
            for(columna=0;columna<5;columna++){
                 System.out.printf("%7d   ", numero[fila][columna]);
                suma_fila+= numero[fila][columna];
            }
            System.out.printf("|%7d\n", suma_fila);
        }
        
        //MOSTRANDO LAS SUMAS PARCIALES  DE LAS COLUMNAS
        
        for (columna=0;columna<5;columna++){
            System.out.print("----------");           
        }
        System.out.println("-----------");
        
        
        for(columna=0;columna<5;columna++){
            suma_columna=0;
            for(fila=0;fila<4;fila++){
                
                suma_columna+=numero[fila][columna];
            }
            suma_total+=suma_columna;
            System.out.printf("%7d   ", suma_columna);
            
        }
        
        System.out.printf("|%7d   ", suma_total);       
    }
    
}
