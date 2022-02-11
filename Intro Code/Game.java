import java.util.Scanner;
public class Game
{
    public static void main()
    {
        Scanner k = new Scanner(System.in);
        Nim nim = new Nim();
        int win = 0;
        while(nim.stones[0]>0||nim.stones[1]>0||nim.stones[2]>0)
            {
                
                System.out.println("Player1: \n");
                System.out.println("Enter which pile:");
                int pile1 = k.nextInt()-1;
                System.out.println("Enter how many stones:");
                int stones1 = k.nextInt();
                nim.stones[pile1] = nim.stones[pile1]-stones1;
                win = 2;
                nim.displayNim(nim.stones);
                
                
                System.out.println("Player2: \n");
                System.out.println("Enter which pile:");
                int pile2 = k.nextInt()-1;
                System.out.println("Enter how many stones:");
                int stones2 = k.nextInt();
                nim.stones[pile2] = nim.stones[pile2]-stones2;
                win = 1;
                nim.displayNim(nim.stones);
                
                
            }
            System.out.println("Player"+win+" wins!");
    }
}
