package com.antigravity.tests;

import com.antigravity.data.TestDataGenerator;
import io.qameta.allure.Description;
import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.annotations.Test;

import java.util.Map;

@Feature("Book Management")
public class TestBookManagement extends BaseTest {

    @Test(priority = 1)
    @Severity(SeverityLevel.BLOCKER)
    @Description("TC01: Verify Login Successfully")
    public void test_tc01_verify_login_successfully() {
        loginPage.navigateToLoginPage();
        loginPage.login("anhtester@example.com", "123456");
        loginPage.verifyLoginSuccess();
    }



}
