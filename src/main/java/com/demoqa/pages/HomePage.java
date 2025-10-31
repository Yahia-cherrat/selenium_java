package com.demoqa.pages;

import com.demoqa.pages.forms.FormsPage;
import com.base.BasePage;
import org.openqa.selenium.By;

import static com.utilities.JavaScriptUtility.scrollToElementJS;

public class HomePage extends BasePage {

    private By formsCrad = By.xpath("//div[@id='app']//h5[text()='Forms']");

    public FormsPage goToForms() {
        scrollToElementJS(formsCrad);
        click(formsCrad);
        return new FormsPage();
    }

}
