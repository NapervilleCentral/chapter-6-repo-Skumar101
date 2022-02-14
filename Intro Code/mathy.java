import java.text.DecimalFormat;
import java.text.NumberFormat;
//import cs1.Keyboard;
//import javax.swing.*;
public class mathy
{
    private int [][] square;

    /**
        default constructor - stubed in

    */
    public mathy()
    {
            System.out.println ("hi from default constructor");

    }

    public mathy(int [][] array)
    {
        square = array;

    }
    
    /**
     * prints the 2D array so it is readable row by coloumn
     * @param int[][]
     */
    public static void print2D(int[][] arr)
    {
        for(int r=0; r<arr.length; r++)
        {
            for(int c = 0; c<arr[r].length; c++)
            {
                System.out.print(arr[r][c]+" ");
            }
            System.out.println();
        }
    }
    /**
     * Creates and populates an array with random values
     * @param size - the number of random values 
     * @param range - the range of random values from 1 to range (1, range)
     * 
     */
    public int[] poprandomArray ( int size, int range)
    {
        return new int[10];
    }
    /**
     * will produce a latin square
     * @param int of size
     * @return the latin square
     */
    public static int[][] latinSq(int size)
    {
        int arr[][] = new int[size][size];
          for(int r = 0; r<arr.length; r++)
        {
            arr[0][r] = 1+r;
            
        }
        for(int i = 1; i<size; i++)
        {
            for(int j = 0; j<size; j++)
            {
                arr[i][j] = arr[i-1][j];
            }
            rotateRight(arr[i]);
        }
        return arr;
    }
    /**
        take the absoulute value of the number
        @param int value
        @return absoulute value of number
    */
    public int abs (int x)
    {
        if (x < 0)
            x = -x;

        return x;



    }//end of abs

    public static void rotateRight(int[] arr)
       {
          int x = arr[arr.length - 1];
          for(int i = arr.length - 1; i>0; i--)
          {
              arr[i] = arr[i-1];
          }
          arr[0] = x;
       }

    /**
    *   takes the odd numbers out of an array
    *   @param int[] values int [] to be populated
    *   front load the odd array with the value
    */

   public  void getOdd ( int[] nums, int odds [])
    {   int count = 0;
        for(int i = 0; i<nums.length; i++)
        {
            if (nums[i]%2!=0)
                {odds[count] = nums[i];
                count+=1;} //a binary search must have everything in order first
        }
        

        



    }//end of getOdd



    /**
    *   takes the even numbers out of an num array
    *   assigns values to evennum array
    *   @param int[] values, int[] evenvalues
    *   @none
    */


    public int [] getEven(int[] num)
    {
        int [] evens = new int[num.length];



        return evens;
    }//end of getEven









    /**
            message from Mathy class
            @param none
            @return String message
    */


    public String toString()
    {
        return ("Hi what do you want?, I'm just Mathy");

    }


    public void switchThem (int[] a1, int a2[])
    {
        int [] temp = a1;




    }
    public void count(int[] a1, int[] a2)
    {
        for (int i : a1)
            a2[i] ++;



    }


    public static int sum2DArray(int [][] scores)
    {



        for ( int row=0; row < scores.length; row++)
        {
            for ( int col=0; col < scores[row].length; col++)

                System.out.print (scores[row][col] + "\t");

            System.out.println();
        }


        return 0;

    }



    public int sumOneRow2DArray(int row)
    {   int total = 0;




        return total;

    }
        public int sumOneCol2DArray(int row)
        {   int total = 0;




            return total;

    }

    public int[] sumall2DArray(int [][] scores)
    {
        int [] temp = {1,2,3,4,};




        return temp;
    }

    /**
        Doubles the size of an array
        @param int []
        @return int [] twice the size, with values copied over
    */
   public static int[] doubleSize(int[] array)
   {
       //make temp 2 times the size of array
       int[] temp = new int[array.length * 2];
       System.out.println(temp.length +"-" );

        //copy all the values over to new array
       for (int i = 0; i < array.length; i++)
            temp[i] = array[i];

        //old array changes reference to new larger array
       array = temp;

        return array;

   }




}//end of class
