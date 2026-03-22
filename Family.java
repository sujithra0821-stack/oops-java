public class Family {
    public static void main(String[] args) {
        Child obj=new Child();
        obj.eat();
        obj.sleep();
        Father.eat();
        Father.sleep();
        Mother.eat();
        Mother.sleep();
        System.out.println(Father.age);
        System.out.println(Father.name);
        System.out.println(Mother.age);
        System.out.println(Mother.name);


    }
}
