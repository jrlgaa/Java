package animal;

public class Pet extends Animal {
    public Pet(String name, int age, String type, int weight, String gender, int lifeExpectancy) {
        super(name, age, type, weight, gender, lifeExpectancy);
    }
    public void printValues(){
    	System.out.println("\nI have a pet named " + getName() + ", who is " + getAge() + " years old and weighs " + getWeight() + " pounds.");
    }
}

