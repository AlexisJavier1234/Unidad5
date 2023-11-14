/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package consumodeagua;

/**
 *
 * @author Usuario
 */
public class ConsumodeAgua {

    public static void main(String[] args) {
        int [][]contenidoAgua={
            {100,50,30,120,60},  
            {32,122,46,80,90},
            {45,100,56,26,36},  
            {69,110,72,33,40}
     };
 int numCasas= contenidoAgua.length;
 int numDias=contenidoAgua[0].length;
 
 for(int i=0; i<numCasas; i++){
 int consumoPorCasa=0;
 for (int j=0; j<numDias;j++){
consumoPorCasa +=contenidoAgua[i][j]; 
 
}
     System.out.println("casa" + (i+1)+": Consumo de agua=" + consumoPorCasa);
}
}
}