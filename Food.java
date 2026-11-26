public class Food {
    String Type;
    String FoodName;
    String Size;
    String availibility;
    int price;

    public Food(String Type, String FoodName, String Size,String availibility,int price ){
        this.Type = Type;
        this.FoodName = FoodName;
        this.Size = Size;
        this.availibility= availibility;
        this.price = price;
    }
    public void infoFood(){
        System.out.printf("Food: %-20s Type: %-10s Size: %-17s Availibility: %-10s Reguler Price: %-10s%n",
                                 FoodName,Type,Size,availibility,price);
    }
}
