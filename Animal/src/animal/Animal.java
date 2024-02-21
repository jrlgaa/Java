package animal;

public class Animal {
    private String name;
    private int age;
    private String type;
    private int weight;
    private String gender;
    private int lifeExpectancy;

    public Animal(String name, int age, String type, int weight, String gender, int lifeExpectancy) {
        this.name = name;
        this.age = age;
        this.type = type;
        this.weight = weight;
        this.gender = gender;
        this.lifeExpectancy = lifeExpectancy;
    }

    protected String getName() {
        return name;
    }

    protected int getAge() {
        return age;
    }

    protected int getWeight() {
        return weight;
    }

    public void printValues() {
        System.out.println("I have a " + gender + " " + type + " named " + name + ", who is " + age + " years old and weighs " + weight + " pounds, with a life expectancy of " + lifeExpectancy + " years.");
    }
    
    public String getType() {
        return type;
    }
}
