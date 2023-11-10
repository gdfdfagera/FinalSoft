import Strategy.ChangeDB;
import Strategy.Const;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ShowProdcts extends ChangeDB {
    public static void show(){
        String show = "SELECT * FROM " + Const.TABLE_NAME;
        try {
            PreparedStatement prSt = db.getDbConnection().prepareStatement(show);

            ResultSet resultSet = prSt.executeQuery();

            while (resultSet.next()) {
                String id = resultSet.getString("id");
                String name = resultSet.getString("productName");
                String type = resultSet.getString("type");
                String price = resultSet.getString("price");

                System.out.println(id + " " + name + " " + type + " " + price);
                System.out.println("--------------------------------------------");
            }
            System.out.println("=============================================");
        } catch (SQLException e){
            e.printStackTrace();
        } catch (ClassNotFoundException e){
            e.printStackTrace();
        }
    }

    public static Product showConcreteProduct(int iD){
        String show = "SELECT * FROM " + Const.TABLE_NAME + " WHERE id=" + iD;
        Product p = new Product();
        try {
            PreparedStatement prSt = db.getDbConnection().prepareStatement(show);

            ResultSet resultSet = prSt.executeQuery();

            if (resultSet.next()) {
                String id = resultSet.getString("id");
                String name = resultSet.getString("productName");
                String type = resultSet.getString("type");
                String price = resultSet.getString("price");

                p.setId(Integer.parseInt(id));
                p.setPrice(Integer.parseInt(price));
                p.setType(type);
                p.setName(name);
            }
        } catch (SQLException e){
            e.printStackTrace();
        } catch (ClassNotFoundException e){
            e.printStackTrace();
        }
        return p;
    }
}
