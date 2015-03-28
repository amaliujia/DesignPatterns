/**
 * Created by amaliujia on 15-3-28.
 */
public abstract class Command {
    protected CodeGroup codeGroup = new CodeGroup();

    protected ArtGroup artGroup = new ArtGroup();

    public abstract void action();
}
