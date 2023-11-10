import Strategy.Admin;
import Strategy.Delete;

import java.util.Scanner;

public class CurrentUser {
    private int wallet;
    Busket busket = new Busket();

    public CurrentUser(int wallet){
        this.wallet =wallet;
    }

    public int getWallet() {
        return wallet;
    }

    public void buy(Admin ad){
        if (busket.busketList.isEmpty()){
            System.out.println("Your busket is empty");
            return;
        }
        int finalPrice = 0;
        for (Product p:
             busket.busketList) {
            finalPrice += p.price;
        }
        if (finalPrice > wallet){
            System.out.println("You do not have enough money");
            return;
        }

        ad.setChange(new Delete());
        for (Product p:
                busket.busketList) {
            ad.action(p.id, "", "", "");
        }
        busket.removeBusket();
    }

    public void myBusket(){
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Press 1 to add a product to the busket");
            System.out.println("Press 2 to remove a product from the busket");
            System.out.println("Press 3 to show all products from the busket");
            System.out.println("Press 4 to delete all from the busket");
            System.out.println("Press 5 to exit");
            int ch = sc.nextInt();
            if (ch == 1) {
                System.out.println("Choose a product");
                ShowProdcts.show();
                int id = sc.nextInt();
                busket.addToBusket(ShowProdcts.showConcreteProduct(id));
            } else if (ch == 2) {
                busket.showBusket();
                System.out.println("Choose a product");
                int c = sc.nextInt();
                busket.removeFromBusket(c);
            } else if (ch == 3) {
                busket.showBusket();
            } else if (ch == 4){
                busket.removeBusket();
            } else {
                break;
            }
        }
    }
}
