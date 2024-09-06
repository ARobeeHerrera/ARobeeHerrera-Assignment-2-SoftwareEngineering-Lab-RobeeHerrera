package Temperature;

public class CoolingSystemThermostat {
    private int temperature = 24;

    private int increaseTemp(int temperatureUp) {
       return this.temperature += temperatureUp;
    }

    private int decreaseTemp(int temperatureDown) {
        return this.temperature -= temperatureDown;
    }

    public String DecreaseTemperature() {
        return  "Decrease the Current Temperature. " +
                "\nCurrent Temperature: " + decreaseTemp(1)+"°C";
    }

    public String IncreaseTemperature() {
        return  "Increase the Current Temperature. " +
                "\nCurrent Temperature: " + increaseTemp(1) +"°C";
    }
}
