//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.2-146 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.05.08 at 07:18:24 PM IST 
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
 *         &lt;element name="useradmin" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="user_FirstName_Data" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="user_LastName_Data" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="user_ID" type="{http://www.w3.org/2001/XMLSchema}byte"/>
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
    "useradmin"
})
@XmlRootElement(name = "useradmins")
public class Useradmins {

    protected List<Useradmins.Useradmin> useradmin;

    /**
     * Gets the value of the useradmin property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the useradmin property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUseradmin().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Useradmins.Useradmin }
     * 
     * 
     */
    public List<Useradmins.Useradmin> getUseradmin() {
        if (useradmin == null) {
            useradmin = new ArrayList<Useradmins.Useradmin>();
        }
        return this.useradmin;
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
     *         &lt;element name="user_FirstName_Data" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="user_LastName_Data" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="user_ID" type="{http://www.w3.org/2001/XMLSchema}byte"/>
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
        "userFirstNameData",
        "userLastNameData",
        "userID"
    })
    public static class Useradmin {

        @XmlElement(name = "user_FirstName_Data", required = true)
        protected String userFirstNameData;
        @XmlElement(name = "user_LastName_Data", required = true)
        protected String userLastNameData;
        @XmlElement(name = "user_ID")
        protected String userID;

        /**
         * Gets the value of the userFirstNameData property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getUserFirstNameData() {
            return userFirstNameData;
        }

        /**
         * Sets the value of the userFirstNameData property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setUserFirstNameData(String value) {
            this.userFirstNameData = value;
        }

        /**
         * Gets the value of the userLastNameData property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getUserLastNameData() {
            return userLastNameData;
        }

        /**
         * Sets the value of the userLastNameData property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setUserLastNameData(String value) {
            this.userLastNameData = value;
        }

        /**
         * Gets the value of the userID property.
         * 
         */
        public String getUserID() {
            return userID;
        }

        /**
         * Sets the value of the userID property.
         * 
         */
        public void setUserID(String value) {
            this.userID = value;
        }

    }

}