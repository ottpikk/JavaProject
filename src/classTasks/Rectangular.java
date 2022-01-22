package classTasks;

public class Rectangular {
    /*
    *   Create a class named Rectangular that will have private 2 fields –
    *   length (float) and width (float), and 2 methods:
    *   area – that has no input arguments and it prints to console area of a
    *   rectangular	perimeter – that has no input arguments and prints to
    *   console perimeter of a rectangular
    */

    //fields
    private float length;
    private float width;

    // setters
    public void setWidth(float width) {
        this.width = width;
    }
    public void setLength(float length) {
        this.length = length;
    }

    //getters
    public float getLength() {
        return length;
    }
    public float getWidth() {
        return width;
    }
    public float getArea() {
        return length * width;
    }
    public float getPerimeter() {
        return 2 * (length + width);
    }
}
