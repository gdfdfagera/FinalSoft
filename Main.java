import Adapter.Certificate;
import Adapter.DiscountAdapter;
import Adapter.ICertificate;
import Decorator.*;
import Observer.Shop;
import Observer.User;
import Strategy.Add;
import Strategy.Admin;
import Strategy.Delete;

import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Admin admin = new Admin();
        Shop sh = new Shop();

        sh.addUser(new User("Dima", 50));
        sh.addUser(new User("Max", 50));
        sh.addUser(new User("Dias", 50));
        sh.addUser(new User("Era", 50));



        System.out.println("Do you want to sign in like an Administrator?");
        String adminOrUser = sc.nextLine();
        if (Objects.equals(adminOrUser, "Yes")){
            while(true) {
                System.out.println("Enter 1 if you want to add user");
                System.out.println("Enter 2 if you want to add product");
                System.out.println("Enter 3 if you want to remove product");
                System.out.println("Press 4 to exit");
                int ch = sc.nextInt();
                if (ch == 1) {
                    sc.nextLine();
                    System.out.println("Enter name and wallet of user");
                    String name = sc.nextLine();
                    int wallet = sc.nextInt();
                    admin.createUser(name, wallet);
                } else if (ch == 2) {
                    admin.setChange(new Add());
                    System.out.println("Enter product name, product type and product price");
                    sc.nextLine();
                    String name = sc.nextLine();
                    String type = sc.nextLine();
                    String price = sc.nextLine();
                    admin.action(0, name, type, price);
                } else if (ch == 3) {
                    admin.setChange(new Delete());
                    ShowProdcts.show();
                    System.out.println("Enter id of product");
                    int id = sc.nextInt();
                    admin.action(id, "", "", "");
                } else if (ch == 4) {
                    break;
                }
            }
        } else {
            System.out.println("Enter your name");
            String name = sc.nextLine();
            if (Objects.equals(name, "Dias")){
                System.out.println("Enter your wallet");
                int wallet = sc.nextInt();
                CurrentUser me = new CurrentUser(wallet);
                while(true){
                    System.out.println("Press 1 to show all products");
                    System.out.println("Press 2 to show your wallet");
                    System.out.println("Press 3 to add product in basket");
                    System.out.println("Press 4 to buy");
                    System.out.println("Press 5 to buy device");
                    System.out.println("Press 6 to buy a certificate");
                    System.out.println("Press 7 to exit");
                    int choose = sc.nextInt();
                    if (choose == 1){
                        ShowProdcts.show();
                    } else if (choose == 2) {
                        System.out.println(me.getWallet());
                    } else if (choose == 3){
                        me.myBusket();
                    } else if (choose == 4){
                        me.buy(admin);
                    } else if (choose == 5){
                        IDecorator d = new AddMouse(new Devices());
                        System.out.println(d.addToBusket());
                    } else if (choose == 6) {
                        ICertificate discount = new DiscountAdapter();
                        ICertificate certificate = new Certificate();
                        System.out.println(certificate.buyCertificate());
                        System.out.println(discount.buyCertificate());
                    } else {
                        break;
                    }
                }
            }
        }
    }
}
