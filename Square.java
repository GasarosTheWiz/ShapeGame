// Dimitris Drakos 2689
    class Square extends Shape {
    private double B;

    Square(Double x){
        super();
        this.B = x;

    }
    @Override
    double computeArea() {
        return B;
    }

    @Override
    String getType() {
        return "Square";
    }

}
