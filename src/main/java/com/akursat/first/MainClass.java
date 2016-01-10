/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.akursat.first;

import org.apache.log4j.PropertyConfigurator;
import org.slf4j.LoggerFactory;

/**
 *
 * @author akursat
 */
public class MainClass {
    
    private static final org.slf4j.Logger slf4jLogger = LoggerFactory.getLogger(MainClass.class);
    public static void main(String[] args) {

        PropertyConfigurator.configure("log4j.properties");
        ThirdClass class3 = new ThirdClass();
        try {
            class3.genAnotherException();
        } catch (CustomException ex) {
            slf4jLogger.info("ClassName:" + MainClass.class.getName(), ex);
        }
    }
}
