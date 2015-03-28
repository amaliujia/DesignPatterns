/**
 * Created by amaliujia on 15-3-28.
 */
public class Invoker {
    private Command command;

    public void setCommand(Command command){
        this.command = command;
    }

    public void execute(){
        this.command.action();
    }
}
