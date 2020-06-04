public class KoreanBake
{
    private int length;
    private double area;
    private String shapeType;

    public KoreanBake(String shape, int size) {
        length = size;
        shapeType = shape;
        area = calcArea();
    }

    public double getArea() {
        return area;
    }

    public String shapeType() {
        return shapeType;
    }

    public double calcArea() {
        if(shapeType.equals("square")) {
            // square
            return (length * length);
        }
        else if(shapeType.equals("circle")) {
            return (3.14 * (length / 2.0) * (length / 2.0));
        }
        return 1.0;
    }

    public boolean isGoodFee(KoreanBake bake) {
        System.out.print("Mine area : ");
        System.out.println(this.getArea());
        System.out.print("That area : ");
        System.out.println(bake.getArea());
        if(bake.getArea() < this.getArea()) {
            return true;
        }
        else {
            return false;
        }
    }
}