package chapter10;

// Polymorphism Demo

public class Zoo {

    public static void main(String[] args) {

        Dog rocky = new Dog();
        rocky.fetch();
        rocky.makeSound();
        feed(rocky);

        Animal sasha = new Dog();
        System.out.println((sasha instanceof Animal));
        System.out.println((sasha instanceof Dog));
        sasha.makeSound();
        feed(sasha);
        ((Dog) sasha).fetch();

        sasha = new Cat();
        sasha.makeSound();
        System.out.println(sasha.getClass().getSimpleName());
        ((Cat) sasha).scratch(); // this call is not mutative. sasha remains and Animal;
        feed(sasha);
//        sasha.scratch();
        System.out.println(sasha.getClass().getSuperclass().getSimpleName());

        Cat bert = ((Cat) sasha);
        bert.scratch();


    }

    public static void feed(Animal animal) {

        if (animal instanceof Dog) {
            System.out.println("here's your dog food");
        } else if (animal instanceof Cat) {
            System.out.println("here's your cat food");
        }
    }

}
