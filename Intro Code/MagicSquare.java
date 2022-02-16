;
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
        return checkrows()&&checkdiagonals()&&checkcoloumns();
    }
    public int getMagicNum()
    {
        return magicNum;
    }
    public void setMagicSquare(int [] [] array)
    {
        this.array=array;
    }
    public boolean checkrows()
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
            else
                break;
        }
        if(truecounter == array.length-1)
            return true;
        else
            return false;
    }
    public boolean checkdiagonals()
    {
        int all = 0;
        for(int i = 0; i<array[0].length; i++)
        {
            all+=array[i][i];
        }
        int all2 = 0;
        for(int i = array[0].length-1; i>=0; i--)
        {
            all2+=array[i][array[0].length-1-i];
        }
        if(all==magicNum && all2==magicNum)
            return true;
        else
            return false;
    }
    public boolean checkcoloumns()
    {
        int truecounter = 0;
        for(int i = 1; i<array.length; i++)
        {
            int num = 0;
            for(int j = 0; j<array.length; j++)
            {
                num+=array[j][i];
            }
            if(num==magicNum)
                truecounter++;
            else
                break;
        }
        if(truecounter == array.length-1)
            return true;
        else
            return false;
    }
}
