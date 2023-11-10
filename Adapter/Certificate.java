package Adapter;

public class Certificate implements ICertificate {
    @Override
    public String buyCertificate(){
        return "You bought certificate";
    }
}
