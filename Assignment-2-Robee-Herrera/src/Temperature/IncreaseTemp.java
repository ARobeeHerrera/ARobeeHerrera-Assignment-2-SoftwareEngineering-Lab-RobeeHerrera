package Temperature;

import Command.Command;

public class IncreaseTemp implements Command {
    private CoolingSystemThermostat thermostat;

    public IncreaseTemp(CoolingSystemThermostat thermostat) {
        this.thermostat = thermostat;
    }
    public String execute() {
        return thermostat.IncreaseTemperature();
    }
}
