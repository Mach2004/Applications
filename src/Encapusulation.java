class Human{
    private String name = "Shreyansh";
    private int age = 19;

    public int getAge(){
        return age;
    }
    public String getName(){
        return name;
    }

}


public class Encapusulation {
    public static void main(String[] args) {

        Human obj1 = new Human();
        System.out.println(obj1.getName() + ":" + obj1.getAge());

    }
}
