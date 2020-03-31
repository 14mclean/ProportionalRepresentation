import java.util.*;

public class ChooserLauncher
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Dictionary<String, int[]> allChoices;
        int numRooms;
        int numPeople;
        String currentPerson = new String();

        // get num of rooms
        System.out.println("How many rooms are there: ");
        numRooms = sc.nextInt();
        // get num of people
        System.out.println("How many people are there: ");
        numPeople = sc.nextInt();
        // get player names and choices
        for(int count = 0; count < numPeople; count++)
        {
            System.out.println("What is person " + count + "'s name: ");
            currentPerson = sc.nextLine();
            for(int count2 = 0; count2 < numRooms; count2++)
            {

            }
        }
        // recurse to find highest happiness
    }
}