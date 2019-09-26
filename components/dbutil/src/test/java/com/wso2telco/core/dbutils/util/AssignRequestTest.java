package com.wso2telco.core.dbutils.util;

import com.wso2telco.core.dbutils.exception.BusinessException;
import com.wso2telco.core.dbutils.util.AssignRequest;
import com.wso2telco.core.dbutils.util.UserManageHealper;
import org.assertj.core.api.Assertions;
import org.mockito.Mockito;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AssignRequestTest {
    private AssignRequest assignRequest;
    @BeforeTest
    public void initialtest(){
        assignRequest =new AssignRequest();
        assignRequest.setTaskId("1");
    }

    @Test
    public void testgetTaskId(){
        Assertions.assertThat(assignRequest.getTaskId()).isEqualTo("1");
    }


}
