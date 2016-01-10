/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.akursat.first;

/**
 *
 * @author akursat
 */
public class SecondClass {

    FirstClass class1;

    public void callException() {
        class1 = new FirstClass();
        class1.genException();
    }
}
