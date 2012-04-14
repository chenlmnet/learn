// "Turning off" Checked exceptions.
package com.chenlm.learn.tjava.exceptions;

import static com.chenlm.learn.tjava.util.Print.print;

import java.io.FileNotFoundException;
import java.io.IOException;

class WrapCheckedException {
    void throwRuntimeException(int type) {
        try {
            switch (type) {
            case 0:
                throw new FileNotFoundException();
            case 1:
                throw new IOException();
            case 2:
                throw new RuntimeException("Where an i?");
            default:
                return;
            }
        } catch (Exception e) { // Adapt to unchecked:
            throw new RuntimeException(e);
        }
    }
}

class SomeOtherException extends Exception {}

public class TurnOffChecking {
    public static void main(String[] args) {
        WrapCheckedException wce = new WrapCheckedException();
        // You can call throwRuntimeException() without a try
        // block, and let RuntimeExceptions leave the method:
        wce.throwRuntimeException(3);
        // Or you can choose to catch exception:
        for (int i = 0; i < 4; i++) {
            try {
                if (i < 3)
                    wce.throwRuntimeException(i);
                else
                    throw new SomeOtherException();
            } catch (SomeOtherException e) {
                print("SomeOtherException: " + e);
            } catch (RuntimeException re) {
                try {
                    throw re.getCause();
                } catch (FileNotFoundException e) {
                    print("FileNOtFoundException: " + e);
                } catch (IOException e) {
                    print("IOException: " + e);
                } catch (Throwable e) {
                    print("Throwable: " + e);
                }
            }
        }
    }
}
