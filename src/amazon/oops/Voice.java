package amazon.oops;

public class Voice {
    public static void main(String[] args){
        dog d = new dog();
        cat c = new cat();
        d.sound();
        c.sound();
    }
}
abstract class Noice{
    abstract void sound();
}

class dog extends Noice{
    @Override
    void sound(){
        System.out.println(" Barking ");
    }
}

class cat extends Noice{
    @Override
    void sound(){
        System.out.println(" Meow ");
    }
}

