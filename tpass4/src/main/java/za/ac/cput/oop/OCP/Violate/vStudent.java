package za.ac.cput.oop.OCP.Violate;

/**
 * Created by Ethon on 3/27/2016.
 */
public class vStudent {

    int SportType;

    String sportPosition;

    public  String Sport()
    {
        if(SportType == 1)
            sportPosition = FootballerPosition();
        else if (SportType == 2)
            sportPosition= RugbyPlayerPosition();

        return sportPosition;
    }

    public String FootballerPosition()
    {
        return "Position is left wing";
    }

    public String RugbyPlayerPosition()
    {
        return "Position is Flanker";
    }
}
