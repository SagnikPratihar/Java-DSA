package OOP.Properties.Inhetitance;

public class BoxWeight extends Box {
    double weight;

    public BoxWeight() {
        super();
        this.weight = -1;
    }

    BoxWeight(BoxWeight other) {
        super(other);
        weight = other.weight;
    }

    public BoxWeight(double side, double weight) {
        super(side); //call the parent class constructor
        //used to initialised values in parent class
        this.weight = weight;
    }

    public BoxWeight(double l, double w, double h, double weight) {
        super(l, w, h); //call the parent class constructor
        //used to initialised values in parent class
        this.weight = weight;
        this.l = l;
    }
}
