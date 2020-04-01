import java.util.Scanner;

public class Person
{
    private int[] roomOrder;
    private String name  = new String();
    private int numRooms;
    private Scanner sc;

    Person(String name, int numRooms)
    {
        this.numRooms = numRooms;
        roomOrder = new int[numRooms];
        this.name = name;
    }

    void setChoices()
    {
        sc = new Scanner(System.in);
        for(int count = 0; count < numRooms; count++)
        {
            System.out.println("What room is your " + (count+1) + " pick");
            roomOrder[count] = sc.nextInt();
        }
        sc = null;
    }
    
    String getName()
    {
        return name;
    }

    int getHappiness(int currentRoom)
    {
        for(int count = 0; count < roomOrder.length; count++)
        {
            if(roomOrder[count] == currentRoom)
            {
                return roomOrder.length - count+1;
            }
        }
        return -1;
    }
}