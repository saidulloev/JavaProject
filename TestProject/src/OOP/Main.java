package OOP;

public class Main {
    public static void main(String[] args) {

//        Animal cat = new Animal();
//        cat.info();
//        cat.age = 2;
//        cat.name = "Kitty";
//        cat.info();
//
//        Animal dog = new Animal("rex");
//        dog.info();
//
//        Animal cat2 = new Animal("murzik",4);
//        cat2.info();
//
//        Animal dog2 = new Animal();
//        dog2.info();
        Employee Tom = new Employee("Tom", 50,"Hardy" + "\n");
        Tom.displayInfo();

        System.out.println(Operation.findFactorial(6));
        System.out.println(Operation.div(100, 15));
        System.out.println(Operation.sum(2023, 87));
        System.out.println(Operation.mult(17, 8) + "\n");


        Persons Bob = new Persons("Bob", 29);
        System.out.println(Bob.getAge());
        Bob.setAge(30);
        System.out.println(Bob.getAge());

        Bob.setAge(101);
        System.out.println(Bob.getAge() + "\n");

        Animal newCat = new Animal("Pretty", 2, "Beverly Hills", "myauw");
        newCat.infoName();
        newCat.infoAge();
        newCat.infoVoice();
//        newCat.infoAdress();  Error, because private method

        System.out.println("\n" + newCat.name);
        System.out.println(newCat.age);
        System.out.println(newCat.voice);
//        System.out.println(newCat.address); Error, because private

        Day currentDay = Day.Friday;
        System.out.println("\n" + currentDay);
    }

    enum Day{
        Monday,
        Tuesday,
        Wednesday,
        Thursday,
        Friday,
        Saturday,
        Sunday
    }
}



