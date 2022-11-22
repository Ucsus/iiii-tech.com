package com.iiiitech;

import com.codeborne.selenide.CollectionCondition;
import com.iiiitech.page.SiteElements;
import io.qameta.allure.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;
import static com.iiiitech.TestData.*;
import static io.qameta.allure.Allure.step;

public class SitePageTest extends TestBase {
    private final SiteElements siteElements = new SiteElements();

    @Test
    @Feature("Тест главной страницы")
    @Story("Проверяем заголовок")
    @Owner("Ucsus")
    @Severity(SeverityLevel.BLOCKER)
    @Link(value = "iiii-tech.com", url = "https://iiii-tech.com")
    @DisplayName("Проверка заголовка")

    public void headerTest() {
        step("Открываем главную страницу", () -> {
            siteElements.openPage();
        });
        step("Проверяем заголовок", () -> {
            $(".hero-main__heading").shouldHave(text("Технологии будущего для настоящего"));
        });
    }

    @DisplayName("Проверка блока 'Задать Вопрос'")
    @Test
    public void askAQuestion() {
        step("Открываем главную страницу", () -> {
            siteElements.openPage();
        });
        step("Нажимаем на кнопку 'Задать Вопрос'", () -> {
            $(byText("Задать вопрос")).click();
        });
        step("Проверяем видимость формы", () -> {
            $(".modal-form").shouldBe(visible);
        });
        step("Заполняем форму", () -> {
            siteElements
                    .setFirstName(firstName)
                    .setLastName(lastName)
                    .setCompany(company)
                    .setJobPosition(jobPosition)
                    .setEmail(email)
                    .setPhone(phoneNumber)
                    .setQuestion(question);
//            .clickSubmit();
            sleep(1000);
        });
    }

    @DisplayName("Проверка подменю")
    @Test
    public void submenuTest() {
        step("Открываем главную страницу", () -> {
            siteElements.openPage();
        });
        step("Кликаем на меню 'Сервисы'", () -> {
            $("[data-target=submenu-1]").click();
        });
        step("Кликаем на меню 'Тестирование программного обеспечения'", () -> {
            $("[data-sub-target=sub-8]").click();
        });
        step("Проверяем наличие меню 'Автоматизация тестрирования'", () -> {
            $("[data-sub-id=sub-8] .menu__sub-items .menu__sub-text", 2)
                    .shouldHave(text("Автоматизация тестрирования"));
        });
    }

    @DisplayName("Проверка соцсетей в футере")
    @Test
    public void footerSocialsTest() {
        step("Открываем главную страницу", () -> {
            siteElements.openPage();
        });
        step("Скроллим вниз", () -> {
            $(".footer").scrollTo();
        });
        step("Проверяем ссылки на соц.сети", () -> {
            $$(".footer__socials a").
                    shouldHave(CollectionCondition.texts(
                            "linkedin",
                            "zen.yandex",
                            "vkontakte",
                            "youtube",
                            "telegram"));
        });
    }

    @DisplayName("Проверка шэринга статей")
    @Test
    public void articlesSharingTest() {
        step("Открываем главную страницу", () -> {
            siteElements.openPage();
        });
        step("Открываем статью 'Облачная архитектура: 9 самых важных тенденций на 2022 год'", () -> {
            $(".block-media__card", 1).click();
        });
        step("Проверяем заголовок", () -> {
            $(".hero-news__title").shouldBe(exactText("Облачная архитектура: 9 самых важных тенденций на 2022 год"));
        });
        step("Скроллим к блоку статьи", () -> {
            $(".article-layout__content").scrollTo();
        });
        step("Проверяем видимость кнопок шэринга", () -> {
            $(".share__content").shouldBe(visible);
        });
        step("Шарим в вконтакте", () -> {
            $(".ya-share2__container a").shouldHave(text("Вконтакте")).click();
            switchTo().window(1).close();
            switchTo().window(0);
        });
        step("Шарим в одноклассниках", () -> {
            $(".ya-share2__container a", 1).shouldHave(text("Одноклассники")).click();
            switchTo().window(1).close();
            switchTo().window(0);
        });
        step("Шарим в телеграме", () -> {
            $(".ya-share2__container a", 2).shouldHave(text("Telegram")).click();
            switchTo().window(1).close();
            switchTo().window(0);
        });

    }
}
