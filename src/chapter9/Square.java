package chapter9;

public class Square extends Rectangle {


    @Override // strongly encouraged but not required
    public double calculatePerimeter() {
        return this.sides * this.length;
    }

    public void print(String what) {
        System.out.println("I'm a " + what);
    }

}
