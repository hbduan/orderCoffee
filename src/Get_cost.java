import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

/**
 * @描述
 * @创建人 Duanhaibo
 * @创建时间 2020/8/27
 * @修改人和其它信息
 */
public class Get_cost {
    private String drinkName;
    private String cupSize;
    private String TJType;
    private int TJnum;
    private String LJType;
    private int LJnum;
    private String hot;



    private static final HashMap<ArrayList<String>, Integer> price = new HashMap();
    private static final HashMap<String, Double> TJprice = new HashMap();
    private static final HashMap<String, Double> LJprice = new HashMap();
    {ArrayList<String> list=new ArrayList();
    list.add("MILK");
    list.add("BIG");
    price.put(list,25);
    list.set(1,"MIDDLE");
    price.put(list,20);
    list.set(1,"SMALL");
    price.put(list,15);
    list.clear();

    list.add("COFFEE");
    list.add("BIG");
    price.put(list,20);
    list.set(1,"MIDDLE");
    price.put(list,15);
    list.set(1,"SMALL");
    price.put(list,10);

    list.clear();
    list.add("TEA");
    list.add("BIG");
    price.put(list,30);
    list.set(1,"MIDDLE");
    price.put(list,25);
    list.set(1,"SMALL");
    price.put(list,20);
    list.clear();


    list.add("ORANGE");
    list.add("BIG");
    price.put(list,18);
    list.set(1,"MIDDLE");
    price.put(list,15);
    list.set(1,"SMALL");
    price.put(list,12);
    list.clear();
}


    {
        TJprice.put("STARW",1.5);
        TJprice.put("PLAIN", (double) 1);
        TJprice.put("MOKA", (double) 1);
        TJprice.put("CARAMEL", (double) 2);
    }

    {
        LJprice.put("MOKA", (double) 1);
        LJprice.put("CARAMEL",1.5);
    }
    public static HashMap<ArrayList<String>, Integer> getPrice() {
        return price;
    }
    public static HashMap<ArrayList<String>, Integer> getMilk_price() {
        return price;
    }

    public static HashMap<String, Double> getTJprice() {
        return TJprice;
    }

    public static HashMap<String, Double> getLJprice() {
        return LJprice;
    }

    public String getDrinkName() {
        return drinkName;
    }

    public void setDrinkName(String drinkName) {
        this.drinkName = drinkName;
    }

    public String getCupSize() {
        return cupSize;
    }

    public void setCupName(String cupSize) {
        this.cupSize = cupSize;
    }

    public String getTJType() {
        return TJType;
    }

    public void setTJType(String TJType) {
        this.TJType = TJType;
    }

    public int getTJnum() {
        return TJnum;
    }

    public void setTJnum(int TJnum) {
        this.TJnum = TJnum;
    }

    public String getLJType() {
        return LJType;
    }

    public void setLJType(String LJType) {
        this.LJType = LJType;
    }

    public int getLJnum() {
        return LJnum;
    }

    public void setLJnum(int LJnum) {
        this.LJnum = LJnum;
    }

    public String getHot() {
        return hot;
    }

    public void setHot(String hot) {
        this.hot = hot;
    }


    public static double getDrinkCost(ArrayList<String> list0){
        price.get(list0);
        return 0;
    }
    public void main(String[] args) {

        System.out.print("请输入所需要的饮品：COFFEE/TEA/ORANGE/MILK:");
        Scanner in=new Scanner(System.in);
        String drink=in.nextLine();
//        drink.toUpperCase();
//        in.close();
//        System.out.println(drink.toUpperCase());
        System.out.println("所需杯大小：BIG（大杯）/MIDDLE（中杯）/SMALL（小杯）:");
        Scanner in1=new Scanner(System.in);
        String size=in1.nextLine();
        System.out.println(size.toUpperCase().length());
//        in1.close();
//        System.out.println(size);
        System.out.println("所需冷热：Hot(热)/bitHot（微热）/Ice（冰）/bitIce(微冰):");
        Scanner in2=new Scanner(System.in);
        String hot=in2.nextLine();
//        in2.close();
        System.out.println("所需糖酱配料：PLAIN（原味）,STARW（草莓味）,MOKA（摩卡）,CARAMEL（焦糖）:");
        Scanner in3=new Scanner(System.in);
        String tangjiang=in3.nextLine();
//        in3.close();
        System.out.println("所需糖酱配料份数:");
        Scanner in4=new Scanner(System.in);
        int tangjiangnum=in4.nextInt();
//        in4.close();
        System.out.println("所需淋酱配料：MOKA（摩卡）,CARAMEL（焦糖）:");
        Scanner in5=new Scanner(System.in);
        String linjiang=in5.nextLine();
//        in5.close();
        System.out.println("所需淋酱配料的份数:");
        Scanner in6=new Scanner(System.in);
        int linjiangnum=in6.nextInt();
        in6.close();
        DrinkStrategy1 drinkStrategy1=new DrinkStrategy1();
        TJStrategy1 tjStrategy=new TJStrategy1();
        LJStrategy1 ljStrategy1=new LJStrategy1();
        double result=get_final_cost(drinkStrategy1.get_price(this,drink,size),tjStrategy.total_cost(this,tangjiang,tangjiangnum),ljStrategy1.total_cost(this,linjiang,linjiangnum));
        System.out.println("您点的饮品共计"+result+"元");
////        this.setDrinkName(drink);
////        this.setCupName(size);
////        this.set





        }



    private HashMap getIntegPrice() {
        return LJprice;
    }

    private HashMap getInteg1Price(){
        return TJprice;
    }
    public static double drinkBaseCost(String drinkName, String cupSize){
        if(drinkName.toUpperCase().equals(DrinkStyle.COFFEE)){
            if(cupSize.toUpperCase().equals(CupStyle.BIG)){
                return 20;
            }
            else if (cupSize.toUpperCase().equals(CupStyle.MIDDLE)){
                return 15;
            }

            else{
                return 10;
            }
        }

        else if(drinkName.toUpperCase().equals(DrinkStyle.TEA)){
            if(cupSize.toUpperCase().equals(CupStyle.BIG)){
                return 30;
            }
            else if (cupSize.toUpperCase().equals(CupStyle.MIDDLE)){
                return 25;
            }

            else{
                return 20;
            }
        }

        else if(drinkName.toUpperCase().equals(DrinkStyle.MILK)){
            if(cupSize.toUpperCase().equals(CupStyle.BIG)){
                return 25;
            }
            else if (cupSize.toUpperCase().equals(CupStyle.MIDDLE)){
                return 20;
            }

            else{
                return 15;
            }
        }

        else if(drinkName.toUpperCase().equals(DrinkStyle.ORANGE)){
            if(cupSize.toUpperCase().equals(CupStyle.BIG)){
                return 18;
            }
            else if (cupSize.toUpperCase().equals(CupStyle.MIDDLE)){
                return 15;
            }

            else{
                return 12;
            }
        }

        else return 0;
    }



    public static double getTangJiangCost(String integ, int num){
        if(integ.toUpperCase().equals(TangjiangType.STARW)) {
            return num*1.5;}
        else if(integ.toUpperCase().equals(TangjiangType.PLAIN) ||integ.toUpperCase().equals(TangjiangType.CARAMEL)) {
            return num*1;}
        else if(integ.toUpperCase().equals(TangjiangType.MOKA)) {
            return num*2;}
        else return 0;
    }

    public static double getLinJiangCost(String integ, int num){
        if(integ.toUpperCase().equals(LinjiangType.MOKA)) {
            return num*1.5;}
        else if(integ.toUpperCase().equals(TangjiangType.CARAMEL)) {
            return num*1;}
        else {
            return 0;}
    }



    public static double get_final_cost(String drinkName, String cupSize, String TJType, int TJnum, String LJType, int LJnum){
        double total_price=drinkBaseCost(drinkName,cupSize)+getTangJiangCost(TJType,TJnum)+getLinJiangCost(LJType,LJnum);
        return total_price;
    }



}
