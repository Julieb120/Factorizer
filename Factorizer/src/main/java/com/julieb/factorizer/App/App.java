/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.julieb.factorizer.App;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author julie
 */
public class App {
    public static void main(String[] args){
    
    System.out.println("Welcome to the Factorizer \nInput your number:");


    //user inputs value 
    Scanner input = new Scanner(System.in);
    int value = input.nextInt();
    System.out.println();
    
    //print factors 
    ArrayList<Integer> factors = findFactors(value);
    System.out.println("The factors of "+ value + " are " + factors.toString());
    
    
    //print if its perfect --> all factors add up to original number
    isPerfect(factors, value);
    
    //print if its prime --> factors are 1 and itself
        if(factors.size() == 1){
            System.out.println("This is a prime");
        }
    }
    
    public static ArrayList<Integer> findFactors(int num){
        ArrayList<Integer> factors = new ArrayList<>(); 
        for(int i=1; i< num; i++){
            
            if (num%i == 0 ){
                factors.add(i);    
            }
        }
    return factors;
    }
    
    public static void isPerfect(ArrayList<Integer> factors, int num){
            int sum =0;
        for(Integer i: factors){
            sum += i;
        }
        
        if (sum == num){
            System.out.println("This is a perfect number");
        }
      
    }
}
