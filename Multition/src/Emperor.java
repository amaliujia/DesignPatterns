import java.util.ArrayList;
import java.util.Random;

/**
 * Created by amaliujia on 15-2-23.
 */
public class Emperor {
    private static int maxNumofEmperor = 2;

    private static ArrayList empeorInfo = new ArrayList(maxNumofEmperor);

    private static ArrayList  emperors = new ArrayList(maxNumofEmperor);

    private static int count = 0;

    static {
        for(int i = 0; i < maxNumofEmperor; i++){
            emperors.add(new Emperor());
        }
    }

    private Emperor(){

    }

    private Emperor(String info){
        empeorInfo.add(info);
    }

    public static Emperor getInstance(){
        Random random = new Random();
        count = random.nextInt(maxNumofEmperor);
        return (Emperor)emperors.get(count);
    }

    public static Emperor getInstance(int i){
        if(i >= count){
            return null;
        }
        return (Emperor)emperors.get(i);
    }

    public static void getInfo(){
        System.out.println(empeorInfo.get(count));
    }
}
