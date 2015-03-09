import java.util.ArrayList;

/**
 * Created by amaliujia on 15-2-25.
 */
public abstract class CarModel {
    private ArrayList<String> sequence = new ArrayList<String>();

    protected abstract void start();

    protected abstract void alarm();

    protected abstract void stop();

    protected abstract void engine();


}
