public class PersonalInfo {

    private String name;
    private int age;
    private String gender;

    public PersonalInfo(String name, int age, String gender){
        this.name=name;
        this.age=age;
        this.gender=gender;
    }

    public void display(){
        System.out.println("Name: "+this.name);
        System.out.println("Age: "+this.age);
        System.out.println("Gender: "+this.gender);
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name=name;
    }

    public int getAge(){
        return this.age;
    }

    public void setAge(int age){
        this.age=age;
    }

    public String getGender(){
        return this.gender;
    }

    public void setGender(String gender){
        this.gender=gender;
    }
}
