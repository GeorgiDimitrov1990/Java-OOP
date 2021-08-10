package Command;

import Core.Main;

public class MoveDown implements Command{
    @Override
    public void execute() {
        Main.player.increaseRow();
    }
}
