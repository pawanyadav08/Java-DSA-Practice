class Animal{
    void sound(){
        System.out.println("Animal makes sound");
    }
}
class oops7 extends Animal {
    @Override
    void sound(){
        System.out.println("Dog barks");
    }

    public static void main(String[] args){
        Animal a = new oops7();
        a.sound();
    }
}
