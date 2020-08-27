import java.util.ArrayList;

/**
 * @描述
 * @创建人 Duanhaibo
 * @创建时间 2020/8/27
 * @修改人和其它信息
 */
public class DrinkStrategy1 extends DrinkStrategy {
    public double get_price(Get_cost get_Cost,String drinkType,String cupSize){
        ArrayList<String> list=new ArrayList();
        list.add(drinkType);
        list.add(cupSize);
        return Get_cost.getDrinkCost(list);
    }
}
