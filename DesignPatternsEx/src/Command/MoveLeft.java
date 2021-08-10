package Command;

import Core.Main;

public class MoveLeft implements Command{
    @Override
    public void execute() {
        Main.player.decreaseCol();
    }
}
