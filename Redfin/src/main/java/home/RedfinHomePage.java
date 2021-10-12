package home;

import common.WebAPI;
import org.junit.After;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

import static home.AetnaWebElements.*;

public class AetnaHomePage extends WebAPI {
    // generic xpath for 5 elements in aetna home page:
    public void pathElement(String text){
        driver.findElement(By.xpath("//*[contains(text(),'" + text + "')]")).click();
    }
    public void getInitElement(){
        PageFactory.initElements(driver,AetnaHomePage.this);
    }
    @FindBy(how= How.XPATH,using=loginHomePageWebelement)
    public WebElement loginHome;
    @FindBy(how=How.XPATH,using = loginPageWebElement)
    public WebElement loginPage;
    @FindBy(how=How.ID,using=webElementSearch)
    public WebElement search;
    @FindBy(how=How.XPATH,using = webAetnaApps)
    public WebElement aetnaApps;
    @FindBy(how = How.XPATH,using = webCareers)
    public WebElement careers;
    @FindBy(how=How.XPATH,using = webFaqs)
    public WebElement faqs;
    @FindBy(how=How.XPATH,using = webGlossary)
    public WebElement glossary;
    @FindBy(how=How.XPATH,using = webAccessibilityService)
    public WebElement accessibilityService;
    @FindBy(how=How.XPATH,using = webPlanDisclosures)
    public WebElement planDisclosure;
    @FindBy(how=How.XPATH,using = webProgramProvision)
    public WebElement programProvision;
    @FindBy(how=How.XPATH,using = webStateDirectory)
    public WebElement stateDirectory;
    @FindBy(how=How.XPATH,using = webGrievenceForms)
    public WebElement grieveForms;
    @FindBy(how=How.XPATH,using = webHealthCareReform)
    public WebElement healthCareReform;
    @FindBy(how=How.XPATH,using = webNewsAndAnalysis)
    public WebElement newsAndAnalysis;
    @FindBy(how=How.XPATH,using = webInvestorInfo)
    public WebElement investorInfo;
    @FindBy(how=How.XPATH,using = webSiteMap)
    public WebElement siteMap;
    @FindBy(how=How.XPATH,using = webTermsOfUse)
    public WebElement termsOfUse;
    @FindBy(how=How.XPATH,using = webLegalNotices)
    public WebElement legalNotices;
    @FindBy(how=How.XPATH,using = webPrivacyCenter)
    public WebElement privacyCenter;
    public void openBrowerToAetna() throws IOException {
          openBrowser();
    }
    public void clickOnLoginButton() throws IOException {
        getInitElement();
      //  openBrowerToAetna();
        loginHome.click();
    }
    public void validateTitle() throws IOException, InterruptedException {
        clickOnLoginButton();
        Thread.sleep(3000);
        String actualTitle= driver.getTitle();
        System.out.println("the title is=====> "+actualTitle);
        Assert.assertEquals(expectedLoginTitle,actualTitle);
    }
    public void validateSearch(){
        getInitElement();
        //search.click();
    }
    public void doSearch(){
        validateSearch();
        search.sendKeys("medicaid"+ "\n");
    }
    public void doSearchList(String element) throws InterruptedException {
        getInitElement();
        search.sendKeys(element+ "\n");
        Thread.sleep(3000);
    }
    public void scrollDownToAetnaApps() throws InterruptedException {
        getInitElement();
        Thread.sleep(3000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
       js.executeScript("arguments[0].scrollIntoView();", aetnaApps);
        Thread.sleep(3000);
        aetnaApps.click();
    }
    public void validateAetnaAppsTitle() throws InterruptedException {
        scrollDownToAetnaApps();
        Thread.sleep(3000);
        String actualTitle=driver.getTitle();
        System.out.println("aetna apps Title =====> "+actualTitle);
        Assert.assertEquals(expectedAetnaAppsTitle,actualTitle);
    }
    public void scrollDownToFaqs() throws InterruptedException {
        getInitElement();
        Thread.sleep(3000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();",faqs );
        Thread.sleep(3000);
        faqs.click();
    }
    public void validateFaqsTitle() throws InterruptedException {
        scrollDownToFaqs();
        Thread.sleep(3000);
        String actualTitle=driver.getTitle();
        System.out.println("faqs Title =====> "+actualTitle);
         Assert.assertEquals(expectedFaqsTitle,actualTitle);
    }
    public void scrollDownToGlossary() throws InterruptedException {
        getInitElement();
        Thread.sleep(3000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();",glossary );
        Thread.sleep(3000);
        glossary.click();
    }
    public void validateGlossaryTitle() throws InterruptedException {
        scrollDownToGlossary();
        Thread.sleep(3000);
        String actualTitle=driver.getTitle();
        System.out.println("glossary Title =====> "+actualTitle);
         Assert.assertEquals(expectedGlossaryTitle,actualTitle);
    }
    public void scrollDowntoAccessibilityservice() throws InterruptedException {
        getInitElement();
        Thread.sleep(3000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();",accessibilityService );
        Thread.sleep(3000);
        accessibilityService.click();
    }
    public void validateAccessibilityServiceTitle() throws InterruptedException {
        scrollDowntoAccessibilityservice();
        Thread.sleep(3000);
        String actualTitle=driver.getTitle();
        System.out.println("accessibility service Title =====> "+actualTitle);
         Assert.assertEquals(expectedAccessibilityServiceTitle,actualTitle);
    }
    public void scrollDownToPlanDisclosure(){
        getInitElement();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();",planDisclosure );
        planDisclosure.click();
    }
    public void validatePlanDisclosureTitle() throws InterruptedException {
        scrollDownToPlanDisclosure();
        Thread.sleep(3000);
        String actualTitle=driver.getTitle();
        System.out.println("plan disclosure Title =====> "+actualTitle);
         Assert.assertEquals(expectedPlandisclosuresTitle,actualTitle);
    }
    public void scrollDownToProgramProvision() throws InterruptedException {
        getInitElement();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();",programProvision );
        Thread.sleep(3000);
        programProvision.click();
    }
    public void validateProgramProvisionTitle() throws InterruptedException {
        scrollDownToProgramProvision();
        Thread.sleep(3000);
        String actualTitle=driver.getTitle();
        System.out.println("program provision Title =====> "+actualTitle);
         Assert.assertEquals(expectedProgramProvisionTitle,actualTitle);
    }
   public void scrollDownToStateDirectory() throws InterruptedException {
        getInitElement();
       JavascriptExecutor js = (JavascriptExecutor) driver;
       js.executeScript("arguments[0].scrollIntoView();",stateDirectory );
       Thread.sleep(3000);
       stateDirectory.click();
   }
   public void validateStateDirectoryTitle() throws InterruptedException {
       scrollDownToStateDirectory();
       String actualTitle=driver.getTitle();
       System.out.println("state directory Title =====> "+actualTitle);
        Assert.assertEquals(expectedStateDirectoryTitle,actualTitle);
   }
   public void scrollDownToGrieveForms() throws InterruptedException {
        getInitElement();
       JavascriptExecutor js = (JavascriptExecutor) driver;
       js.executeScript("arguments[0].scrollIntoView();",grieveForms );
       Thread.sleep(3000);
       grieveForms.click();
   }
   public void validateGrieveFormsTitle() throws InterruptedException {
       String actualTitle=driver.getTitle();
       System.out.println("grieve forms Title =====> "+actualTitle);
        Assert.assertEquals(expectedGrievenceFormsTitle,actualTitle);
   }
   public void scrollDownToHealthReform() throws InterruptedException {
        getInitElement();
       JavascriptExecutor js = (JavascriptExecutor) driver;
       js.executeScript("arguments[0].scrollIntoView();",healthCareReform );
       Thread.sleep(3000);
       healthCareReform.click();
   }
   public void validateHealthCareReformTitle() throws InterruptedException {

       String actualTitle=driver.getTitle();
       System.out.println("health care reform Title =====> "+actualTitle);
        Assert.assertEquals(expectedHealthCareReform,actualTitle);
   }
   public void scrollDownToNewsAndAnalysis() throws InterruptedException {
        getInitElement();
       JavascriptExecutor js = (JavascriptExecutor) driver;
       js.executeScript("arguments[0].scrollIntoView();",newsAndAnalysis );
       Thread.sleep(3000);
       newsAndAnalysis.click();
   }
   public void validateNewsAndAnalysisTitle() throws InterruptedException {
       String actualTitle=driver.getTitle();
       System.out.println("new and analysis Title =====> "+actualTitle);
        Assert.assertEquals(expectedNewsAndAnalysisTitle,actualTitle);
   }
   public void scrollDownToInvestorInfo() throws InterruptedException {
        getInitElement();
       JavascriptExecutor js = (JavascriptExecutor) driver;
       js.executeScript("arguments[0].scrollIntoView();",investorInfo );
       Thread.sleep(3000);
       investorInfo.click();
   }
   public void validateInvestorInfoTitle(){
       String actualTitle=driver.getTitle();
       System.out.println("investor info Title =====> "+actualTitle);
        Assert.assertEquals(expectedInvestorInfo,actualTitle);
   }
   public void scrollDowntoSiteMap() throws InterruptedException {
        getInitElement();
       JavascriptExecutor js = (JavascriptExecutor) driver;
       js.executeScript("arguments[0].scrollIntoView();",siteMap );
       Thread.sleep(3000);
       siteMap.click();
   }
   public void validateSiteMapTitle(){
       String actualTitle=driver.getTitle();
       System.out.println("site map Title =====> "+actualTitle);
        Assert.assertEquals(expectedSiteMapTitle,actualTitle);
   }
   public void scrollDOwnToTermsOfUse() throws InterruptedException {
        getInitElement();
        JavascriptExecutor js=(JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();",termsOfUse);
        Thread.sleep(3000);
        termsOfUse.click();
   }
   public void validateTermsOfUseTitle(){
       String actualTitle=driver.getTitle();
       System.out.println("terms of use Title =====> "+actualTitle);
        Assert.assertEquals(expectedTermsOfUseTitle,actualTitle);
   }
   public void scrollDownToLegalNotices() throws InterruptedException {
       getInitElement();
       JavascriptExecutor js=(JavascriptExecutor) driver;
       js.executeScript("arguments[0].scrollIntoView();",legalNotices);
       Thread.sleep(3000);
       legalNotices.click();
   }
   public void validateLegalNoticesTitle(){
       String actualTitle=driver.getTitle();
       System.out.println("legal notices Title =====> "+actualTitle);
        Assert.assertEquals(expectedLegalNoticesTitle,actualTitle);
   }
   public void scrollDownToPrivacyCenter() throws InterruptedException {
        getInitElement();
       JavascriptExecutor js=(JavascriptExecutor) driver;
       js.executeScript("arguments[0].scrollIntoView();",privacyCenter);
       Thread.sleep(3000);
       privacyCenter.click();
   }
   public void validatePrivacyCenterTitle(){
       String actualTitle=driver.getTitle();
       System.out.println("legal notices Title =====> "+actualTitle);
        Assert.assertEquals(expectedPrivacyCenterTitle,actualTitle);
   }
}
