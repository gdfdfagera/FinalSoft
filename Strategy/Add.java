package Strategy;

import Observer.Shop;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Add extends ChangeDB implements IChange{

    @Override
    public void action(int productId, String pName, String type, String price) {
        String insert = "INSERT INTO " + Const.TABLE_NAME + "(" + Const.product_NAME + "," + Const.type + "," + Const.price + ")" + "VALUES(?,?,?)";
        System.out.println(pName + type + price);
        try {
            PreparedStatement prSt = db.getDbConnection().prepareStatement(insert);

            prSt.setString(1, pName);
            prSt.setString(2, type);
            prSt.setString(3, price);

            prSt.executeUpdate();
        } catch (SQLException e){
            e.printStackTrace();
        } catch (ClassNotFoundException e){
            e.printStackTrace();
        }

        Shop.notifyObservers();
    }
}
