package pages;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class dispensary_Pages extends StartupPage {

// Write the required locators here
	
	String pageName = this.getClass().getSimpleName();
	public dispensary_Pages(WebDriver driver) {
		super(driver);
	}
	
	/**@Test 1.1
	 * This method logs in to the Health App using the given valid credentials.
	 * 
	 * @param : A map containing "username" and "password" as keys.
	 * @description Enters the username and password into their respective text fields, 
	 *              clicks on the sign-in button, and verifies if the registered patient text is displayed.
	 * @return boolean - Returns true if the registered patient text is displayed, otherwise false.
	 * @author Yaksha
	 * @throws Exception If any issue occurs during execution.
	 */
	public boolean loginToHealthAppByGivenValidCredetial(Map<String, String> expectedData) throws Exception {
//	Write your logic here
		return false;
	}

	/** @Test1.2
	 * This method retrieves and verifies the title of the current page.
	 * 
	 * @description Fetches the title of the currently loaded web page.
	 * @return String - Returns the title of the page.
	 * @author Yaksha
	 * @throws Exception If any issue occurs while retrieving the title.
	 */
	public String verifyTitleOfThePage() throws Exception {
//		Write your logic here
			return null;
	}

	/**@Test 1.3
	 * This method retrieves and verifies the URL of the current page.
	 * 
	 * @description Fetches the current page's URL and prints it in the console.
	 * @return String - Returns the URL of the page.
	 * @author Yaksha
	 * @throws Exception If any issue occurs while retrieving the URL.
	 */

	public String verifyURLOfThePage() throws Exception {
//		Write your logic here
			return null;
	}


	/**@Test2
	 * This method verifies whether the Dispensary module is present on the page.
	 * 
	 * @description Checks if the Dispensary module is displayed and returns the result.
	 * @return boolean - Returns true if the Dispensary module is present, otherwise false.
	 * @author Yaksha
	 * @throws Exception If any issue occurs during execution.
	 */

	public Boolean verifyDispensaryModuleIsPresentOrNot() throws Exception {
//		Write your logic here
			return false;
	}
	
	/**@Test3
	 * This method verifies that all sub-modules under the "Dispensary" module are present and 
	 * then clicks on the "Dispensary" module.
	 * 
	 * @description Checks if the "Dispensary" module is displayed, expands it using the toggle, 
	 *              verifies the presence of all sub-modules, and then clicks on the "Dispensary" module.
	 * @return boolean - Returns true if all sub-modules are displayed successfully, otherwise false.
	 * @author Yaksha
	 * @throws Exception If any issue occurs during execution.
	 */
	public Boolean verifyAllSubModulesArePresentAndClickOnDispensary() throws Exception {
//		Write your logic here
			return false;
	}


	/**@Test4
	 * This method scrolls to the bottom of the "Sale" page if required and verifies the presence 
	 * of specific buttons and text elements.
	 * 
	 * @description Clicks on the "Morning Counter," scrolls to the "Credit Limits and Balance" text, 
	 *              and verifies the presence of the "Print Invoice" button, "Discard" button, 
	 *              "Invoice History" text, and "Credit Limits and Balance" text.
	 * @return boolean - Returns true if all elements are displayed successfully, otherwise false.
	 * @author Yaksha
	 * @throws Exception If any issue occurs during execution.
	 */

	public Boolean scrollToButtomAndVerifytheFields() throws Exception {
//		Write your logic here
			return false;
	}



	/**@Test5
	 * This method performs a keyboard operation (Alt + N) to open the "Add New Patient" popup 
	 * and retrieves its title.
	 * 
	 * @description Simulates the Alt + N keyboard shortcut, verifies if the "Add New Patient" 
	 *              popup is displayed, and fetches the title of the popup.
	 * @return String - Returns the title of the "Add New Patient" page.
	 * @author Yaksha
	 * @throws Exception If any issue occurs during execution.
	 */
	public String performTheKeyboardOperationToOpenthePopup() throws Exception {
//		Write your logic here
			return null;
	}


	/**@Test6
	 * This method validates the error message displayed in the First Name text field.
	 * 
	 * @description Clicks the "OK" button without filling any information, waits for a few seconds, 
	 *              retrieves the error message from the First Name text field, and returns it.
	 * @return String - Returns the error message text if present, otherwise an empty string.
	 * @author Yaksha
	 * @throws Exception If any issue occurs during execution.
	 */

	public String validateErrorMessageInFirstnameTextfield() throws Exception {
//		Write your logic here
			return null;
	}

	/**@Test7.1
	 * This method fills the First Name text field and verifies that the First Name is entered correctly.
	 * 
	 * @param expectedData A map containing the "firstName" key with the value to be entered.
	 * @description Checks if the First Name text field is displayed, enters the provided First Name, 
	 *              retrieves the entered value, and verifies it.
	 * @return String - Returns the entered First Name value.
	 * @author Yaksha
	 * @throws Exception If any issue occurs during execution.
	 */
	public String fillfirstNameTextFieldVerifyTheFirstName(Map<String, String> expectedData) throws Exception {
//		Write your logic here
			return null;
	}

	/**
	 * @Test7.2  
	 * This method fills the Middle Name text field and verifies that the middle name is entered correctly.  
	 *  
	 * @param expectedData A `Map<String, String>` object containing "middleName" as a key,  
	 *                     with the value retrieved from the test data source.  
	 * @description Checks if the Middle Name text field is displayed, enters the provided middle name,  
	 *              retrieves the entered value, and verifies it.  
	 * @return String - Returns the entered Middle Name value.  
	 * @author Yaksha  
	 * @throws Exception If any issue occurs during execution.  
	 */

	public String fillmiddelNameTextFieldVerifyThemiddleName(Map<String, String> expectedData) throws Exception {
//		Write your logic here
			return null;
	}


	/**@Test7.3
	 * This method fills the Last Name text field and verifies that the last name is entered correctly.  
	 *  
	 * @param expectedData A `Map<String, String>` object containing "lastName" as a key,  
	 *                     with the value retrieved from the test data source.  
	 * @description Checks if the Last Name text field is displayed, enters the provided last name,  
	 *              retrieves the entered value, and verifies it.  
	 * @return String - Returns the entered Last Name value.  
	 * @author Yaksha  
	 * @throws Exception If any issue occurs during execution.  
	 */

	public String filllastNameTextfieldVerifylastName(Map<String, String> expectedData) throws Exception {
//		Write your logic here
			return null;
	}

	/**@Test7.4
	 * This method fills the Age text field and verifies that the age is entered correctly.  
	 *  
	 * @param expectedData A `Map<String, String>` object containing "age" as a key,  
	 *                     with the value retrieved from the test data source.  
	 * @description Checks if the Age text field is displayed, enters the provided age,  
	 *              retrieves the entered value, and verifies it.  
	 * @return String - Returns the entered Age value.  
	 * @author Yaksha  
	 * @throws Exception If any issue occurs during execution.  
	 */
	public String fillAgeTextFieldVerifyTheAge(Map<String, String> expectedData) throws Exception {
//		Write your logic here
			return null;
	}

	/**@Test7.5
	 * This method fills the Contact Number text field and verifies that the contact number is entered correctly.  
	 *  
	 * @param expectedData A `Map<String, String>` object containing "contact" as a key,  
	 *                     with the value retrieved from the test data source.  
	 * @description Checks if the Contact Number text field is displayed, enters the provided contact number,  
	 *              retrieves the entered value, and verifies it.  
	 * @return String - Returns the entered Contact Number value.  
	 * @author Yaksha  
	 * @throws Exception If any issue occurs during execution.  
	 */

	public String fillContactNumberTextFieldVerifyContactNumber(Map<String, String> expectedData) throws Exception {
//		Write your logic here
			return null;
	}	

	/**
	 * @Test8  
	 * This method validates the confirmation message on the "New Consumption Entry" page.  
	 *  
	 * @param null - No parameters required.  
	 * @description Navigates to the "New Consumption Entry" page, initiates a new entry,clicks the save button, and verifies the confirmation message  
	 *              "Are you sure you want to proceed?".  
	 * @return String - Returns the confirmation message text.  
	 * @author Yaksha  
	 * @throws Exception If any issue occurs during execution.  
	 */

	public String validateTheConfirmMessageOnTheNewConsumptionEntryPage() throws Exception {
//		Write your logic here
			return null;
	}


	/**
	 * @Test9  
	 * This method selects "Main Store" from the "Filter by Store" dropdown on the Stock page  
	 * and verifies that the selection is applied correctly.  
	 *  
	 * @param null - No parameters required.  
	 * @description Navigates to the Stock page, selects "Main Store" from the  
	 *              "Filter by Store" dropdown, and ensures that the stock values  
	 *              are filtered based on the selected store.  
	 * @return Boolean - Returns true if "Main Store" is successfully selected, otherwise false.  
	 * @author Yaksha  
	 * @throws Exception If any issue occurs during execution.  
	 */

	public Boolean selectMainStoreFromFilter() throws Exception {
//		Write your logic here
			return false;
	}

}
