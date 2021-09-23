package com.sfj.testing;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestDatabase {

    Database database = null;

    // this one is a fake Object!!! not mock!
    DatabaseConnection databaseConnection = new DatabaseConnection() {
        @Override
        public boolean checkUserPass(String user, String password) {
            return true;
        }
    };

    @Before
    public void init() {
        database = new Database(databaseConnection);
    }

    @Test
    public void testSum() {
        Integer expected = 3;
        assertEquals(expected, database.sum("Gyula", "jelszó", 1, 1, 1));
    }
}
