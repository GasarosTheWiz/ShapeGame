// Dimitris Drakos 2689
    class Triangle extends Shape {
    private double B;

    Triangle(double x){
        super();
        this.B = x;
    }
    @Override
    double computeArea() {
        return B/2;
    }
    @Override
    String getType() {
        return "Triangle";
    }

}