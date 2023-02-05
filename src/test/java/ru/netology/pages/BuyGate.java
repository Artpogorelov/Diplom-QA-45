package ru.netology.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import ru.netology.data.Card;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.*;

public class BuyGate {
    private SelenideElement heading = $(withText("Оплата по карте"));
    private SelenideElement cardNumberField = $(byText("Номер карты")).parent().$("[class=\"input__control\"]");
    private SelenideElement monthField = $(byText("Месяц")).parent().$("[class=\"input__control\"]");
    private SelenideElement yearField = $(byText("Год")).parent().$("[class=\"input__control\"]");
    private SelenideElement cardHolderField = $(byText("Владелец")).parent().$("[class=\"input__control\"]");
    private SelenideElement cvvField = $(byText("CVC/CVV")).parent().$("[class=\"input__control\"]");
    private SelenideElement approvedOperation = $(byText("Операция одобрена Банком.")).parent().$("[class=\"notification__content\"]");
    private SelenideElement failureOperation = $(byText("Ошибка! Банк отказал в проведении операции.")).parent().$("[class=\"notification__content\"]");

    private final SelenideElement wrongFormatError = $("fieldset > div:nth-child(1) > span > span > span.input__sub");

    private ElementsCollection wrongFormat4Error = $$(byText("Неверный формат"));
    private SelenideElement cardExpirationDateError = $(byText("Неверно указан срок действия карты"));
    private SelenideElement cardExpiredError = $(byText("Истёк срок действия карты"));
    private SelenideElement requiredFieldError = $(byText("Поле обязательно для заполнения"));
    private SelenideElement cancelField = $$("[class=\"icon-button__text\"]").first();
    private SelenideElement continueButton = $$("button").find(exactText("Продолжить"));

    public BuyGate() {
        heading.shouldBe(visible);
    }

    public void inputData(Card card) {
        cardNumberField.setValue(card.getCardNumber());
        monthField.setValue(card.getMonth());
        yearField.setValue(card.getYear());
        cardHolderField.setValue(card.getCardHolder());
        cvvField.setValue(card.getCvv());
        continueButton.click();
    }

    public void sleepNotificationApproved() {
        sleep(4000);
        approvedOperation.shouldBe(visible);
        cancelField.click();
    }

    public void waitNotificationFailure() {
        failureOperation.shouldBe(visible);
    }

    public void waitNotificationWrongFormat() {
        sleep(4000);
        wrongFormatError.shouldBe(Condition.visible);
        cancelField.click();
    }

    public void waitNotificationExpirationDateError() {
        cardExpirationDateError.shouldBe(visible);
    }

    public void waitNotificationExpiredError() {
        sleep(4444);
        cardExpiredError.shouldHave(text("Неверный формат"));
        cancelField.click();
    }

    public void sleepNotificationWrongFormat4Fields() {
        wrongFormat4Error.shouldHave();
        requiredFieldError.shouldBe(visible);
    }
}