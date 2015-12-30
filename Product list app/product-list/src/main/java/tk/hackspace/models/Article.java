//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.12.23 at 08:32:58 PM MSK 
//


package tk.hackspace.models;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.*;
import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "supplieraid",
        "articledetails",
        "articlefeatures",
        "ArticleOrderDetails",
        "articlepricedetails",
        "mimeinfo",


})
@XmlRootElement(name = "ARTICLE")
@Entity
public class Article {
    public Article() {
    }

    @Id
    @GeneratedValue
    @XmlTransient
    @Column(name = "ARTICLE_ID")
    private Long article_id;
    @XmlAttribute(name = "mode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String mode;
    @XmlElement(name = "SUPPLIER_AID", required = true)
    protected String supplieraid;
    @XmlElement(name = "ARTICLE_DETAILS", required = true)
    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    protected ArticleDetails articledetails;
    @XmlElement(name = "ARTICLE_FEATURES")
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    protected List<ArticleFeatures> articlefeatures;
    @XmlElement(name = "ARTICLE_ORDER_DETAILS", required = true)
    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    protected ArticleOrderDetails ArticleOrderDetails;
    @XmlElement(name = "ARTICLE_PRICE_DETAILS", required = true)
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    protected List<ArticlePriceDetails> articlepricedetails;
    @XmlElement(name = "MIME_INFO")
    @ManyToOne(cascade = CascadeType.ALL)
    protected MimeInfo mimeinfo;


    /**
     * Gets the value of the mode property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getMode() {
        if (mode == null) {
            return "new";
        } else {
            return mode;
        }
    }

    /**
     * Sets the value of the mode property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setMode(String value) {
        this.mode = value;
    }

    /**
     * Gets the value of the supplieraid property.
     *
     * @return possible object is
     * {@link String }
     */
    public String getSupplierAId() {
        return supplieraid;
    }

    /**
     * Sets the value of the supplieraid property.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setSUPPLIERAID(String value) {
        this.supplieraid = value;
    }

    /**
     * Gets the value of the articledetails property.
     *
     * @return possible object is
     * {@link ArticleDetails }
     */
    public ArticleDetails getARTICLEDETAILS() {
        return articledetails;
    }

    /**
     * Sets the value of the articledetails property.
     *
     * @param value allowed object is
     *              {@link ArticleDetails }
     */
    public void setARTICLEDETAILS(ArticleDetails value) {
        this.articledetails = value;
    }

    /**
     * Gets the value of the articlefeatures property.
     * <p>
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the articlefeatures property.
     * <p>
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getARTICLEFEATURES().add(newItem);
     * </pre>
     * <p>
     * <p>
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArticleFeatures }
     */
    public List<ArticleFeatures> getARTICLEFEATURES() {
        if (articlefeatures == null) {
            articlefeatures = new ArrayList<>();
        }
        return this.articlefeatures;
    }

    /**
     * Gets the value of the ArticleOrderDetails property.
     *
     * @return possible object is
     * {@link ArticleOrderDetails }
     */
    public ArticleOrderDetails getARTICLEORDERDETAILS() {
        return ArticleOrderDetails;
    }

    /**
     * Sets the value of the ArticleOrderDetails property.
     *
     * @param value allowed object is
     *              {@link ArticleOrderDetails }
     */
    public void setARTICLEORDERDETAILS(ArticleOrderDetails value) {
        this.ArticleOrderDetails = value;
    }

    /**
     * Gets the value of the articlepricedetails property.
     * <p>
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the articlepricedetails property.
     * <p>
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getARTICLEPRICEDETAILS().add(newItem);
     * </pre>
     * <p>
     * <p>
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArticlePriceDetails }
     */
    public List<ArticlePriceDetails> getARTICLEPRICEDETAILS() {
        if (articlepricedetails == null) {
            articlepricedetails = new ArrayList<>();
        }
        return this.articlepricedetails;
    }

    /**
     * Gets the value of the mimeinfo property.
     *
     * @return possible object is
     * {@link MimeInfo }
     */
    public MimeInfo getMIMEINFO() {
        return mimeinfo;
    }

    /**
     * Sets the value of the mimeinfo property.
     *
     * @param value allowed object is
     *              {@link MimeInfo }
     */
    public void setMIMEINFO(MimeInfo value) {
        this.mimeinfo = value;
    }

    /**
     * Gets the value of the userdefinedextensions property.
     *
     * @return possible object is
     * {@link String }
     */


    public Long getArticle_id() {
        return article_id;
    }

    @Override
    public String toString() {
        return "TestArticle{" +
                "article_id=" + article_id +
                ", mode='" + mode + '\'' +
                ", supplieraid='" + supplieraid + '\'' +
                ", articledetails=" + articledetails +
                ", articlefeatures=" + articlefeatures +
                ", ArticleOrderDetails=" + ArticleOrderDetails +
                ", articlepricedetails=" + articlepricedetails +
                ", mimeinfo=" + mimeinfo +
                '}';
    }

    public void setArticle_id(Long article_id) {
        this.article_id = article_id;
    }

}