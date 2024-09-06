package Volume;

public class Music {
    private Integer sound = 50;

    public Integer IncreaseSound(Integer soundUp) {
        return this.sound += soundUp;
    }
    public Integer DecreaseSound(Integer soundDown) {
        return this.sound -= soundDown;
    }

    public String VolumeUp() {
        return "Volume Up" +
                "\nCurrent Volume: " + IncreaseSound(1);
    }
    public String VolumeDown() {
        return "Volume Down" +
                "\nCurrent Volume: " + DecreaseSound(1);
    }

}
