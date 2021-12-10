// Dimitris Drakos 2689
import java.util.Scanner;
import java.util.Stack;

    class Player {
    private double points = 0;
    private int size;
    private Stack<Shape> stack;
    private Shape[]copy;
    Player(int size) {
        stack = new Stack<Shape>();
        this.size = size;
    }

    void playShape(Shape x) {

        System.out.println(" ");
        System.out.println("Do you accept? (y/n)");
        Scanner in = new Scanner(System.in);
        String answer = in.nextLine();
        while (!answer.equals("y") && !answer.equals("n")) {
            System.out.println("\nDo you accept? (y/n)");
            answer = in.nextLine();
        }
        if (answer.equals("y")) {

            if (stack.isEmpty()) {      //you cant check last element if its empty
                insertatbottom(x);
                System.out.println(" ");
                System.out.println("Added " + x.computeArea() + " points.");
                points = points + x.computeArea();


            } else {
                Shape y = stack.firstElement();  //keeping first element in y before inserting x
                insertatbottom(x);
                System.out.println(" ");
                System.out.println("Added " + x.computeArea() + " points.");
                points = points + x.computeArea();

                if (x.sameArea(y)) {
                    System.out.println("10* points!");
                    points = points + x.computeArea() * 10;
                }
                if (x.sameType(y)) {
                    System.out.println(" ");
                    System.out.println("Removed " + x + " and " + y);
                    stack.remove(x);        //removing x and y
                    stack.remove(y);

                }
            }
        }

    }

    boolean isStackFull(){
        if (stack.size() == size){
            return true;
        }
        return false;
    }
    void printStack() {
        System.out.println("Current stack: ");
        System.out.print(stack);
        System.out.println(" ");
    }

    double getPoints(){
        return points;
    }
    private Stack<Shape> insertatbottom(Shape x){
        if (stack.size() ==0){
            stack.push(x);
        }else{
            Shape p = stack.peek();
            stack.pop();
            insertatbottom(x);
            stack.push(p);
        }
        return stack;
    }
}
