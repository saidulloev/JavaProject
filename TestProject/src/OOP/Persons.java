package OOP;

class Persons {

    private String name;
    private int age;

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
        if (age > 0 && age < 100)
            this.age = age;
    }

    public Persons(String name, int age) {
        setName(name);
        setAge(age);
    }
}

class Employee extends Persons {

    String surname;

    public Employee(String name, int age, String surname) {
        super(name, age);
        this.surname = surname;
    }

    public void displayInfo() {
        System.out.println("Name: " + getName());
        System.out.println("Age: " + getAge());
        System.out.println("Surname: " + surname);
    }
}
