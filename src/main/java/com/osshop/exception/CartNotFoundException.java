/**
 * 
 */
package com.osshop.exception;

/**
 * @author Admin
 *
 */
public class CartNotFoundException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public CartNotFoundException(String message) {
        super(message);
    }
}
