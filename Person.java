class Person
{
    private String[] choiceOrder;
    private String name = new String(), veto = new String();

    Person(String name, int numChoices)
    {
        this.name = name;
        this.choiceOrder = new String[numChoices];
    }

    String getName()
    {
        return name;
    }

    void setVeto(String veto)
    {
        this.veto = veto;
    }

    String getVeto()
    {
        return veto;
    }

    void setChoice(String choice, int place)
    {
        this.choiceOrder[place] = choice;
    }
}