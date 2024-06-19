package org.chobit.spring.dlock.exception;


/**
 *
 * @author rui.zhang
 */
public class DLockException extends RuntimeException {

    public DLockException() {
    }


    public DLockException(String message) {
        super(message);
    }
}
