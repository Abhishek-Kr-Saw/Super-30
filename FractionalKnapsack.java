import java.util.*;

class Item{
    int value , weight;
    double ratio;

    Item(int value , int weight){
        this.value = value;
        this.weight = weight;
        this.ratio = (double) value/weight;
    }
}

public class FractionalKnapsack {

    public static double fractionalKnapsack(int[] val,int[] wt,long cap){
        int n = val.length;
        List<Item> items = new ArrayList<>();

        for(int i=0;i<n;i++){
            items.add(new Item(val[i],wt[i]));
        }

        // sort the item by ratio in descending order
        items.sort((a,b) -> Double.compare(b.ratio,a.ratio));

        double totalValue = 0;

        for(Item item : items){
            if(cap >= item.weight){
                totalValue += item.value;
                cap -= item.weight;
            }else{
                totalValue += item.ratio * cap;
                break;
            }
        }
        return totalValue;
    }
    public static void main(String[] args) {
        int[] val = {60, 100, 120};
        int[] wt = {10, 20, 30};
        int cap = 50;

        System.out.println("Maximum value = " + fractionalKnapsack(val, wt, cap));
    }
}
