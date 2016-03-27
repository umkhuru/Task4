package za.ac.cput.oop.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import za.ac.cput.oop.DIP.Obey.Equipment;
import za.ac.cput.oop.DIP.Obey.MotorBikes;
import za.ac.cput.oop.DIP.Obey.MotorCycleModel;
import za.ac.cput.oop.DIP.Obey.MotorCyclistEquipment;
import za.ac.cput.oop.DIP.Violating.vMotorCycleEquipment;
import za.ac.cput.oop.DIP.Violating.vMotorCycleModel;
import za.ac.cput.oop.DIP.Violating.vPurchase;
import za.ac.cput.oop.ISP.Obeying.BestExamResults;
import za.ac.cput.oop.ISP.Obeying.TopStudent;
import za.ac.cput.oop.ISP.Violating.vResults;
import za.ac.cput.oop.ISP.Violating.vTopStudent;
import za.ac.cput.oop.Inheritance.SoccerPlayer;
import za.ac.cput.oop.Inheritance.Striker;
import za.ac.cput.oop.LSP.Obey.CentralDefender;
import za.ac.cput.oop.LSP.Obey.FootballPlayer;
import za.ac.cput.oop.LSP.Obey.Goalkeeper;
import za.ac.cput.oop.LSP.Violate.vCentralDefender;
import za.ac.cput.oop.LSP.Violate.vFootballPlayer;
import za.ac.cput.oop.LSP.Violate.vGoalKeeper;
import za.ac.cput.oop.OCP.Obey.Footballer;
import za.ac.cput.oop.OCP.Obey.RugbyPlayer;
import za.ac.cput.oop.OCP.Obey.StudentInfo;
import za.ac.cput.oop.OCP.Violate.vStudent;
import za.ac.cput.oop.encapsulation.SoccerPlayerInformation;
import za.ac.cput.oop.polymorphism.Student;
import za.ac.cput.oop.polymorphism.StudentJob;

/**
 * Created by Ethon on 3/27/2016.
 */
@Configuration
public class AppConfig {

    @Bean(name ="Encap")
    public SoccerPlayerInformation getPlayerInfo()
    {
        return new SoccerPlayerInformation();
    }

    @Bean (name ="inherit")
    public SoccerPlayer getSoccerPlayer()
    {
        return new Striker();
    }

    @Bean(name="poly")
    public Student getPolyService()
    {
        return new StudentJob();
    }

    @Bean(name="DIPObey")
    public MotorCycleModel getModel()
    {
        return new MotorBikes();
    }

    @Bean(name="DIPObey2")
    public MotorCyclistEquipment getEquipment()
    {
        return new Equipment();
    }

    @Bean(name="DIPVio")
    public vPurchase getEquipVio()
    {
        return new vMotorCycleEquipment();
    }

    @Bean(name="DIPVio2")
    public vPurchase getModelVio()
    {
        return new vMotorCycleModel();
    }

    @Bean(name="ISPObey")
    public BestExamResults getAStudent()
    {
        return new TopStudent();
    }

    @Bean(name="ISPVio")
    public vResults getVioAStudent()
    {
        return new vTopStudent();
    }

    @Bean(name="LSPObey")
    public FootballPlayer getDefender()
    {
        return new CentralDefender();
    }

    @Bean(name="LSPObey2")
    public FootballPlayer getKeeper()
    {
        return new Goalkeeper();
    }

    @Bean(name="LSPVio")
    public vFootballPlayer getCDefender()
    {
        return new vCentralDefender();
    }

    @Bean(name="LSPVio2")
    public vFootballPlayer getGKeeper()
    {
        return new vGoalKeeper();
    }

    @Bean(name="OCPObey")
    public StudentInfo getfootball()
    {
        return new Footballer();
    }

    @Bean(name="OCPObey2")
    public StudentInfo getRugbyPlayer()
    {
        return new RugbyPlayer();
    }

    @Bean(name="OCPVio")
    public vStudent getvioFootballer()
    {
        return new vStudent();
    }
}
