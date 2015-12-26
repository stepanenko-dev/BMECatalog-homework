//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.12.23 at 08:32:58 PM MSK 
//


package tk.hackspace.dtd.gen;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.xml.bind.annotation.*;


/**
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "allowedvalue"
})
@XmlRootElement(name = "ALLOWED_VALUES")
@Entity
public class AllowedValues {
    @Id
    @GeneratedValue
    @XmlTransient
    private Long id;
    @OneToMany
    @XmlElement(name = "ALLOWED_VALUE", required = true)
    protected List<AllowedValue> allowedvalue;

    public AllowedValues() {
    }

    /**
     * Gets the value of the allowedvalue property.
     * <p>
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the allowedvalue property.
     * <p>
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getALLOWEDVALUE().add(newItem);
     * </pre>
     * <p>
     * <p>
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AllowedValue }
     */
    public List<AllowedValue> getALLOWEDVALUE() {
        if (allowedvalue == null) {
            allowedvalue = new ArrayList<>();
        }
        return this.allowedvalue;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
