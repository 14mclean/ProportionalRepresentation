import java.util.*;

public class driver
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int numPeople = 0, numOptions = 0;
        String[] names = new String[numPeople];

        // Collect num of people, different options & people's orders

        System.out.println("How many people: ");
        numPeople = scan.nextInt();
        Person[] people = new Person[numPeople];

        System.out.println("How many choices: ");
        numOptions = scan.nextInt();
        String[] options = new String[numOptions];

        for(int count = 0; count < numOptions; count++)
        {
            System.out.println("What is option " + count + ": ");
            options[count] = new String(scan.next());
        }

        for(int count = 0; count < numPeople; count++)
        {
            System.out.println("\nWho is person " + count + ": ");
            people[count] = new Person(scan.next(), numOptions);

            for(int count2 = 0; count2 < numOptions; count2++)
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
    }
}