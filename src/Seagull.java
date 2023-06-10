public class Seagull {

    private String name;

    private int age;

    public void sayHello(String userName){
        System.out.println("Hello " + userName + ". Nice to meet you. My name is "+ this.name);
    }


    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
