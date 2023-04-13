import entity.Rectangle;
import entity.Square;

public class CalculRectangle {

    public static void main(String[] args){
        Rectangle rectangle = new Rectangle(3, 5);
        Square square = new Square(5, 8);
        System.out.println(rectangle.getHauteur());
        System.out.println(rectangle.getLargeur());
        System.out.println(rectangle.display(rectangle.getHauteur(), rectangle.getLargeur()));
        System.out.println(square.calculAire());
    }
}
