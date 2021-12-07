package com.crowdar.examples.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

public class TeluHomePage extends PageBaseTelular {

    
    private final  String BTN_SYSTEMTOOL_Xpath = "/html/body/div[2]/div/dl/dt[10]";
    private final String BTN_RESTART_PANEL_XPATH= "/html/body/div[2]/div/dl/dd[10]/ul/li[9]/a";
    private final String BTN_RESTART_FINAL_XPATH= "/html/body/form/table[4]/tbody/tr[2]/td[3]/input";


    public TeluHomePage(RemoteWebDriver driver) {
        super(driver);
        this.url = ""; //here you can define the custom paths For example:"/search" --> www.googe.com/search
    }

    public void go() {
        navigateToCompleteURL();
    }


   public void restartTelu(){
        clickElement(By.xpath(BTN_SYSTEMTOOL_Xpath));
        clickElement(By.xpath(BTN_RESTART_PANEL_XPATH));
        clickElement(By.xpath(BTN_RESTART_FINAL_XPATH));
   }


}
