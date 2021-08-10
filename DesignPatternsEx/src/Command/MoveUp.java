package Command;

import Core.Main;

public class MoveUp implements Command{
    @Override
    public void execute() {
        Main.player.decreaseRow();
    }
}
