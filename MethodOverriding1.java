class Animal{
    void sound(){
        System.out.println("Animal makes sound");
    }
}
class Cat extends Animal{
    @Override
    void sound(){
        System.out.println("Cat meows");
    }
}
public class MethodOverriding1 {
    public static void main(String[] args) {
        Animal a = new Cat();
        a.sound();
    }
}
