package DesignPrinciples.Open_Closed;

public class Cat implements IAnimal {
    @Override
    public void feed(){
        System.out.println("Feeding Cat");
    }
}
