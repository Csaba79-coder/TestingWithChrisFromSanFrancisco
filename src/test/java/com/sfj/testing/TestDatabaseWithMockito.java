package com.sfj.testing;

import static org.junit.Assert.*;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

public class TestDatabaseWithMockito {

    // do not forget from mvn repository take the mockito dependency!!!
    // add to pom.xml as dependencies! ...

    Database dataBase = null;
    DatabaseConnection dbConnection = Mockito.mock(DatabaseConnection.class);

    @Before
    public void init() {
        dataBase = new Database(dbConnection);
    }

    @Test
    public void testSum() {
        // this one can be called stub, as not checked is dbConnection is really called!
        // but after verification I can call as mock, because I'm sure that it is used with mockito!
        when(dbConnection.checkUserPass("Gyula", "jelszó")).thenReturn(true);
        Integer expected = 3;
        assertEquals(expected, dataBase.sum("Gyula", "jelszó", 1, 1, 1));
        // to validate the connection we gonna verify it!
        verify(dbConnection).checkUserPass("Gyula", "jelszó");
    }
}
