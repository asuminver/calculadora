/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mi.calculadora;

/**
 * Control de las operaciones de la calculadora.
 * la variable de clase acumulado, mantiene el valor resultado de operaciones
 * o establecido al pulsar la tecla igual.
 * @author joer
 */
public class Operacion {
    private int acumulado;
    
    
    Operacion() {
        acumulado = 0;
    }
    
    /**
     * Realiza la suma del parámetro entero más el acumulado.
     * @param s
     */
    public void suma(int s) {
        acumulado += s;
    }
    
    
    /**
     * Realiza la resta del parametro entero al acumulado.
     * @param r
     */
    public void resta(int r) {
        acumulado -= r;
    }
    
    /**
     * Realiza la multiplicación del parámetro entero y el acumulado.
     * @param m
     */
    public void multiplica(int m) {
        acumulado = acumulado * m;
    }
    
    /**
     * Realiza la división entera del acumulado entre el parámetro.
     * Captura la excepción, división entre cero. Devolviendo el resultado
     * cero.
     * @param d
     */
    public void divide(int d) {
        try {
        acumulado = acumulado / d;
        } catch (ArithmeticException e) {
            acumulado = 0;
        }
    }
    
    
    /**
     * Devuelve el valor de la variable de clase acumulado.
     * @return
     */
    public int obtenerAcumulado() {
        return acumulado;
    }
    
    
    /**
     * Devuelve el valor de la variable de clase acumulado de tipo String.
     * @return
     */
    public String mostrarAcumulado() {
        return String.valueOf(acumulado);
    }
    
    /**
     * Pone a cero el valor de la variable de clase acumulado
     */
    public void borrarAcumulado() {
        acumulado = 0;
    }
    
    /**
     * Establece el valor de la variable de clase acumulado, al valor entero
     * pasado como parámetro.
     * @param v
     */
    public void establecerAcumulado(int v) {
        acumulado = v;
    }
}
