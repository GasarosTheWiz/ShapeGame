// Dimitris Drakos 2689
import java.util.Random;

import static java.lang.String.valueOf;

class ShapeGenerator {
    Shape[] allshapes;
    private int size;
        private java.lang.String String;

        ShapeGenerator(int n){
        allshapes = new Shape[n*4];
        size = n*4;
        initializeShapes();

        for(int i=0; i<n; i++){
            allshapes[i] = (Shape) new Circle(initializeShapes());        //making allshapes have n times every shape
        }
        for(int i=n; i<2*n; i++) {
            allshapes[i] = (Shape) new Triangle(initializeShapes());
        }
        for(int i=2*n; i<3*n; i++) {
            allshapes[i] = (Shape) new Square(initializeShapes());
        }
        for(int i=3*n; i<4*n; i++) {
            allshapes[i] = (Shape) new Pentagon(initializeShapes());
        }
        Random rnd = new Random();

        for (int i = 0; i < allshapes.length; i++) {
            int randomIndexToSwap = rnd.nextInt(allshapes.length);
            Shape temp = allshapes[randomIndexToSwap];                              //shuffle
            allshapes[randomIndexToSwap] = allshapes[i];
            allshapes[i] = temp;
        }

    }
    double initializeShapes(){
        int []possiblesizes;
        possiblesizes = new int[7];
        possiblesizes[0] = 1;
        possiblesizes[1] = 2;
        possiblesizes[2] = 3;
        possiblesizes[3] = 4;
        possiblesizes[4] = 8;
        possiblesizes[5] = 12;
        possiblesizes[6] = 16;
        Random rnd = new Random();
        int randomNumber =rnd.nextInt(6);
        return possiblesizes[randomNumber];
    }

    Shape nextShape(){
        Random rnd = new Random();
        int randomNumber =rnd.nextInt(size);
        Shape temp = allshapes[randomNumber];
        allshapes[randomNumber] = allshapes[size-1];        //putting random position in last position
        allshapes[size-1] = temp;
        size--;                                             //deleting size's length so as to loop in a way
        if (size!=0) {                                      // you "cant" see the deleted(last) values
            return allshapes[size-1];
        }
        return allshapes[0];

    }

    Shape nextShape(Shape x){            //overload to use in "no" answer in player
        int pos=0;
        for (int i=0; i<size; i++){
            if (allshapes[i] == x){
                pos = i;
            }
        }
        Shape temp = allshapes[pos];
        allshapes[pos] = allshapes[size-1];
        allshapes[size-1] = temp;
        size--;
        if (size!=0) {
            return allshapes[size-1];
        }
        return allshapes[0];

    }

    boolean hasShape(){
        if (size == 0){             //if size = 0,every shape is found
            return false;
        }
        return true;
    }
    public String toString(){
        String s = null;
        for (int i =0; i<size; i++){
            s = s + valueOf(allshapes[i]);
        }
        return s;
    }

        Shape[] getallshapes(){
        return allshapes;
    }

    public static void main(String[] args){
        ShapeGenerator x = new ShapeGenerator(2);

            x.nextShape();
            System.out.print(x.nextShape());
            var y = x.toString();

    }
}

