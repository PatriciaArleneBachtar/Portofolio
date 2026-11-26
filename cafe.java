import java.util.Scanner;
public class cafe {
    public static void main(String[] args) { //declare variable
        Scanner input = new Scanner(System.in);
        Service[] Queue = new Service[100];
        Service[] History = new Service[100];
        Service p;
        int choice;
        int front = 0, rear = 0;
        int historyindex =0;
        int index;
        int total=0;
        int price;
        int quantity;
        int lasttotal=0;
        int number;
        int S = 100;
        int M = 100;
        int L = 100;
        String name;
        String order;
        String garis = "-".repeat(80);
        String command;
        String Size;
        beverage[] beveragesmenu = createBeverages();
        beverage q;
        Food[] foodsmenu = createFoods();
        Food r;
        User[] users = createUsers();
        User s;  
                        //until here
           
        System.out.println(garis);
        System.out.println("|                                CAFE                                          |"); //account login page
        System.out.println("|                     Welcome to CAFE employee login                           |");
        System.out.println(garis);
        do{
            System.out.print("Please input email login: ");
            String emails = input.next();
            index = linearSearchUser(users, emails);
        if (index ==0){                                         //admin page to create, edit, delete the array
            do{
                System.out.println(garis);
                System.out.println("Admin Page");
                System.out.println(garis);
                System.out.println("Command list:");
                System.out.println("1.Add Beverage");
                System.out.println("2.Edit Beverage");
                System.out.println("3.Delete Beverage");
                System.out.println("4.Add Food");
                System.out.println("5.Edit Food");
                System.out.println("6.Delete Food");
                System.out.println("7.Add User");
                System.out.println("8.Edit User");
                System.out.println("9.Delete User");
                System.out.println("10.Search Employee with ID");
                System.out.println("11.Add / Remove Cup Stocks");
                System.out.println("0.Exit");
                System.out.println(garis);
                System.out.print("select Command: ");
                choice = input.nextInt();
                switch (choice) {
                    case 1:
                    System.out.print("Drink's Name: ");
                    String drinks= input.next();
                    System.out.println("hot / ice");
                    System.out.print("Drink's Category: ");
                    String category = input.next();
                    System.out.println("ready / unready");
                    System.out.print("Drink's Availibility: ");
                    String availibilty = input.next();
                    System.out.println("S / M / L");
                    System.out.print("Drink's Size: ");
                    String size = input.next();
                    System.out.print("Drink's Price: ");
                    int newPrice = input.nextInt();
                    q = new beverage(drinks, category, availibilty, size, newPrice);
                    addBeverage(beveragesmenu, q);
                    break;
                    case 2:
                    System.out.println("List Edit");
                    System.out.println("1.Category");
                    System.out.println("2.Available");
                    System.out.println("3.Size");
                    System.out.println("4.Price");
                    System.out.print("Command: ");
                    choice = input.nextInt();
                    switch (choice){
                        case 1:
                        bubblesortBeverage(beveragesmenu);
                        printBeverageMenu(beveragesmenu);
                        System.out.print("Enter drinks name: ");
                        name = input.next();
                        System.out.println("hot / ice");
                        System.out.print("Input: ");
                        command = input.next();
                        index = linearSearchBeverage(beveragesmenu, name);
                        editCategoryBeverage(index,beveragesmenu,command);
                        index = 0;
                        break;
                        case 2:
                        bubblesortBeverage(beveragesmenu);
                        printBeverageMenu(beveragesmenu);
                        System.out.print("Enter drinks name: ");
                        name = input.next();
                        System.out.println("ready / unready");
                        System.out.print("Input: ");
                        command = input.next();
                        index = linearSearchBeverage(beveragesmenu, name);
                        editAvailableBeverage(index,beveragesmenu,command);
                        index = 0;
                        break;
                        case 3:
                        bubblesortBeverage(beveragesmenu);
                        printBeverageMenu(beveragesmenu);
                        System.out.print("Enter drinks name: ");
                        name = input.next();
                        System.out.println("S / M / L");
                        System.out.print("Drink's Size: ");
                        command = input.next();
                        index = linearSearchBeverage(beveragesmenu, name);
                        editSizeBeverage(index,beveragesmenu,command);
                        index = 0;
                        break;
                        case 4:
                        bubblesortBeverage(beveragesmenu);
                        printBeverageMenu(beveragesmenu);
                        System.out.print("Enter drinks name: ");
                        name = input.next();
                        System.out.print("New Drink's Price: ");
                        price =input.nextInt();
                        index = linearSearchBeverage(beveragesmenu, name);
                        editPriceBeverage(index,beveragesmenu,price);
                        index = 0;
                        break;
                        default:
                        System.out.println("Command not found");
                        break;
                    }
                    break;
                    case 3:
                    System.out.println(garis);
                    bubblesortBeverage(beveragesmenu);
                    printBeverageMenu(beveragesmenu);
                    System.out.println(garis);
                    System.out.print("Input drink's name: ");
                    name=input.next();
                    deleteBeverage(beveragesmenu, name);
                    break;
                    case 4:
                    System.out.print("Food's Name: ");
                    String food= input.next();
                    System.out.println("food / snack / bread");
                    System.out.print("Food's Category: ");
                    String categori = input.next();
                    System.out.println("ready / unready");
                    System.out.print("Food's Availibility: ");
                    String availibilti = input.next();
                    System.out.println("normal / extra");
                    System.out.print("Food's Size: ");
                    String sizes = input.next();
                    System.out.print("Food's Price: ");
                    int newPrices = input.nextInt();
                    r = new Food(categori, food, sizes, availibilti, newPrices);
                    addFood(foodsmenu, r);
                    break;
                    case 5:
                    System.out.println("List Edit");
                    System.out.println("1.Available");
                    System.out.println("2.Size");
                    System.out.println("3.Price");
                    System.out.print("Command: ");
                    choice = input.nextInt();
                    switch (choice){
                        case 1:
                        bubblesortFood(foodsmenu);
                        printFoodMenu(foodsmenu);
                        System.out.print("Enter food name: ");
                        name = input.next();
                        System.out.println("ready / unready");
                        System.out.print("Input: ");
                        command = input.next();
                        index = linearSearchFood(foodsmenu, name);
                        editAvailableFood(index,foodsmenu,command);
                        index = 0;
                        break;
                        case 2:
                        bubblesortFood(foodsmenu);
                        printFoodMenu(foodsmenu);
                        System.out.print("Enter food name: ");
                        name = input.next();
                        System.out.println("normal / extra");
                        System.out.print("New Food's Size: ");
                        command = input.next();
                        index = linearSearchFood(foodsmenu, name);
                        editSizeFood(index,foodsmenu,command);
                        index =0;
                        break;
                        case 3:
                        bubblesortFood(foodsmenu);
                        printFoodMenu(foodsmenu);
                        System.out.print("Enter food name: ");
                        name = input.next();
                        System.out.print("New Food's Price: ");
                        price =input.nextInt();
                        index = linearSearchFood(foodsmenu, name);
                        editPriceFood(index,foodsmenu,price);
                        index = 0;
                        break;
                        default:
                        System.out.println("Command not found");
                        break;
                    }
                    break;
                    case 6:
                    System.out.println(garis);
                    bubblesortBeverage(beveragesmenu);
                    printFoodMenu(foodsmenu);
                    System.out.println(garis);
                    System.out.print("Input food's name: ");
                    name=input.next();
                    deleteFood(foodsmenu, name);
                    break;
                    case 7:
                    System.out.print("User's Name: ");
                    String User= input.next();
                    System.out.println("Example: xxx@gmail.com");
                    System.out.print("User's Email: ");
                    String email = input.next();
                    System.out.println("Input 6 last number of your phone numbers");
                    System.out.print("The Number: ");
                    int lastNumber = input.nextInt();
                    s = new User(User, email, lastNumber);
                    addUser(users, s);
                    
                    break;
                    case 8:
                    System.out.println("List Edit");
                    System.out.println("1.Username");
                    System.out.println("2.Email");
                    System.out.print("Command: ");
                    choice = input.nextInt();
                    switch (choice){
                        case 1:
                        insertionSortID(users);
                        printUser(users);
                        System.out.print("Enter Username: ");
                        name = input.next();
                        System.out.print("New Username: ");
                        command = input.next();
                        index = linearSearchUser(users, emails);
                        editUsernameAccount(index,users,command);
                        index =0;
                        break;
                        case 2:
                        printUser(users);
                        System.out.print("Enter Username: ");
                        name = input.next();
                        System.out.println("Example: xxx@gmail.com");
                        System.out.print("New Email: ");
                        command = input.next();
                        index = linearSearchUser(users, emails);
                        editEmailAccount(index,users,command);
                        index = 0;
                        break;
                        default:
                        System.out.println("Command not found");
                        break;
                    }
                    break;
                    case 9:
                    System.out.println(garis);
                    printUser(users);
                    System.out.println(garis);
                    System.out.print("Input Username: ");
                    name = input.next();
                    deleteUser(users, name);
                    break;
                    case 10:
                    System.out.println("Please input ID employee");
                    System.out.println("HINT: 6 last digit of employee's phone numbers");
                    System.out.print("Input: ");
                    int ID = input.nextInt();
                    insertionSortID(users);
                    index = binarySearchID(ID, users);
                    if(index != -1){
                    users[index].printEmail();
                    }
                    else{
                        System.out.println("ID not found!");
                    }
                    index = linearSearchUser(users, emails);
                    break;
                    case 11:
                    System.out.println("Add / Remove");
                    System.out.print("Selection: ");
                    command = input.next();
                    switch (command) {
                        case "Add":
                            System.out.println("How Many cups you want to add to stock?");
                            System.out.print("Number of Cups: ");
                            number = input.nextInt();
                            System.out.print("Cup Size (S / M / L): ");
                            command = input.next();
                            if(command.equals("S")){
                                S = S+number;
                                System.out.println("Current Cups of Size S is "+S);
                            }
                            else if (command.equals("M")){
                                M = M+number;
                                System.out.println("Current Cups of Size M is "+M);
                            }
                            else if (command.equals("L")){
                                L = L+number;
                                System.out.println("Current Cups of Size L is "+L);
                            }
                            else{
                                System.out.println("Cups Size not Found");
                                System.out.println("Back to Admin Main Page");
                            }
                            break;
                        case "Remove":
                        System.out.println("How Many cups you want to remove from stock?");
                            System.out.print("Number of Cups: ");
                            number = input.nextInt();
                            System.out.print("Cup Size (S / M / L): ");
                            command = input.next();
                            if(command.equals("S")){
                                S = S-number;
                                if(S < 1){
                                    S = 0;
                                    System.out.println("Current Cups of Size S is "+S);
                                }
                                else if(S>=1){
                                System.out.println("Current Cups of Size S is "+S);
                                }
                            }
                            else if (command.equals("M")){
                                M = M-number;
                                if(M < 1){
                                    M = 0;
                                    System.out.println("Current Cups of Size M is "+M);
                                }
                                else if(M>=1){
                                    System.out.println("Current Cups of Size M is "+M);
                                }
                            }
                            else if (command.equals("L")){
                                L = L-number;
                                if(L < 1){
                                    L = 0;
                                    System.out.println("Current Cups of Size L is "+L);
                                }
                                else if(S>=1){
                                    System.out.println("Current Cups of Size L is "+L);
                                }
                            }
                            else{
                                System.out.println("Cups Size not Found");
                                System.out.println("Back to Admin Main Page");
                            }
                            break;
                        default:
                            break;
                    }
                    break;
                    case 0:   
                    System.out.println("Switch to User?");
                    System.out.println("1.yes");
                    System.out.println("2.no");
                    System.out.print("Input: ");
                    choice=input.nextInt();
                    switch (choice) {
                        case 1:                             
                        index = 1;
                            break;
                        case 2:
                        System.exit(0);
                        input.close();
                        default:
                            break;
                    
                    }
                }
            }
            while(index == 0);
        }
        else if (index != -1) {                              //employye(cashier) page to add menu on list
            do{
                System.out.println(garis);
                System.out.println("                                Cashier Menu                            ");
                System.out.println(garis);
                System.out.println("List of Command");
                System.out.println("1.Input beverages");
                System.out.println("2.Input food");
                System.out.println("3.Check order");
                System.out.println("4.Finish the order");
                System.out.println("5.History and Shift Earning");
                System.out.println("0.End Today Phase");
                System.out.println(garis);
                System.out.print("Your Command: ");
                choice= input.nextInt();
                switch (choice) {
                    case 1:
                    System.out.println("Enter detail drinks: ");
                    System.out.print("Name            : ");
                    name = input.next();
                    System.out.println(garis);
                    bubblesortBeverage(beveragesmenu);
                    printBeverageMenu(beveragesmenu);
                    System.out.println(garis);
                    do{
                    System.out.print("Order         : ");
                    order = input.next();
                    index = linearSearchBeverage(beveragesmenu, order);
                    if(index != -1 && beveragesmenu[index].availibility.equalsIgnoreCase("ready")){
                        System.out.println("Beverages name "+beveragesmenu[index].itemName+ " found");
                    }
                    else if(index == -1){
                        System.out.println("Beverage not found.\nPlease enter again");
                        }   
                        else{
                            System.out.println("Out of stock\nPlease choose another beverage");
                        }
                    }

                    while(index == -1);
                    System.out.println("Please select the size (S / M / L)");
                    System.out.println("S Price = M - Rp.3000");
                    System.out.println("L Price = M + Rp.3000");
                    do{
                    System.out.print("Input: ");
                    Size = input.next();
                    if(Size.equals("S")||Size.equals("M")||Size.equals("L")){
                        quantity =1;
                    }
                    else{
                        System.out.println("Please input the correct size");
                        quantity = 0;
                    }
                    }
                    while (quantity == 0);
                    if(Size.equals("S")){
                        if(S == 0){
                            System.out.println("Cup Size S is out of stock");
                        }
                        else{
                        System.out.print("Drink Quantity  : ");
                        quantity = input.nextInt();
                        price = (beveragesmenu[index].price-3000)*quantity;
                        p = new Service(name, order, Size , quantity , price);
                        System.out.println("Drink have been enter to the order list\n");
                        Queue[rear]=p;
                        for(int i = 0;i<quantity;i++){
                            S--;
                            rear++;
                        }
                        }
                    }
                        else if (Size.equals("M")){
                        if(M == 0){
                            System.out.println("Cup Size M is out of stock");
                        }
                        else{
                        System.out.print("Drink Quantity  : ");
                        quantity = input.nextInt();
                        price = beveragesmenu[index].price*quantity;
                        p = new Service(name, order, Size , quantity , price);
                        System.out.println("Drink have been enter to the order list\n");
                        Queue[rear]=p;
                        for(int i = 0;i<quantity;i++){
                            M--;
                            rear++;
                        }
                        }
                    }
                        else if (Size.equals("L")){
                        if(L == 0){
                            System.out.println("Cup Size L is out of stock");
                        }
                        else{
                        System.out.print("Drink Quantity  : ");
                        quantity = input.nextInt();
                        price = (beveragesmenu[index].price+3000)*quantity;
                        p = new Service(name, order, Size , quantity , price);
                        System.out.println("Drink have been enter to the order list\n");
                        Queue[rear]=p;
                        for(int i = 0;i<quantity;i++){
                            L--;
                            rear++;
                        }
                        }
                    }
                    index = linearSearchUser(users, emails);
                        break;
                    case 2:
                    System.out.println("Enter detail food: ");
                    System.out.print("Name            : ");
                    name = input.next();
                    System.out.println(garis);
                    bubblesortFood(foodsmenu);
                    printFoodMenu(foodsmenu);
                    System.out.println(garis);
                    do{
                    System.out.print("Order         : ");
                    order = input.next();
                    index = linearSearchFood(foodsmenu, order);
                    if(index != -1&& foodsmenu[index].availibility.equalsIgnoreCase("ready")){
                        System.out.println("Food name "+foodsmenu[index].FoodName+ " found");
                    }
                    else if(index == -1){
                        System.out.println("Food not found.\nPlease enter again");
                        }
                        else{
                            System.out.println("Out of stock\nPlease choose another food");
                        }
                    }
                    while(index == -1);
                    System.out.println("Please select the size (regular / jumbo)");
                    System.out.println("Jumbo Price = Regular Price + Rp.5000 ");
                    do{
                    System.out.print("Input: ");
                    Size = input.next();
                    if(Size.equalsIgnoreCase("regular")||Size.equalsIgnoreCase("jumbo")){   
                        quantity = 1;
                    }
                    else{
                        System.out.println("Please enter the correct size !!");
                        quantity = 0;
                    }
                    }
                    while (quantity == 0);
                    if (Size.equalsIgnoreCase("regular")) {
                        System.out.print("Food Quantity  : ");
                        quantity = input.nextInt();
                        price = foodsmenu[index].price*quantity;
                        p = new Service(name, order,Size , quantity,price);
                        Queue[rear]=p;
                        rear++;
                    }
                    else if (Size.equalsIgnoreCase("jumbo")){
                        System.out.print("Food Quantity  : ");
                        quantity = input.nextInt();
                        price = (foodsmenu[index].price+5000)*quantity;
                        p = new Service(name, order,Size , quantity,price);
                        Queue[rear]=p;
                        rear++;
                    }
                    System.out.println("Food have been enter to the order list\n");
                    index = linearSearchUser(users, emails);
                        break;
                    case 3:
                    printAntrian(front,  rear,  Queue);
                        break;
                    case 4:
                if (front < rear) {
                    while (Queue[front] == null && front < rear) {
                        for (int i = front; i < rear - 1; i++) {
                            Queue[i] = Queue[i + 1];
                        }
                        Queue[rear - 1] = null;
                        rear--;
                        if (front == rear) {
                            front = 0;
                            rear = 0;
                            break;
                        }
                    }
            
                    if (Queue[front] != null) { 
                        System.out.println(Queue[front].order + " of customer's name " + Queue[front].name + " have been finished\n");
                        History[historyindex] = Queue[front];
                        historyindex++;
                        for (int i = front; i < rear - 1; i++) {
                            Queue[i] = Queue[i + 1];
                        }
                        Queue[rear - 1] = null;
                        rear--;
                        if (rear == front) {
                            front = 0;
                            rear = 0;
                        }
                    } else {
                        System.out.println("No valid orders in the queue to process!");
                    }
                } else {
                    System.out.println("No orders in the queue to finish\n");
                }
                        break;
                    case 5:
                        System.out.println("List History:");
                        bubblesortHistoryPrice(History);
                        bubblesortHistoryName(History);
                        lasttotal =printHistory(front, historyindex, History,total);
                        break;
                    case 0:
                        if(rear == 0){
                        System.out.println("Your shift has ended");
                        System.out.println("Your shift cafe's earning Rp."+lasttotal);
                        System.out.println("Thanks for your hardwork");
                        System.out.println("Switch User?");
                        System.out.println("1.yes");
                        System.out.println("2.no");
                        System.out.print("Input: ");
                        choice=input.nextInt();
                        switch (choice) {
                            case 1:                               
                            index = 0;
                                break;
                            case 2:
                            System.exit(0);
                            input.close();
                            default:
                                break;
                        }
                    }
                    else{
                        System.out.println("Please finnish the queue before exit!");
                    }
                    default:
                    if(index == 0 || index>0){
                        System.out.println("");
                    }
                        break;
                }
            }
            while(index >0);
        }
        else 
        if(index == 0 || index >0){
            System.out.println("");
        }
        else{
            System.out.println("Email not found");
        }
    }
    while(true);
    }
                                                                                            //all method to use on admin page and employee page
    public static User[] editEmailAccount(int index, User[] users, String command){            // edit method start line
        if(users[0].name.equalsIgnoreCase(command)){
            System.out.println("This Account Cannot be Edited");
            return users;
        }
        else{
            users[index].email=command;
            return users;
        }
    }
    public static User[] editUsernameAccount(int index, User[] users, String command){
        if(users[0].email.equalsIgnoreCase(command)){
            System.out.println("This Account Cannot be Edited");
            return users;
        }
        else{users[index].name=command;
        return users;
    }
}                                                                                           
    public static Food[] editPriceFood(int index,Food[] foods,int price){
        foods[index].price = price;
        return foods;
    }
    public static Food[] editAvailableFood(int index,Food[] foods,String command){
        foods[index].availibility = command;
        return foods;
    }
    public static Food[] editSizeFood(int index,Food[] foods,String command){
        foods[index].Size = command;
        return foods;
    }
    public static beverage[] editPriceBeverage(int index, beverage[] beverages,int price){
        beverages[index].price=price;
        return beverages;
    }
    public static beverage[] editSizeBeverage(int index, beverage[] beverages,String command){
        beverages[index].size=command;
        return beverages;
    }
    public static beverage[] editAvailableBeverage(int index, beverage[] beverages,String command){
        beverages[index].availibility=command;
        return beverages;
    }
    public static beverage[] editCategoryBeverage(int index, beverage[] beverages,String command){
        beverages[index].category=command;
        return beverages;
    }                                                                                                       //edit method end line
    public static User[] deleteUser(User[] users, String name){                                             //delete methode start line
        if(users[0].name.equalsIgnoreCase(name)){
            System.out.println("This account cannot be delete");
        }
        else{
        for(int i = 0;i<users.length;i++){
            if(users[i].name.equalsIgnoreCase(name)){
                System.out.println("Account "+users[i].name+" has been deleted");
                System.out.println();
                users[i]=null;
                return users;
            }
            }
        }
        if(users[0].name.equalsIgnoreCase(name)){
            System.out.println("Account not found");
            return users;
        }
        return users;
    }

    public static Food[] deleteFood(Food[] foods, String name){
        for(int i = 0;i<foods.length;i++){
            if(foods[i].FoodName.equalsIgnoreCase(name)){
                System.out.println("Food "+foods[i].FoodName+" has been deleted");
                System.out.println();
                foods[i]=null;
                return foods;
            }
        }
        System.out.println("Food not found");
        return foods;
    }
    
    public static beverage[] deleteBeverage(beverage[] beverages, String name){
        for(int i = 0;i<beverages.length;i++){
            if(beverages[i].itemName.equalsIgnoreCase(name)){
                System.out.println("Frink "+beverages[i].itemName+" has been deleted");
                System.out.println();
                beverages[i]=null;
                return beverages;
            }
        }
        System.out.println("Drink not found");
        return beverages;
    }                                                                                               //delete method lines end
    public static beverage[] addBeverage(beverage[] beverages, beverage q){                         //add method line start

        for(int i=0;i<beverages.length;i++){
            if(beverages[i] == null){
                beverages[i] = q;
                System.out.println("New Drink "+beverages[i].itemName+" has been added to menu");
                System.out.println();
                return beverages;
            }
        }
        System.out.println("Array is full, Cannot add anymore drink");
        return beverages;
    }
    public static Food[] addFood(Food[] Foods, Food r){

        for(int i=0;i<Foods.length;i++){
            if(Foods[i] == null){
                Foods[i] = r;
                System.out.println("New Drink "+Foods[i].FoodName+" has been added to menu");
                System.out.println();
                return Foods;
            }
        }
        System.out.println("Array is full, Cannot add anymore food");
        return Foods;
    }
    public static User[] addUser(User[] users, User s){

        for(int i=0;i<users.length;i++){
            if(users[i] == null){
                users[i] = s;
                System.out.println("New user "+users[i].name+" has been added to account");
                System.out.println();
                return users;
            }
        }
        System.out.println("Array is full, Cannot add anymore user");
        return users;
    }                                                                                                           //add method lines end

    public static int printHistory(int front, int historyindex, Service[] History, int total){                  //print antrian/queue
        for(int i = front;i<historyindex;i++){
            History[i].infoOrder();
            total = total + History[i].price;
        }
        System.out.println("Total Profit: Rp."+total);
        System.out.println();
        return total;
    }
    public static void printAntrian(int front, int rear, Service[] Queue){                                      //print history/riwayat setelah antrian
        System.out.println("List of Order:");
        for(int i = front;i<rear;i++){
            if(Queue[i]!=null){
        Queue[i].infoOrder();
        }
    }
        System.out.println();
    }
    
    public static int linearSearchUser(User[] users,String emails){                                             //search method line start
        for(int i= 0;i<users.length;i++){
            if(users[i] !=null && users[i].email.equalsIgnoreCase(emails)){
            return i ;
            }
        }
        return -1;
    }

    public static int binarySearchID(int ID,User[] users){
            int low = 0;
            int high = users.length -1;
            while (low<=high){
                int mid = (low+high)/2;
                if (users[mid].ID == ID){
                    return mid;
                }
                if (users[mid].ID <ID){
                    low = mid+1;
                }
                else {
                    high = mid -1;
                }
            }
            return -1;
        }

    
    public static int linearSearchFood(Food[] foodsmenu, String order){
        for(int i= 0;i<foodsmenu.length;i++){
            if(foodsmenu[i] != null && foodsmenu[i].FoodName.equalsIgnoreCase(order)){
                return i;
            }
        }
        return -1;
    }  
    
    public static int linearSearchBeverage(beverage[] beveragesmenu, String order){
        for(int i= 0;i<beveragesmenu.length;i++){
            if (beveragesmenu[i] != null && beveragesmenu[i].itemName.equalsIgnoreCase(order)) {
                return i;
            }
    }
        return -1;
  }                                                                                                                 // search method line end

  public static void bubblesortHistoryPrice(Service[] History) {                                                         // sorting method line start
    if (History == null) {
        System.out.println("");
        return;
    }
    int n = History.length;
    for (int i = 0; i < n - 1; i++) {
        for (int j = 0; j < n - i - 1; j++) {
            if (History[j] != null && History[j + 1] != null) {
                if (History[j].price > History[j + 1].price) {
                    Service temp = History[j];
                    History[j] = History[j + 1];
                    History[j + 1] = temp;
                }
            } 
        }
    }
}
public static void bubblesortHistoryName(Service[] History) {                                                         // sorting method line start
    if (History == null) {
        System.out.println("");
        return;
    }
    int n = History.length;
    for (int i = 0; i < n - 1; i++) {
        for (int j = 0; j < n - i - 1; j++) {
            if (History[j] != null && History[j + 1] != null) {
                if (History[j].name.compareToIgnoreCase(History[j + 1].name)>0) {
                    Service temp = History[j];
                    History[j] = History[j + 1];
                    History[j + 1] = temp;
                }
            } 
        }
    }
}


  public static void bubblesortBeverage(beverage[] beverages) {
    if (beverages == null) {
        System.out.println("");
        return;
    }
    int n = beverages.length;
    for (int i = 0; i < n - 1; i++) {
        for (int j = 0; j < n - i - 1; j++) {
            if (beverages[j] != null && beverages[j + 1] != null) {
                if (beverages[j].itemName.compareToIgnoreCase(beverages[j + 1].itemName)>0) {
                    beverage temp = beverages[j];
                    beverages[j] = beverages[j + 1];
                    beverages[j + 1] = temp;
                }
            } 
        }
    }
}
public static void bubblesortFood(Food[] foods) {
    if (foods == null) {
        System.out.println("");
        return;
    }
    int n = foods.length;
    for (int i = 0; i < n - 1; i++) {
        for (int j = 0; j < n - i - 1; j++) {
            if (foods[j] != null && foods[j + 1] != null) {
                if (foods[j].FoodName.compareToIgnoreCase(foods[j + 1].FoodName)>0) {
                    Food temp = foods[j];
                    foods[j] = foods[j + 1];
                    foods[j + 1] = temp;
                }
            } 
        }
    }
}   
public static void insertionSortID(User[] users) {
    for (int i = 1; i < users.length; i++) {
        User key = users[i];
        int j = i - 1;
        if (key == null) {
            continue;
        }
        while (j >= 0 && users[j] != null && users[j].ID > key.ID) {
            users[j + 1] = users[j];
            j--;
        }
        users[j + 1] = key;
    }
}    
                                                                                                             //sorting method lines end
    public static void printBeverageMenu(beverage[]beveragesmenu){                                               //print menu
        for(int i=0;i<beveragesmenu.length;i++){
            if(beveragesmenu[i]!= null){
            beveragesmenu[i].infoBeverages();
        }
    }
}
    
    public static void printFoodMenu(Food[]foodsmenu){
        for(int i=0;i<foodsmenu.length;i++){
            if(foodsmenu[i]!= null){
            foodsmenu[i].infoFood();
        }
    }
}
    public static void printUser(User[]users){
        for(int i = 0;i<users.length;i++){
            if(users[i]!= null){
                users[i].printEmail();
            }
        }
    }
                                                                                                                    //print menu dan user
    public static beverage[] createBeverages()                                                                                          //create menu atau user
    {
        beverage[] beverages = new beverage[15];
        beverages[0] = new beverage("affogato", "hot", "ready", "S / M / L", 35000);
        beverages[1] = new beverage("red_velvet", "ice", "ready", "S / M / L", 40000);
        beverages[2] = new beverage("caramel_macchiato", "ice", "ready", "S / M / L", 39000);
        beverages[3] = new beverage("americano", "hot", "ready", "S / M / L", 25000);
        beverages[4] = new beverage("matcha_latte", "hot", "ready", "S / M / L", 40000);
        beverages[5] = new beverage("vanilla_latte", "hot", "ready", "S / M / L", 35000);
        beverages[6] = new beverage("pandan_latte", "hot", "ready", "S / M / L", 40000);
        beverages[7] = new beverage("lemon_tea", "ice", "ready", "S / M / L", 35000);
        beverages[8] = new beverage("lychee_tea", "ice", "ready", "S / M / L", 40000);
        beverages[9] = new beverage("casual_tea", "ice", "ready", "S / M / L", 25000);
        beverages[10] = new beverage("jasmine_green_tea", "ice", "ready", "S / M / L", 35000);

        return beverages;
    }
    public static Food[] createFoods()
    {
        Food[] Foods = new Food[15];
        Foods[0] = new Food("bread  ","croissant","normal / jumbo","ready",14000);
        Foods[1] = new Food("bread  ","baguette","normal / jumbo","ready",12000);
        Foods[2] = new Food("bread  ","donut","normal / jumbo","ready",5000);
        Foods[3] = new Food("bread  ","pretzel","normal / jumbo","ready",20000);
        Foods[4] = new Food("food   ","fried_rice","normal / jumbo","ready",16000);
        Foods[5] = new Food("food   ","fried_noodle","normal / jumbo","ready",18000);
        Foods[6] = new Food("snack  ","french_fries","normal / jumbo","ready",12000);
        Foods[7] = new Food("food   ","fried_chicken","normal / jumbo","ready",20000);
        Foods[8] = new Food("snack  ","crispy_chicken_skin","normal / jumbo","ready",15000);
        Foods[9] = new Food("snack  ","toasted_bread","normal / jumbo","ready",10000);
        Foods[10] = new Food("food  ","spaghetti_bolognese","normal / jumbo","ready",17000);
        Foods[11] = new Food("snack ","waffle","normal / jumbo","ready",8000);

        return Foods;
    }
    public static User[] createUsers()
    {
        User[] Users = new User[7];
        Users[0] = new User("admin","admin@gmail.com",00000);
        Users[1] = new User("aldrian","aldrian@gmail.com",157716);
        Users[2] = new User("clarissa","clarissa@gmail.com",960528);
        Users[3] = new User("kelvin","kelvin@gmail.com",649108);
        Users[4] = new User("kennedy","kennedy@gmail.com",687651);
        Users[5] = new User("patricia", "patricia@gmail.com",288887);

        return Users;
    }
}                                                                                                                               //create menu atau user
