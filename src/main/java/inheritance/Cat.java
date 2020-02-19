package inheritance;

public class Cat extends Animal{
    Cat(String n, String a)
    {
        name = n;
        activity = a;
    }
    @Override
    public String toString(){
        return "my name is " + name + " " + activity;
    }
}
