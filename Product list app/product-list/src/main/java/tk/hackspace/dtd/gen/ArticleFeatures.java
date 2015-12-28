//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.12.23 at 08:32:58 PM MSK 
//


package tk.hackspace.dtd.gen;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.*;
import javax.xml.bind.annotation.*;


/**
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "referencefeaturesystemname",
        "referenceFeatureGroupId"
})

@XmlRootElement(name = "ARTICLE_FEATURES")
@Entity
public class ArticleFeatures {
    @Id
    @GeneratedValue
    @Column(name = "ARTICLE_FEATURES_ID")
    @XmlTransient
    private Long ArticleFeaturesId;
    @XmlElement(name = "REFERENCE_FEATURE_SYSTEM_NAME")
    protected String referencefeaturesystemname;

    @XmlElement(name = "REFERENCE_FEATURE_GROUP_ID")
    protected String referenceFeatureGroupId;

    public String getReferenceFeatureGroupId() {
        return referenceFeatureGroupId;
    }

    public void setReferenceFeatureGroupId(String referenceFeatureGroupId) {
        this.referenceFeatureGroupId = referenceFeatureGroupId;
    }

    public ArticleFeatures() {
    }

    /**
     * Gets the value of the referencefeaturesystemname property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getREFERENCEFEATURESYSTEMNAME() {
        return referencefeaturesystemname;
    }

    /**
     * Sets the value of the referencefeaturesystemname property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setREFERENCEFEATURESYSTEMNAME(String value) {
        this.referencefeaturesystemname = value;
    }

    public Long getArticleFeaturesId() {
        return ArticleFeaturesId;
    }

    public void setArticleFeaturesId(Long articleFeaturesId) {
        ArticleFeaturesId = articleFeaturesId;
    }
}
