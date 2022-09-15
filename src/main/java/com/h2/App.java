package com.h2;

import javax.swing.plaf.synth.SynthTextAreaUI;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );


       /* int[] a={1,2,3,4,5};
        System.out.println(add(a));*/
    }

    public static int doubleTheNumber(int number) {
        return (2*number);
    }
    private  static int add(int[] numbers){
        int sum=0;
        for (int i=0;i<numbers.length;i++) {
            sum += numbers[i];
        }
        return sum;
    }
}
