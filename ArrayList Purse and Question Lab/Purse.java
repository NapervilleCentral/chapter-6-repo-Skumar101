import java.util.ArrayList;
public class Purse
{
    //private ArrayList
    private ArrayList <Coin> change = new ArrayList<>();
        public Purse (int p, int n, int d, int q)//easier to start if can set all main values in the beginning
        {
            while(p>0)
                {
                 Coin coin = new Coin('p');
                 change.add(coin);
                 p--;
                }
            while(n>0)
                {
                 Coin coin = new Coin('n');
                 change.add(coin);
                 n--;
                }
            while(d>0)
                {Coin coin = new Coin('d');
                 change.add(coin);
                 d--;
                }
            while(q>0)
                {Coin coin = new Coin('q');
                 change.add(coin);
                 q--;
                }
        }
        
        public Purse (Coin acoin)//constructor to just add a new coin right away
        {
            change.add(acoin);
        }
        /** precondition: Coin will be initialized (value and name) correctly
        *               each variable will have a value
          postcondition: Puts the Coin into the array list change
        */
    public void add (Coin acoin)
    {
        int i = 0;
        change.add(acoin);
        if(change.size()==0)//sort to make it in order of value
            change.add(acoin);
        else
            while (i<change.size() && acoin.getValue() > change.get(i).getValue())
                {
                    i++;
                    change.add(i, acoin);
                }
    }
    public void remove(char type)//removes using the type since using a coin can't work
    {
        for(int i = 0; i<change.size(); i++)//
            if(change.get(i).getType() == type)
                {change.remove(change.get(i));
                 break;}
                 
    }
  /** Returns the total value of the coins in the array
  *                 list change
        @return total of all the coin values in the purse
  */
    public double getTotal()
    {
        double total = 0;
        for(int i = 0; i<change.size(); i++)
            total+=change.get(i).getValue();
        return total;

    }



 /**
 *  Returns the all objects in the array list as Strings
 */

   public String toString()
   {
       int p = 0;
       int n = 0;
       int d = 0;
       int q = 0;
       String data="";
       for(int i = 0; i<change.size(); i++)
        if(change.get(i).getType()=='p')
            p++;
        else if(change.get(i).getType()=='n')
            n++;
        else if(change.get(i).getType()=='d')
            d++;
        else if(change.get(i).getType()=='q')
            q++;   
       data+= p+" Pennies\n";
       data+= n+" Nickels\n";
       data+= d+" Dimes\n";
       data+= q+" Quarters\n";
       data+="Total: $"+getTotal();
       return data;
   }

}
//end of purse
