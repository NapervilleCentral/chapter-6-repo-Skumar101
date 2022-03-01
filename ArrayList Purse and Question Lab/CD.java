//********************************************************************
//  CD.java       Author: Lewis/Loftus/Cocking
//
//  Represents a compact disc.
//********************************************************************

import java.text.NumberFormat;

public class CD
{
   private String title, artist;
   private double cost;
   private int tracks;
   private double rating;
   private String genre;

   //-----------------------------------------------------------------
   //  Creates a new CD with the specified information.
   //-----------------------------------------------------------------
   public CD (String name, String singer, double price, int numTracks)
   {
      title = name;
      artist = singer;
      cost = price;
      tracks = numTracks;
      rating = 0;
   }
   //-----------------------------------------------------------------
      //  Creates a new CD with the specified information.
      //-----------------------------------------------------------------
      public CD (String name, String singer, double price, int numTracks, double rate)
      {
         title = name;
         artist = singer;
         cost = price;
         tracks = numTracks;
         rating = rate;
   }

   /**
   create hashCode() method
   will use all static information and creat hashCode
   mulitply by prime number
   @return int - the hash Code
   
   */
    public int hashCode(CD cd)
    {
        
        return 17*cd.tracks*cd.title.length()*cd.artist.length()*(int)cd.cost*(int)cd.rating;
    }
   //-----------------------------------------------------------------
   //  Returns a description of this CD.
   //-----------------------------------------------------------------
   public String toString()
   {
      NumberFormat fmt = NumberFormat.getCurrencyInstance();

      String description;

      description = fmt.format(cost) + "\t" + tracks + "\t";
      description += title + "\t" + artist+ "\t"+ rating;

      return description;
   }
}
