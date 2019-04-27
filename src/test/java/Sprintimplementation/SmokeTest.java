/**
 * 
 */
package Sprintimplementation;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

import Utilities.coreutil;

/**
 * @author sahan
 *This class will contain all testng test annotation where we
  will conduct our test cases.
 */
public class SmokeTest extends coreutil{

	@Test
	public void  smoketest1_1() {
		
		openBrowser();
		goToWebApp();
		closeBrowser();
	}
}
