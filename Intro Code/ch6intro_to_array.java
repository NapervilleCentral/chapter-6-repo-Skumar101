/********************************************************************
// These are the notes for ch 6 used in hayes class


import
//******************************************************************* */


import java.text.DecimalFormat;
import java.text.NumberFormat;
import javax.swing.*;
import java.util.StringTokenizer;
import java.util.*;


public class ch6intro_to_array

{
    final static int MAX = 20;

public static void main (String[] args)
{

/*
        mathy useful = new mathy();
        int x = 50;
        int[] num = new int[20];
        int[] values = new int[MAX];
        //.length not a method public data
        int[] oddnums = new int[num.length];
        int[] evennum = new int[num.length];
        int[] negnum = new int[MAX];

       Random gen = new Random();
       
       int[] nums2 = {-3, 5, 1, 4, 66, 33, -27, 38, 88, 73};
       useful.getOdd(nums2, oddnums);
       
       for( int s: oddnums)
       {
           System.out.print(s+",");
        }
       /*

        System.out.println(Searches.linearSearch(num,look)  );
        Sorts.selectionSort(num);
        System.out.println(Searches.binarySearch(num,look)  );



        //for each loop
/*

        useful.getOdd(num,oddnum);




        //System.out.println("----------SORTING-----------"  );






/*
        System.out.println("Enter a number");
        int find = Keyboard.readInt();

        System.out.println(Searches. binarySearch(num,find));

   /*







 /*
       //make a two dementional array
       int [][] table = new int [5][10];

       // Load the table with values
       for (int row=0; row < table.length; row++)
          for (int col=0; col < table[row].length; col++)
             table[row][col] = row * 10 + col;

       //print the table
        for (int row=0; row < table.length; row++)
        {
            for (int col=0; col < table[row].length; col++)
                System.out.print (table[row][col] + "\t");

            System.out.println();
        }


    // make a 2d array with an iniitalizer list.
    //print the length of row and col
/**/
    int [][] scores = { {1,2,3},//6
                        {2,2,3},//7
                        {3,2,3},//8
                        {4,2,3}    };//9
    mathy.print2D(scores);
    System.out.println(scores[2][1]);
    //how many columns
    System.out.println(scores[0].length+"col");
    //how many rows
    System.out.println(scores.length+"row");
    int arraySum = 0;
    for(int r = 0; r<scores.length; r++)
    {
        for(int c = 0; c<scores[r].length; c++)
        {
            arraySum+= scores[r][c];
        }
    }
    //sum entire 2D array
    System.out.println("The sum of this array is "+arraySum);
    //sum a row of 2D array
    int sum2 = 0;
    for(int c = 0; c<scores[2].length; c++)
    {
        sum2+= scores[2][c];
    }
    System.out.println("The sum of row 2 is "+sum2);
    //sum of last coloumn
    int sum3 = 0;
    for(int r = 0; r<scores.length; r++)
    {
        sum3+= scores[r][scores[0].length-1];
    }
    System.out.println("The sum of last coloumn is "+sum3);
    
    int [][] Latin = mathy.latinSq(3);
    mathy.print2D(Latin);
    
    Latin = mathy.latinSq(6);
    mathy.print2D(Latin);



}// end of main

   public static int[] doubleSize(int[] array)
   {


        return array;


   }

//passing int by value
   public static void foo(int x)
   {

       x = 100;
   }


//arrays are passed by reference
    public static void foo(int [] num)
      {

          num[0] = 100;

      }

    /*


   public static void odd()
   {

       int count =0;


   }// end of odd

    /*  */
}// end of class











