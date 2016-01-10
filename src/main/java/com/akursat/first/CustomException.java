/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.akursat.first;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author akursat
 */
public class CustomException extends Exception {

    public CustomException() {
        // TODO Auto-generated constructor stub
    }

    public CustomException(String message) {
        super(message);
    }

    public CustomException(String message, Throwable throwable) {
        super(message, throwable);
    }

}
