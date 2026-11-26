public class beverage {
    String itemName;
    String category;
    String availibility;
    String size;
    int price;

    public beverage(String itemName, String category, String availibility, String size, int price) {
        this.itemName = itemName;
        this.category = category;
        this.availibility = availibility;
        this.size = size;
        this.price = price;
    }
    public void infoBeverages(){
    System.out.printf("Drink: %-20s Category: %-6s Availibility: %-10s Size: %-10s Medium Price: %-10s%n",
                            itemName, category, availibility, size, price);
    }      
}

