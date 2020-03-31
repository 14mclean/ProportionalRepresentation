public class Room
{
    private Person occupant;
    private int roomNum;
    private int happiness;

    Room(int roomNumber, Person occupant)
    {
        this.roomNum = roomNumber;
        this.occupant = occupant;
    }

    int getHappiness()
    {
        this.happiness = occupant.getHappiness(roomNum);
        return happiness;
    }

    Person getOccupant()
    {
        return occupant;
    }

    int getRoomNumber()
    {
        return roomNum;
    }
}