package TV;

import Command.Command;

public class PowerOn implements Command {
    private Tv tv ;

    public PowerOn(Tv tv){
        this.tv = tv;
    }

    public String execute() {
        return tv.PowerOn();
    }
}
