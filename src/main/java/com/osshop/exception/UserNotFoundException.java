/**
 * 
 */
package com.osshop.exception;

/**
 * @author Admin
 *
 */
public class UserNotFoundException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public UserNotFoundException(String message) {
        super(message);
	}
}
