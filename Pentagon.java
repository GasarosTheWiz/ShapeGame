// Dimitris Drakos 2689
    class Pentagon extends Shape {
    private double B;

    Pentagon(double x){
        super();
        this.B = x;
    }
    @Override
    double computeArea() {
        return 3*B/4;
    }
    @Override
    String getType() {
        return "Pentagon";
    }

}