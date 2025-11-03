package com.demoqa.pages.forms;

import com.demoqa.pages.HomePage;
import org.openqa.selenium.By;

import static com.utilities.JavaScriptUtility.scrollToElementJS;

public class FormsPage extends HomePage {

    private By formMenuItem = By.xpath("//li[@id='item-0']/span[text()='Practice Form']");

    public PracticeFormPage clickPracticeForm() {
        scrollToElementJS(formMenuItem);
        click(formMenuItem);
        return new PracticeFormPage();
    }

}
