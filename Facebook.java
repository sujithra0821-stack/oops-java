public class Facebook extends PersonalInfo{
    
    private String username;
    private String password;
    // private int otp;

    public Facebook(String name, int age, String gender,String username,String password){
        super(name,age,gender);
        this.username=username;
        this.password=password;
    }

    @Override
    public void display(){
        // super.display();

        System.out.println("Name:" +this.username);
        System.out.println("Password:" +this.password);
        // System.out.println("Otp:" +this.otp);
    } 

    public void name(String name) {
        System.out.println("1st name "+name);
    }

    public void name() {
        System.out.println("ghghgththt ");
    }

    public void name(int age) {
        System.out.println("oooooooooo ");
    }

}
