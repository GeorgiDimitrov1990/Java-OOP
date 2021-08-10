package Command;

import Core.Main;

public class Fire implements Command{
    @Override
    public void execute() {
        Main.player.throwStone();
    }
}
