/**
 * Created by amaliujia on 15-4-3.
 */
public abstract class Contractor {
    protected Buidge bridge;

    protected Contractor(Buidge buidge){
        this.bridge = buidge;
    }

    public abstract void build();
}


