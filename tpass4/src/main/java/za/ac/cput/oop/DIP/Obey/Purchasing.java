package za.ac.cput.oop.DIP.Obey;

import java.util.Scanner;

/**
 * Created by Ethon on 3/27/2016.
 */
public class Purchasing {

    public Purchasing()
    {
        Equipment equip = new Equipment();
        MotorBikes mbm = new MotorBikes();

        Scanner input = new Scanner(System.in);
        System.out.println("Choose the option below:");
        System.out.println("Enter 1 for motorcycle gear or 2 for motorcycle purchase:");
        int option = input.nextInt();

        if (option == 1)
        {
            equip.EnteringPurchase();
        } else
        {
            mbm.EnteringPurchase();
        }
    }
}
