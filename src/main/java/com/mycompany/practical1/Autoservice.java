/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practical1;

/**
 *
 * @author darkp
 */
public class Autoservice {
    
public void modify(Car car) {
        String modifiedName = car.getName().toLowerCase().replace('a', 'o').replace('i', 'e');
        System.out.println(modifiedName);
    }
}
