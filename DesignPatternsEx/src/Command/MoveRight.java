package Command;

import Core.Main;

public class MoveRight implements Command{
    @Override
    public void execute() {
        Main.player.increaseCol();
    }
}
