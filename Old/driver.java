import java.util.*;

public class driver
{
    static void permute(List<Person> arr, int k, List<Person[]> out)
    {
        for(int i = k; i < arr.size(); i++)
        {
            Collections.swap(arr, i, k);
            permute(arr, k+1, out);
            Collections.swap(arr, k, i);
        }
        if (k == arr.size() -1)
        {
            //out.add(arr.toArray());
            Person[] temp = new Person[arr.size()];
            for(int count = 0; count < arr.size(); count++)
            {
                temp[count] = arr.get(count);
            }
        }
    }

    static int factorial(int n)
    {
        int result = 1;

        for(int fact = 2; fact <= n; fact++)
        {
            result *= fact;
        }

        return result;
    }

    static int P(int n, int r)
    {
        return factorial(n)/factorial(n-r);
    }
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int numPeople = 0;

        System.out.println("How many people: ");
        numPeople = scan.nextInt();
        Person[] people = new Person[numPeople];
        String[] options = new String[numPeople];

        for(int count = 0; count < numPeople; count++)
        {
            System.out.println("What is option " + count + ": ");
            options[count] = new String(scan.next());
        }

        for(int count = 0; count < numPeople; count++)
        {
            System.out.println("\nWho is person " + count + ": ");
            people[count] = new Person(scan.next(), numPeople);

            for(int count2 = 0; count2 < numPeople; count2++)
            {
                System.out.println("What place is " + options[count2] + ": ");
                people[count].setChoice(options[count2], scan.nextInt()-1);
            }
        }

        for(int count = 0; count < numPeople; count++)
        {
            System.out.println("Does " + people[count].getName() + "have a veto (Y/N)");
            if(scan.next().toUpperCase() == "Y")
            {
                System.out.println("What is " + people[count] + "'s veto:");
                people[count].setVeto(scan.next());
                System.out.println("\n");
            }
        }

        scan.close();

        System.out.println("\n-----Starting selection process-----\n");

        List<Person> temp = new ArrayList<Person>();
        List<Person[]> end = new ArrayList<Person[]>();
        for(int count = 0; count < numPeople; count++)
        {
            temp.add(people[count]);
        }

        permute(temp, 0, end);

        int topHappiness = 0;
        int topHappinessIndex = 0;
        
        for(int count = 0, happiness = 0; count < end.size(); count++)
        {
            happiness = 0;
            for(int i = 0; i < numPeople; i++)
            {
                happiness += end.get(count)[i].getHappiness(options[i]);
            }
            if(happiness > topHappiness)
            {
                topHappinessIndex = count;
            }
        }

        System.out.println("-----Results-----");
        for(int count = 0; count < numPeople; count++)
        {
            System.out.println(options[count] + end.get(topHappinessIndex)[count].getName());
        }
    }
}