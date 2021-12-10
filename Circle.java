// Dimitris Drakos 2689
    class Circle extends Shape {
    private double B;

     Circle(double x){
        super();
        this.B = x;
    }

    @Override
    double computeArea() {
        return B/4 * Math.PI;
    }
    @Override
    String getType() {
        return "Circle";
    }

}