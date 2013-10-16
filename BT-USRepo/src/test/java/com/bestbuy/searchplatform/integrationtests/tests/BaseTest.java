package com.bestbuy.searchplatform.integrationtests.tests;

import static com.bestbuy.searchplatform.integrationtests.commons.IntegationTestConstants.BANNER_DELETE;
import static com.bestbuy.searchplatform.integrationtests.commons.IntegationTestConstants.BOOSTBLOCK_DELETE;
import static com.bestbuy.searchplatform.integrationtests.commons.IntegationTestConstants.BT_REST_PASSWORD;
import static com.bestbuy.searchplatform.integrationtests.commons.IntegationTestConstants.BT_REST_URL;
import static com.bestbuy.searchplatform.integrationtests.commons.IntegationTestConstants.BT_REST_USERNAME;
import static com.bestbuy.searchplatform.integrationtests.commons.IntegationTestConstants.FACET_DELETE;
import static com.bestbuy.searchplatform.integrationtests.commons.IntegationTestConstants.PROMO_DELETE;
import static com.bestbuy.searchplatform.integrationtests.commons.IntegationTestConstants.PROP_FILE;
import static com.bestbuy.searchplatform.integrationtests.commons.IntegationTestConstants.REDIRECT_DELETE;
import static com.bestbuy.searchplatform.integrationtests.commons.IntegationTestConstants.REST_SERVICE_TIMEOUT;
import static com.bestbuy.searchplatform.integrationtests.commons.IntegationTestConstants.SYNONYM_DELETE;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotNull;
import static org.testng.Assert.assertTrue;

import java.io.InputStream;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.logging.Logger;

import org.codehaus.jettison.json.JSONObject;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.http.client.SimpleClientHttpRequestFactory;
import org.springframework.security.core.codec.Base64;
import org.springframework.web.client.RestTemplate;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.bestbuy.searchplatform.integrationtests.commons.Constants;
import com.bestbuy.searchplatform.integrationtests.model.Banners.Banner;
import com.bestbuy.searchplatform.integrationtests.model.BoostsAndBlocks.BoostsAndBlock;
import com.bestbuy.searchplatform.integrationtests.model.Facets.Facet;
import com.bestbuy.searchplatform.integrationtests.model.Keywordredirects.Keywordredirect;
import com.bestbuy.searchplatform.integrationtests.model.Synonyms.Synonym;

public class BaseTest implements Constants {

	private final static Logger log = Logger.getLogger("BaseTest");
	private static Properties properties = new Properties(); 
	private static RestTemplate restTemplate = null;
	private static HttpHeaders headers = null;
	private static Map<Integer,Keywordredirect> redirectsMap = new HashMap<Integer,Keywordredirect>();
	private static Map<Integer,Banner> bannersMap = new HashMap<Integer,Banner>();
	private static Map<Integer,String> promosMap = new HashMap<Integer,String>();
	private static Map<Integer,Synonym> synonymsMap = new HashMap<Integer,Synonym>();
	private static Map<Integer,Facet> facetsMap = new HashMap<Integer,Facet>();
	private static Map<Integer,BoostsAndBlock> boostsAndBlocksMap = new HashMap<Integer,BoostsAndBlock>();
	private static Map<String,BoostsAndBlock> boostSkuId = new HashMap<String,BoostsAndBlock>();
	private static Map<String,Integer> attributeID = new HashMap<String,Integer>();
	
	
	

	@BeforeSuite (alwaysRun = true) 
	public void beforeSuite() throws Exception{
		log.info(" before suite = started loading properties");
		loadRestProperties();
		//set the rest template to call the service
		int timeout = Integer.parseInt(getProperty(REST_SERVICE_TIMEOUT));
		restTemplate = new RestTemplate();
		((SimpleClientHttpRequestFactory)restTemplate.getRequestFactory() ).setReadTimeout(timeout);
		//ToDO Need to move the requestHeaders here
		headers = getAuthenticationHeaders();
		log.info("before suite = completed");
	}
	
	//@AfterSuite (alwaysRun = true) 
	public void cleanUpSuite() throws Exception{
		log.info(" After suite = clean up started");
		log.info(" redirects cleanup ");
		if(redirectsMap != null && redirectsMap.size() > 0){
			String url = getProperty(BT_REST_URL)+REDIRECT_DELETE+"/";
			log.info("delete redirect resturl = "+url);
			for (Integer redirectId : getRedirectsMap().keySet()) {
				 HttpEntity<Integer> entity = new HttpEntity<Integer>(getHeaders());
				 ResponseEntity<String> response =  getRestTemplate().exchange(url+redirectId, HttpMethod.PUT, entity, String.class);
				 assertNotNull(response);
				 String redirectResponseString =  response.getBody();
				 log.info("delete redirect response = "+redirectResponseString);
				 JSONObject redirectResponse = new JSONObject(redirectResponseString);
				 assertTrue(redirectResponse.has("data"));
				 JSONObject data = (JSONObject)redirectResponse.get("data");
				 assertTrue(data.has("statusId"));
				 Integer statusId = (Integer)data.get("statusId");
				 log.info("deleted redirect status = "+redirectId+" status = "+statusId);
				 assertNotNull(statusId);
				 assertTrue(statusId == 7);
			}
			redirectsMap.clear();
		}
		log.info(" Banners cleanup ");
		if(bannersMap != null && bannersMap.size() > 0){
			String url = getProperty(BT_REST_URL)+BANNER_DELETE+"/";
			log.info("delete banner resturl = "+url);
			for (Integer bannerId : getBannersMap().keySet()) {
				 HttpEntity<Integer> entity = new HttpEntity<Integer>(getHeaders());
				 ResponseEntity<String> response =  getRestTemplate().exchange(url+bannerId, HttpMethod.PUT, entity, String.class);
				 assertNotNull(response);
				 String bannerResponseString =  response.getBody();
				 log.info("delete banner response = "+bannerResponseString);
				 JSONObject bannerResponse = new JSONObject(bannerResponseString);
				 assertTrue(bannerResponse.has("data"));
				 JSONObject data = (JSONObject)bannerResponse.get("data");
				 assertTrue(data.has("statusId"));
				 Integer statusId = (Integer)data.get("statusId");
				 log.info("deleted banner status = "+bannerId+" status = "+statusId);
				 assertNotNull(statusId);
				 assertTrue(statusId == 7);
			}
			bannersMap.clear();
		}
		log.info(" Promos cleanup ");
		if(promosMap != null && promosMap.size() > 0){
			String url = getProperty(BT_REST_URL)+PROMO_DELETE+"/";
			log.info("delete promo resturl = "+url);
			for (Integer promoId : getPromosMap().keySet()) {
				 HttpEntity<Integer> entity = new HttpEntity<Integer>(getHeaders());
				 ResponseEntity<String> response =  getRestTemplate().exchange(url+promoId, HttpMethod.PUT, entity, String.class);
				 assertNotNull(response);
				 String promoResponseString =  response.getBody();
				 log.info("delete promo response = "+promoResponseString);
				 JSONObject promoResponse = new JSONObject(promoResponseString);
				 assertTrue(promoResponse.has("data"));
				 JSONObject data = (JSONObject)promoResponse.get("data");
				 assertTrue(data.has("statusId"));
				 Integer statusId = (Integer)data.get("statusId");
				 log.info("deleted promo status = "+promoId+" status = "+statusId);
				 assertNotNull(statusId);
				 assertTrue(statusId == 7);
			}
			promosMap.clear();
		}
		
		log.info(" synonyms cleanup ");
		if(synonymsMap != null && synonymsMap.size() > 0){
			String url = getProperty(BT_REST_URL)+SYNONYM_DELETE+"/";
			log.info("delete synonym resturl = "+url);
			for (Integer synonymId : getSynonymsMap().keySet()) {
				 HttpEntity<Integer> entity = new HttpEntity<Integer>(getHeaders());
				 ResponseEntity<String> response =  getRestTemplate().exchange(url+synonymId, HttpMethod.PUT, entity, String.class);
				 assertNotNull(response);
				 String synonymResponseString =  response.getBody();
				 log.info("delete synonym response = "+synonymResponseString);
				 JSONObject synonymResponse = new JSONObject(synonymResponseString);
				 assertTrue(synonymResponse.has("data"));
				 JSONObject data = (JSONObject)synonymResponse.get("data");
				 assertTrue(data.has("status"));
				 String status = (String)data.get("status");
				 log.info("delete synonym status = "+synonymId+" status = "+status);
				 assertNotNull(status);
				 assertEquals(status,"Deleted");
			}
			synonymsMap.clear();
		}
		
		log.info(" facets cleanup ");
		if(facetsMap != null && facetsMap.size() > 0){
			String url = getProperty(BT_REST_URL)+FACET_DELETE+"/";
			log.info("delete facet resturl = "+url);
			for (Integer facetId : facetsMap.keySet()) {
				 HttpEntity<Integer> entity = new HttpEntity<Integer>(getHeaders());
				 ResponseEntity<String> response =  getRestTemplate().exchange(url+facetId, HttpMethod.PUT, entity, String.class);
				 assertNotNull(response);
				 String facetResponseString =  response.getBody();
				 log.info("delete facet response = "+facetResponseString);
				 JSONObject facetResponse = new JSONObject(facetResponseString);
				 assertTrue(facetResponse.has("status"));
				 String status = (String)facetResponse.get("status");
				 assertEquals(status, "SUCCESS");
			}
			facetsMap.clear();
		}
		
		log.info(" boostandblock cleanup ");
		if(boostsAndBlocksMap != null && boostsAndBlocksMap.size() > 0){
			String url = getProperty(BT_REST_URL)+BOOSTBLOCK_DELETE+"/";
			log.info("delete boost resturl = "+url);
			for (Integer boostBlockId : boostsAndBlocksMap.keySet()) {
				 HttpEntity<Integer> entity = new HttpEntity<Integer>(getHeaders());
				 ResponseEntity<String> response =  getRestTemplate().exchange(url+boostBlockId, HttpMethod.PUT, entity, String.class);
				 assertNotNull(response);
				 String boostAndBlockResponseString =  response.getBody();
				 log.info("delete boostAndBlock response = "+boostAndBlockResponseString);
				 JSONObject boostAndBlockResponse = new JSONObject(boostAndBlockResponseString);
				 assertTrue(boostAndBlockResponse.has("status"));
				 String status = (String)boostAndBlockResponse.get("status");
				 assertEquals(status, "SUCCESS");
			}
			boostsAndBlocksMap.clear();
		}
		
		
		
	}
	
	
	@BeforeMethod (alwaysRun = true) 
	public void setUp() throws Exception {
		int timeout = Integer.parseInt(getProperty(REST_SERVICE_TIMEOUT));
		restTemplate = new RestTemplate();
		((SimpleClientHttpRequestFactory)restTemplate.getRequestFactory() ).setReadTimeout(timeout);
	}



	@AfterMethod (alwaysRun = true) 
	public void tearDown() throws Exception {
		
	}


	
	
	/**
	 * Method to load the properties from the properties File
	 * @throws Exception
	 */
	private void loadRestProperties() throws Exception{
		InputStream inputStream  = null;
		inputStream = this.getClass().getResourceAsStream(PROP_FILE);
    	properties.load(inputStream);
   }
	
	/**
	 * Loads the Property from the properties Map
	 * @param propertyKey
	 * @return
	 */
	public static String getProperty(String propertyKey){
		String propertyVal = null;
		if(properties != null && !properties.isEmpty()){
			propertyVal = properties.getProperty(propertyKey);
		}
		return propertyVal;
	}
	
	/**
	 * Authentication Headers
	 * @return
	 */
	public HttpHeaders getAuthenticationHeaders(){

	    @SuppressWarnings("serial")
		HttpHeaders acceptHeaders = new HttpHeaders() {
	        {
	            set(javax.ws.rs.core.HttpHeaders.ACCEPT,
	                MediaType.APPLICATION_JSON.toString());
	        }
	    };
	    String authorization = getProperty(BT_REST_USERNAME) + ":" + getProperty(BT_REST_PASSWORD);
	    String basic = new String(Base64.encode(authorization.getBytes(Charset.forName("UTF-8"))));
	    acceptHeaders.set("Authorization", "Basic " + basic);
	    acceptHeaders.setContentType(MediaType.APPLICATION_JSON);
	    return acceptHeaders;
	}
	
	/**
	 * RestTemplate to do post,put and delete operations
	 * @return
	 */
	public static RestTemplate getRestTemplate() {
		return restTemplate;
	}
	
	/**
	 * returns redirects map with approve information
	 * @return
	 */
	public static Map<Integer, Keywordredirect> getRedirectsMap() {
		return redirectsMap;
	}
	
	/**
	 * returns attributeID map with  facet atrribute information
	 * @return
	 */
	
	public static Map<String, Integer> getAttributeID() {
		return attributeID;
	}

	/**
	 * returns banners map with approve information
	 * @return
	 */
	public static Map<Integer, Banner> getBannersMap() {
		return bannersMap;
	}

	/**
	 * returns promos map with approve information
	 * @return
	 */
	public static Map<Integer, String> getPromosMap() {
		return promosMap;
	}
	
	/**
	 * returns the HttpHeaders with authentication
	 * @return
	 */
	public static HttpHeaders getHeaders() {
		return headers;
	}
	
	/**
	 * returns synonyms map with approve information
	 * @return
	 */
	public static Map<Integer, Synonym> getSynonymsMap() {
		return synonymsMap;
	}
	
	/**
	 * returns synonyms map with approve information
	 * @return
	 */
	public static Map<Integer, Facet> getFacetsMap() {
		return facetsMap;
	}
	
	
	
	public static Map<String, BoostsAndBlock> getBoostSkuId() {
		return boostSkuId;
	}

	

	public static Map<Integer, BoostsAndBlock> getBoostAndBlocksMap() {
		return boostsAndBlocksMap;
	}
	
	protected String getCurrentStartDate() {
		return new SimpleDateFormat("MM-dd-yyyy hh:MM:ss").format(new Date());
	}
	
	protected String getCurrentEndDate() {
		return getFutureStartDate();
	}
	
	protected String getFutureStartDate() {
		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.MONTH, 1);
		Date future = cal.getTime();
		return new SimpleDateFormat("MM-dd-yyyy hh:MM:ss").format(future);
	}
	
	protected String getFutureEndDate() {
		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.MONTH, 2);
		Date future = cal.getTime();
		return new SimpleDateFormat("MM-dd-yyyy hh:MM:ss").format(future);
	}
}
