package Light;

import Command.Command;

public class TurnOff implements Command {
    private Lights lights;

    public TurnOff(Lights lights) {
        this.lights = lights;
    }

    @Override
    public String execute() {
        return lights.TurnOff();
    }
}
