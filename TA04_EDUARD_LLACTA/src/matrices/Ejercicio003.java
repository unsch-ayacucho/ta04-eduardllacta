
package matrices;

import java.util.Scanner;
public class Ejercicio003 {

    
    public static void main(String[] args) {
        
        //DECLARANDO LA CLASE SCANNER
        Scanner teclado = new Scanner(System.in);
        
        //DICIENDO ALUSUARIO QUE ESCRIBA LA POSICION DEL ALFIL
        System.out.println("SEÑALE LA POSICION DEL ALFIL"+"\033[31m(POR EJEMPLO d5)");
        System.out.println("******************************************************");
        
        // DECLARANDO LA VARIABLE DONDE SE ALMACENARA EL VALOR DE LA VARIABLE
        String posicion_alfil=teclado.nextLine();
        
        // declarando las val=rialbes columna y fila
        int columna_alfil=(int)(posicion_alfil.charAt(0))-96;
        int fila_alfil = (int)(posicion_alfil.charAt(1))-48;
        
        System.out.println("*********************************************************");
        System.out.println("\033[34mEL ALFIL PUEDE MOVERSE A LAS SIGUIENTES POSICIONES: ");
        
        for(int fila =8;fila>=1;fila--){
            for(int columna=1;columna<=8;columna++){
                if ((Math.abs(fila_alfil - fila) == Math.abs(columna_alfil - columna)) && (! ((fila_alfil == fila) && (columna_alfil == columna)))){
                    System.out.print((char)(columna + 96) + "" + fila + " ");
                } 
            }
        }
        
    }
    
}
