import java.util.Scanner;
public class Game
{
    public static void main()
    {
        Scanner k = new Scanner(System.in);
        Nim nim = new Nim();
        int win = 0;
        while(true)
            {
                System.out.println("Player1: \n");
                System.out.println("Enter which pile:");
                int pile1 = k.nextInt()-1;
                if(pile1<0)
                    pile1 = k.nextInt()-1;
                if(nim.stones[pile1]<=0)
                    pile1 = k.nextInt()-1; 
                System.out.println("Enter how many stones:");
                int stones1 = k.nextInt();
                if(stones1<=0)
                    stones1 = k.nextInt()-1;
                nim.stones[pile1] = nim.stones[pile1]-stones1;
                win = 2;
                nim.displayNim(nim.stones);
                if(nim.stones[0]<=0&&nim.stones[1]<=0&&nim.stones[2]<=0)
                    break;
                
                System.out.println("Player2: \n");
                System.out.println("Enter which pile:");
                int pile2 = k.nextInt()-1;
                if(pile2<0)
                    pile2 = k.nextInt()-1;
                if(nim.stones[pile2]<=0)
                    pile2 = k.nextInt()-1;
                System.out.println("Enter how many stones:");
                int stones2 = k.nextInt();
                if(stones2<=0)
                    stones2 = k.nextInt()-1;
                nim.stones[pile2] = nim.stones[pile2]-stones2;
                win = 1;
                nim.displayNim(nim.stones);
                if(nim.stones[0]<=0&&nim.stones[1]<=0&&nim.stones[2]<=0)
                    break;
                
            }
            System.out.println("Player"+win+" wins!");
    }
}
