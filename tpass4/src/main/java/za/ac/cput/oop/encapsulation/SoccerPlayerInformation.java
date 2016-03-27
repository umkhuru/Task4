package za.ac.cput.oop.encapsulation;

/**
 * Created by Ethon on 3/27/2016.
 */
public class SoccerPlayerInformation {

    private String Name;
    private int Age;
    private String Position;


    public String getName()
    {
        return Name;
    }

    public void setName(String name)
    {
        Name = name;
    }

    public int getAge()
    {
        return Age;
    }

    public void setAge(int age)
    {
        Age = age;

    }

    public String getPosition()
    {
        return Position;
    }

    public void setPosition(String pos)
    {
        Position = pos;
    }
}
