/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.*;

/**
 *
 * @author Master
 */
public class Insurance2 {
    public static int quote(int age){
        int policyQuote = (age*5)+300;
    return policyQuote;
    }
    
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    System.out.println("How old are you?");
    int answer = keyboard.nextInt();
    int policy = quote(answer);
    System.out.println("your policy will cost $"+policy+".");
    }
    
}

    

