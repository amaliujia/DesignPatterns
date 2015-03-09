/**
 * Created by amaliujia on 15-3-9.
 */
public class Facotry {

    public static Human createHuman(Class c){
        Human human = null;
        try{
            human = (Human)Class.forName(c.getName()).newInstance();
        }catch (InstantiationException e){
            System.out.println("who this?");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return human;
    }
}
