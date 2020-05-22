package discount;

public interface Discount {
    double discount(double billAmount);
}

class typeS implements Discount{

    @Override
    public double discount(double billAmount) {
        return billAmount * 0.1;
    }
}
class typeD implements Discount{

    @Override
    public double discount(double billAmount) {
        return billAmount * 0.5;
    }
}
class typeL implements Discount{

    @Override
    public double discount(double billAmount) {
        return billAmount * 0.75;
    }
}
