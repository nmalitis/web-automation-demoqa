package com.testing.pageObjects.pages;

import org.openqa.selenium.By;

import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("/modal-dialogs")
public class ModalDialogsPage extends AlertsFrameAndWindowsPage {
    // Locators ----------------------------------------------------------------------------------------------------------
    public static By MODAL_DIALOGS_TITLE = text("Modal Dialogs");
    public static By SMALL_MODAL_BUTTON = css("button[id='showSmallModal']");
    public static By LARGE_MODAL_BUTTON = css("button[id='showLargeModal']");
    public static By SMALL_MODAL_CLOSE_BUTTON = css("button[id='closeSmallModal']");
    public static By LARGE_MODAL_CLOSE_BUTTON = css("button[id='closeLargeModal']");
    public static By SMALL_MODAL = css("div[class=modal-body]");
    public static By LARGE_MODAL = css("div[class=modal-body]");
    // Public methods ----------------------------------------------------------------------------------------------------
    public void waitForPageToLoad() {
        getElement(ALERTS_FRAME_AND_WINDOWS).waitUntilPresent();
        logWeAreOnPage();
    }
}
