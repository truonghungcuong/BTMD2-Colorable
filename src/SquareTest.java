public class SquareTest {
    public static void main(String[] args) {
        Square square=new Square();
        System.out.println(square);
        square.howToColor();

        square=new Square(5);
        System.out.println("\n"+square);
        square.howToColor();
    }
}
