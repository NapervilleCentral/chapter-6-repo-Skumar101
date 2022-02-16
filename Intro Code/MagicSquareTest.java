/********************************************************************
// Starter Code for Magic Square


import
//******************************************************************* */

import java.text.DecimalFormat;
import java.text.NumberFormat;
import javax.swing.*;
import java.util.*;

public class MagicSquareTest

{       final static int MAX = 15;

      public static void main (String[] args)
   {


    // make a 2d array with an iniitalizer list.
    //If you test this and it not Magic your waving your wand wrong

    int [][] square1 = { {16,3, 2,13},
                        {5,10,11, 8},
                        {9, 6, 7,12},
                        {4,15,14, 1}  };

    // magic square or not a magic square, that is the question
    int [][] square2 = { {5,9,1},
                         {7,2,6},
                         {3,4,8}  };

    // Do you belive in magic?
    int [][] square3 = {{11,24, 7,20, 3},
                        { 4,12,25, 8,16},
                        {17, 5,13,21, 9},
                        {10,18, 1,14,22},
                        {23, 6,19, 2,15}  };


    MagicSquare util= new MagicSquare(square1);
    
    System.out.println("Square 1:\n");
    if (util.isMagic())
        System.out.println("It's MAGIC!! With a sum of "+ util.getMagicNum());
    else
        System.out.println("Hello muggle, your square is not magic");
    System.out.println();
    //change the 2D array and retest
    util.setMagicSquare(square2);
    System.out.println("Square 2:\n");
    if (util.isMagic())
            System.out.println("It's MAGIC!! With a sum of "+ util.getMagicNum());
        else
        System.out.println("Hello muggle, your square is not magic");
    System.out.println();
    //change the 2D array and retest
        util.setMagicSquare(square3);
        System.out.println("Square 3:\n");
        if (util.isMagic())
                System.out.println("It's MAGIC!! With a sum of "+ util.getMagicNum());
            else
        System.out.println("Hello muggle, your square is not magic");
        




}//end of main
}// end of class











