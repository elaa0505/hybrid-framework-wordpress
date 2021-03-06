package pageObjects;

import org.openqa.selenium.WebDriver;

import Commons.BasePage;
import PageUIs.UserCustomerInfoPageUI;

public class UserCustomerInfoPO extends BasePage{
	WebDriver driver;
	
	public UserCustomerInfoPO(WebDriver driver) {
		this.driver = driver;
	}

	public boolean isGenderMaleRadioButtonSelected() {
		waitForElementVisible(driver, UserCustomerInfoPageUI.GENDER_MALE_RADIO_BUTTON);
		return isElementSelected(driver, UserCustomerInfoPageUI.GENDER_MALE_RADIO_BUTTON);
	}

	public String getFirstNameTextboxValue() {
		waitForElementVisible(driver, UserCustomerInfoPageUI.FIRSTNAME_TEXTBOX);
		return getElementAttribute(driver, UserCustomerInfoPageUI.FIRSTNAME_TEXTBOX, "value");
	}

	public String getLastNameTextboxValue() {
		waitForElementVisible(driver, UserCustomerInfoPageUI.LASTNAME_TEXTBOX);
		return getElementAttribute(driver, UserCustomerInfoPageUI.LASTNAME_TEXTBOX, "value");
	}
	
	public String getSelectedTextInDaydropdown() {
		waitForElementVisible(driver, UserCustomerInfoPageUI.DAY_DROPDOWN);
		return getSelectItemInDropdown(driver, UserCustomerInfoPageUI.DAY_DROPDOWN);
	}

	public String getSelectedTextInMonthdropdown() {
		waitForElementVisible(driver, UserCustomerInfoPageUI.MONTH_DROPDOWN);
		return getSelectItemInDropdown(driver, UserCustomerInfoPageUI.MONTH_DROPDOWN);
	}

	public String getSelectedTextInYeardropdown() {
		waitForElementVisible(driver, UserCustomerInfoPageUI.YEAR_DROPDOWN);
		return getSelectItemInDropdown(driver, UserCustomerInfoPageUI.YEAR_DROPDOWN);
	}

	public String getEmailTextboxValue() {
		waitForElementVisible(driver, UserCustomerInfoPageUI.EMAIL_TEXTBOX);
		return getElementAttribute(driver, UserCustomerInfoPageUI.EMAIL_TEXTBOX, "value");
	}

	public String getCompanyTextboxValue() {
		waitForElementVisible(driver, UserCustomerInfoPageUI.COMPANY_TEXTBOX);
		return getElementAttribute(driver, UserCustomerInfoPageUI.COMPANY_TEXTBOX, "value");
	}

	public boolean isNewsLetterCheckboxSelected() {
		waitForElementVisible(driver, UserCustomerInfoPageUI.NEWSLETTER_CHECKBOX);
		return isElementSelected(driver, UserCustomerInfoPageUI.NEWSLETTER_CHECKBOX);
	}

	public UserHomePO clickToLogoutLink() {
		waitForElementClickable(driver, UserCustomerInfoPageUI.LOGOUT_LINK);
		clickToElement(driver, UserCustomerInfoPageUI.LOGOUT_LINK);
		return GeneratorManagerPage.getUserHomepage(driver);
	}



}
