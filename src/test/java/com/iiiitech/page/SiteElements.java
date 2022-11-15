package com.iiiitech.page;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class SiteElements {
    private final SelenideElement
            firstNameImput = $("[name=form_text_176]"),
            lastNameInput = $("[name=form_text_177]"),
            companyInput = $("[name=form_text_178]"),
            jobPositionInput = $("[name=form_text_179]"),
            emailInput = $("[name=form_email_180]"),
            phoneInput = $("[name=form_text_181]"),
            questionInput = $("[name=form_textarea_182]"),
            submitButton = $(".modal-form__submit");


    public SiteElements openPage() {
        open("/");
//        $(byText("Хорошо")).click();
        return this;
    }

    public SiteElements setFirstName(String value) {
        firstNameImput.setValue(value);
        return this;
    }

    public SiteElements setLastName(String value) {
        lastNameInput.setValue(value);
        return this;
    }

    public SiteElements setCompany(String value) {
        companyInput.setValue(value);
        return this;
    }

    public SiteElements setJobPosition(String value) {
        jobPositionInput.setValue(value);
        return this;
    }

    public SiteElements setEmail(String value) {
        emailInput.setValue(value);
        return this;
    }

    public SiteElements setPhone(String value) {
        phoneInput.setValue(value);
        return this;
    }

    public SiteElements setQuestion(String value) {
        questionInput.setValue(value);
        return this;
    }

    public SiteElements clickSubmit() {
        submitButton.click();

        return this;
    }
}
