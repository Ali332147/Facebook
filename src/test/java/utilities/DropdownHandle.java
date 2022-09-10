package utilities;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DropdownHandle {

	
	public static void selectByVisibleText(WebElement element, String text) {
		if(text != ""){
		Select drop =  new Select(element);
		drop.selectByVisibleText(text);
		}
	
		}
	public static void selectByValue(WebElement element, String value) {
		Select drop = new Select(element);
		drop.selectByValue(value);
		}
}
