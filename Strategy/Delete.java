package Strategy;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Delete extends ChangeDB implements IChange{

    @Override
    public void action(int productId, String pName, String type, String price) {
        String delete = "DELETE FROM " + Const.TABLE_NAME + " WHERE " + Const.ID + " = ?";

        try {
            PreparedStatement prSt = db.getDbConnection().prepareStatement(delete);
            prSt.setInt(1, productId);

            prSt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
