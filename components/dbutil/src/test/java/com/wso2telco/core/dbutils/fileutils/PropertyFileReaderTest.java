package com.wso2telco.core.dbutils.fileutils;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.mockito.Mockito;
import org.testng.annotations.Test;
import static org.testng.Assert.*;
import static org.mockito.Mockito.*;
import static org.testng.Assert.assertNull;
import static org.testng.Assert.fail;


public class PropertyFileReaderTest {
    PropertyFileReader propertyFileReader;
    @BeforeTest
    public void setUp() {

    }

    @Test
    public void testGetFileReader() {
        PropertyFileReader.getFileReader();

  //  propertyFileReader.getProperties("lahiru");
    }
}
//com.wso2telco.core.dbutils.fileutils.PropertyFileReader@1e9e725a