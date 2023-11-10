package Adapter;

public class DiscountAdapter implements ICertificate{
    Discount dis = new Discount();
    @Override
    public String buyCertificate() {
        return dis.getDiscount();
    }
}
