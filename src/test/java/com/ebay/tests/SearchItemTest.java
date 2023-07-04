package com.ebay.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SearchItemTest extends TestBase{

    @Test
    public void searchItem(){

        app.getSelect().selectDepartment("Elektronik");

        app.getSelect().selectCategoryType("1");

        app.getSelect().selectCategoryType("1");

        String secondItemName = app.getItem().getItemName("2");
        System.out.println(secondItemName);

        app.getItem().fillSearchBar (secondItemName);


        String firstItemName = app.getItem().getFirstItemName("2");

       Assert.assertTrue(firstItemName.contains(secondItemName));

        //Assert.assertEquals(firstItemName, secondItemName);

    }


}
