/**
 * Created by amaliujia on 15-2-23.
 */
public class Singleton {
    public static final Singleton singleton = new Singleton();

    public Singleton(){

    }

    public synchronized Singleton sharedInstance(){
        return singleton;
    }

}
