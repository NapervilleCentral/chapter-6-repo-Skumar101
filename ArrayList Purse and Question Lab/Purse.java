
import java.util.ArrayList;

public class Purse
{
    //private ArrayList
    private ArrayList <Coin> change;
        public Purse (int p, int n, int d, int q)
        {
            while(p>0)
                {
                 change.add(new Coin('p'));
                 p--;
                }
            while(n>0)
                {change.add(new Coin('n'));
                 n--;
                }
            while(d>0)
                {change.add(new Coin('d'));
                 d--;
                }
            while(q>0)
                {change.add(new Coin('q'));
                 q--;
                }
        }
        
        public Purse (Coin acoin)
        {
            change.add(acoin);
        }
        /** precondition: Coin will be initialized (value and name) correctly
        *               each variable will have a value
          postcondition: Puts the Coin into the array list change
        */
    public void add (Coin acoin)
    {
        change.add(acoin);
    }
    public void remove(Coin acoin)
    {
        change.remove(acoin);
    }
  /** Returns the total value of the coins in the array
  *                 list change
        @return ???
  */
    public double getTotal()
    {
        int total = 0;
        for(int i = 0; i<change.size(); i++)
            total+=change.get(i).getValue();
        return total;

    }



 /**
 *  Returns the all objects in the array list as Strings
 */

   public String toString()
   {
       String data="";
       for(int i = 0; i<change.size(); i++)
        data+=change.get(i)+"\n";
       data+="Total: "+getTotal();
       return data;
   }

}
//end of purse
