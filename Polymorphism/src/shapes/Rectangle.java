package shapes;

public class Rectangle extends Shape {

    private final Double height;
    private final Double wight;

    public Rectangle(Double height, Double wight) {
        this.height = height;
        this.wight = wight;
    }

    @Override
    public Double calculatePerimeter() {
        if (super.perimeter != null){
            return super.perimeter;
        }

        return super.perimeter = 2 * this.height + 2 * this.wight;
    }

    @Override
    public Double calculateArea() {

        if (super.area != null){
            return super.area;
        }
        return super.area =  this.height * this.wight;
    }
}
