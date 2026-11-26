public class Service {
    String name;
    String order;
    int quantity;
    int price;
    String size;
    public Service(String name, String order,String size, int quantity,int price){
        this.name = name;
        this.order = order;
        this.size = size;
        this.quantity = quantity;
        this.price = price;
    }
    public void infoOrder(){
        System.out.printf("Name: %-15s Order: %-20s Size: %-10s Quantity: %-5s Price: %-10s\n",
                                name,order,size,quantity,price);

    }
}