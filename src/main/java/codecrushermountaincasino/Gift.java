package codecrushermountaincasino;

/**
 * Created by lucky on 2/1/16.
 */
public class Gift {

    int cost;

    String gift;

    public Gift(int cost, String string){
        this.cost = cost;
        gift = string;
    }

    public String toString(){
        return gift;
    }

    public int getCost(){
     return cost;
    }

}
