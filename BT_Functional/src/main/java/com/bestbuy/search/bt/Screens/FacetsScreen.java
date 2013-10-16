package com.bestbuy.search.bt.Screens;

import org.apache.commons.lang.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.bestbuy.search.bt.model.Facets.Facet;
import com.bestbuy.search.bt.selenium.util.MagicNumbers;
import com.bestbuy.search.bt.uiconstants.MerchandisingUIIdentifiers;
import com.bestbuy.search.bt.uiconstants.MerchandisingUIData;

/**
 * Class that contains the implementation of the methods that are called in the
 * Test methods of the Class FacetsTest
 */

public class FacetsScreen extends BaseScreen {

	private Log log = LogFactory.getLog("FacetOrderingScreen");
	private MerchandisingUIIdentifiers merchUI;
	private MerchandisingUIData merchData;
	private String screenName;
	private String methodName;
	int i=0;

	public FacetsScreen() {
		merchUI = new MerchandisingUIIdentifiers();
		merchData = new MerchandisingUIData();

	}

	/**
	 * Implementation of the Method to Load Facets Tab
	 * 
	 * @param screenshotName
	 *            The name in which the Screen shot file is saved
	 */
	public void selectFacetsTab(String screenshotName) {
		try {
			if (StringUtils.isEmpty(screenshotName)) {
				screenName = Thread.currentThread().getStackTrace()[1]
						.getMethodName();
				methodName = screenName;
			} else {
				methodName = screenshotName;
			}
			i++;
			log.info("Executing selectFacetsTab scenario");
			Thread.sleep(MagicNumbers.THREE_THOUSAND_SECONDS);
			if (getXpathWebElement(merchUI.getFacetsTab()).isDisplayed()) {
				waitForElementPresent(merchUI.getFacetsTab(), methodName);
				getXpathWebElement(merchUI.getFacetsTab());
				click();
			} else {
				waitForElementPresent(merchUI.getIpadViewMenuTab(), methodName);
				getXpathWebElement(merchUI.getIpadViewMenuTab());
				click();
				waitForElementPresent(merchUI.getIpadViewFacetsTab(),
						methodName);
				getXpathWebElement(merchUI.getIpadViewFacetsTab());
				click();
			}
		} catch (Exception e) {
			log.info("Exception in addFacets" + e.getMessage());
		}
	}

	/**
	 * Implementation of the Method to Add Facets
	 * 
	 * @param screenshotName
	 *            The name in which the Screen shot file is saved
	 * 
	 * @param facets
	 *            Object Of Facets Class
	 */
	public void addFacets(String screenshotName, Facet facet) {
		try {
			if (StringUtils.isEmpty(screenshotName)) {
				screenName = Thread.currentThread().getStackTrace()[1]
						.getMethodName();
				methodName = screenName;
			} else {
				methodName = screenshotName;
			}
			log.info("Executing addFacets scenario");
			waitForElementPresent(merchUI.getUserAddIcon(), methodName);
			getXpathWebElement(merchUI.getUserAddIcon());
			click();
			waitForElementPresent(merchUI.getFacetsCreateAttribute(),
					methodName);
			getXpathWebElement(merchUI.getFacetsCreateAttribute());
			click();
			waitForElementPresent(merchUI.getFacetsCreateSelectFacets(),
					methodName);
			getXpathWebElement(merchUI.getFacetsCreateSelectFacets());
			click();
			waitForElementPresent(merchUI.getFacetsCreateSubmit(), methodName);
			getXpathWebElement(merchUI.getFacetsCreateSubmit());
			click();
			waitForElementPresent(merchUI.getFacetsCreateSystemName(),
					methodName);
			getXpathWebElement(merchUI.getFacetsCreateSystemName());
			click();
			clear();
			sendKeys(facet.getFacetsSysNameData());
			waitForElementPresent(merchUI.getFacetsCreateDisplayName(),
					methodName);
			getXpathWebElement(merchUI.getFacetsCreateDisplayName());
			click();
			clear();
			sendKeys(facet.getFacetsDispNameData());

			waitForElementPresent(merchUI.getStartDate(), methodName);
			getXpathWebElement(merchUI.getStartDate());
			click();
			waitForElementPresent(merchUI.getCalMonthFieldXpath(), methodName);
			getXpathWebElement(merchUI.getCalMonthFieldXpath());
			click();
			selectText(element, facet.getStartDateMonth());
			waitForElementPresent(merchUI.getCalYearFieldXpath(), methodName);
			getXpathWebElement(merchUI.getCalYearFieldXpath());
			click();
			selectText(element, facet.getStartDateYear());
			waitForElementPresent(merchUI.getCalHourFieldXpath(), methodName);
			getXpathWebElement(merchUI.getCalHourFieldXpath());
			click();
			sendKeys(facet.getStartDateHour());
			waitForElementPresent(merchUI.getCalMinuteFieldXpath(), methodName);
			getXpathWebElement(merchUI.getCalMinuteFieldXpath());
			click();
			sendKeys(facet.getStartDateMinute());
			if ("Dec".equals(facet.getStartDateMonth())) {

				if ("23".equals(facet.getStartDateHour())) {

					if ("59".equals(facet.getStartDateMinute())) {
					

					if ("2013".equals(facet.getStartDateYear())) {
						waitForElementPresent(merchUI.getSelectedStartDate1(),
								methodName);
						getXpathWebElement(merchUI.getSelectedStartDate1());
						click();
					}
					}
				}
			} else {
				waitForElementPresent(merchUI.getSelectedStartDate(),
						methodName);
				getXpathWebElement(merchUI.getSelectedStartDate());
				click();

			}
			waitForElementPresent(merchUI.getEndDate(), methodName);
			getXpathWebElement(merchUI.getEndDate());
			click();
			waitForElementPresent(merchUI.getCalMonthFieldXpath(), methodName);
			getXpathWebElement(merchUI.getCalMonthFieldXpath());
			click();
			selectText(element, facet.getEndDateMonth());
			waitForElementPresent(merchUI.getCalYearFieldXpath(), methodName);
			getXpathWebElement(merchUI.getCalYearFieldXpath());
			click();
			selectText(element, facet.getEndDateYear());
			waitForElementPresent(merchUI.getCalHourFieldXpath(), methodName);
			getXpathWebElement(merchUI.getCalHourFieldXpath());
			click();
			sendKeys(facet.getEndDateHour());
			waitForElementPresent(merchUI.getCalMinuteFieldXpath(), methodName);
			getXpathWebElement(merchUI.getCalMinuteFieldXpath());
			click();
			sendKeys(facet.getEndDateMinute());

			if ("Dec".equals(facet.getEndDateMonth())) {

				if ("23".equals(facet.getEndDateHour())) {

					if ("59".equals(facet.getEndDateMinute())) {

						if ("2014".equals(facet.getEndDateYear())) {
							waitForElementPresent(merchUI.getSelectedEndDate1(), methodName);
							getXpathWebElement(merchUI.getSelectedEndDate1());
							click();
						}
					}
				}
			} else {
				waitForElementPresent(merchUI.getSelectedEndDate(), methodName);
				getXpathWebElement(merchUI.getSelectedEndDate());
				click();
			}

			waitForElementPresent(merchUI.getFacetsCreateAssetId(), methodName);
			getXpathWebElement(merchUI.getFacetsCreateAssetId());
			click();
			clear();
			sendKeys(facet.getFacetsGlossary());
			waitForElementPresent(merchUI.getFacetsMinValueCreate(), methodName);
			getXpathWebElement(merchUI.getFacetsMinValueCreate());
			sendKeys(merchData.getFacetsMinValue());
			waitForElementPresent(merchUI.getFacetsMaxValueCreate(), methodName);
			getXpathWebElement(merchUI.getFacetsMaxValueCreate());
			sendKeys(merchData.getFacetsMaxValue());
			waitForElementPresent(merchUI.getFacetsCreateSpecificOrder(),
					methodName);
			getXpathWebElement(merchUI.getFacetsCreateSpecificOrder());
			click();
			/*
			 * waitForElementPresent(merchUI.getFacetsCreateAddPage(),
			 * methodName);
			 * getXpathWebElement(merchUI.getFacetsCreateAddPage()); click();
			 */
			waitForElementPresent(merchUI.getCreateTreeView(), methodName);
			getXpathWebElement(merchUI.getCreateTreeView());
			click();
			waitForElementPresent(merchUI.getSelectCreateTree(), methodName);
			getXpathWebElement(merchUI.getSelectCreateTree());
			click();
			waitForElementPresent(merchUI.getCreateTree(), methodName);
			getXpathWebElement(merchUI.getCreateTree());
			click();
			/*
			 * waitForElementPresent(merchUI.getFacetsCreateAddPageBtn(),
			 * methodName);
			 * getXpathWebElement(merchUI.getFacetsCreateAddPageBtn()); click();
			 */
			waitForElementPresent(merchUI.getFacetsCreateBtn(), methodName);
			getXpathWebElement(merchUI.getFacetsCreateBtn());
			click();

			if (getXpathWebElement("//img[@name='editIcon']").isDisplayed()) {
				isTextPresent(facet.getFacetsSysNameData());
			} else {
				log.info("Exception in addFacetsChooseFacetValue");
			}
			tabledata("//table[@id='myTable']","//table/tbody/tr[1]","//table/tbody/tr[1]/td[3]");
			isTextPresent(facet.getFacetsSysNameData());
		} catch (Exception e) {
			log.info("Exception in addFacets" + e.getMessage());
		}

	}

	public void facetsValidUpdate(String screenshotName, Facet facet) {
		try {
			if (StringUtils.isEmpty(screenshotName)) {
				screenName = Thread.currentThread().getStackTrace()[1]
						.getMethodName();
				methodName = screenName;
			} else {
				methodName = screenshotName;
			}
			log.info("Executing facetsValidUpdate scenario");
			searchFacets(methodName, facet);
			waitForElementPresent(merchUI.getEditBtn(), methodName);
			getXpathWebElement(merchUI.getEditBtn());
			click();
			waitForElementPresent(merchUI.getFacetsCreateDisplayName(),
					methodName);
			getXpathWebElement(merchUI.getFacetsCreateDisplayName());
			click();
			clear();
			sendKeys(facet.getFacetsDispNameData());

			waitForElementPresent(merchUI.getFacetsCreateAssetId(), methodName);
			getXpathWebElement(merchUI.getFacetsCreateAssetId());
			click();
			clear();
			sendKeys(facet.getFacetsGlossary());

			waitForElementPresent(merchUI.getUpdateBtn(), methodName);
			getXpathWebElement(merchUI.getUpdateBtn());
			click();
			waitForElementPresent(merchUI.getFacetsPopUpCloseBtn(), methodName);
			getXpathWebElement(merchUI.getFacetsPopUpCloseBtn());
			click();
			waitForElementPresent(merchUI.getRefreshIcon(), methodName);
			getXpathWebElement(merchUI.getRefreshIcon());
			click();
		} catch (Exception e) {
			log.info("Exception in addFacetsChooseFacetValue" + e.getMessage());
		}

	}

	/**
	 * Implementation of the Method to Update Facets With Invalid data
	 * 
	 * @param screenshotName
	 *            The name in which the Screen shot file is saved
	 */

	public void facetsInvalidUpdate(String screenshotName) {
		try {
			if (StringUtils.isEmpty(screenshotName)) {
				screenName = Thread.currentThread().getStackTrace()[1]
						.getMethodName();
				methodName = screenName;
			} else {
				methodName = screenshotName;
			}
			log.info("Executing facetsInvalidUpdate scenario");
			waitForElementPresent(merchUI.getEditBtn(), methodName);
			getXpathWebElement(merchUI.getEditBtn());
			click();
			Thread.sleep(MagicNumbers.THREE_THOUSAND_SECONDS);
			waitForElementPresent(merchUI.getFacetsCreateDisplayName(),
					methodName);
			getXpathWebElement(merchUI.getFacetsCreateDisplayName());
			click();
			clear();
			sendKeys(merchData.getFacetsUpdateDisplayNameData());
			waitForElementPresent(merchUI.getCreateTreeView(), methodName);
			getXpathWebElement(merchUI.getCreateTreeView());
			click();
			waitForElementPresent(merchUI.getSelectCreateTree(), methodName);
			getXpathWebElement(merchUI.getSelectCreateTree());
			click();
			waitForElementPresent(merchUI.getCreateTree(), methodName);
			getXpathWebElement(merchUI.getCreateTree());
			click();
			/*
			 * waitForElementPresent(merchUI.getFacetsCreateAddPage(),
			 * methodName);
			 * getXpathWebElement(merchUI.getFacetsCreateAddPage()); click();
			 */
			waitForElementPresent(merchUI.getUpdateBtn(), methodName);
			getXpathWebElement(merchUI.getUpdateBtn());
			click();
			waitForElementPresent(merchUI.getFacetsPopUpCloseBtn(), methodName);
			getXpathWebElement(merchUI.getFacetsPopUpCloseBtn());
			click();
			waitForElementPresent(merchUI.getRefreshIcon(), methodName);
			getXpathWebElement(merchUI.getRefreshIcon());
			click();
		} catch (Exception e) {
			log.info("Exception in addFacetsChooseFacetValue" + e.getMessage());
		}

	}

	/**
	 * Implementation of the Method to Approve Facets
	 * 
	 * @param screenshotName
	 *            The name in which the Screen shot file is saved
	 */

	public void approveFacets(String screenshotName, Facet facet) {
		try {
			if (StringUtils.isEmpty(screenshotName)) {
				screenName = Thread.currentThread().getStackTrace()[1]
						.getMethodName();
				methodName = screenName;
			} else {
				methodName = screenshotName;
			}
			log.info("Executing ApproveFacets scenario");
			searchFacets(methodName, facet);
			waitForElementPresent(merchUI.getApproveTab(), methodName);
			getXpathWebElement(merchUI.getApproveTab()).isEnabled();
			click();
			// isTextPresent(merchData.getFacetsValidationMsgApprove());
		} catch (Exception e) {
			log.info("Exception in approveFacets" + e.getMessage());
		}
	}

	/**
	 * Implementation of the Method to Reject Facets
	 * 
	 * @param screenshotName
	 *            The name in which the Screen shot file is saved
	 */

	public void rejectFacets(String screenshotName, Facet facet) {
		try {
			if (StringUtils.isEmpty(screenshotName)) {
				screenName = Thread.currentThread().getStackTrace()[1]
						.getMethodName();
				methodName = screenName;
			} else {
				methodName = screenshotName;
			}
			log.info("Executing RejectFacets scenario");
			searchFacets(methodName, facet);
			waitForElementPresent(merchUI.getRejectTab(), methodName);
			getXpathWebElement(merchUI.getRejectTab());
			click();
			// isTextPresent(merchData.getFacetsValidationMsgReject());
		} catch (Exception e) {
			log.info("Exception in rejectFacets" + e.getMessage());
		}
	}

	/**
	 * Implementation of the Method to delete Facets
	 * 
	 * @param screenshotName
	 *            The name in which the Screen shot file is saved
	 */

	public void deleteFacets(String screenshotName, Facet facet) {
		try {
			if (StringUtils.isEmpty(screenshotName)) {
				screenName = Thread.currentThread().getStackTrace()[1]
						.getMethodName();
				methodName = screenName;
			} else {
				methodName = screenshotName;
			}
			log.info("Executing deleteFacets scenario");
			Thread.sleep(MagicNumbers.TWO_THOUSAND_SECONDS);
			if (getXpathWebElement(merchUI.getDeleteTab()).isDisplayed()) {
				waitForElementPresent(merchUI.getDeleteTab(), methodName);
				getXpathWebElement(merchUI.getDeleteTab());
				click();
				waitForElementPresent(merchUI.getDeletePopUPOKBtn(), methodName);
				getXpathWebElement(merchUI.getDeletePopUPOKBtn());
				click();
				// isTextPresent(merchData.getFacetsValidationMsgDelete());
			} else {
				log.info("Facets Delete Icon Not Displayed");
			}
		} catch (Exception e) {
			log.info("Exception in deleteFacets" + e.getMessage());
		}
	}

	/**
	 * Implementation of the Method to Search Facets with invalid data
	 * 
	 * @param screenshotName
	 *            The name in which the Screen shot file is saved
	 */

	public void invalidFacetsSearch(String screenshotName) {
		try {
			if (StringUtils.isEmpty(screenshotName)) {
				screenName = Thread.currentThread().getStackTrace()[1]
						.getMethodName();
				methodName = screenName;
			} else {
				methodName = screenshotName;
			}
			log.info("Executing searchFacets scenario");
			waitForElementPresent(merchUI.getFacetsSystemNameSearchField(),
					methodName);
			enterKeys(merchUI.getFacetsSystemNameSearchField(),
					merchData.getFacetsSystemNameInvalidSearchData());
			waitForElementPresent(merchUI.getRefreshIcon(), methodName);
			getXpathWebElement(merchUI.getRefreshIcon());
			click();
		} catch (Exception e) {
			log.info("Exception in invalidFacetsSearch" + e.getMessage());
		}
	}

	/**
	 * Implementation of the Method to Show or Hide All Facets
	 * 
	 * @param screenshotName
	 *            The name in which the Screen shot file is saved
	 */

	public void showOrHideAllFacets(String screenshotName) {
		try {
			if (StringUtils.isEmpty(screenshotName)) {
				screenName = Thread.currentThread().getStackTrace()[1]
						.getMethodName();
				methodName = screenName;
			} else {
				methodName = screenshotName;
			}
			log.info("Executing ShowOrHideAllFacets scenario");
			waitForElementPresent(merchUI.getFacetsShowAll(), methodName);
			getXpathWebElement(merchUI.getFacetsShowAll());
			click();
			waitForElementPresent(merchUI.getFacetsHideAll(), methodName);
			getXpathWebElement(merchUI.getFacetsHideAll());
			click();
		} catch (Exception e) {
			log.info("Exception in showOrHideAllFacets" + e.getMessage());
		}
	}

	/**
	 * Implementation of the Method to Sort and Refresh Facets
	 * 
	 * @param screenshotName
	 *            The name in which the Screen shot file is saved
	 */

	public void sortnRefreshFacets(String screenshotName) {
		try {
			if (StringUtils.isEmpty(screenshotName)) {
				screenName = Thread.currentThread().getStackTrace()[1]
						.getMethodName();
				methodName = screenName;
			} else {
				methodName = screenshotName;
			}
			log.info("Executing SortnRefreshFacets scenario");
			waitForElementPresent(merchUI.getFacetsSortBySysName(), methodName);
			getXpathWebElement(merchUI.getFacetsSortBySysName());
			click();
			waitForElementPresent(merchUI.getFacetsSortBySysName(), methodName);
			getXpathWebElement(merchUI.getFacetsSortBySysName());
			click();
			waitForElementPresent(merchUI.getRefreshIcon(), methodName);
			getXpathWebElement(merchUI.getRefreshIcon());
			click();
		} catch (Exception e) {
			log.info("Exception in sortnRefreshFacets" + e.getMessage());
		}
	}

	/**
	 * Implementation of the Method to verify the Pagination of the Facets
	 * 
	 * @param screenshotName
	 *            The name in which the Screen shot file is saved
	 */

	public void pagiNationForFacetsPage(String screenshotName) {
		try {
			if (StringUtils.isEmpty(screenshotName)) {
				screenName = Thread.currentThread().getStackTrace()[1]
						.getMethodName();
				methodName = screenName;
			} else {
				methodName = screenshotName;
			}
			log.info("Executing PagiNationForFacetsPage scenario");
			Thread.sleep(MagicNumbers.THREE_THOUSAND_SECONDS);
			if (getXpathWebElement(merchUI.getNextBtn()).isDisplayed()) {
				log.info("Pagination Not Available");
			} else {
				waitForElementPresent(merchUI.getNextBtn(), methodName);
				getXpathWebElement(merchUI.getNextBtn());
				click();
				waitForElementPresent(merchUI.getPrevBtn(), methodName);
				getXpathWebElement(merchUI.getPrevBtn());
				click();
				waitForElementPresent(merchUI.getRefreshIcon(), methodName);
				getXpathWebElement(merchUI.getRefreshIcon());
				click();
			}
		} catch (Exception e) {
			log.info("Exception in pagiNationForFacetsPage" + e.getMessage());
		}
	}

	/**
	 * Implementation of the Method to Search Facets
	 * 
	 * @param screenshotName
	 *            The name in which the Screen shot file is saved
	 */

	public void searchFacetsSystemName(String screenshotName) {
		try {
			if (StringUtils.isEmpty(screenshotName)) {
				screenName = Thread.currentThread().getStackTrace()[1]
						.getMethodName();
				methodName = screenName;
			} else {
				methodName = screenshotName;
			}
			log.info("Executing searchFacetsSystemName scenario");
			waitForElementPresent(merchUI.getFacetsSystemNameSearchField(),
					methodName);
			enterKeys(merchUI.getFacetsSystemNameSearchField(),
					merchData.getFacetsSystemNameSearchFieldData());
			waitForElementPresent(merchUI.getRefreshIcon(), methodName);
			getXpathWebElement(merchUI.getRefreshIcon());
			click();
		} catch (Exception e) {
			log.info("Exception in searchFacetsSystemName" + e.getMessage());
		}
	}

	public void verifyCreatePopUpTextFieldsValidation(String screenshotName) {
		try {
			if (StringUtils.isEmpty(screenshotName)) {
				screenName = Thread.currentThread().getStackTrace()[1]
						.getMethodName();
				methodName = screenName;
			} else {
				methodName = screenshotName;
			}
			log.info("Executing verifyCreatePopUpTextFieldsValidation scenario");

			waitForElementPresent(merchUI.getUserAddIcon(), methodName);
			getXpathWebElement(merchUI.getUserAddIcon());
			click();
			Thread.sleep(MagicNumbers.THREE_THOUSAND_SECONDS);
			waitForElementPresent(merchUI.getFacetsCreateBtn(), methodName);
			getXpathWebElement(merchUI.getFacetsCreateBtn());
			click();
			waitForElementPresent(
					merchUI.getFacetCreateAndUpdatePopUpCloseBtn(), methodName);
			getXpathWebElement(merchUI.getFacetCreateAndUpdatePopUpCloseBtn());
			click();
		} catch (Exception e) {
			log.info("Exception in verifyCreatePopUpTextFieldsValidation"
					+ e.getMessage());
		}
	}

	public void verifyEditPopUpTextFieldsValidation(String screenshotName) {
		try {
			if (StringUtils.isEmpty(screenshotName)) {
				screenName = Thread.currentThread().getStackTrace()[1]
						.getMethodName();
				methodName = screenName;
			} else {
				methodName = screenshotName;
			}
			log.info("Executing verifyEditPopUpTextFieldsValidation scenario");

			waitForElementPresent(merchUI.getEditBtn(), methodName);
			getXpathWebElement(merchUI.getEditBtn());
			click();
			Thread.sleep(MagicNumbers.THREE_THOUSAND_SECONDS);

			waitForElementPresent(merchUI.getFacetsCreateSystemName(),
					methodName);
			getXpathWebElement(merchUI.getFacetsCreateSystemName());
			click();
			clear();
			waitForElementPresent(merchUI.getFacetsCreateDisplayName(),
					methodName);
			getXpathWebElement(merchUI.getFacetsCreateDisplayName());
			click();
			clear();
			waitForElementPresent(merchUI.getStartDate(), methodName);
			getXpathWebElement(merchUI.getStartDate());
			click();
			clear();

			waitForElementPresent(merchUI.getEndDate(), methodName);
			getXpathWebElement(merchUI.getEndDate());
			click();
			clear();

			waitForElementPresent(merchUI.getFacetsCreateAssetId(), methodName);
			getXpathWebElement(merchUI.getFacetsCreateAssetId());
			click();
			clear();

			waitForElementPresent(merchUI.getUpdateBtn(), methodName);
			getXpathWebElement(merchUI.getUpdateBtn());
			click();
			waitForElementPresent(
					merchUI.getFacetCreateAndUpdatePopUpCloseBtn(), methodName);
			getXpathWebElement(merchUI.getFacetCreateAndUpdatePopUpCloseBtn());
			click();

		} catch (Exception e) {
			log.info("Exception in verifyEditPopUpTextFieldsValidation"
					+ e.getMessage());
		}
	}

	public void verifyFacetsValueOrder(String screenshotName) {
		try {
			if (StringUtils.isEmpty(screenshotName)) {
				screenName = Thread.currentThread().getStackTrace()[1]
						.getMethodName();
				methodName = screenName;
			} else {
				methodName = screenshotName;
			}
			log.info("Executing verifyFacetsValueOrder scenario");
			waitForElementPresent(merchUI.getUserAddIcon(), methodName);
			getXpathWebElement(merchUI.getUserAddIcon());
			click();
			waitForElementPresent(merchUI.getFacetsCreateAttribute(),
					methodName);
			getXpathWebElement(merchUI.getFacetsCreateAttribute());
			click();
			waitForElementPresent(merchUI.getFacetsCreateSelectFacets(),
					methodName);
			getXpathWebElement(merchUI.getFacetsCreateSelectFacets());
			click();
			waitForElementPresent(merchUI.getFacetsCreateSubmit(), methodName);
			getXpathWebElement(merchUI.getFacetsCreateSubmit());
			click();
			waitForElementPresent(merchUI.getFacetsCreateSpecificOrder(),
					methodName);
			getXpathWebElement(merchUI.getFacetsCreateSpecificOrder());
			click();
			waitForElementPresent(merchUI.getFacetsValueControl(), methodName);
			getXpathWebElement(merchUI.getFacetsValueControl());
			click();
			waitForElementPresent(merchUI.getFacetsValueControl1(), methodName);
			getXpathWebElement(merchUI.getFacetsValueControl1());
			click();
			waitForElementPresent(merchUI.getFacetsValueControl2(), methodName);
			getXpathWebElement(merchUI.getFacetsValueControl2());
			click();
			waitForElementPresent(merchUI.getFacetsValueControl3(), methodName);
			getXpathWebElement(merchUI.getFacetsValueControl3());
			click();
			waitForElementPresent(merchUI.getFacetsOrderRemove(), methodName);
			getXpathWebElement(merchUI.getFacetsOrderRemove());
			click();
			waitForElementPresent(merchUI.getFacetsOrderRemove1(), methodName);
			getXpathWebElement(merchUI.getFacetsOrderRemove1());
			click();
			waitForElementPresent(merchUI.getFacetCreatePopUpNextBtn(),
					methodName);
			getXpathWebElement(merchUI.getFacetCreatePopUpNextBtn());
			click();
			waitForElementPresent(merchUI.getFacetCreatePopUpNextBtn(),
					methodName);
			getXpathWebElement(merchUI.getFacetCreatePopUpNextBtn());
			click();
			waitForElementPresent(merchUI.getFacetCreatePopUpNextBtn(),
					methodName);
			getXpathWebElement(merchUI.getFacetCreatePopUpNextBtn());
			click();
			waitForElementPresent(merchUI.getFacetOrderValueSearchField(),
					methodName);
			enterKeys(merchUI.getFacetOrderValueSearchField(),
					merchData.getFacetOrderingTextFieldData());
			Thread.sleep(MagicNumbers.THREE_THOUSAND_SECONDS);

		} catch (Exception e) {
			log.info("Exception in verifyFacetsValueOrder" + e.getMessage());
		}

	}

	public void searchFacets(String screenshotName, Facet facet) {
		try {
			if (StringUtils.isEmpty(screenshotName)) {
				screenName = Thread.currentThread().getStackTrace()[1]
						.getMethodName();
				methodName = screenName;
			} else {
				methodName = screenshotName;
			}
			log.info("Executing searchFacetsSystemName scenario");
			waitForElementPresent(merchUI.getRefreshIcon(), methodName);
			getXpathWebElement(merchUI.getRefreshIcon());
			click();
			waitForElementPresent(merchUI.getFacetsSystemNameSearchField(),
					methodName);
			enterKeys(merchUI.getFacetsSystemNameSearchField(),
					facet.getFacetsSysNameData());

		} catch (Exception e) {
			log.info("Exception in searchFacetsSystemName" + e.getMessage());
		}
	}

}
