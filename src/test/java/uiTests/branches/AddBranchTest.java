package uiTests.branches;

import org.testng.Assert;
import org.testng.annotations.Test;
import uiTests.BaseUiTest;

public class AddBranchTest extends BaseUiTest {
    @Test
    public void clickAddUserBtn(){
        branchesPage.clickAddBranchBtn();
        Assert.assertEquals(driver.getCurrentUrl(),"https://nuta1bema.talentlms.com/branch/index");
    }
}
