package za.ac.cput.oop.LSP.Violate;

/**
 * Created by Ethon on 3/27/2016.
 */
public class vCentralDefender implements vFootballPlayer {

    @Override
    public Boolean dribbles()
    {
        return true;
    }

    @Override
    public Boolean Saves()
    {
        return true;
    }

    @Override
    public Boolean GoalKicks()
    {
        return true;
    }
}
