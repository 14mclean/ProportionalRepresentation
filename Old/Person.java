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

    String getChoice(int place)
    {
        return this.choiceOrder[place];
    }

    int getHappiness(String choice)
    {
        if(choice == this.veto)
        {
            return -1;
        }
        else
        {
            for(int count = 0; count < this.choiceOrder.length; count++)
            {
                if( this.choiceOrder[count] == choice)
                {
                    return this.choiceOrder.length + 1 - count;
                }
            }

            return 0;
        }
    }
}