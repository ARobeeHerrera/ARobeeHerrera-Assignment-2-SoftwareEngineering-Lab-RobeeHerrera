import Central_HUB.*;
import Light.*;
import TV.*;
import Temperature.*;
import Volume.*;

import java.util.Scanner;

public class ViewerApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CentralHub ce = new CentralHub();

        Tv tv = new Tv();
        CoolingSystemThermostat cooling = new CoolingSystemThermostat();
        Music ms = new Music();
        Lights lights = new Lights();
        System.out.println("Welcome to Central HUB");
        boolean toRun = true;

        while (toRun) {
            System.out.println("[1] Turn On Lights");
            System.out.println("[2] Turn Off Lights");
            System.out.println("[3] Increase Temperature of Thermostats");
            System.out.println("[4] Decrease Temperature of Thermostats");
            System.out.println("[5] Power On TV");
            System.out.println("[6] Power Off TV");
            System.out.println("[7] Volume Up the Music");
            System.out.println("[8] Volume Down the Music");
            System.out.print("Select an option:");
            int option = sc.nextInt();

            switch (option) {
                case 1:
                    TurnOn thOn = new TurnOn(lights);
                    ce.setCommand(thOn);
                    System.out.println("\n" + ce.clickButton() + "\n");
                    break;
                case 2:
                    TurnOff thOff = new TurnOff(lights);
                    ce.setCommand(thOff);
                    System.out.println("\n" + ce.clickButton() + "\n");
                    break;
                case 3:
                    IncreaseTemp incTemp = new IncreaseTemp(cooling);
                    ce.setCommand(incTemp);
                    System.out.println("\n" + ce.clickButton() + "\n");
                    break;
                case 4:
                    DecreaseTemp dcTemp = new DecreaseTemp(cooling);
                    ce.setCommand(dcTemp);
                    System.out.println("\n" + ce.clickButton() + "\n");
                    break;
                case 5:
                    PowerOn pwOn = new PowerOn(tv);
                    ce.setCommand(pwOn);
                    System.out.println("\n" + ce.clickButton() + "\n");
                    break;
                case 6:
                    PowerOff pwOff = new PowerOff(tv);
                    ce.setCommand(pwOff);
                    System.out.println("\n" + ce.clickButton() + "\n");
                    break;
                case 7:
                    VolumeUp vmUp = new VolumeUp(ms);
                    ce.setCommand(vmUp);
                    System.out.println("\n" + ce.clickButton() + "\n");
                    break;
                case 8:
                    VolumeDown vmDown = new VolumeDown(ms);
                    ce.setCommand(vmDown);
                    System.out.println("\n" + ce.clickButton() + "\n");
                    break;
                default:
                    System.out.println("\nInvalid Selected\n");
                    toRun = false;
            }
        }

    }
}