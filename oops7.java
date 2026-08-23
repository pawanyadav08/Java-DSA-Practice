class SoundAnimal{
    void sound(){
        System.out.println("Animal makes sound");
    }
}
class oops7 extends SoundAnimal {
    @Override
    void sound(){
        System.out.println("Dog barks");
    }

    public static void main(String[] args){
        SoundAnimal a = new oops7();
        a.sound();
    }
}
