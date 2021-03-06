//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.2-146 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.05.09 at 09:49:32 AM IST 
//


package com.bestbuy.search.bt.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="facet" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="facets_SysName_Data" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="facets_DispName_Data" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="facet_Position" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *                   &lt;element name="Start_Date_Month" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="Start_Date_Day" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *                   &lt;element name="Start_Date_Year" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *                   &lt;element name="Start_Date_Hour" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *                   &lt;element name="Start_Date_Minute" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *                   &lt;element name="End_Date_Month" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="End_Date_Day" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *                   &lt;element name="End_Date_Year" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *                   &lt;element name="End_Date_Hour" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *                   &lt;element name="End_Date_Minute" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *                   &lt;element name="facets_Mode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="facets_Glossary" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *                   &lt;element name="facets_Display_MinValue" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *                   &lt;element name="facets_Display_MaxValue" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "facet"
})
@XmlRootElement(name = "facets")
public class Facets {

    protected List<Facets.Facet> facet;

    /**
     * Gets the value of the facet property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the facet property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFacet().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Facets.Facet }
     * 
     * 
     */
    public List<Facets.Facet> getFacet() {
        if (facet == null) {
            facet = new ArrayList<Facets.Facet>();
        }
        return this.facet;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="facets_SysName_Data" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="facets_DispName_Data" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="facet_Position" type="{http://www.w3.org/2001/XMLSchema}byte"/>
     *         &lt;element name="Start_Date_Month" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="Start_Date_Day" type="{http://www.w3.org/2001/XMLSchema}byte"/>
     *         &lt;element name="Start_Date_Year" type="{http://www.w3.org/2001/XMLSchema}short"/>
     *         &lt;element name="Start_Date_Hour" type="{http://www.w3.org/2001/XMLSchema}byte"/>
     *         &lt;element name="Start_Date_Minute" type="{http://www.w3.org/2001/XMLSchema}byte"/>
     *         &lt;element name="End_Date_Month" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="End_Date_Day" type="{http://www.w3.org/2001/XMLSchema}byte"/>
     *         &lt;element name="End_Date_Year" type="{http://www.w3.org/2001/XMLSchema}short"/>
     *         &lt;element name="End_Date_Hour" type="{http://www.w3.org/2001/XMLSchema}byte"/>
     *         &lt;element name="End_Date_Minute" type="{http://www.w3.org/2001/XMLSchema}byte"/>
     *         &lt;element name="facets_Mode" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="facets_Glossary" type="{http://www.w3.org/2001/XMLSchema}short"/>
     *         &lt;element name="facets_Display_MinValue" type="{http://www.w3.org/2001/XMLSchema}byte"/>
     *         &lt;element name="facets_Display_MaxValue" type="{http://www.w3.org/2001/XMLSchema}byte"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "facetsSysNameData",
        "facetsDispNameData",
        "facetPosition",
        "startDateMonth",
        "startDateDay",
        "startDateYear",
        "startDateHour",
        "startDateMinute",
        "endDateMonth",
        "endDateDay",
        "endDateYear",
        "endDateHour",
        "endDateMinute",
        "facetsMode",
        "facetsGlossary",
        "facetsDisplayMinValue",
        "facetsDisplayMaxValue"
    })
    public static class Facet {

        @XmlElement(name = "facets_SysName_Data", required = true)
        protected String facetsSysNameData;
        @XmlElement(name = "facets_DispName_Data", required = true)
        protected String facetsDispNameData;
        @XmlElement(name = "facet_Position")
        protected String facetPosition;
        @XmlElement(name = "Start_Date_Month", required = true)
        protected String startDateMonth;
        @XmlElement(name = "Start_Date_Day")
        protected String startDateDay;
        @XmlElement(name = "Start_Date_Year")
        protected String startDateYear;
        @XmlElement(name = "Start_Date_Hour")
        protected String startDateHour;
        @XmlElement(name = "Start_Date_Minute")
        protected String startDateMinute;
        @XmlElement(name = "End_Date_Month", required = true)
        protected String endDateMonth;
        @XmlElement(name = "End_Date_Day")
        protected String endDateDay;
        @XmlElement(name = "End_Date_Year")
        protected String endDateYear;
        @XmlElement(name = "End_Date_Hour")
        protected String endDateHour;
        @XmlElement(name = "End_Date_Minute")
        protected String endDateMinute;
        @XmlElement(name = "facets_Mode", required = true)
        protected String facetsMode;
        @XmlElement(name = "facets_Glossary")
        protected String facetsGlossary;
        @XmlElement(name = "facets_Display_MinValue")
        protected String facetsDisplayMinValue;
        @XmlElement(name = "facets_Display_MaxValue")
        protected String facetsDisplayMaxValue;

        /**
         * Gets the value of the facetsSysNameData property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFacetsSysNameData() {
            return facetsSysNameData;
        }

        /**
         * Sets the value of the facetsSysNameData property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFacetsSysNameData(String value) {
            this.facetsSysNameData = value;
        }

        /**
         * Gets the value of the facetsDispNameData property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFacetsDispNameData() {
            return facetsDispNameData;
        }

        /**
         * Sets the value of the facetsDispNameData property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFacetsDispNameData(String value) {
            this.facetsDispNameData = value;
        }

        /**
         * Gets the value of the facetPosition property.
         * 
         */
        public String getFacetPosition() {
            return facetPosition;
        }

        /**
         * Sets the value of the facetPosition property.
         * 
         */
        public void setFacetPosition(String value) {
            this.facetPosition = value;
        }

        /**
         * Gets the value of the startDateMonth property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getStartDateMonth() {
            return startDateMonth;
        }

        /**
         * Sets the value of the startDateMonth property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setStartDateMonth(String value) {
            this.startDateMonth = value;
        }

        /**
         * Gets the value of the startDateDay property.
         * 
         */
        public String getStartDateDay() {
            return startDateDay;
        }

        /**
         * Sets the value of the startDateDay property.
         * 
         */
        public void setStartDateDay(String value) {
            this.startDateDay = value;
        }

        /**
         * Gets the value of the startDateYear property.
         * 
         */
        public String getStartDateYear() {
            return startDateYear;
        }

        /**
         * Sets the value of the startDateYear property.
         * 
         */
        public void setStartDateYear(String value) {
            this.startDateYear = value;
        }

        /**
         * Gets the value of the startDateHour property.
         * 
         */
        public String getStartDateHour() {
            return startDateHour;
        }

        /**
         * Sets the value of the startDateHour property.
         * 
         */
        public void setStartDateHour(String value) {
            this.startDateHour = value;
        }

        /**
         * Gets the value of the startDateMinute property.
         * 
         */
        public String getStartDateMinute() {
            return startDateMinute;
        }

        /**
         * Sets the value of the startDateMinute property.
         * 
         */
        public void setStartDateMinute(String value) {
            this.startDateMinute = value;
        }

        /**
         * Gets the value of the endDateMonth property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEndDateMonth() {
            return endDateMonth;
        }

        /**
         * Sets the value of the endDateMonth property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEndDateMonth(String value) {
            this.endDateMonth = value;
        }

        /**
         * Gets the value of the endDateDay property.
         * 
         */
        public String getEndDateDay() {
            return endDateDay;
        }

        /**
         * Sets the value of the endDateDay property.
         * 
         */
        public void setEndDateDay(String value) {
            this.endDateDay = value;
        }

        /**
         * Gets the value of the endDateYear property.
         * 
         */
        public String getEndDateYear() {
            return endDateYear;
        }

        /**
         * Sets the value of the endDateYear property.
         * 
         */
        public void setEndDateYear(String value) {
            this.endDateYear = value;
        }

        /**
         * Gets the value of the endDateHour property.
         * 
         */
        public String getEndDateHour() {
            return endDateHour;
        }

        /**
         * Sets the value of the endDateHour property.
         * 
         */
        public void setEndDateHour(String value) {
            this.endDateHour = value;
        }

        /**
         * Gets the value of the endDateMinute property.
         * 
         */
        public String getEndDateMinute() {
            return endDateMinute;
        }

        /**
         * Sets the value of the endDateMinute property.
         * 
         */
        public void setEndDateMinute(String value) {
            this.endDateMinute = value;
        }

        /**
         * Gets the value of the facetsMode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFacetsMode() {
            return facetsMode;
        }

        /**
         * Sets the value of the facetsMode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFacetsMode(String value) {
            this.facetsMode = value;
        }

        /**
         * Gets the value of the facetsGlossary property.
         * 
         */
        public String getFacetsGlossary() {
            return facetsGlossary;
        }

        /**
         * Sets the value of the facetsGlossary property.
         * 
         */
        public void setFacetsGlossary(String value) {
            this.facetsGlossary = value;
        }

        /**
         * Gets the value of the facetsDisplayMinValue property.
         * 
         */
        public String getFacetsDisplayMinValue() {
            return facetsDisplayMinValue;
        }

        /**
         * Sets the value of the facetsDisplayMinValue property.
         * 
         */
        public void setFacetsDisplayMinValue(String value) {
            this.facetsDisplayMinValue = value;
        }

        /**
         * Gets the value of the facetsDisplayMaxValue property.
         * 
         */
        public String getFacetsDisplayMaxValue() {
            return facetsDisplayMaxValue;
        }

        /**
         * Sets the value of the facetsDisplayMaxValue property.
         * 
         */
        public void setFacetsDisplayMaxValue(String value) {
            this.facetsDisplayMaxValue = value;
        }

    }

}
