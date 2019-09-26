package com.wso2telco.core.dbutils.util;
import com.wso2telco.core.dbutils.exception.BusinessException;
import org.assertj.core.api.Assertions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.sql.SQLException;

import static org.mockito.Mockito.*;
import static org.testng.Assert.assertNull;
import static org.testng.Assert.fail;
public class UserManageHealperTest{
    private UserManageHealper userManageHealper;
    @BeforeTest
    public void Initialtest(){
        userManageHealper = UserManageHealper.getInstace();
    }

    @Test
    public void Testgetuser_whenvaliduser() throws BusinessException {
        Assertions.assertThat(userManageHealper.getUser("Basic YWRtaW46YWRtaW4=")).isEqualTo("admin");
    }

    @Test
    public void  Testgetuser_wheninvaliduser() throws BusinessException {
        Assertions.assertThat(userManageHealper.getUser("Basic YWRtaW46YWRtaW4=")).doesNotContain("chamara");

    }


}
