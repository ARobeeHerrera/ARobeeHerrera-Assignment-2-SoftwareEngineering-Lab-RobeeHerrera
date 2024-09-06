package Volume;

import Command.Command;

public class VolumeDown implements Command {
    private Music music;

    public VolumeDown(Music music) {
        this.music = music;
    }

    @Override
    public String execute() {
        return music.VolumeDown();
    }
}
