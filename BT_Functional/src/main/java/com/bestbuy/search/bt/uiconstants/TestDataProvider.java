package com.bestbuy.search.bt.uiconstants;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import org.testng.ITestContext;
import org.testng.annotations.DataProvider;

import com.bestbuy.search.bt.model.Banners;
import com.bestbuy.search.bt.model.Banners.Banner;
import com.bestbuy.search.bt.model.Facets;

import com.bestbuy.search.bt.model.Boostandblocks;
import com.bestbuy.search.bt.model.Boostandblocks.Boostandblock;
import com.bestbuy.search.bt.model.Facets.Facet;
import com.bestbuy.search.bt.model.Keywordredirects;
import com.bestbuy.search.bt.model.Keywordredirects.Keywordredirect;
import com.bestbuy.search.bt.model.Promos;
import com.bestbuy.search.bt.model.Promos.Promo;
import com.bestbuy.search.bt.model.Synonyms;
import com.bestbuy.search.bt.model.Synonyms.Synonym;
import com.bestbuy.search.bt.model.Useradmins;
import com.bestbuy.search.bt.model.Useradmins.Useradmin;

public class TestDataProvider<E> {

	@DataProvider(name = "synonymsCreateData")
	public static Iterator<Object[]> synonymsDataProvider (ITestContext context) throws JAXBException {

		String inputFile = context.getCurrentXmlTest().getParameter("synonymdataXml");
		Synonyms synonyms = getFileContentList(inputFile, Synonyms.class);
		List<Synonym> synonym = synonyms.getSynonym();
		return getDataObject(synonym);

	}
	
	@DataProvider(name = "synonymsUpdateData")
	public static Iterator<Object[]> synonymsUpdateDataProvider (ITestContext context) throws JAXBException {

		String inputFile = context.getCurrentXmlTest().getParameter("synonymUpdatedataXml");
		Synonyms synonyms = getFileContentList(inputFile, Synonyms.class);
		List<Synonym> synonym = synonyms.getSynonym();
		return getDataObject(synonym);

	}
	
	@DataProvider(name = "keywordredirectdata")
	public static Iterator<Object[]> keywordRedirectDataProvider (ITestContext context) throws JAXBException {

		String inputFile = context.getCurrentXmlTest().getParameter("keywordredirectdataXml");
		Keywordredirects keywordredirects = getFileContentList(inputFile, Keywordredirects.class);
		List<Keywordredirect> keywordredirect = keywordredirects.getKeywordredirect();
		return getDataObject(keywordredirect);

	}
	
	@DataProvider(name = "keywordredirectupdatedata")
	public static Iterator<Object[]> keywordRedirectUpdateDataProvider (ITestContext context) throws JAXBException {

		String inputFile = context.getCurrentXmlTest().getParameter("keywordredirectUpdatedataXml");
		Keywordredirects keywordredirects = getFileContentList(inputFile, Keywordredirects.class);
		List<Keywordredirect> keywordredirect = keywordredirects.getKeywordredirect();
		return getDataObject(keywordredirect);

	}
	
	@DataProvider(name = "promosdata")
	public static Iterator<Object[]> promosDataProvider (ITestContext context) throws JAXBException {

		String inputFile = context.getCurrentXmlTest().getParameter("promodataXml");
		Promos promos = getFileContentList(inputFile, Promos.class);
		List<Promo> promo = promos.getPromo();
		return getDataObject(promo);

	}
	
	@DataProvider(name = "promosupdatedata")
	public static Iterator<Object[]> promosUpdateDataProvider (ITestContext context) throws JAXBException {

		String inputFile = context.getCurrentXmlTest().getParameter("promoUpdateDataXml");
		Promos promos = getFileContentList(inputFile, Promos.class);
		List<Promo> promo = promos.getPromo();
		return getDataObject(promo);

	}
	
	@DataProvider(name = "userAdminData")
	public static Iterator<Object[]> userAdminDataProvider (ITestContext context) throws JAXBException {

		String inputFile = context.getCurrentXmlTest().getParameter("userdataXml");
		Useradmins useradmins = getFileContentList(inputFile, Useradmins.class);
		List<Useradmin> useradmin = useradmins.getUseradmin();
		return getDataObject(useradmin);
	}
	
	@DataProvider(name = "userAdminUpdateData")
	public static Iterator<Object[]> userAdminUpdateDataProvider (ITestContext context) throws JAXBException {

		String inputFile = context.getCurrentXmlTest().getParameter("userUpdateDataXml");
		Useradmins useradmins = getFileContentList(inputFile, Useradmins.class);
		List<Useradmin> useradmin = useradmins.getUseradmin();
		return getDataObject(useradmin);
	}
	
	@DataProvider(name = "bannersdata")
	public static Iterator<Object[]> bannersDataProvider (ITestContext context) throws JAXBException {

		String inputFile = context.getCurrentXmlTest().getParameter("bannerdataXml");
		Banners banners = getFileContentList(inputFile, Banners.class);
		List<Banner> banner = banners.getBanner();
		return getDataObject(banner);

	}
	
	
	@DataProvider(name = "bannersupdatedata")
	public static Iterator<Object[]> bannersUpdateDataProvider (ITestContext context) throws JAXBException {

		String inputFile = context.getCurrentXmlTest().getParameter("bannerUpdateDataXml");
		Banners banners = getFileContentList(inputFile, Banners.class);
		List<Banner> banner = banners.getBanner();
		return getDataObject(banner);

	}
	
	@DataProvider(name = "facetsupdatedata")
	public static Iterator<Object[]> facetsUpdateDataProvider (ITestContext context) throws JAXBException {

		String inputFile = context.getCurrentXmlTest().getParameter("facetUpdateDataXml");
		Facets facets = getFileContentList(inputFile, Facets.class);
		List<Facet> facet = facets.getFacet();
		return getDataObject(facet);

	}
	
	@DataProvider(name = "facetsdata")
	public static Iterator<Object[]> facetsDataProvider (ITestContext context) throws JAXBException {

		String inputFile = context.getCurrentXmlTest().getParameter("facetdataXml");
		Facets facets = getFileContentList(inputFile, Facets.class);
		List<Facet> facet = facets.getFacet();
		return getDataObject(facet);

	}
	
	@DataProvider(name = "facetsdata1")
	public static Iterator<Object[]> facetsDataProvider1 (ITestContext context) throws JAXBException {

		String inputFile = context.getCurrentXmlTest().getParameter("facetdataXml1");
		Facets facets = getFileContentList(inputFile, Facets.class);
		List<Facet> facet = facets.getFacet();
		return getDataObject(facet);

	}
	
	@DataProvider(name = "facetsdata2")
	public static Iterator<Object[]> facetsDataProvider2 (ITestContext context) throws JAXBException {

		String inputFile = context.getCurrentXmlTest().getParameter("facetdataXml2");
		Facets facets = getFileContentList(inputFile, Facets.class);
		List<Facet> facet = facets.getFacet();
		return getDataObject(facet);

	}
	
	@DataProvider(name = "facetsdata3")
	public static Iterator<Object[]> facetsDataProvider3 (ITestContext context) throws JAXBException {

		String inputFile = context.getCurrentXmlTest().getParameter("facetdataXml3");
		Facets facets = getFileContentList(inputFile, Facets.class);
		List<Facet> facet = facets.getFacet();
		return getDataObject(facet);

	}
	
	@DataProvider(name = "boostandblockdata")
	public static Iterator<Object[]> boostAndBlockDataProvider (ITestContext context) throws JAXBException {

		String inputFile = context.getCurrentXmlTest().getParameter("boostandblockdataXml");
		Boostandblocks boostsAndBlocks = getFileContentList(inputFile, Boostandblocks.class);
		List<Boostandblock> boostsAndBlock = boostsAndBlocks.getBoostandblock();
		return getDataObject(boostsAndBlock);

	}
	
	
	@DataProvider(name = "sprint21facetcreatedata")
	public static Iterator<Object[]> sprint21FacetCreateDataProvider (ITestContext context) throws JAXBException {

		String inputFile = context.getCurrentXmlTest().getParameter("Sprint21facetCreateDataXml");
		Facets facets = getFileContentList(inputFile, Facets.class);
		List<Facet> facet = facets.getFacet();
		return getDataObject(facet);
	}
	
	@DataProvider(name = "sprint21facetupdatedata")
	public static Iterator<Object[]> sprint21FacetUpdateDataProvider (ITestContext context) throws JAXBException {

		String inputFile = context.getCurrentXmlTest().getParameter("Sprint21facetUpdateDataXml");
		Facets facets = getFileContentList(inputFile, Facets.class);
		List<Facet> facet = facets.getFacet();
		return getDataObject(facet);

	}
	
	@DataProvider(name = "sprint21keywordredirectcreatedata")
	public static Iterator<Object[]> sprint21KeywordRedirectDataProvider (ITestContext context) throws JAXBException {

		String inputFile = context.getCurrentXmlTest().getParameter("Sprint21KeywordCreateDataXml");
		Keywordredirects keywordredirects = getFileContentList(inputFile, Keywordredirects.class);
		List<Keywordredirect> keywordredirect = keywordredirects.getKeywordredirect();
		return getDataObject(keywordredirect);

	}
	
	@DataProvider(name = "sprint21keywordredirectupdatedata")
	public static Iterator<Object[]> sprint21KeywordRedirectUpdateDataProvider (ITestContext context) throws JAXBException {

		String inputFile = context.getCurrentXmlTest().getParameter("Sprint21KeywordUpdateDataXml");
		Keywordredirects keywordredirects = getFileContentList(inputFile, Keywordredirects.class);
		List<Keywordredirect> keywordredirect = keywordredirects.getKeywordredirect();
		return getDataObject(keywordredirect);

	}
	
	@DataProvider(name = "sprint21bannerscreatedata")
	public static Iterator<Object[]> sprint21BannersDataProvider (ITestContext context) throws JAXBException {

		String inputFile = context.getCurrentXmlTest().getParameter("Sprint21BannersCreateDataXml");
		Banners banners = getFileContentList(inputFile, Banners.class);
		List<Banner> banner = banners.getBanner();
		return getDataObject(banner);

	}
	
	
	@DataProvider(name = "sprint21bannersupdatedata")
	public static Iterator<Object[]> sprint21BannersUpdateDataProvider (ITestContext context) throws JAXBException {

		String inputFile = context.getCurrentXmlTest().getParameter("Sprint21BannersUpdateDataXml");
		Banners banners = getFileContentList(inputFile, Banners.class);
		List<Banner> banner = banners.getBanner();
		return getDataObject(banner);

	}
	
	
	private static <T> Iterator<Object[]> getDataObject(List<T> objList) {
		List<Object[]> dataToBeReturned = new ArrayList<Object[]>();
		for (T userData : objList) {
			dataToBeReturned.add(new Object[] { userData } );
		}

		return dataToBeReturned.iterator();
	}
	
	

	@SuppressWarnings("unchecked")
	private static <T> T getFileContentList(String filenamePath, Class<T> clazz) throws JAXBException {

		JAXBContext jaxbContext = JAXBContext.newInstance(clazz);
		Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
		InputStream resourceAsStream = clazz.getResourceAsStream(filenamePath);
		return (T) jaxbUnmarshaller.unmarshal(resourceAsStream);
	}
}
