package com.ebay.fw;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SelectHelper extends BaseHelper{

    public SelectHelper(WebDriver driver) {
        super(driver);
    }

    public void selectDepartment(String department) {
        jumpDown();
        click(By.xpath("(//a[.='" + department+"'])[1]"));
    }

    public void selectCategoryType(String type) {
        click(By.cssSelector(".b-visualnav__tile:nth-child("+ type +")"));
    }


}
