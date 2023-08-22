package OOP;

public class Animal {

    public String name;
    int age;
    private String adress;
    protected String voice;

    Animal()
    {
        name = "Unknown";
        age = 0;
    }

    Animal(String name){
        this.name = name;
        age = 1;
    }

    Animal(String name, int age){
//        name = name_;
//        age = age_;

        this.name = name;
        this.age = age;
    }


    Animal(String name, int age, String adress, String voice){

        this.name = name;
        this.age = age;
        this.adress = adress;
        this.voice = voice;

    }

    public void infoName(){
        System.out.println("Name: " + name);
    }

    protected void infoAge(){
        System.out.println("Age: " + age);
    }

    private void infoAdress(){
        System.out.println("Adress: " + adress);
    }

    void infoVoice(){
        System.out.println("Voice: " + voice);
    }

    public void info(){
        System.out.println("Name animal: " + name +
                "\n" + "Age: " + age +
                "\n" + "Adress: " + adress +
                "\n" + "voice: " + age);
    }



}
