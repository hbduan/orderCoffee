import org.junit.Test;
//import Get_cost;
/**
 * @描述
 * @创建人 Duanhaibo
 * @创建时间 2020/8/27
 * @修改人和其它信息
 */

public class test_base {

    @Test
    public void testBaseCost(){
        double cost=Get_cost.drinkBaseCost("MILK","big");
        System.out.println(cost);
    }


}
