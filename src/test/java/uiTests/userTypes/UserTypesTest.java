package uiTests.userTypes;

import io.qameta.allure.Description;
import io.qameta.allure.Feature;
import org.testng.Assert;
import org.testng.annotations.Test;
import uiTests.BaseUiTest;

public class UserTypesTest extends BaseUiTest {

    @Test (priority = 1)
    @Description("Open UserTypes page from Home page with use title link")
    @Feature("UserTypes")
    public void openUserTypesWithTitle() {
        webElementActions.click(userTypes.userTypesTitleLink);
        webElementActions.assertUrlPage(userTypes.userTypesURL);
    }

    @Test (priority = 2)
    @Description("Open UserTypes page from Home page with use icon link")
    @Feature("UserTypes")
    public void openUserTypesWithIcon() {
        webElementActions.click(userTypes.userTypesIconLink);
        webElementActions.assertUrlPage(userTypes.userTypesURL);
    }

    @Test
    @Description("Open AddUserTypes page from UserTypes page")
    @Feature("UserTypes")
    public void openAddUserTypesPage() {
        userTypes.openUserTypesPage();
        webElementActions.click(userTypes.addUserTypeLink);
        webElementActions.assertUrlPage("https://nuta1bema.talentlms.com/acl/create");
    }

    @Test
    @Description("Enter userType in the search input field to display only that userType")
    @Feature("UserTypes")
    public void userTypeSearch() {
        userTypes.openUserTypesPage();
        webElementActions.sendKeys(userTypes.searchUserTypesInput, "learner");

    }

}