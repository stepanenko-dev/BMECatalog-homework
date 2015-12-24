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
        "groupsystemid",
        "groupsystemname",
        "catalogstructure",
        "groupsystemdescription"
})
@XmlRootElement(name = "CATALOG_GROUP_SYSTEM")
public class CatalogGroupSystem {

    @XmlElement(name = "GROUP_SYSTEM_ID")
    protected String groupsystemid;
    @XmlElement(name = "GROUP_SYSTEM_NAME")
    protected String groupsystemname;
    @XmlElement(name = "CATALOG_STRUCTURE", required = true)
    protected List<CatalogStructure> catalogstructure;
    @XmlElement(name = "GROUP_SYSTEM_DESCRIPTION")
    protected String groupsystemdescription;

    /**
     * Gets the value of the groupsystemid property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getGROUPSYSTEMID() {
        return groupsystemid;
    }

    /**
     * Sets the value of the groupsystemid property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setGROUPSYSTEMID(String value) {
        this.groupsystemid = value;
    }

    /**
     * Gets the value of the groupsystemname property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getGROUPSYSTEMNAME() {
        return groupsystemname;
    }

    /**
     * Sets the value of the groupsystemname property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setGROUPSYSTEMNAME(String value) {
        this.groupsystemname = value;
    }

    /**
     * Gets the value of the catalogstructure property.
     * <p>
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the catalogstructure property.
     * <p>
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCATALOGSTRUCTURE().add(newItem);
     * </pre>
     * <p>
     * <p>
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CatalogStructure }
     */
    public List<CatalogStructure> getCATALOGSTRUCTURE() {
        if (catalogstructure == null) {
            catalogstructure = new ArrayList<CatalogStructure>();
        }
        return this.catalogstructure;
    }

    /**
     * Gets the value of the groupsystemdescription property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getGROUPSYSTEMDESCRIPTION() {
        return groupsystemdescription;
    }

    /**
     * Sets the value of the groupsystemdescription property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setGROUPSYSTEMDESCRIPTION(String value) {
        this.groupsystemdescription = value;
    }

}
