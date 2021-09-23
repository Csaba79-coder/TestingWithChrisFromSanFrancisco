package com.sfj.testing;

public class Database {

    DatabaseConnection dbCon;

    public Database() {
    }

    public Database(DatabaseConnection dbCon) {
        this.dbCon = dbCon;
    }

    public Integer sum(String user, String password, int a, int b, int c) {

        boolean checkUser = dbCon.checkUserPass(user, password);

        if (checkUser) {
            return (a + b + c);
        }
        return null;
    }
}
