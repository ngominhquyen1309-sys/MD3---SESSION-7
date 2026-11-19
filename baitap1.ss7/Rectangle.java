package baitap1.ss7;

public class Rectangle {
    
    private double length;
    private double width;

    
    public Rectangle() {
        this.length = 1.0;
        this.width = 1.0;
    }

    
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // tính diện tích
    public double getArea() {
        return length * width;
    }

    //tính chu vi
    public double getPerimeter() {
        return 2 * (length + width);
    }

    // hiển thị thông tin
    public void display() {
        System.out.println("Chiều dài: " + length);
        System.out.println("Chiều rộng: " + width);
        System.out.println("Diện tích: " + getArea());
        System.out.println("Chu vi: " + getPerimeter());
    }


}