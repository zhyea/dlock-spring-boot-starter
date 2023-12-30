package org.chobit.spring.rlock.exception;


/**
 * @author rui.zhang
 */
public class RLockException extends RuntimeException {

    public RLockException() {
    }


    public RLockException(String message) {
        super(message);
    }
}
