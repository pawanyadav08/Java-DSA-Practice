class Animal{
    void eat(){
        System.out.println("Animal is Eating");
    }
}
class oops5 extends Animal {
    void bark(){
        System.out.println("Dog is Barking ");
    }
    public static void main(String[] args) {
        oops5 d = new oops5();
        d.eat();
        d.bark();
    }
}
