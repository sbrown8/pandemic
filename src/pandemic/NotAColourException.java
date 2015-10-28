/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pandemic;

/**
 *
 * @author Shannon
 */
public class NotAColourException extends Exception {

    /**
     * Creates a new instance of <code>NotAColourException</code> without detail
     * message.
     */
    public NotAColourException() {
    }

    /**
     * Constructs an instance of <code>NotAColourException</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public NotAColourException(String msg) {
        super(msg);
    }
}
