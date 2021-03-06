import java.util.Map;

public class Invoker {
    private Map<String, Command> commands;


    public Invoker() {
        this.commands = Map.of("PrintName", new PrintNameCommand(),
                "PrintRandom", new PrintRandomNumber());
    }

    public void invoke(String type){
        this.commands.get(type).execute();
    }

}
