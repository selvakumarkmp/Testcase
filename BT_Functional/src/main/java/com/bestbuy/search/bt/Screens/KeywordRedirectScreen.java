package com.bestbuy.search.bt.Screens;

import org.apache.commons.lang.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.bestbuy.search.bt.model.Keywordredirects.Keywordredirect;
import com.bestbuy.search.bt.selenium.util.MagicNumbers;
import com.bestbuy.search.bt.uiconstants.MerchandisingUIData;
import com.bestbuy.search.bt.uiconstants.MerchandisingUIIdentifiers;

/**
 * Class that contains the implementation of the methods that are called in the
 * Test methods of the Class KeywordRedirectTest
 */

public class KeywordRedirectScreen extends BaseScreen {

	private Log log = LogFactory.getLog("KeyWordScreen");
	private MerchandisingUIIdentifiers merchUI;
	private MerchandisingUIData merchData;
	private String screenName;
	private String methodName;
	

	public KeywordRedirectScreen() {
		merchUI = new MerchandisingUIIdentifiers();
		merchData = new MerchandisingUIData();
	}

	/**
	 * Implementation of the Method to Add Keyword Redirect
	 * 
	 * @param screenshotName
	 *            The name in which the Screen shot file is saved
	 * 
	 * @param keywordredirect
	 *            Object of KeywordRedirect class
	 */

	public void addkeywordRedirect(String screenshotName,
			Keywordredirect keywordredirect) {
		try {
			if (StringUtils.isEmpty(screenshotName)) {
				screenName = Thread.currentThread().getStackTrace()[1]
				                                                    .getMethodName();
				methodName = screenName;
			} else {
				methodName = screenshotName;
			}
			log.info("Executing addkeywordRedirect scenario");
			Thread.sleep(MagicNumbers.FOUR_THOUSAND_SECONDS);
			if (getXpathWebElement(merchUI.getIpadViewMenuTab()).isDisplayed()) {
				waitForElementPresent(merchUI.getIpadViewMenuTab(), methodName);
				getXpathWebElement(merchUI.getIpadViewMenuTab());
				click();
				waitForElementPresent(merchUI.getIpadViewKeywordTab(),
						methodName);
				getXpathWebElement(merchUI.getIpadViewKeywordTab());
				click();
			} else {
				waitForElementPresent(merchUI.getKeywordRedirectsTab(),
						methodName);
				getXpathWebElement(merchUI.getKeywordRedirectsTab());
				click();
			}
			waitForElementPresent(merchUI.getAddIcon(), methodName);
			getXpathWebElement(merchUI.getAddIcon());
			click();
			waitForElementPresent(merchUI.getKrdRedrirectTerm(), methodName);
			getXpathWebElement(merchUI.getKrdRedrirectTerm());
			click();
			sendKeys(keywordredirect.getRdRedirectTermValue());
			waitForElementPresent(merchUI.getKrdRedirectUrl(), methodName);
			getXpathWebElement(merchUI.getKrdRedirectUrl());
			click();
			sendKeys(keywordredirect.getRdRedirectUrlValue());
			waitForElementPresent(merchUI.getKrdSearchProfile(), methodName);
			getXpathWebElement(merchUI.getKrdSearchProfile());
			sendKeys(merchData.getKrdSearchProfileData());

			waitForElementPresent(merchUI.getStartDate(), methodName);
			getXpathWebElement(merchUI.getStartDate());
			click();
			waitForElementPresent(merchUI.getCalMonthFieldXpath(), methodName);
			getXpathWebElement(merchUI.getCalMonthFieldXpath());
			click();
			selectText(element, keywordredirect.getStartDateMonth());
			waitForElementPresent(merchUI.getCalYearFieldXpath(), methodName);
			getXpathWebElement(merchUI.getCalYearFieldXpath());
			click();
			selectText(element, keywordredirect.getStartDateYear());
			waitForElementPresent(merchUI.getCalHourFieldXpath(), methodName);
			getXpathWebElement(merchUI.getCalHourFieldXpath());
			click();
			sendKeys(keywordredirect.getStartDateHour());
			waitForElementPresent(merchUI.getCalMinuteFieldXpath(), methodName);
			getXpathWebElement(merchUI.getCalMinuteFieldXpath());
			click();
			sendKeys(keywordredirect.getStartDateMinute());
			
			if ("Dec".equals(keywordredirect.getStartDateMonth())) {

				if ("23".equals(keywordredirect.getStartDateHour())) {

					if ("59".equals(keywordredirect.getStartDateMinute())) {
					

					if ("2013".equals(keywordredirect.getStartDateYear())) {
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
			selectText(element, keywordredirect.getEndDateMonth());
			waitForElementPresent(merchUI.getCalYearFieldXpath(), methodName);
			getXpathWebElement(merchUI.getCalYearFieldXpath());
			click();
			selectText(element, keywordredirect.getEndDateYear());
			waitForElementPresent(merchUI.getCalHourFieldXpath(), methodName);
			getXpathWebElement(merchUI.getCalHourFieldXpath());
			click();
			sendKeys(keywordredirect.getEndDateHour());
			waitForElementPresent(merchUI.getCalMinuteFieldXpath(), methodName);
			getXpathWebElement(merchUI.getCalMinuteFieldXpath());
			click();
			sendKeys(keywordredirect.getEndDateMinute());
			
			if ("Dec".equals(keywordredirect.getEndDateMonth())) {

				if ("23".equals(keywordredirect.getEndDateHour())) {

					if ("59".equals(keywordredirect.getEndDateMinute())) {

						if ("2014".equals(keywordredirect.getEndDateYear())) {
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
			waitForElementPresent(merchUI.getCreateBtn(), methodName);
			getXpathWebElement(merchUI.getCreateBtn());
			click();
			waitForElementPresent(merchUI.getRefreshIcon(), methodName);
			getXpathWebElement(merchUI.getRefreshIcon());
			click();
			isTextPresent(keywordredirect.getRdRedirectTermValue());	

		} catch (Exception e) {
			log.info("Exception in addkeywordRedirect" + e.getMessage());
		}
	}
	
	

	public void VerifyCreatePopUpTextFieldsValidation(String screenshotName) {
		try {
			if (StringUtils.isEmpty(screenshotName)) {
				screenName = Thread.currentThread().getStackTrace()[1]
				                                                    .getMethodName();
				methodName = screenName;
			} else {
				methodName = screenshotName;
			}
			log.info("Executing VerifyCreatePopUpTextFieldsValidation scenario");
			waitForElementPresent(merchUI.getAddIcon(), methodName);
			getXpathWebElement(merchUI.getAddIcon());
			click();
			waitForElementPresent(merchUI.getCreateBtn(), methodName);
			getXpathWebElement(merchUI.getCreateBtn());
			click();
			waitForElementPresent(merchUI.getKrdPopUpCloseBtn(), methodName);
			getXpathWebElement(merchUI.getKrdPopUpCloseBtn());
			click();
		} catch (Exception e) {
			log.info("Exception in VerifyCreatePopUpTextFieldsValidation" + e.getMessage());
		}
	}

	public void VerifyEditPopUpTextFieldsValidation(String screenshotName) {
		try {
			if (StringUtils.isEmpty(screenshotName)) {
				screenName = Thread.currentThread().getStackTrace()[1]
				                                                    .getMethodName();
				methodName = screenName;
			} else {
				methodName = screenshotName;
			}
			log.info("Executing VerifyEditPopUpTextFieldsValidation scenario");
			waitForElementPresent(merchUI.getEditBtn(), methodName);
			getXpathWebElement(merchUI.getEditBtn());
			click();
			waitForElementPresent(merchUI.getKrdRedrirectTerm(), methodName);
			getXpathWebElement(merchUI.getKrdRedrirectTerm());
			click();
			clear();
			waitForElementPresent(merchUI.getKrdRedirectUrl(), methodName);
			getXpathWebElement(merchUI.getKrdRedirectUrl());
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
			waitForElementPresent(merchUI.getUpdateBtn(), methodName);
			getXpathWebElement(merchUI.getUpdateBtn());
			click();
			waitForElementPresent(merchUI.getKrdPopUpCloseBtn(), methodName);
			getXpathWebElement(merchUI.getKrdPopUpCloseBtn());
			click();
		} catch (Exception e) {
			log.info("Exception in VerifyEditPopUpTextFieldsValidation" + e.getMessage());
		}
	}

	/**
	 * Implementation of the Method to Update Keyword Redirect
	 * 
	 * @param screenshotName
	 *            The name in which the Screen shot file is saved
	 * 
	 * @param upkeywordrd
	 *            Object of the KeywordRedirect Class
	 */

	public void updatekeywordRedirect(String screenshotName,Keywordredirect keywordredirect) {
		try {
			if (StringUtils.isEmpty(screenshotName)) {
				screenName = Thread.currentThread().getStackTrace()[1]
				                                                    .getMethodName();
				methodName = screenName;
			} else {
				methodName = screenshotName;
			}
			log.info("Executing updatekeywordRedirect scenario");
			
			searchRedirectUrl(methodName,keywordredirect);
			waitForElementPresent(merchUI.getEditBtn(), methodName);
			getXpathWebElement(merchUI.getEditBtn());
			click();
			
			waitForElementPresent(merchUI.getKrdRedrirectTerm(), methodName);
			getXpathWebElement(merchUI.getKrdRedrirectTerm());
			clear();
			click();
			sendKeys(keywordredirect.getRdRedirectTermValue());
			waitForElementPresent(merchUI.getUpdateBtn(), methodName);
			getXpathWebElement(merchUI.getUpdateBtn());
			click();			
			waitForElementPresent(merchUI.getRefreshIcon(), methodName);
			getXpathWebElement(merchUI.getRefreshIcon());
			click();
			isTextPresent(keywordredirect.getRdRedirectTermValue());	
		} catch (Exception e) {
			log.info("Exception in updatekeywordRedirect" + e.getMessage());
		}
	}

	/**
	 * Implementation of the Method to Invalid Update Keyword Redirect
	 * 
	 * @param screenshotName
	 *            The name in which the Screen shot file is saved
	 */

	public void invalidUpdatekeywordRedirect(String screenshotName) {
		try {
			if (StringUtils.isEmpty(screenshotName)) {
				screenName = Thread.currentThread().getStackTrace()[1]
				                                                    .getMethodName();
				methodName = screenName;
			} else {
				methodName = screenshotName;
			}
			log.info("Executing invalidUpdatekeywordRedirect scenario");
			waitForElementPresent(merchUI.getEditBtn(), methodName);
			getXpathWebElement(merchUI.getEditBtn());
			click();
			waitForElementPresent(merchUI.getKrdRedrirectTerm(), methodName);
			getXpathWebElement(merchUI.getKrdRedrirectTerm());
			click();
			clear();
			waitForElementPresent(merchUI.getUpdateBtn(), methodName);
			getXpathWebElement(merchUI.getUpdateBtn());
			click();
			waitForElementPresent(merchUI.getKrdPopUpCloseBtn(), methodName);
			getXpathWebElement(merchUI.getKrdPopUpCloseBtn());
			click();
		} catch (Exception e) {
			log.info("Exception in invalidUpdatekeywordRedirect"
					+ e.getMessage());
		}
	}

	/**
	 * Implementation of the Method to Invalid Add Keyword Redirect
	 * 
	 * @param screenshotName
	 *            The name in which the Screen shot file is saved
	 */

	public void invalidAddkeywordRedirect(String screenshotName) {
		try {
			if (StringUtils.isEmpty(screenshotName)) {
				screenName = Thread.currentThread().getStackTrace()[1]
				                                                    .getMethodName();
				methodName = screenName;
			} else {
				methodName = screenshotName;
			}
			log.info("Executing invalidAddkeywordRedirect scenario");
			waitForElementPresent(merchUI.getAddIcon(), methodName);
			getXpathWebElement(merchUI.getAddIcon());
			click();
			waitForElementPresent(merchUI.getKrdRedrirectTerm(), methodName);
			getXpathWebElement(merchUI.getKrdRedrirectTerm());
			click();
			sendKeys(merchData.getKrdRedirectTermData());
			waitForElementPresent(merchUI.getKrdRedirectUrl(), methodName);
			getXpathWebElement(merchUI.getKrdRedirectUrl());
			click();
			waitForElementPresent(merchUI.getKrdSearchProfile(), methodName);
			getXpathWebElement(merchUI.getKrdSearchProfile());
			sendKeys(merchData.getKrdSearchProfileData());
			waitForElementPresent(merchUI.getStartDate(), methodName);
			getXpathWebElement(merchUI.getStartDate());
			click();
			clear();
			waitForElementPresent(merchUI.getEndDate(), methodName);
			getXpathWebElement(merchUI.getEndDate());
			click();
			clear();
			waitForElementPresent(merchUI.getCreateBtn(), methodName);
			getXpathWebElement(merchUI.getCreateBtn());
			click();
			waitForElementPresent(merchUI.getKrdPopUpCloseBtn(), methodName);
			getXpathWebElement(merchUI.getKrdPopUpCloseBtn());
			click();
		} catch (Exception e) {
			log.info("Exception in invalidAddkeywordRedirect" + e.getMessage());
		}
	}

	/**
	 * Implementation of the Method to Approve Keyword Redirect
	 * 
	 * @param screenshotName
	 *            The name in which the Screen shot file is saved
	 */

	public void approvekeywordRedirect(String screenshotName,Keywordredirect keywordredirect) {
		try {
			if (StringUtils.isEmpty(screenshotName)) {
				screenName = Thread.currentThread().getStackTrace()[1]
				                                                    .getMethodName();
				methodName = screenName;
			} else {
				methodName = screenshotName;
			}
			log.info("Executing approvekeywordRedirect scenario");
			searchKeywords(methodName,keywordredirect);
			waitForElementPresent(merchUI.getApproveTab(), methodName);
			getXpathWebElement(merchUI.getApproveTab());
			click();			
		} catch (Exception e) {
			log.info("Exception in approvekeywordRedirect" + e.getMessage());
		}
	}

	/**
	 * Implementation of the Method to Reject Keyword Redirect
	 * 
	 * @param screenshotName
	 *            The name in which the Screen shot file is saved
	 */

	public void rejectkeywordRedirect(String screenshotName,Keywordredirect keywordredirect) {
		try {
			if (StringUtils.isEmpty(screenshotName)) {
				screenName = Thread.currentThread().getStackTrace()[1]
				                                                    .getMethodName();
				methodName = screenName;
			} else {
				methodName = screenshotName;
			}
			log.info("Executing rejectkeywordRedirect scenario");
			searchKeywords(methodName,keywordredirect);
			waitForElementPresent(merchUI.getRejectTab(), methodName);
			getXpathWebElement(merchUI.getRejectTab());
			click();			
		} catch (Exception e) {
			log.info("Exception in rejectkeywordRedirect" + e.getMessage());
		}
	}

	/**
	 * Implementation of the Method to Sort and refresh Keyword Redirect
	 * 
	 * @param screenshotName
	 *            The name in which the Screen shot file is saved
	 */

	public void sortnRefreshkeywordRedirect(String screenshotName) {
		try {
			if (StringUtils.isEmpty(screenshotName)) {
				screenName = Thread.currentThread().getStackTrace()[1]
				                                                    .getMethodName();
				methodName = screenName;
			} else {
				methodName = screenshotName;
			}
			log.info("Executing sortnRefreshkeywordRedirect scenario");
			waitForElementPresent(merchUI.getKrdSorting(), methodName);
			getXpathWebElement(merchUI.getKrdSorting());
			click();
			waitForElementPresent(merchUI.getKrdSorting(), methodName);
			getXpathWebElement(merchUI.getKrdSorting());
			click();
			waitForElementPresent(merchUI.getRefreshIcon(), methodName);
			getXpathWebElement(merchUI.getRefreshIcon());
			click();
		} catch (Exception e) {
			log.info("Exception in sortnRefreshkeywordRedirect"
					+ e.getMessage());
		}
	}

	/**
	 * Implementation of the Method to Invalid Search Keyword Redirect
	 * 
	 * @param screenshotName
	 *            The name in which the Screen shot file is saved
	 */

	public void invalidSearchkeywordRedirect(String screenshotName) {
		try {
			if (StringUtils.isEmpty(screenshotName)) {
				screenName = Thread.currentThread().getStackTrace()[1]
				                                                    .getMethodName();
				methodName = screenName;
			} else {
				methodName = screenshotName;
			}
			log.info("Executing invalidSearchkeywordRedirect scenario");
			waitForElementPresent(merchUI.getKrdTermsSearchField(), methodName);
			enterKeys(merchUI.getKrdTermsSearchField(),
					merchData.getRdInvalidSearchData());
			waitForElementPresent(merchUI.getRefreshIcon(), methodName);
			getXpathWebElement(merchUI.getRefreshIcon());
			click();			
		} catch (Exception e) {
			log.info("Exception in invalidSearchkeywordRedirect"
					+ e.getMessage());
		}
	}

	/**
	 * Implementation of the Method to Delete Keyword Redirect
	 * 
	 * @param screenshotName
	 *            The name in which the Screen shot file is saved
	 */

	public void deleteKeywordRedirect(String screenshotName,Keywordredirect keywordredirect) {
		try {
			if (StringUtils.isEmpty(screenshotName)) {
				screenName = Thread.currentThread().getStackTrace()[1]
				                                                    .getMethodName();
				methodName = screenName;
			} else {
				methodName = screenshotName;
			}
			log.info("Executing deleteKeywordRedirect scenario");
				Thread.sleep(MagicNumbers.TWO_THOUSAND_SECONDS);
				if (getXpathWebElement(merchUI.getDeleteTab()).isDisplayed()) {
					waitForElementPresent(merchUI.getDeleteTab(), methodName);
					getXpathWebElement(merchUI.getDeleteTab());
					click();
					waitForElementPresent(merchUI.getDeletePopUPOKBtn(),
							methodName);
					getXpathWebElement(merchUI.getDeletePopUPOKBtn());
					click();
					waitForElementPresent(merchUI.getRefreshIcon(), methodName);
					getXpathWebElement(merchUI.getRefreshIcon());
					click();

				} else {
					log.info("KeywordRedirect Delete Icon Not Displayed");
				}
		} catch (Exception e) {
			log.info("Exception in deleteKeywordRedirect" + e.getMessage());
		}
	}

	/**
	 * Implementation of the Method to Verify the Pagination of the Keyword
	 * Redirect
	 * 
	 * @param screenshotName
	 *            The name in which the Screen shot file is saved
	 */

	public void pageNationForKeywordRedirectPage(String screenshotName) {
		try {
			if (StringUtils.isEmpty(screenshotName)) {
				screenName = Thread.currentThread().getStackTrace()[1]
				                                                    .getMethodName();
				methodName = screenName;
			} else {
				methodName = screenshotName;
			}
			log.info("Executing pageNationForKeywordRedirectPage scenario");
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
			log.info("Exception in pageNationForKeywordRedirectPage"
					+ e.getMessage());
		}
	}
	
	public void searchKeywords(String screenshotName,Keywordredirect keywordredirect) {
		try {
		if (StringUtils.isEmpty(screenshotName)) {
		screenName = Thread.currentThread().getStackTrace()[1]
		.getMethodName();
		methodName = screenName;
		} else {
		methodName = screenshotName;
		}
		log.info("Executing searchKeywordTerms scenario");
		waitForElementPresent(merchUI.getRefreshIcon(), methodName);
		getXpathWebElement(merchUI.getRefreshIcon());
		click();
		waitForElementPresent(merchUI.getKrdTermsSearchField(), methodName);
		enterKeys(merchUI.getKrdTermsSearchField(),
		keywordredirect.getRdRedirectTermValue());

		} catch (Exception e) {
		log.info("Exception in searchKeywordTerms" + e.getMessage());
		}
		}
	
	public void searchRedirectUrl(String screenshotName,Keywordredirect keywordredirect) {
		try {
		if (StringUtils.isEmpty(screenshotName)) {
		screenName = Thread.currentThread().getStackTrace()[1]
		.getMethodName();
		methodName = screenName;
		} else {
		methodName = screenshotName;
		}
		log.info("Executing searchKeywordTerms scenario");
		waitForElementPresent(merchUI.getRefreshIcon(), methodName);
		getXpathWebElement(merchUI.getRefreshIcon());
		click();
		waitForElementPresent(merchUI.getSearchField(), methodName);
		enterKeys(merchUI.getSearchField(),
		keywordredirect.getRdRedirectUrlValue());

		} catch (Exception e) {
		log.info("Exception in searchKeywordTerms" + e.getMessage());
		}
		}


	/**
	 * Implementation of the Method to Search Keyword Redirect
	 * 
	 * @param screenshotName
	 *            The name in which the Screen shot file is saved
	 */

	public void searchKeywordTerms(String screenshotName) {
		try {
			if (StringUtils.isEmpty(screenshotName)) {
				screenName = Thread.currentThread().getStackTrace()[1]
				                                                    .getMethodName();
				methodName = screenName;
			} else {
				methodName = screenshotName;
			}
			log.info("Executing searchKeywordTerms scenario");
			waitForElementPresent(merchUI.getKrdTermsSearchField(), methodName);
			enterKeys(merchUI.getKrdTermsSearchField(),
					merchData.getKrdTermsSearchFieldData());
			waitForElementPresent(merchUI.getRefreshIcon(), methodName);
			getXpathWebElement(merchUI.getRefreshIcon());
			click();
		} catch (Exception e) {
			log.info("Exception in searchKeywordTerms" + e.getMessage());
		}
	}

}
