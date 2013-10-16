//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.2-146 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.04.30 at 01:25:59 PM IST 
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
 *         &lt;element name="synonym" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="primaryTermData" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="termsData" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "synonym"
})
@XmlRootElement(name = "synonyms")
public class Synonyms {

    protected List<Synonyms.Synonym> synonym;

    /**
     * Gets the value of the synonym property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the synonym property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSynonym().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Synonyms.Synonym }
     * 
     * 
     */
    public List<Synonyms.Synonym> getSynonym() {
        if (synonym == null) {
            synonym = new ArrayList<Synonyms.Synonym>();
        }
        return this.synonym;
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
     *         &lt;element name="primaryTermData" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="termsData" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
        "primaryTermData",
        "termsData"
    })
    public static class Synonym {

        @XmlElement(required = true)
        protected String primaryTermData;
        @XmlElement(required = true)
        protected String termsData;

        /**
         * Gets the value of the primaryTermData property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPrimaryTermData() {
            return primaryTermData;
        }

        /**
         * Sets the value of the primaryTermData property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPrimaryTermData(String value) {
            this.primaryTermData = value;
        }

        /**
         * Gets the value of the termsData property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTermsData() {
            return termsData;
        }

        /**
         * Sets the value of the termsData property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTermsData(String value) {
            this.termsData = value;
        }

    }


	

}
