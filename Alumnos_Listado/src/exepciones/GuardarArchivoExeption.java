/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exepciones;

/**
 *
 * @author Citlalli
 */
public class GuardarArchivoExeption extends Exception{
    /**
     * Creates a new instance of <code>GuardarArchivoExeption</code> without
     * detail message.
     */
    public GuardarArchivoExeption() {
    }

    /**
     * Constructs an instance of <code>GuardarArchivoExeption</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public GuardarArchivoExeption(String msg) {
        super(msg);
    }
}
