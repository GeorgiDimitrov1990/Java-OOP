package shapes;

public class Circle extends Shape {
    private Double radius;

    public Circle(Double radius) {
        this.radius = radius;
    }

    @Override
    public Double calculatePerimeter() {
        if (perimeter != null){
            return perimeter;
        }

        return 2 * Math.PI * this.radius;

    }

    @Override
    public Double calculateArea() {
        if (area != null) {
            return area  ;
        }

        return Math.PI * this.radius * this.radius;

    }
}
