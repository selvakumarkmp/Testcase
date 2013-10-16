package com.bestbuy.search.bt.uiconstants;

import java.io.File;
import java.io.FilenameFilter;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.w3c.dom.DOMException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import com.bestbuy.search.bt.Screens.BannersScreen;
import com.bestbuy.search.bt.Screens.BoostAndBlockScreen;
import com.bestbuy.search.bt.Screens.FacetsScreen;
import com.bestbuy.search.bt.Screens.KeywordRedirectScreen;
import com.bestbuy.search.bt.Screens.PromoScreen;
import com.bestbuy.search.bt.Screens.SynonymsScreen;
import com.bestbuy.search.bt.Screens.UserAdminScreen;
import com.bestbuy.search.bt.model.Banners;
import com.bestbuy.search.bt.model.Banners.Banner;
import com.bestbuy.search.bt.model.Boostandblocks.Boostandblock;
import com.bestbuy.search.bt.model.Boostandblocks.Boostandblock;
import com.bestbuy.search.bt.model.Facets;
import com.bestbuy.search.bt.model.Facets.Facet;
import com.bestbuy.search.bt.model.Keywordredirects.Keywordredirect;
import com.bestbuy.search.bt.model.Promos;
import com.bestbuy.search.bt.model.Promos.Promo;
import com.bestbuy.search.bt.model.Synonyms.Synonym;
import com.bestbuy.search.bt.model.Useradmins;
import com.bestbuy.search.bt.model.Useradmins.Useradmin;
import com.bestbuy.search.bt.selenium.util.ScreenException;

/**
 * The Class where the data is loaded from multiple xml's for create & update
 * functionality
 */

public class ReadCreateAndUpdateData {

	private static Element eElement;
	private Log log = LogFactory.getLog("ReadCreateData");
	private SynonymsScreen synonymsScreen;
	private KeywordRedirectScreen keywordRedirectScreen;
	private BannersScreen bannersScreen;
	private PromoScreen promoScreen;
	private FacetsScreen facetsScreen;
	private BoostAndBlockScreen boostAndBlockScreen;
	private UserAdminScreen userAdminScreen;
	private ModifyDateTime modifydatetime;
	private String textContent;

	private static final String KEYWORDREDIRECTCREATEDATA = "./src/main/resources/keywordredirects/create/keywordData.xml";
	private static final String BANNERSCREATEDATA = "./src/main/resources/banners/create/bannersdata.xml";
	private static final String PROMOCREATEDATA = "./src/main/resources/promo/create/promodata.xml";
	private static final String FACETSCREATEDATA = "./src/main/resources/facets/create/facetsdata.xml";
	
	private static final String SPRINT22_FACETSCREATEDATA="./src/main/resources/sprint22/facets/create/facetsdata.xml";

	private static final String KEYWORDREDIRECTUPDATEDATA = "./src/main/resources/keywordredirects/update/keywordData.xml";
	private static final String BANNERSUPDATEDATA = "./src/main/resources/banners/update/bannersdata.xml";
	private static final String PROMOUPDATEDATA = "./src/main/resources/promo/update/promodata.xml";
	private static final String FACETSUPDATEDATA = "./src/main/resources/facets/update/facetsdata.xml";

	private static final String KEYWORDREDIRECT = "keywordredirect";
	private static final String BANNERS = "banner";
	private static final String PROMO = "promo";
	private static final String FACETS = "facet";

	/**
	 * Method to read the xml data
	 */
	public ReadCreateAndUpdateData() {
		synonymsScreen = new SynonymsScreen();
		keywordRedirectScreen = new KeywordRedirectScreen();
		bannersScreen = new BannersScreen();
		promoScreen = new PromoScreen();
		facetsScreen = new FacetsScreen();
		boostAndBlockScreen = new BoostAndBlockScreen();
		userAdminScreen = new UserAdminScreen();
		modifydatetime = new ModifyDateTime();

	}

	/**
	 * Method to load the BestBuy constants
	 * 
	 * @param properties
	 *            properties is the variable that stores the xml file
	 * 
	 * @param tagname
	 *            tagname is the name of the root tag read from the xml
	 * 
	 * @throws ScreenException
	 *             ScreenException is an exception to suppress warnings
	 */

	public void loadBTConstansts(String properties, String tagname)
			throws ScreenException {

		try {
			File fXmlFile = new File(properties);
			DocumentBuilderFactory dbFactory = DocumentBuilderFactory
					.newInstance();
			dbFactory.setNamespaceAware(true);
			DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
			Document doc = dBuilder.parse(fXmlFile);
			NodeList nList = doc.getElementsByTagName(tagname);

			for (int temp = 0; temp < nList.getLength(); temp++) {

				Node nNode = nList.item(temp);
				if (nNode.getNodeType() == Node.ELEMENT_NODE) {

					eElement = (Element) nNode;

				}
			}
		} catch (Exception e) {
			log.info("Exception in loadBTConstansts" + e.getMessage());
		}
	}

	/**
	 * Method to read the tag value by passing the tag name
	 * 
	 * @param tagname
	 *            tagname is the name of the root tag read from the xml
	 */
	private void getElementsByTagName(String tagname) {

		try {
			textContent = eElement.getElementsByTagName(tagname).item(0)
					.getTextContent();
		} catch (DOMException e) {
			log.info("Exception in getElementsByTagName" + e.getMessage());
		}
	}

	/**
	 * Method to load create & update data from xml for synonyms tab
	 * 
	 * @param screenshotName
	 *            The name in which the Screen shot file is saved
	 * 
	 * @throws ScreenException
	 *             ScreenException is an exception to suppress warnings
	 */
	public void loadSynonymsCreateData(String screenshotName, Synonym synonym)
			throws ScreenException {
		try {
			synonymsScreen.selectSynonymsTab(screenshotName);
			synonymsScreen.addSynonym(screenshotName, synonym);

		} catch (Exception e) {
			log.info("Exception in loadSynonymsCreateData" + e.getMessage());
		}
	}

	/**
	 * Method to load create & update data from xml for Keyword Redirects tab
	 * 
	 * @param screenshotName
	 *            The name in which the Screen shot file is saved
	 * 
	 * @throws ScreenException
	 *             ScreenException is an exception to suppress warnings
	 */

	public void loadKeywordRedirectCreateData(String screenshotName,
			Keywordredirect keyword) throws ScreenException {
		try {

			modifydatetime.updateDateAndTime(KEYWORDREDIRECTCREATEDATA,
					KEYWORDREDIRECT);
			modifydatetime.updateDateAndTime(KEYWORDREDIRECTUPDATEDATA,
					KEYWORDREDIRECT);

			keywordRedirectScreen.addkeywordRedirect(screenshotName, keyword);

		} catch (Exception e) {
			log.info("Exception in loadKeywordRedirectCreateData"
					+ e.getMessage());
		}
	}

	/**
	 * Method to load create & update data from xml for Banners tab
	 * 
	 * @param screenshotName
	 *            The name in which the Screen shot file is saved
	 * 
	 * @throws ScreenException
	 *             ScreenException is an exception to suppress warnings
	 */
	public void loadBannersCreateAndUpdateData(String screenshotName,
			Banner banner) throws ScreenException {
		try {
			modifydatetime.updateDateAndTime(BANNERSCREATEDATA, BANNERS);
			modifydatetime.updateDateAndTime(BANNERSUPDATEDATA, BANNERS);
			bannersScreen.addBanners(screenshotName, banner);

		} catch (Exception e) {
			log.info("Exception in loadSynonymsCreateData" + e.getMessage());
		}
	}

	/**
	 * Method to load create & update data from xml for BoostandBlock tab
	 * 
	 * @param screenshotName
	 *            The name in which the Screen shot file is saved
	 * 
	 * @throws ScreenException
	 *             ScreenException is an exception to suppress warnings
	 */
	public void loadBoostBlockCreateAndUpdateData(String screenshotName,
			Boostandblock boostandblock) throws ScreenException {
		try {
			boostAndBlockScreen.selectBoostAndBlockTab(screenshotName);
			boostAndBlockScreen.addBoostAndBlock(screenshotName, boostandblock);

		} catch (Exception e) {
			log.info("Exception in loadBoostAndBlockCreateData"
					+ e.getMessage());
		}
	}

	/**
	 * Method to load create & update data from xml for Facets tab
	 * 
	 * @param screenshotName
	 *            The name in which the Screen shot file is saved
	 * 
	 * @throws ScreenException
	 *             ScreenException is an exception to suppress warnings
	 */
	public void loadFacetsCreateAndUpdateData(String screenshotName, Facet facet)
			throws ScreenException {
		try {
			modifydatetime.updateDateAndTime(SPRINT22_FACETSCREATEDATA, FACETS);
			modifydatetime.updateDateAndTime(FACETSCREATEDATA, FACETS);
			modifydatetime.updateDateAndTime(FACETSUPDATEDATA, FACETS);
			facetsScreen.selectFacetsTab(screenshotName);
			facetsScreen.addFacets(screenshotName, facet);

		} catch (Exception e) {
			log.info("Exception in loadFacetsCreateData" + e.getMessage());
		}
	}

	/**
	 * Method to load create & update data from xml for Promo tab
	 * 
	 * @param screenshotName
	 *            The name in which the Screen shot file is saved
	 * 
	 * @throws ScreenException
	 *             ScreenException is an exception to suppress warnings
	 */
	public void loadPromoCreateAndUpdateData(String screenshotName, Promo promo)
			throws ScreenException {
		try {

			modifydatetime.updateDateAndTime(PROMOCREATEDATA, PROMO);
			modifydatetime.updateDateAndTime(PROMOUPDATEDATA, PROMO);

			promoScreen.addPromoPage(screenshotName, promo);

		} catch (Exception e) {
			log.info("Exception in loadPromoCreateData" + e.getMessage());
		}
	}

	/**
	 * Method to load create & update data from xml for UserAdmin tab
	 * 
	 * @param screenshotName
	 *            The name in which the Screen shot file is saved
	 * 
	 * @throws ScreenException
	 *             ScreenException is an exception to suppress warnings
	 */
	public void loadUserAdminCreateAndUpdateData(String screenshotName,
			Useradmin useradmin) throws ScreenException {
		try {

			userAdminScreen.addUserAdmin(screenshotName, useradmin);

		} catch (Exception e) {
			log.info("Exception in loadUserAdminCreateData" + e.getMessage());
		}
	}
}

/**
 * Class to filter the .xml files
 */
class AllTestFilter implements FilenameFilter {

	public boolean accept(File dir, String name) {
		return name.endsWith(".xml");
	}
}
