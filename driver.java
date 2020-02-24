import java.util.*;

public class driver
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int numPeople = 0, numOptions = 0;
        
        // Collect num of people, different options & people's orders

        System.out.println("How many people: ");
        numPeople = scan.nextInt();
        Person[] people = new Person[numPeople];

        System.out.println("How many choices: ");
        numOptions = scan.nextInt();
        String[] options = new String[numOptions];
    }
}