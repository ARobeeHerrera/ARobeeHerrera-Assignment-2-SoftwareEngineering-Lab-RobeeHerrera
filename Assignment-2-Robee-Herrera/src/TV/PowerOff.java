package TV;

import Command.Command;

public class PowerOff implements Command {
    private Tv tv ;

    public PowerOff(Tv tv){
        this.tv = tv;
    }

    public String execute() {
        return tv.PowerOff();
    }
}
