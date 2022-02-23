/**
*  Edit class to fullfill Purse Requirements
*
*  Represents a coin with two sides that can be flipped.
*/

import java.util.Random;

public class Coin
{
   private final int HEADS = 0;
   private final int TAILS = 1;

   private int face;
   private double amount;
   private char type;
   
   /**-----------------------------------------------------------------
   *  Sets up the coin by flipping it initially.
   */
   public Coin (char Type)
   {
       if (Type == 'p')
        amount = 0.01;
       else if(Type == 'n')
        amount = 0.05;
       else if(Type == 'd')
        amount = 0.1;
       else if(Type == 'q')
        amount = 0.25;
       else
        amount = 0;
       type = Type;
       flip();
   }
   
   /**-----------------------------------------------------------------
   *  Flips the coin by randomly choosing a face value.
   */
   public void flip ()
   {
      face = (int) (Math.random() * 2);
   }
   
   /**------------------------------------------------------------------
   * does stuff
   */
   public double getValue()
   {
       return amount;
    }
   
   /**-------------------------------------------------------------------
    * does more stuff
    */ 
   public char getType()
   {
       return type;
    }
   /**-----------------------------------------------------------------
   *  Returns true if the current face of the coin is heads.
        @return boolean, true if heads
   */
   public boolean isHeads ()
   {
      return (face == HEADS);
   }

   /**-----------------------------------------------------------------
   *  Returns coin type and value.
        @return String
   */
   public String toString()
   {
      String Type;
      if (type == 'p')
        Type = "Penny";
       else if(type == 'n')
        Type = "Nickel";
       else if(type == 'd')
        Type = "Dime";
       else if(type == 'q')
        Type = "Quarter";
       else
        Type = "N/A";
      return Type + " "+ amount;
   }
}
