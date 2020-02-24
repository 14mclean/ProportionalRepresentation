class Person
{
    private String[] choiceOrder;
    private String name = new String();

    Person(String name, String[] choiceOrder)
    {
        this.name = name;
        this.choiceOrder = new String[choiceOrder.length];
        this.choiceOrder = choiceOrder;
    }

    String getName()
    {
        return name;
    }
}