/**
 * Write a description of class MagicSquare here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MagicSquare
{
    private int magicNum;
    private int[][] array;
    public MagicSquare(int[][]array)
    {
        for(int i= 0; i<array.length; i++)
        {
            magicNum+= array[0][i];
        }
        this.array = array;
    }
    public boolean isMagic()
    {
        int truecounter = 0;
        for(int i = 1; i<array.length; i++)
        {
            int num = 0;
            for(int j = 0; j<array.length; j++)
            {
                num+=array[i][j];
            }
            if(num==magicNum)
                truecounter++;
        }
        if(truecounter == array.length-1)
            return true;
        else
            return false;
    }
    //public int
}
