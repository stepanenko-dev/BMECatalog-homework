//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.12.23 at 08:32:58 PM MSK 
//


package tk.hackspace.dtd.gen;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "name",
        "name2",
        "name3",
        "contact",
        "street",
        "zip",
        "boxno",
        "zipbox",
        "city",
        "state",
        "country",
        "phone",
        "fax",
        "email",
        "publickey",
        "url",
        "addressremarks"
})
@XmlRootElement(name = "ADDRESS")
@Entity
public class Address {

    @XmlAttribute(name = "type", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String type;
    @XmlElement(name = "NAME")
    protected String name;
    @XmlElement(name = "NAME2")
    protected String name2;
    @XmlElement(name = "NAME3")
    protected String name3;
    @XmlElement(name = "CONTACT")
    protected String contact;
    @XmlElement(name = "STREET")
    protected String street;
    @XmlElement(name = "ZIP")
    protected String zip;
    @XmlElement(name = "BOXNO")
    protected String boxno;
    @XmlElement(name = "ZIPBOX")
    protected String zipbox;
    @XmlElement(name = "CITY")
    protected String city;
    @XmlElement(name = "STATE")
    protected String state;
    @XmlElement(name = "COUNTRY")
    protected String country;
    @XmlElement(name = "PHONE")
    protected String phone;
    @XmlElement(name = "FAX")
    protected String fax;
    @XmlElement(name = "EMAIL")
    protected String email;
    @XmlElement(name = "PUBLIC_KEY")
    @ManyToMany
    protected List<PublicKey> publickey;
    @XmlElement(name = "URL")
    protected String url;
    @XmlElement(name = "ADDRESS_REMARKS")
    protected String addressremarks;

    @Id
    @GeneratedValue
    @XmlTransient
    private Long address_id;

    public Address() {

    }
    /**
     * Gets the value of the type property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Gets the value of the name property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getNAME() {
        return name;
    }

    /**
     * Sets the value of the name property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setNAME(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the name2 property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getNAME2() {
        return name2;
    }

    /**
     * Sets the value of the name2 property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setNAME2(String value) {
        this.name2 = value;
    }

    /**
     * Gets the value of the name3 property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getNAME3() {
        return name3;
    }

    /**
     * Sets the value of the name3 property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setNAME3(String value) {
        this.name3 = value;
    }

    /**
     * Gets the value of the contact property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getCONTACT() {
        return contact;
    }

    /**
     * Sets the value of the contact property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setCONTACT(String value) {
        this.contact = value;
    }

    /**
     * Gets the value of the street property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getSTREET() {
        return street;
    }

    /**
     * Sets the value of the street property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setSTREET(String value) {
        this.street = value;
    }

    /**
     * Gets the value of the zip property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getZIP() {
        return zip;
    }

    /**
     * Sets the value of the zip property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setZIP(String value) {
        this.zip = value;
    }

    /**
     * Gets the value of the boxno property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getBOXNO() {
        return boxno;
    }

    /**
     * Sets the value of the boxno property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setBOXNO(String value) {
        this.boxno = value;
    }

    /**
     * Gets the value of the zipbox property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getZIPBOX() {
        return zipbox;
    }

    /**
     * Sets the value of the zipbox property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setZIPBOX(String value) {
        this.zipbox = value;
    }

    /**
     * Gets the value of the city property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getCITY() {
        return city;
    }

    /**
     * Sets the value of the city property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setCITY(String value) {
        this.city = value;
    }

    /**
     * Gets the value of the state property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getSTATE() {
        return state;
    }

    /**
     * Sets the value of the state property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setSTATE(String value) {
        this.state = value;
    }

    /**
     * Gets the value of the country property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getCOUNTRY() {
        return country;
    }

    /**
     * Sets the value of the country property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setCOUNTRY(String value) {
        this.country = value;
    }

    /**
     * Gets the value of the phone property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getPHONE() {
        return phone;
    }

    /**
     * Sets the value of the phone property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setPHONE(String value) {
        this.phone = value;
    }

    /**
     * Gets the value of the fax property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getFAX() {
        return fax;
    }

    /**
     * Sets the value of the fax property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setFAX(String value) {
        this.fax = value;
    }

    /**
     * Gets the value of the email property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getEMAIL() {
        return email;
    }

    /**
     * Sets the value of the email property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setEMAIL(String value) {
        this.email = value;
    }

    /**
     * Gets the value of the publickey property.
     * <p>
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the publickey property.
     * <p>
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPUBLICKEY().add(newItem);
     * </pre>
     * <p>
     * <p>
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PublicKey }
     */
    public List<PublicKey> getPUBLICKEY() {
        if (publickey == null) {
            publickey = new ArrayList<PublicKey>();
        }
        return this.publickey;
    }

    /**
     * Gets the value of the url property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getURL() {
        return url;
    }

    /**
     * Sets the value of the url property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setURL(String value) {
        this.url = value;
    }

    /**
     * Gets the value of the addressremarks property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getADDRESSREMARKS() {
        return addressremarks;
    }

    /**
     * Sets the value of the addressremarks property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setADDRESSREMARKS(String value) {
        this.addressremarks = value;
    }

    public Long getAddress_id() {
        return address_id;
    }

    public void setAddress_id(Long address_id) {
        this.address_id = address_id;
    }
}
