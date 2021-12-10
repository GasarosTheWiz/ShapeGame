// Dimitris Drakos 2689
import java.util.Scanner;

    class ShapeGame {

    public static void main(String[] args) {
        Shape[] shapes;
        int i=0;
        System.out.println("Give me the number of shapes per type");
        Scanner y = new Scanner(System.in);
        int numberofshapes = y.nextInt();
        System.out.println("Give me the size of the stack of player");
        Scanner x = new Scanner(System.in);
        int sizeofstack = x.nextInt();
        ShapeGenerator p = new ShapeGenerator(numberofshapes);
        Player player = new Player(sizeofstack);
        shapes = new ShapeGenerator(numberofshapes).getallshapes();


        while (p.hasShape() && !player.isStackFull()) {
            System.out.println(" ");
            player.printStack();
            System.out.println(" ");
            System.out.println("Incoming shape: " + shapes[i].getType() + " " + shapes[i].computeArea());
            player.playShape(shapes[i]);
            p.nextShape(shapes[i]);
            System.out.println("Players has " + player.getPoints() + " points.");
            i++;
        }
        System.out.println("GAME OVER");
    }
}
