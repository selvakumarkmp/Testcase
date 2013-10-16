package com.bestbuy.search.bt.Screens;

import org.apache.commons.lang.StringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import com.bestbuy.search.bt.model.Banners.Banner;
import com.bestbuy.search.bt.selenium.util.MagicNumbers;
import com.bestbuy.search.bt.uiconstants.MerchandisingUIIdentifiers;
import com.bestbuy.search.bt.uiconstants.MerchandisingUIData;

/**
 * Class that contains the implementation of the methods that are called in the
 * Test methods of the Class BannersTest
 */

public class BannersScreen extends BaseScreen {

	private Log log = LogFactory.getLog("BannersScreen");
	private MerchandisingUIIdentifiers merchUI;
	private MerchandisingUIData merchData;
	private String screenName;
	private String methodName;

	/**
	 * Constructor of the class which initializes other constructors
	 */
	public BannersScreen() {

		merchUI = new MerchandisingUIIdentifiers();
		merchData = new MerchandisingUIData();
	}

	/**
	 * Implementation of the Method to Add Banners
	 * 
	 * @param screenshotName
	 *            The name in which the Screen shot file is saved
	 * 
	 * @param banners
	 *            Object of the Banners Class
	 */

	public void addBanners(String screenshotName, Banner banner) {

		try {
			if (StringUtils.isEmpty(screenshotName)) {
				screenName = Thread.currentThread().getStackTrace()[1]
						.getMethodName();
				methodName = screenName;
			} else {
				methodName = screenshotName;
			}
			log.info("Executing Addbanners scenario");
			Thread.sleep(MagicNumbers.THREE_THOUSAND_SECONDS);
			if (getXpathWebElement(merchUI.getBannersTab()).isDisplayed()) {
				waitForElementPresent(merchUI.getBannersTab(), methodName);
				getXpathWebElement(merchUI.getBannersTab());
				click();
			} else {
				waitForElementPresent(merchUI.getIpadViewMenuTab(), methodName);
				getXpathWebElement(merchUI.getIpadViewMenuTab());
				click();
				waitForElementPresent(merchUI.getIpadViewBannersTab(),
						methodName);
				getXpathWebElement(merchUI.getIpadViewBannersTab());
				click();
			}
			waitForElementPresent(merchUI.getAddIcon(), methodName);
			getXpathWebElement(merchUI.getAddIcon());
			click();
			waitForElementPresent(merchUI.getBannerCreateName(), methodName);
			getXpathWebElement(merchUI.getBannerCreateName());
			click();
			sendKeys(banner.getBannersBannerName());
			waitForElementPresent(merchUI.getBannerCreatePriority(), methodName);
			getXpathWebElement(merchUI.getBannerCreatePriority());
			click();
			sendKeys(banner.getBannersPriority());
			waitForElementPresent(merchUI.getStartDate(), methodName);
			getXpathWebElement(merchUI.getStartDate());
			click();
			waitForElementPresent(merchUI.getCalMonthFieldXpath(), methodName);
			getXpathWebElement(merchUI.getCalMonthFieldXpath());
			click();
			selectText(element, banner.getStartDateMonth());
			waitForElementPresent(merchUI.getCalYearFieldXpath(), methodName);
			getXpathWebElement(merchUI.getCalYearFieldXpath());
			click();
			selectText(element, banner.getStartDateYear());
			waitForElementPresent(merchUI.getCalHourFieldXpath(), methodName);
			getXpathWebElement(merchUI.getCalHourFieldXpath());
			click();
			sendKeys(banner.getStartDateHour());
			waitForElementPresent(merchUI.getCalMinuteFieldXpath(), methodName);
			getXpathWebElement(merchUI.getCalMinuteFieldXpath());
			click();
			sendKeys(banner.getStartDateMinute());
			if ("Dec".equals(banner.getStartDateMonth())) {

				if ("23".equals(banner.getStartDateHour())) {

					if ("59".equals(banner.getStartDateMinute())) {
					

					if ("2013".equals(banner.getStartDateYear())) {
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
			selectText(element, banner.getEndDateMonth());
			waitForElementPresent(merchUI.getCalYearFieldXpath(), methodName);
			getXpathWebElement(merchUI.getCalYearFieldXpath());
			click();
			selectText(element, banner.getEndDateYear());
			waitForElementPresent(merchUI.getCalHourFieldXpath(), methodName);
			getXpathWebElement(merchUI.getCalHourFieldXpath());
			click();
			sendKeys(banner.getEndDateHour());
			waitForElementPresent(merchUI.getCalMinuteFieldXpath(), methodName);
			getXpathWebElement(merchUI.getCalMinuteFieldXpath());
			click();
			sendKeys(banner.getEndDateMinute());
			if ("Dec".equals(banner.getEndDateMonth())) {

				if ("23".equals(banner.getEndDateHour())) {

					if ("59".equals(banner.getEndDateMinute())) {

						if ("2014".equals(banner.getEndDateYear())) {
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
			waitForElementPresent(merchUI.getBannerCreateContextKeyword(),
					methodName);
			getXpathWebElement(merchUI.getBannerCreateContextKeyword());
			click();
			sendKeys(banner.getBannersContextKeyWord());
			waitForElementPresent(
					merchUI.getBannerCreateContextKeywordAddTerm(), methodName);
			getXpathWebElement(merchUI.getBannerCreateContextKeywordAddTerm());
			click();
			waitForElementPresent(
					merchUI.getBannerCreateContextSelectCategory(), methodName);
			getXpathWebElement(merchUI.getBannerCreateContextSelectCategory());
			click();
			waitForElementPresent(
					merchUI.getBannerCreateContextSelectCategoryTree(),
					methodName);
			getXpathWebElement(merchUI
					.getBannerCreateContextSelectCategoryTree());
			click();
			waitForElementPresent(
					merchUI.getBannerCreateContextSelectProductInTree(),
					methodName);
			getXpathWebElement(merchUI
					.getBannerCreateContextSelectProductInTree());
			click();
			waitForElementPresent(
					merchUI.getBannerCreateContextApplySubCategoryCheckBox(),
					methodName);
			getXpathWebElement(merchUI
					.getBannerCreateContextApplySubCategoryCheckBox());
			click();

			waitForElementPresent(merchUI.getBannerCreateContextAddCategory(),
					methodName);
			getXpathWebElement(merchUI.getBannerCreateContextAddCategory());
			click();
			waitForElementPresent(merchUI.getBannerCreateContextKeyword1(),
					methodName);
			getXpathWebElement(merchUI.getBannerCreateContextKeyword1());
			click();
			sendKeys(banner.getBannersContextKeyWord());
			waitForElementPresent(
					merchUI.getBannerCreateContextKeywordAddTerm1(), methodName);
			getXpathWebElement(merchUI.getBannerCreateContextKeywordAddTerm1());
			click();
			waitForElementPresent(
					merchUI.getBannerCreateContextSelectCategory1(), methodName);
			getXpathWebElement(merchUI.getBannerCreateContextSelectCategory1());
			click();
			waitForElementPresent(
					merchUI.getBannerCreateContextSelectCategoryTree1(),
					methodName);
			getXpathWebElement(merchUI
					.getBannerCreateContextSelectCategoryTree1());
			click();
			waitForElementPresent(
					merchUI.getBannerCreateContextSelectProductInTree1(),
					methodName);
			getXpathWebElement(merchUI
					.getBannerCreateContextSelectProductInTree1());
			click();

			waitForElementPresent(merchUI.getBannerCreateThemeBannersTemp(),
					methodName);
			getXpathWebElement(merchUI.getBannerCreateThemeBannersTemp());
			click();
			selectText(element, merchData.getBannerThemetemplate());
			waitForElementPresent(merchUI.getBannerCreateThemeAssetId(),
					methodName);
			getXpathWebElement(merchUI.getBannerCreateThemeAssetId());
			click();
			sendKeys(banner.getBannersThemeAssetID());
			waitForElementPresent(merchUI.getBannerCreateButton(), methodName);
			getXpathWebElement(merchUI.getBannerCreateButton());
			click();
			isTextPresent(banner.getBannersBannerName());

		} catch (Exception e) {
			log.info("Exception in addBanners" + e.getMessage());
		}
	}

	/**
	 * Implementation of the Method to Update Banners
	 * 
	 * @param screenshotName
	 *            The name in which the Screen shot file is saved
	 * 
	 * @param upbanners
	 *            Object of the Banners Class
	 */

	public void updateBanners(String screenshotName, Banner banner) {
		try {
			if (StringUtils.isEmpty(screenshotName)) {
				screenName = Thread.currentThread().getStackTrace()[1]
						.getMethodName();
				methodName = screenName;
			} else {
				methodName = screenshotName;
			}
			log.info("Executing Updatebanners scenario");

			bannersKeywordSearch(methodName, banner);
			waitForElementPresent(merchUI.getEditBtn(), methodName);
			getXpathWebElement(merchUI.getEditBtn());
			click();
			waitForElementPresent(merchUI.getBannerCreateName(), methodName);
			getXpathWebElement(merchUI.getBannerCreateName());
			click();
			clear();
			sendKeys(banner.getBannersBannerName());
			waitForElementPresent(merchUI.getBannerCreateThemeBannersTemp(),
					methodName);
			getXpathWebElement(merchUI.getBannerCreateThemeBannersTemp());
			click();
			sendKeys(merchData.getBannerThemetemplate());
			waitForElementPresent(merchUI.getBannerCreateThemeAssetId(),
					methodName);
			getXpathWebElement(merchUI.getBannerCreateThemeAssetId());
			click();
			sendKeys(merchData.getBannerThemeAssetId());
			waitForElementPresent(merchUI.getBannerUpdateButton(), methodName);
			getXpathWebElement(merchUI.getBannerUpdateButton());
			click();
			isTextPresent(banner.getBannersBannerName());
		} catch (Exception e) {
			log.info("Exception in updateBanners" + e.getMessage());
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
			Thread.sleep(MagicNumbers.THREE_THOUSAND_SECONDS);
			waitForElementPresent(merchUI.getBannerCreateButton(), methodName);
			getXpathWebElement(merchUI.getBannerCreateButton());
			click();
			waitForElementPresent(merchUI.getBannersAddUpdatePopUpCloseBtn(),
					methodName);
			getXpathWebElement(merchUI.getBannersAddUpdatePopUpCloseBtn());
			click();
		} catch (Exception e) {
			log.info("Exception in VerifyCreatePopUpTextFieldsValidation"
					+ e.getMessage());
		}
	}

	public void VerifyUpdatePopUpTextFieldsValidation(String screenshotName) {
		try {
			if (StringUtils.isEmpty(screenshotName)) {
				screenName = Thread.currentThread().getStackTrace()[1]
						.getMethodName();
				methodName = screenName;
			} else {
				methodName = screenshotName;
			}
			log.info("Executing VerifyUpdatePopUpTextFieldsValidation scenario");
			waitForElementPresent(merchUI.getEditBtn(), methodName);
			getXpathWebElement(merchUI.getEditBtn());
			click();
			Thread.sleep(MagicNumbers.THREE_THOUSAND_SECONDS);
			waitForElementPresent(merchUI.getBannerCreateName(), methodName);
			getXpathWebElement(merchUI.getBannerCreateName());
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
			waitForElementPresent(
					merchUI.getBannersUpdatePopUpKeywordTermCloseBtn(),
					methodName);
			getXpathWebElement(merchUI
					.getBannersUpdatePopUpKeywordTermCloseBtn());
			click();

			getXpathWebElement(merchUI.getBannerCreateThemeAssetId());
			click();
			clear();

			waitForElementPresent(merchUI.getBannerUpdateButton(), methodName);
			getXpathWebElement(merchUI.getBannerUpdateButton());
			click();
			waitForElementPresent(merchUI.getBannersAddUpdatePopUpCloseBtn(),
					methodName);
			getXpathWebElement(merchUI.getBannersAddUpdatePopUpCloseBtn());
			click();
		} catch (Exception e) {
			log.info("Exception in VerifyUpdatePopUpTextFieldsValidation"
					+ e.getMessage());
		}
	}

	/**
	 * Implementation of the Method to Approve Banners
	 * 
	 * @param screenshotName
	 *            The name in which the Screen shot file is saved
	 */

	public void approveBanners(String screenshotName, Banner banner) {
		try {
			if (StringUtils.isEmpty(screenshotName)) {
				screenName = Thread.currentThread().getStackTrace()[1]
						.getMethodName();
				methodName = screenName;
			} else {
				methodName = screenshotName;
			}
			log.info("Executing Approvebanners scenario");
			searchBanners(methodName, banner);
			waitForElementPresent(merchUI.getApproveTab(), methodName);
			getXpathWebElement(merchUI.getApproveTab());
			click();

		} catch (Exception e) {
			log.info("Exception in approveBanners" + e.getMessage());
		}

	}

	/**
	 * Implementation of the Method to Reject Banners
	 * 
	 * @param screenshotName
	 *            The name in which the Screen shot file is saved
	 */

	public void rejectBanners(String screenshotName, Banner banner) {
		try {
			if (StringUtils.isEmpty(screenshotName)) {
				screenName = Thread.currentThread().getStackTrace()[1]
						.getMethodName();
				methodName = screenName;
			} else {
				methodName = screenshotName;
			}
			log.info("Executing Rejectbanners scenario");
			searchBanners(methodName, banner);
			waitForElementPresent(merchUI.getRejectTab(), methodName);
			getXpathWebElement(merchUI.getRejectTab());
			click();

		} catch (Exception e) {
			log.info("Exception in rejectBanners" + e.getMessage());
		}
	}

	/**
	 * Implementation of the Method to Search Banners
	 * 
	 * @param screenshotName
	 *            The name in which the Screen shot file is saved
	 */

	public void invalidSearchBanners(String screenshotName) {
		try {
			if (StringUtils.isEmpty(screenshotName)) {
				screenName = Thread.currentThread().getStackTrace()[1]
						.getMethodName();
				methodName = screenName;
			} else {
				methodName = screenshotName;
			}

			log.info("Executing invalidSearchBanners scenario");
			waitForElementPresent(merchUI.getBannersNameSearch(), methodName);
			enterKeys(merchUI.getBannersNameSearch(),
					merchData.getBannerSearchData());
			waitForElementPresent(merchUI.getRefreshIcon(), methodName);
			getXpathWebElement(merchUI.getRefreshIcon());
			click();

		} catch (Exception e) {
			log.info("Exception in invalidSearchBanners" + e.getMessage());
		}
	}

	/**
	 * Implementation of the Method to Show or Hide All Banners
	 * 
	 * @param screenshotName
	 *            The name in which the Screen shot file is saved
	 */

	public void showOrHideAllBanners(String screenshotName) {
		try {
			if (StringUtils.isEmpty(screenshotName)) {
				screenName = Thread.currentThread().getStackTrace()[1]
						.getMethodName();
				methodName = screenName;
			} else {
				methodName = screenshotName;
			}
			log.info("Executing ShowOrHideAllbanners scenario");
			waitForElementPresent(merchUI.getBannerShowAll(), methodName);
			getXpathWebElement(merchUI.getBannerShowAll());
			click();
			waitForElementPresent(merchUI.getBannerHideAll(), methodName);
			getXpathWebElement(merchUI.getBannerHideAll());
			click();
		} catch (Exception e) {
			log.info("Exception in showOrHideAllBanners" + e.getMessage());
		}
	}

	/**
	 * Implementation of the Method to Sort and Refresh Banners
	 * 
	 * @param screenshotName
	 *            The name in which the Screen shot file is saved
	 */

	public void sortnRefreshBanners(String screenshotName) {
		try {
			if (StringUtils.isEmpty(screenshotName)) {
				screenName = Thread.currentThread().getStackTrace()[1]
						.getMethodName();
				methodName = screenName;
			} else {
				methodName = screenshotName;
			}
			log.info("Executing SortnRefreshbanners scenario");
			waitForElementPresent(merchUI.getBannerSortByName(), methodName);
			getXpathWebElement(merchUI.getBannerSortByName());
			click();
			waitForElementPresent(merchUI.getBannerSortByName(), methodName);
			getXpathWebElement(merchUI.getBannerSortByName());
			click();
			waitForElementPresent(merchUI.getRefreshIcon(), methodName);
			getXpathWebElement(merchUI.getRefreshIcon());
			click();
		} catch (Exception e) {
			log.info("Exception in sortnRefreshBanners" + e.getMessage());
		}
	}

	/**
	 * Implementation of the Method to Delete Banners
	 * 
	 * @param screenshotName
	 *            The name in which the Screen shot file is saved
	 */

	public void deleteBanner(String screenshotName, Banner banner) {
		try {
			if (StringUtils.isEmpty(screenshotName)) {
				screenName = Thread.currentThread().getStackTrace()[1]
						.getMethodName();
				methodName = screenName;
			} else {
				methodName = screenshotName;
			}
			log.info("Executing DeleteBanner scenario");
			Thread.sleep(MagicNumbers.TWO_THOUSAND_SECONDS);
			if (getXpathWebElement(merchUI.getDeleteTab()).isDisplayed()) {
				waitForElementPresent(merchUI.getDeleteTab(), methodName);
				getXpathWebElement(merchUI.getDeleteTab());
				click();
				waitForElementPresent(merchUI.getDeletePopUPOKBtn(), methodName);
				getXpathWebElement(merchUI.getDeletePopUPOKBtn());
				click();
			} else {
				log.info(" Banner Delete Icon Not Displayed");
			}

		} catch (Exception e) {
			log.info("Exception in deleteBanner" + e.getMessage());
		}
	}

	/**
	 * Implementation of the Method to verify the pagination of the Banners
	 * 
	 * @param screenshotName
	 *            The name in which the Screen shot file is saved
	 */

	public void pagiNationForBannersPage(String screenshotName) {
		try {
			if (StringUtils.isEmpty(screenshotName)) {
				screenName = Thread.currentThread().getStackTrace()[1]
						.getMethodName();
				methodName = screenName;
			} else {
				methodName = screenshotName;
			}
			log.info("Executing PagiNationForBannersPage scenario");
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
			log.info("Exception in pagiNationForBannersPage" + e.getMessage());
		}
	}

	/**
	 * Implementation of the Method to Search Banners
	 * 
	 * @param screenshotName
	 *            The name in which the Screen shot file is saved
	 */

	public void searchBannersName(String screenshotName) {
		try {
			if (StringUtils.isEmpty(screenshotName)) {
				screenName = Thread.currentThread().getStackTrace()[1]
						.getMethodName();
				methodName = screenName;
			} else {
				methodName = screenshotName;
			}
			log.info("Executing searchBanners scenario");
			waitForElementPresent(merchUI.getRefreshIcon(), methodName);
			getXpathWebElement(merchUI.getRefreshIcon());
			click();
			waitForElementPresent(merchUI.getBannersNameSearch(), methodName);
			enterKeys(merchUI.getBannersNameSearch(),
					merchData.getBannersBannersNameSearchData());
			waitForElementPresent(merchUI.getRefreshIcon(), methodName);
			getXpathWebElement(merchUI.getRefreshIcon());
			click();
		} catch (Exception e) {
			log.info("Exception in searchBanners" + e.getMessage());
		}
	}

	public void bannersKeywordSearch(String screenshotName, Banner banner) {
		try {
			if (StringUtils.isEmpty(screenshotName)) {
				screenName = Thread.currentThread().getStackTrace()[1]
						.getMethodName();
				methodName = screenName;
			} else {
				methodName = screenshotName;
			}
			log.info("Executing bannersKeywordSearch scenario");
			waitForElementPresent(merchUI.getRefreshIcon(), methodName);
			getXpathWebElement(merchUI.getRefreshIcon());
			click();
			waitForElementPresent(merchUI.getBannersKeywordSearch(), methodName);
			enterKeys(merchUI.getBannersKeywordSearch(),
					banner.getBannersContextKeyWord());

		} catch (Exception e) {
			log.info("Exception in bannersKeywordSearch" + e.getMessage());
		}
	}

	public void searchBanners(String screenshotName, Banner banner) {
		try {
			if (StringUtils.isEmpty(screenshotName)) {
				screenName = Thread.currentThread().getStackTrace()[1]
						.getMethodName();
				methodName = screenName;
			} else {
				methodName = screenshotName;
			}
			log.info("Executing searchBanners scenario");
			waitForElementPresent(merchUI.getRefreshIcon(), methodName);
			getXpathWebElement(merchUI.getRefreshIcon());
			click();
			waitForElementPresent(merchUI.getBannersNameSearch(), methodName);
			enterKeys(merchUI.getBannersNameSearch(),
					banner.getBannersBannerName());

		} catch (Exception e) {
			log.info("Exception in searchBanners" + e.getMessage());
		}
	}

}
