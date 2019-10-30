package chapter9;

public class InheritanceTester {

    public static void main(String[] args) {
//        Person person = new Person();
        Employee employee = new Employee();

        Rectangle rect = new Rectangle();
        Square square = new Square();

        square.print();
        square.print("square, really!");

        Mother mom = new Mother();
        mom.setName("Mom"); // from person class Mother > Woman > Person > Object

    }

}
