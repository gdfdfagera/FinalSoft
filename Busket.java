import java.util.ArrayList;
import java.util.List;

public class Busket {
    List<Product> busketList = new ArrayList<>();

    public List<Product> getBusketList() {
        return busketList;
    }

    public void addToBusket(Product product){
        busketList.add(product);
    }

    public void deleteFromBusket(Product p){
        busketList.remove(p);
    }

    public void showBusket(){
        for (Product p:
             busketList) {
            System.out.println(p.id + " " + p.name + " " + p.type + " " + p.price);
        }
    }

    public void removeFromBusket(int id){
        for (int i = 0; i < busketList.size(); i++) {
            if (busketList.get(i).id == id){
                busketList.remove(busketList.get(i));
            }
        }
    }

    public void removeBusket(){
        busketList.clear();
    }
}
