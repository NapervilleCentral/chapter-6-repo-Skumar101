/**
 * Write a description of class Game_of_Nim here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Nim
{
    public int stones [] = new int[3];
    public Nim()
    {
        stones[0] = 3;
        stones[1] = 5;
        stones[2] = 8;
        
    }
    public void displayNim(int [] stones)
    {
        if (stones[0]<0)
            stones[0] = 0;
        if (stones[1]<0)
            stones[1] = 0;
        if (stones[2]<0)
            stones[2] = 0;
        for(int num: stones)
        {
            for(int i = 0; i<num; i++)
                System.out.print("O");
            System.out.println();
        }
    }
}
