//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.12.23 at 08:32:58 PM MSK 
//


package tk.hackspace.dtd.gen;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "agreementid",
        "datetime"
})
@XmlRootElement(name = "AGREEMENT")
public class Agreement {

    @XmlElement(name = "AGREEMENT_ID", required = true)
    protected String agreementid;
    @XmlElement(name = "DATETIME")
    protected List<DateTime> datetime;

    /**
     * Gets the value of the agreementid property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getAGREEMENTID() {
        return agreementid;
    }

    /**
     * Sets the value of the agreementid property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setAGREEMENTID(String value) {
        this.agreementid = value;
    }

    /**
     * Gets the value of the datetime property.
     * <p>
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the datetime property.
     * <p>
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDATETIME().add(newItem);
     * </pre>
     * <p>
     * <p>
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DateTime }
     */
    public List<DateTime> getDATETIME() {
        if (datetime == null) {
            datetime = new ArrayList<DateTime>();
        }
        return this.datetime;
    }

}
