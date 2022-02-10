import java.util.ArrayList;//required for AL
import java.util.Scanner;
import java.io.*;//required for File i/o

public class WordList2022
{
  public static void main (String [] args) throws IOException // required for File IO
   {
      ArrayList <String> words = new ArrayList<>();
      Scanner scanFile = new Scanner(new File("words.txt"));
      String word;
      while (scanFile.hasNext())
      {
          word = scanFile.next();
          if (word.length() == 6)
             words.add(word);
       }
       System.out.println("There are " + words.size() + " six letter words");      
       
      //gets rid of adjacent duplicate words
      for (int i = 0; i < words.size() - 1; i++)
      {
          if (words.get(i).equals(words.get(i + 1)))
          {
              words.remove(i);
              i--;
            }
        }
     
      //gets rid of words with adjacent vowels
      String part;
      for (int i = words.size() - 1; i >= 0; i--)
      {
          word = words.get(i);
          for (int j = 0; j < 4; j++)
          {
              part = word.substring(j, j + 2);
              if (part.equals( "aa") || part.equals("ii") || part.equals("uu"))
              {
                  words.remove(i);
                  word = words.get(i);
                }
            }
         
          if (word.substring(4).equals("aa") || word.substring(4).equals("ii") || word.substring(4).equals("uu"))
          {
              words.remove(i);
            }
        }
       
      System.out.println("There are " + words.size() + " six letter words");      

   }
}