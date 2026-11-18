/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplociclowhile;
import java.util.Locale;
import java.util.Scanner;
/**
 *
 * @author reroes
 */
public class Ejemplo022 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        int limite;
        int contador = 1;
        int suma = 0;
        int multiplicacion = 1;
        
        System.out.println("Ingrese el limite"); 
        limite = entrada.nextInt(); // 6
        while (contador <= limite){
            
            if (contador%2!=0) {
                multiplicacion = multiplicacion * contador; 
            }else{
                 suma = suma + contador;
            }
            
            contador = contador + 1;
        }
         System.out.printf("La suma de Pares es %d\n",suma);
         System.out.printf("La multiplicacion de impares es %d\n",multiplicacion);
    }
}
/*
generar un programa que me permita ingerasar un limite por teclado y presentar 
la suma de todos los numeros impares que existan entre 1--- limite 
*/