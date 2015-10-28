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
public class PlayerLoses extends Exception {

    /**
     * Creates a new instance of <code>PlayerLoses</code> without detail
     * message.
     */
    public PlayerLoses() {
    }

    /**
     * Constructs an instance of <code>PlayerLoses</code> with the specified
     * detail message.
     *
     * @param msg the detail message.
     */
    public PlayerLoses(String msg) {
        super(msg);
    }
}
