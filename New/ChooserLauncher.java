import java.util.*;

public class ChooserLauncher
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Person[] allPeople;
        int numRooms;
        int numPeople;

        // get num of rooms
        System.out.println("How many rooms are there: ");
        numRooms = sc.nextInt();

        // get num of people
        System.out.println("How many people are there: ");
        numPeople = sc.nextInt();
        allPeople = new Person[numPeople];
        
        sc = null;

        // get player names and choices
        for(int count = 0; count < allPeople.length; count++)
        {
            allPeople[count].setChoices();
        }
        // recurse to find highest happiness
    }
}