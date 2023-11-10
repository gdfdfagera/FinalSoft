package Strategy;

import Singleton.DBconnection;

public class ChangeDB {
    public static DBconnection db;
    public ChangeDB(){
        this.db= DBconnection.getInstance();
    }
}
