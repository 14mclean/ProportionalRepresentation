public class Accommodation
{
    private int numRooms;
    private Room[] allRooms;
    private int totalHappiness;
    private Person[] occupantList;

    Accommodation(int numRooms, Person[] orderedOccupantList)
    {
        this.occupantList = new Person[orderedOccupantList.length];
        this.occupantList = orderedOccupantList;
        this.numRooms = numRooms;
        
        for(int count = 0; count < numRooms; count++)
        {
            allRooms[count] = new Room(count, occupantList[count]);
        }
    }

    int getTotalHappiness()
    {
        totalHappiness = 0;

        for(int count = 0; count < numRooms; count++)
        {
            totalHappiness += allRooms[count].getHappiness();
        }

        return totalHappiness;
    }
}