import java.util.Dictionary;
import java.util.Hashtable;

public class RepresentationLauncher
{
    public static void main(String[] args)
    {
        Dictionary<String, Person[]> choices = new Hashtable<String, Person[]>();
        int numChoices = 3;
        Person[] allPeople = new Person[numChoices];
        List


        allPeople[0] = new Person("a", numChoices);
        allPeople[1] = new Person("b", numChoices);
        allPeople[2] = new Person("c", numChoices);

        allPeople[0].setChoice("1", 1);
        allPeople[0].setChoice("2", 2);
        allPeople[0].setChoice("3", 3);

        allPeople[1].setChoice("1", 3);
        allPeople[1].setChoice("2", 2);
        allPeople[1].setChoice("3", 1);

        allPeople[2].setChoice("1", 2);
        allPeople[2].setChoice("2", 3);
        allPeople[2].setChoice("3", 1);

        choices.put("1", allPeople);
        choices.put("2", allPeople);
        choices.put("3", allPeople);

        for(int)
    }
}