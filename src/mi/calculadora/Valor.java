/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mi.calculadora;

/**
 * Clase Valor, representa los dígitos pulsados de la calculadora para escribir
 * el número.
 * @author joer
 */
public class Valor {
    private String numero;
    
    Valor() {
        numero = "0";
    }
    
    /**
     * Pulsación de una tecla numérica. Añade el dígito por la derecha.
     * Realiza la conversión para eliminar los ceros de la izquierda.
     * @param s
     */
    public void nuevaCifra(String s) {
        numero = numero + s;
        int vnumero =  Integer.valueOf(numero);
        numero = Integer.toString(vnumero);
    }
    
    /**
     *Devuelve la variable de clase numero.
     * @return
     */
    public String mostrarNumero() {
        return numero;
    }
    
    
    /**
     *Devuelve el valor entero de la variable de clase numero.
     * @return
     */
    public int obtenerNumero() {
        return Integer.valueOf(numero);
    }
    
    /**
     *Establece el valor de la variable de clase numero a cero.
     */
    public void resetNumero() {
        numero = "0";
    }
    
    /**
     *Establece el valor de la variable de clase numero al valor cadena de texto
     * pasado como parámetro n
     *
     * @param n 
     */
    public void establecerNumero(String n) {
        numero = n;
    }
}
