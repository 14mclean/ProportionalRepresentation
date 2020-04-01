import java.util.*;

public class ChooserLauncher
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Person[] allPeople;
        int numRooms;
        int numPeople;
        String tempName;
        List<Person[]> permutations = new ArrayList<Person[]>();
        Accommodation[] accommodationPerms;

        // get num of rooms
        System.out.println("How many rooms are there: ");
        numRooms = sc.nextInt();

        // get num of people
        System.out.println("How many people are there: ");
        numPeople = sc.nextInt();
        allPeople = new Person[numPeople];
        sc.nextLine();

        // get player names and choices
        for(int count = 0; count < allPeople.length; count++)
        {
            System.out.println("\nWhat is your name: ");
            tempName = sc.nextLine();
            allPeople[count] = new Person(tempName, numRooms);
            allPeople[count].setChoices();
            tempName = null;
        }

        sc = null;

        // recurse to find highest happiness
        heapAlgorithm(allPeople, allPeople.length, allPeople.length, permutations);

        accommodationPerms = new Accommodation[permutations.size()];
        for(int count = 0; count < permutations.size(); count++)
        {
            accommodationPerms[count] = new Accommodation(numRooms,  permutations.get(count));
        }
        
        for(int count = (accommodationPerms.length-1); count >= 0; count--)
        {
            for(int count2 = 1; count2 <= count; count++)
            {
                if(accommodationPerms[count2 - count].getTotalHappiness() > accommodationPerms[count].getTotalHappiness())
                {
                    Accommodation temp = accommodationPerms[count2];
                    accommodationPerms[count2-1] = accommodationPerms[count2];
                    accommodationPerms[count2] = temp;
                }
            }
        }
        System.out.println("Sorted");
        for(int count = 0; count < accommodationPerms.length; count++)
        {
            System.out.print(accommodationPerms[count].getTotalHappiness() + ": ");
            for(int count2 = 0; count2 < permutations.size(); count2++)
            {
                System.out.print(permutations.get(count)[count2].getName() + ":" + accommodationPerms[count].getPersonHappiness(permutations.get(count)[count2]));
            }
            System.out.println("\n");
        }
    }

    private static void heapAlgorithm(Person[] array, int size, int n, List<Person[]> list)
    {
        if(size == 1)
        {
            for(int count = 0; count < n; count++)
            {
                list.add(new Person[n]);
                list.get(list.size()-1)[count] = array[count];
                //System.out.print(array[count].getName() + ", ");
            }
            //System.out.println();
        }

        for(int count = 0; count < size; count++)
        {
            heapAlgorithm(array, size-1, n, list);

            if(size % 2 == 1)
            {
                Person temp = array[0];
                array[0] = array[size-1];
                array[size-1] = temp;
            }

            else
            {
                Person temp = array[count];
                array[count] = array[size-1];
                array[size-1] = temp;
            }
        }
    }
}