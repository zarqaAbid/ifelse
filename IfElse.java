/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ifelse;

import java.util.Scanner;

/**
 *
 * @author hassn
 */
public class IfElse {

    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner input = new Scanner( System.in);
        int no;
        no=input.nextInt();
        if (no>=100)
        {
                    System.out.println ("invalid grade");

        }
        else if(no >= 80)
        {
        System.out.println ("your grade is A");
        }
        else if (no >= 70)
        {
        System.out.println ("your grade is B");
        }
        else if (no >= 60)
        {
        System.out.println ("your grade is C");
        }
        else if (no >= 50)
        {
        System.out.println ("your grade is F");
        }
    }
}
