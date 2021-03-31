package com.testing.pageObjects.pages;

import org.openqa.selenium.By;

import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("/menu")
public class MenuPage extends WidgetsPage {
  // Locators ----------------------------------------------------------------------------------------------------------
  public static By MENU_TITLE = text("Menu");
  public static By MAIN_ITEM_1 = By.xpath("//a[text()='Main Item 1']");
  public static By MAIN_ITEM_2 = By.xpath("//a[text()='Main Item 2']");
  public static By MAIN_ITEM_3 = By.xpath("//a[text()='Main Item 3']");
  // Might be necessary to use a xpath selector
  public static By SUB_SUB_LIST = By.xpath("//a[text()='SUB SUB LIST »']");
  public static By SUB_SUB_ITEM_1 = By.xpath("//a[text()='Sub Sub Item 1']");
  public static By SUB_SUB_ITEM_2 = By.xpath("//a[text()='Sub Sub Item 2']");
  // Public methods ----------------------------------------------------------------------------------------------------
  public void waitForPageToLoad() {
    getElement(MENU_TITLE).waitUntilPresent();
    logWeAreOnPage();
  }
}
