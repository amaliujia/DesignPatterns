/**
 * Created by amaliujia on 15-3-28.
 */
public class Client {
    public static void main(String[] args){
       Invoker waiter = new Invoker();

        Command addCode = new AddCodeCommand();
        waiter.setCommand(addCode);
        waiter.execute();

        Command addPiture = new AddPictureCommand();
        waiter.setCommand(addPiture);
        waiter.execute();
    }
}
