package uiTests.login;

import com.talentLMS.UI.dataProviders.ConfigReader;


import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import uiTests.BaseUiTest;

@Epic("Login")
public class LoginTests extends BaseUiTest {
    /**
     *
     */

    @BeforeMethod
    public void openLoginPage(){
        driver.navigate().to(ConfigReader.getProperty("qa_env"));
    }


    @Test
    @Description("Verify that user can login with valid credentials")
    @Feature("Login")
    public void createNewUserTest(){

        // TODO
    }

    @Test(description = "Click to Add coreses button")

    public void  createNewCourse(){
//        loginPage.fillUpUsernameAndPassword("amanzadr", "amanzadr");
//        addCoursesPage.clickAddCourses1();
        Assert.assertEquals(driver.getCurrentUrl(),"https://justtestforaman.talentlms.com/course/create");
        addCoursesPage.VerifyCourseName().fillCategoryAndSample().fillUpDescription();
        Assert.assertEquals(addCoursesPage.activeCheckBox.getText(), "Active");
        addCoursesPage.saveCourseBtn();



    }

//    @Test(priority = 2,  description = "Verify Course Name")
//
//    public void createCoursesName(){
//        addCoursesPage.VerifyCourseName();
//
//
//    }






}
