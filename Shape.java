// Dimitris Drakos 2689
    public abstract class Shape {
    private int boundingrect;  //bounding rectangle

    Shape() {
        this.boundingrect = boundingrect;
    }

    abstract double computeArea();

    abstract String getType();

    boolean sameArea(Shape other) {
        if (this.computeArea() == other.computeArea()) {
            return true;
        }
        return false;
    }
    boolean sameType(Shape other){
        if (this.getType().equals(other.getType())){
            return true;
        }
        return false;
    }
    public String toString(){
        String s = String.valueOf(computeArea());
        System.out.println(s + getType());
        return s + getType();
    }
    double getBoundingrect(){
        return boundingrect;
    }

}