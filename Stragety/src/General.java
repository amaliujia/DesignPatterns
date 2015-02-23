/**
 * Created by amaliujia on 15-2-22.
 */
public class General {
    public static void main(String[] args){
        Context context = new Context(new BackDoor());
        context.operate();

        context = new Context(new GreenLight());
        context.operate();

        context = new Context(new BlockEnemy());
        context.operate();
    }
}
