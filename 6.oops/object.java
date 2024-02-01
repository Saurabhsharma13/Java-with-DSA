// Define a superclass called Animal
class Animal {
    // Declare an instance variable
    String name;
  
    // Declare a constructor
    Animal(String name) {
      this.name = name;
    }
  
    // Declare a method
    void makeSound() {
      System.out.println("The animal makes a sound.");
    }
  }
  
  // Define a subclass called Dog that inherits from Animal
  class Dog extends Animal {
    // Declare a constructor
    Dog(String name) {
      super(name);
    }
  
    // Override the makeSound() method
    @Override
    void makeSound() {
      System.out.println("The dog barks: woof woof!");
    }
  }
  
  // Define a main class
  public class object {
    public static void main(String[] args) {
      // Create an object of the Dog class
      Dog myDog = new Dog("Rex");
  
      // Call the makeSound() method on the Dog object
      myDog.makeSound();
  
      // Create an object of the Animal class
      Animal myAnimal = new Animal("Generic Animal");
  
      // Call the makeSound() method on the Animal object
      myAnimal.makeSound();
    }
  }
