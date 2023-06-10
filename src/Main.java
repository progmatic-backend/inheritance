public class Main {
    public static void main(String[] args) {
        Cat cica = new Cat();
        cica.setName("Cirmi");
        cica.setAge(12);

        cica.sayHello();
        cica.sayHelloTo("Lili");

        Seagull bird = new Seagull();
        bird.setName("Scuttle");
        bird.setAge(34);

        bird.sayHello("Lia");
    }
}
