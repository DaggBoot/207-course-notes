public class Rectangle {
    private double width;
    private double height;

    public Rectangle(double w,double h){
        this.width=w;
        this.height=h;
    }

    public double area(){
        return width*height;
    }

    /**
     * scales the rectangle
     * @param factor factor of which we scale the width and height by.
     */
    public void scale(double factor) {
      width = width * factor;
      height = height * factor;
    }

    public boolean isLargerThan(Rectangle other){
        return area() > other.area();
    }
}
