/**
 * Created by amaliujia on 15-4-3.
 */
public class ChineseContractor extends Contractor {

    private double budget;

    public ChineseContractor(double budget, Buidge bridge){
        super(bridge);
        this.budget = budget;
    }

    @Override
    public void build() {
       this.bridge.build(this.budget);
    }
}
