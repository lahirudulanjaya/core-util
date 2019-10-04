package com.wso2telco.core.dbutils.fileutils;

import org.assertj.core.api.Assertions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.mockito.Mockito;
import org.testng.annotations.Test;
import org.wso2.carbon.utils.CarbonUtils;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import static org.testng.Assert.*;
import static org.mockito.Mockito.*;
import static org.testng.Assert.assertNull;
import static org.testng.Assert.fail;


public class PropertyFileReaderTest {
    PropertyFileReader propertyFileReader;

    @BeforeTest
    public void setUp() {
        PropertyFileReaderTest.class.getProtectionDomain().getCodeSource().getLocation().getPath();
        try {
            System.setProperty("carbon.config.dir.path", PropertyFileReaderTest.class.getProtectionDomain().getCodeSource().getLocation().getPath());

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @Test
    public void testGetFileReader_whenValidPathGiven() {
        Properties properties = PropertyFileReader.getFileReader().getProperties("test.txt");
        Assertions.assertThat(properties.getProperty("key1")).isEqualTo("value1");

    }

    @Test
    public void testGetFileReader_fileNotFoundException() {
        Properties properties = PropertyFileReader.getFileReader().getProperties("wrong.txt");
        Assertions.assertThat(properties.getProperty("key1")).isEqualTo(null);
    }
}
