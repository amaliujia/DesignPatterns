/**
 * Created by amaliujia on 15-2-22.
 */
public class Context {
    private IStrategy strategy;

    public Context(IStrategy strate){
        this.strategy = strate;
    }

    public void operate(){
        this.strategy.operate();
    }
}
