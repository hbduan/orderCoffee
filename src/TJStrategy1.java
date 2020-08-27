/**
 * @描述
 * @创建人 Duanhaibo
 * @创建时间 2020/8/27
 * @修改人和其它信息
 */
public class TJStrategy1 extends TJStrategy{
    private double price=0;
    private int count;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public double total_cost(Get_cost get_Cost,String integType,int num){
        return get_Cost.getInteg1Price().get(integType)*num;
    }
}
