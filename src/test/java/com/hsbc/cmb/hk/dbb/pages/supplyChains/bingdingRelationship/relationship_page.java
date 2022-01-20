package com.hsbc.cmb.hk.dbb.pages.supplyChains.bingdingRelationship;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class relationship_page extends PageObject {

    @FindBy(xpath = "//span[text()='Customer Mapping']" )
    public WebElementFacade customerMapping;

    @FindBy(xpath = "//span[text()='Customers']")
    public WebElementFacade clickCustomersMenu;

    @FindBy(xpath = "//span[text()='Relationship Management']")
    public WebElementFacade checkMappingPage;

    @FindBy(xpath = "//input[@type='text']")
    public WebElementFacade SearchCompanyBox;

    @FindBy(xpath = "//span[@class='lls-input__suffix-inner']")
    public WebElementFacade findButton;

    @FindBy(xpath = "//span//button[@type='button']")
    public WebElementFacade editButton;

    @FindBy(xpath = "//div[@class='lls-page-header__button']//div[@class='btn-container']/div/button")
    public WebElementFacade createNewCounter;

    @FindBy(xpath = "//td[@title='s4@qq.com']/following-sibling::td[5]/child::div/child::div/child::span")
    public WebElementFacade deleteButton;

    @FindBy(xpath = "//span[@class='text-node-f2paac1o']")
    public WebElementFacade counterWindows;

    @FindBy(xpath = "//label[text()='Company Name']/following-sibling::div//input")
    public WebElementFacade inputCounterName;

    @FindBy(xpath = "//label[@class='lls-radio is-checked']")
    public WebElementFacade downstreamCompanyButton;

    @FindBy(xpath = "/html/body/div[2]/div/div[2]/div/div[2]/div/div[2]/button/span")
    public WebElementFacade confirmButton;

    @FindBy(xpath = "//div[@class='lls-scrollbar']//span[text()='s4@qq.com']")
    public WebElementFacade selectEmail;

    @FindBy(xpath = "//div[@class='lls-select-dropdown__wrap lls-scrollbar__wrap']//li[6]")
    public WebElementFacade EmailElement;
}
