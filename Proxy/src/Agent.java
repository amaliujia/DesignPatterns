import java.security.PublicKey;

/**
 * Created by amaliujia on 15-2-23.
 */
public class Agent implements Business {
    private Business supplier;

    public Agent(Business supplier){
        this.supplier = supplier;
    }

    @Override
    public void doBusiness() {
       supplier.doBusiness();
    }
}
