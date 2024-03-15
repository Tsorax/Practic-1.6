/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.practical1;

import java.util.Scanner;

/**
 *
 * @author darkp
 */
public class Practical1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nameInput = input.next();
        Car car = new Car();
        car.setName(nameInput);

        Autoservice as = new Autoservice();

        System.out.println("Алан Мазихов Вариант 1");
        as.modify(car);
    }
}
