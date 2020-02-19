package inheritance;

public class Dog extends Animal {
    Dog(String n, String a)
    {
        name = n;
        activity = a;
    }
    @Override
    public String toString(){
        return "my name is " + name + " " + activity;
    }


}
