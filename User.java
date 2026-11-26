public class User {
    String name;
    String email;
    int ID;

    public User(String name, String email,int ID){
        this.name = name;
        this.email = email;
        this.ID = ID;

    }

    public void printEmail(){
        System.out.printf("Username: %-15s ,Email: %-20s ,ID: %-10s \n",name,email,ID);
    }

}
