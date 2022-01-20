package com.hsbc.cmb.hk.dbb.steps.supplyChains.bingdingRelationship;

import com.hsbc.cmb.hk.dbb.pages.supplyChains.bingdingRelationship.relationship_page;
import com.hsbc.cmb.hk.dbb.utils.BDDUtil;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.apache.tools.ant.taskdefs.Sleep;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import static java.lang.Thread.sleep;
import static org.junit.Assert.assertEquals;

public class relationship_step extends ScenarioSteps {
    private relationship_page relationship_page;
    private BDDUtil bddUtil;
    public static String envTag;


    @Step
    public void clickCustomerMapping_btn(){
        relationship_page.customerMapping.click();
    }

    @Step
    public void getClickCustomersMenu(){
        relationship_page.clickCustomersMenu.click();
    }

    @Step
    public void CustomerMappingPage(){
        assertEquals("Relationship Management",relationship_page.checkMappingPage.getText());
    }

    @Step
    public void clickSearchCompanyBox(){
        relationship_page.SearchCompanyBox.click();
    }

    @Step
    public void getSearchCompanyInput(String value) {
        relationship_page.SearchCompanyBox.sendKeys(value);
        relationship_page.findButton.click();
    }

    @Step
    public void clickEditButton(){
        relationship_page.editButton.click();
    }

    @Step
    public void createNewCounterPage() {
        assertEquals("Create New Counterparty",relationship_page.createNewCounter.getText());
    }

    @Step
    public void clickDeleteButton(){
        bddUtil.scrollWindowToElement(relationship_page.deleteButton);
        relationship_page.deleteButton.click();
    }

    @Step
    public void clickCreateNewCounterButton(){
        relationship_page.createNewCounter.click();
    }

    @Step
    public void counterWindows(){
        assertEquals("Counterparty",relationship_page.counterWindows.getText());
    }

    @Step
    public void clickCounterNameBox(){
        relationship_page.inputCounterName.click();
    }

    @Step
    public void inputCounterNameBox(){
//        relationship_page.inputCounterName.sendKeys(value);
//        bddUtil.scrollWindowToElement(relationship_page.selectEmail);
        relationship_page.EmailElement.click();

    }

    @Step
    public void clickDownstreamCompanyButton(){
        relationship_page.downstreamCompanyButton.click();
    }

    @Step
    public void clickConfirmButton(){
        relationship_page.confirmButton.click();
    }
}
