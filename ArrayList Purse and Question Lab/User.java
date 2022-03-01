import java.util.Scanner;
public class User
{
    public static void main()
    {
    Scanner keyboard = new Scanner(System.in);
    System.out.println("Enter # of Pennies:");
    int p = keyboard.nextInt();
    System.out.println("Enter # of Nickels:");
    int n = keyboard.nextInt();
    System.out.println("Enter # of Dimes:");
    int d = keyboard.nextInt();
    System.out.println("Enter # of Quarters:");
    int q = keyboard.nextInt();
    
    Purse purse = new Purse(p ,n ,d, q);
    int choice = 0;
    while(choice!=3)//simple menu
    {System.out.println("Menu:");
    System.out.println("1. Add");
    System.out.println("2. Remove");
    System.out.println("3. Exit");
    choice = keyboard.nextInt();
    if(choice == 1)
        {System.out.println("Enter the first letter of the coin you want to add: ");
         char add = keyboard.next().toLowerCase().charAt(0);
         purse.add(new Coin(add));
        }
    if(choice == 2)
    {
        System.out.println("Enter the first letter of the coin you want to remove: ");
         char remove = keyboard.next().toLowerCase().charAt(0);
         purse.remove(remove);
    }
    }       
    System.out.println(purse);
}
}
