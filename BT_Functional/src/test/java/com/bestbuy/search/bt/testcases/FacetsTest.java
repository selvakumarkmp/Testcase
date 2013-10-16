package com.bestbuy.search.bt.testcases;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.bestbuy.search.bt.Screens.BaseScreen;
import com.bestbuy.search.bt.Screens.FacetsScreen;
import com.bestbuy.search.bt.Screens.LoginScreen;
import com.bestbuy.search.bt.model.Facets.Facet;
import com.bestbuy.search.bt.selenium.util.ScreenException;
import com.bestbuy.search.bt.uiconstants.MerchandisingUI_UserInfo;
import com.bestbuy.search.bt.uiconstants.MerchandisingUIIdentifiers;
import com.bestbuy.search.bt.uiconstants.Env_Config;
import com.bestbuy.search.bt.uiconstants.ReadCreateAndUpdateData;

/**
 * This class is to Test the major functionalities of the Facets Tab
 */

public class FacetsTest extends ReadCreateAndUpdateData {

	private static String selectedBrowser;
	private static MerchandisingUI_UserInfo merchUserInfo;
	private static MerchandisingUIIdentifiers merchUI;
	private static Env_Config merchEnv;
	private static FacetsScreen facetsScreen;
	private String methodName;
	private static BaseScreen baseScreen;
	private static LoginScreen loginBaseScreen;
	private static ReadCreateAndUpdateData readcreatedata;

	/**
	 * @BeforeTest:The annotated method will be run before any test method
	 *                 belonging to the classes inside the <test> tag is run
	 *                 This method is to instantiate the browser session
	 */

	@BeforeTest
	public static void setUp() throws Exception {

		merchEnv = new Env_Config();
		merchUserInfo = new MerchandisingUI_UserInfo();
		merchUI = new MerchandisingUIIdentifiers();
		facetsScreen = new FacetsScreen();
		loginBaseScreen = new LoginScreen();
		readcreatedata = new ReadCreateAndUpdateData();

		try {
			launchingBrowser();
		} catch (Exception e) {

			e.printStackTrace();
		}

	}

	/**
	 * This method is called in the setUp method which instantiates the browser
	 * session
	 */
	public static void launchingBrowser() throws Exception {

		String applicationURL = merchEnv.getProtocol() + "://"
				+ merchEnv.getHost() + ":" + merchEnv.getPort() + "/";
		selectedBrowser = merchEnv.getBrowser();
		try {
			baseScreen = new BaseScreen(selectedBrowser, applicationURL,
					merchEnv.getContext(), merchEnv, merchUserInfo, merchUI);
		} catch (ScreenException e) {

			e.printStackTrace();
		}

	}

	@Test
	public void testValidLogin() throws InterruptedException, IOException,
			Exception {
		try {

			System.out.println("Executing ValidLogin Testcase");
			methodName = Thread.currentThread().getStackTrace()[1]
					.getMethodName();
			loginBaseScreen.validLogin(methodName);

		} catch (Exception t) {
			t.printStackTrace();

		}
	}

	/**
	 * @Test: Makes a class or a method as part of the test This method Log into
	 *        the Application and Tests the Add & update functionality of the
	 *        Facets Tab
	 */

	@Test(dataProvider = "facetsdata", dataProviderClass = com.bestbuy.search.bt.uiconstants.TestDataProvider.class)
	public void testAddFacets(Facet facet) throws InterruptedException,
			IOException, Exception {
		try {

			System.out.println("Executing testAddFacets Testcases");
			methodName = Thread.currentThread().getStackTrace()[1]
					.getMethodName();
			facetsScreen.selectFacetsTab(methodName);
			readcreatedata.loadFacetsCreateAndUpdateData(methodName, facet);

		} catch (Exception t) {
			t.printStackTrace();

		}
	}

	@Test(dataProvider = "facetsdata1", dataProviderClass = com.bestbuy.search.bt.uiconstants.TestDataProvider.class)
	public void testAddFacets1(Facet facet) throws InterruptedException,
			IOException, Exception {
		try {

			System.out.println("Executing testAddFacets Testcases");
			methodName = Thread.currentThread().getStackTrace()[1]
					.getMethodName();
			readcreatedata.loadFacetsCreateAndUpdateData(methodName, facet);

		} catch (Exception t) {
			t.printStackTrace();

		}
	}

	@Test(dataProvider = "facetsdata2", dataProviderClass = com.bestbuy.search.bt.uiconstants.TestDataProvider.class)
	public void testAddFacets2(Facet facet) throws InterruptedException,
			IOException, Exception {
		try {

			System.out.println("Executing testAddFacets Testcases");
			methodName = Thread.currentThread().getStackTrace()[1]
					.getMethodName();
			readcreatedata.loadFacetsCreateAndUpdateData(methodName, facet);

		} catch (Exception t) {
			t.printStackTrace();

		}
	}

	@Test(dataProvider = "facetsdata3", dataProviderClass = com.bestbuy.search.bt.uiconstants.TestDataProvider.class)
	public void testAddFacets3(Facet facet) throws InterruptedException,
			IOException, Exception {
		try {

			System.out.println("Executing testAddFacets Testcases");
			methodName = Thread.currentThread().getStackTrace()[1]
					.getMethodName();
			readcreatedata.loadFacetsCreateAndUpdateData(methodName, facet);

		} catch (Exception t) {
			t.printStackTrace();

		}
	}

	@Test(dataProvider = "facetsupdatedata", dataProviderClass = com.bestbuy.search.bt.uiconstants.TestDataProvider.class)
	public void testFacetsValidUpdate(Facet facet) throws InterruptedException,
			IOException, Exception {
		try {

			System.out.println("Executing testFacetsValidUpdate Testcases");
			methodName = Thread.currentThread().getStackTrace()[1]
					.getMethodName();

			facetsScreen.facetsValidUpdate(methodName, facet);

		} catch (Exception t) {
			t.printStackTrace();

		}
	}

	/**
	 * @Test: Makes a class or a method as part of the test This method Log into
	 *        the Application and Tests the update functionality of the Facets
	 *        Tab with invalid data
	 */

	public void testFacetsInvalidUpdate() throws InterruptedException,
			IOException, Exception {
		try {

			System.out.println("Executing testFacetsInvalidUpdate Testcases");
			methodName = Thread.currentThread().getStackTrace()[1]
					.getMethodName();

			facetsScreen.facetsInvalidUpdate(methodName);

		} catch (Exception t) {
			t.printStackTrace();

		}
	}

	/**
	 * @Test: Makes a class or a method as part of the test This method Log into
	 *        the Application and Tests the approve functionality of the Facets
	 *        Tab
	 */

	@Test(dataProvider = "facetsdata", dataProviderClass = com.bestbuy.search.bt.uiconstants.TestDataProvider.class)
	public void testApproveFacets(Facet facet) throws InterruptedException,
			IOException, Exception {
		try {

			System.out.println("Executing testApproveFacets Testcases");
			methodName = Thread.currentThread().getStackTrace()[1]
					.getMethodName();

			facetsScreen.approveFacets(methodName, facet);

		} catch (Exception t) {
			t.printStackTrace();

		}
	}

	/**
	 * @Test: Makes a class or a method as part of the test This method Log into
	 *        the Application and Tests the reject functionality of the Facets
	 *        Tab
	 */

	@Test(dataProvider = "facetsdata", dataProviderClass = com.bestbuy.search.bt.uiconstants.TestDataProvider.class)
	public void testRejectFacets(Facet facet) throws InterruptedException,
			IOException, Exception {
		try {

			System.out.println("Executing testRejectFacets Testcases");
			methodName = Thread.currentThread().getStackTrace()[1]
					.getMethodName();

			facetsScreen.rejectFacets(methodName, facet);

		} catch (Exception t) {
			t.printStackTrace();

		}
	}

	/**
	 * @Test: Makes a class or a method as part of the test This method Log into
	 *        the Application and Tests the search functionality of the Facets
	 *        Tab with the valid data
	 */

	@Test
	public void testFacetsSystemName() throws InterruptedException,
			IOException, Exception {
		try {

			System.out.println("Executing testFacetsSystemName Testcases");
			methodName = Thread.currentThread().getStackTrace()[1]
					.getMethodName();

			facetsScreen.searchFacetsSystemName(methodName);

		} catch (Exception t) {
			t.printStackTrace();

		}
	}

	/**
	 * @Test: Makes a class or a method as part of the test This method Log into
	 *        the Application and Tests the search functionality of the Facets
	 *        Tab with the Invalid data
	 */

	@Test
	public void testInvalidFacetsSearch() throws InterruptedException,
			IOException, Exception {
		try {

			System.out.println("Executing testInvalidFacetsSearch Testcases");
			methodName = Thread.currentThread().getStackTrace()[1]
					.getMethodName();

			facetsScreen.invalidFacetsSearch(methodName);

		} catch (Exception t) {
			t.printStackTrace();

		}
	}

	/**
	 * @Test: Makes a class or a method as part of the test This method Log into
	 *        the Application and Tests the search functionality of the Facets
	 *        Tab with the Invalid data
	 */

	@Test(dataProvider = "facetsdata", dataProviderClass = com.bestbuy.search.bt.uiconstants.TestDataProvider.class)
	public void testDeleteFacets(Facet facet) throws InterruptedException,
			IOException, Exception {
		try {

			System.out.println("Executing testDeleteFacets Testcases");
			methodName = Thread.currentThread().getStackTrace()[1]
					.getMethodName();

			facetsScreen.deleteFacets(methodName, facet);

		} catch (Exception t) {
			t.printStackTrace();

		}
	}

	@Test(dataProvider = "facetsdata1", dataProviderClass = com.bestbuy.search.bt.uiconstants.TestDataProvider.class)
	public void testDeleteFacets1(Facet facet) throws InterruptedException,
			IOException, Exception {
		try {

			System.out.println("Executing testDeleteFacets Testcases");
			methodName = Thread.currentThread().getStackTrace()[1]
					.getMethodName();

			facetsScreen.deleteFacets(methodName, facet);

		} catch (Exception t) {
			t.printStackTrace();

		}
	}

	@Test(dataProvider = "facetsdata2", dataProviderClass = com.bestbuy.search.bt.uiconstants.TestDataProvider.class)
	public void testDeleteFacets2(Facet facet) throws InterruptedException,
			IOException, Exception {
		try {

			System.out.println("Executing testDeleteFacets Testcases");
			methodName = Thread.currentThread().getStackTrace()[1]
					.getMethodName();

			facetsScreen.deleteFacets(methodName, facet);

		} catch (Exception t) {
			t.printStackTrace();

		}
	}

	@Test(dataProvider = "facetsdata3", dataProviderClass = com.bestbuy.search.bt.uiconstants.TestDataProvider.class)
	public void testDeleteFacets3(Facet facet) throws InterruptedException,
			IOException, Exception {
		try {

			System.out.println("Executing testDeleteFacets Testcases");
			methodName = Thread.currentThread().getStackTrace()[1]
					.getMethodName();

			facetsScreen.deleteFacets(methodName, facet);

		} catch (Exception t) {
			t.printStackTrace();

		}
	}

	/**
	 * @Test: Makes a class or a method as part of the test This method Log into
	 *        the Application and Tests the show All and hide All functionality
	 *        of the Facets Tab
	 */

	@Test
	public void testShowOrHideAllFacets() throws InterruptedException,
			IOException, Exception {
		try {

			System.out.println("Executing testShowOrHideAllFacets Testcases");
			methodName = Thread.currentThread().getStackTrace()[1]
					.getMethodName();

			facetsScreen.showOrHideAllFacets(methodName);

		} catch (Exception t) {
			t.printStackTrace();

		}
	}

	/**
	 * @Test: Makes a class or a method as part of the test This method Log into
	 *        the Application and Tests the sort and refresh functionality of
	 *        the Facets Tab
	 */

	@Test
	public void testSortnRefreshFacets() throws InterruptedException,
			IOException, Exception {
		try {

			System.out.println("Executing testSortnRefreshFacets Testcases");
			methodName = Thread.currentThread().getStackTrace()[1]
					.getMethodName();

			facetsScreen.sortnRefreshFacets(methodName);
		} catch (Exception t) {
			t.printStackTrace();

		}
	}

	/**
	 * @Test: Makes a class or a method as part of the test This method Log into
	 *        the Application and Tests the pagination functionality of the
	 *        Facets Tab
	 */

	@Test
	public void testPagiNationForFacets() throws InterruptedException,
			IOException, Exception {
		try {

			System.out.println("Executing testPagiNationForFacets Testcases");
			methodName = Thread.currentThread().getStackTrace()[1]
					.getMethodName();

			facetsScreen.pagiNationForFacetsPage(methodName);

		} catch (Exception t) {
			t.printStackTrace();

		}
	}

	@Test
	public void testVerifyFacetsCreatePopUpTextFieldsValidation()
			throws InterruptedException, IOException, Exception {
		try {

			System.out.println("Executing testPagiNationForFacets Testcases");
			methodName = Thread.currentThread().getStackTrace()[1]
					.getMethodName();

			facetsScreen.verifyCreatePopUpTextFieldsValidation(methodName);

		} catch (Exception t) {
			t.printStackTrace();

		}
	}

	@Test
	public void testVerifyFacetsEditPopUpTextFieldsValidation()
			throws InterruptedException, IOException, Exception {
		try {

			System.out.println("Executing testPagiNationForFacets Testcases");
			methodName = Thread.currentThread().getStackTrace()[1]
					.getMethodName();

			facetsScreen.verifyEditPopUpTextFieldsValidation(methodName);

		} catch (Exception t) {
			t.printStackTrace();

		}
	}

	@Test
	public void testverifyFacetsValueOrder() throws InterruptedException,
			IOException, Exception {
		try {

			System.out.println("Executing testPagiNationForFacets Testcases");
			methodName = Thread.currentThread().getStackTrace()[1]
					.getMethodName();

			facetsScreen.verifyFacetsValueOrder(methodName);

		} catch (Exception t) {
			t.printStackTrace();

		}
	}
	
	
	@Test(dataProvider = "sprint21facetcreatedata", dataProviderClass = com.bestbuy.search.bt.uiconstants.TestDataProvider.class)
	public void testSprint21_AddFacets(Facet facet) throws InterruptedException,
			IOException, Exception {
		try {

			System.out.println("Executing testAddFacets Testcases");
			methodName = Thread.currentThread().getStackTrace()[1]
					.getMethodName();
			
			readcreatedata.loadFacetsCreateAndUpdateData(methodName, facet);

		} catch (Exception t) {
			t.printStackTrace();

		}
	}


	@Test(dataProvider = "sprint21facetcreatedata", dataProviderClass = com.bestbuy.search.bt.uiconstants.TestDataProvider.class)
	public void testSprint21_ApproveFacets(Facet facet) throws InterruptedException,
			IOException, Exception {
		try {

			System.out.println("Executing testApproveFacets Testcases");
			methodName = Thread.currentThread().getStackTrace()[1]
					.getMethodName();

			facetsScreen.approveFacets(methodName, facet);

		} catch (Exception t) {
			t.printStackTrace();

		}
	}

	
	@Test(dataProvider = "sprint21facetcreatedata", dataProviderClass = com.bestbuy.search.bt.uiconstants.TestDataProvider.class)
	public void testSprint21_DeleteFacets(Facet facet) throws InterruptedException,
			IOException, Exception {
		try {

			System.out.println("Executing testDeleteFacets Testcases");
			methodName = Thread.currentThread().getStackTrace()[1]
					.getMethodName();

			facetsScreen.deleteFacets(methodName, facet);

		} catch (Exception t) {
			t.printStackTrace();

		}
	}
	
	/**
	 * @AfterTest: The annotated method will be run after all the test methods
	 *             belonging to the classes inside the <test> tag have run This
	 *             method is to terminate the browser session
	 */

	@AfterTest
	public static void tearDown() {
		baseScreen.closeBrowser();
	}

}
