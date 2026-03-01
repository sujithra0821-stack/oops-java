public class Instagram extends PersonalInfo{

    private String username;
    private String password;

    public Instagram(String name, int age, String gender,String username,String password){
        super(name,age,gender);
        this.username=username;
        this.password=password;
    }
    
    public void display(){
        super.display();
        System.out.println("Username: "+this.username);
        System.out.println("Password: "+this.password);
    }
}
