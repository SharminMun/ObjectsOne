package object1;



// Define a class
class Person {

    // Define Instance Variables
    // different for each object!
    String name;
    int age = 0;
    int height = 0;
    //height units are in centimeters

    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person(String name, int age, int height) {
        this.name = name;
        this.age = age;
        this.height = height;
     }

    /*public static void main(String[] args) {
        // Declare and initialize an object
        Person person1 = new Person("John", 30);
        Person person2 = new Person("Alex", 25, 150);
        System.out.println(person2.height);
        /* Now you can use the Object `person1`

        Person[] persons = new Person[2];
        persons[0] = person1;
        persons[1] = person2;
    }*/

}
