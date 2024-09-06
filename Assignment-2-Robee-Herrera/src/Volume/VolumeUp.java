package Volume;

import Command.Command;

public class VolumeUp implements Command {
    private Music music;

    public VolumeUp(Music music) {
        this.music = music;
    }

    @Override
    public String execute() {
        return music.VolumeUp();
    }
}
