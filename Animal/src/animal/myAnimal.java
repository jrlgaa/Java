package animal;

public class myAnimal {

    public static void main(String[] args) {
        Animal myPet = new Animal("Fluffy", 5, "Cat", 8, "Female", 12);
        myPet.printValues();
        
        Pet pet = new Pet ("Bulldog", 4, "Dog", 6, "Male", 15);
        pet.printValues();
    }
}
