package object1;

public class Dog {
    private String name;
    private int age;
    private String breed;

    public Dog(String name, int age, String breed) {
        this.name = name;
        this.age = age;
        this.breed = breed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }
}

/*Dog dog1 = new Dog("Simba",12,"Poodle");
Dog dog2 = new Dog("Bella",20,"Mutt");
Dog dog3 = new Dog("Charlie",35,"Bulldog");


Dog[] dogs = new Dog[3];
Dog[0] = dog1;
Dog[1] = dog2;
Dog[2] = dog3;*/
