package discount;

public class CustomerOrder {

    private String customerName;
    private double billAmount;
   // private char discountType;
    public Discount discount;

    public CustomerOrder(String customerName, double billAmount, Discount discount) {
        this.customerName = customerName;
        this.billAmount = billAmount;
        //this.discountType = discountType;
        this.discount = discount;
    }

    public double getBillAmount() {
/*        double tempBill;
        switch (discountType) {
            case 'S':
            case 's':
                tempBill = billAmount - (billAmount * 0.1);
                break;
            case 'D':
            case 'd':
                tempBill = billAmount - (billAmount * 0.5);
                break;
            case 'L':
            case 'l':
                tempBill = billAmount - (billAmount * 0.75);
                break;
            default:
                tempBill = billAmount;
        }
        return tempBill;*/

        return billAmount - discount.discount(billAmount);
    }

    public void setBillAmount(double billAmount) {
        this.billAmount = billAmount;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public double showDiscount(){
        return discount.discount(billAmount);
    }

    public void setDiscount(Discount newDiscountType) {
        discount = newDiscountType;
    }


    @Override
    public String toString() {
        return "Customer{"
                + "customerName='" + customerName + '\''
                + ", billAmount=" + billAmount
                + ", discountType=" + discount
                + '}';
    }
}
