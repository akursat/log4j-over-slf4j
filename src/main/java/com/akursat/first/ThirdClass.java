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
public class ThirdClass {

    FirstClass class1;
    SecondClass class2;

    private final Logger slf4jLogger = LoggerFactory.getLogger(ThirdClass.class);

    public void genAnotherException() throws CustomException {

        try {
            class2 = new SecondClass();
            class2.callException();

        } catch (Exception ex) {
            throw new CustomException("another exception created as response to first exception", ex);

        }

    }
}
