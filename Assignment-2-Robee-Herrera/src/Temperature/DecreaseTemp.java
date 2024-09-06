package Temperature;

import Command.Command;

public class DecreaseTemp   implements Command {
    private CoolingSystemThermostat thermostat;

    public DecreaseTemp(CoolingSystemThermostat thermostat) {
        this.thermostat = thermostat;
    }
    public String execute() {
        return thermostat.DecreaseTemperature();
    }
}
