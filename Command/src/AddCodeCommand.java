/**
 * Created by amaliujia on 15-3-28.
 */
public class AddCodeCommand extends Command {
    @Override
    public void action() {
        codeGroup.add();
        codeGroup.delete();
    }
}
