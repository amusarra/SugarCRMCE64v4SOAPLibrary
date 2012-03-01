
package com.sugarcrm.sugarcrm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for module_list_entry complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="module_list_entry">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="module_key" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="module_label" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="favorite_enabled" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="acls" type="{http://www.sugarcrm.com/sugarcrm}acl_list"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "module_list_entry", propOrder = {

})
public class ModuleListEntry {

    @XmlElement(name = "module_key", required = true)
    protected String moduleKey;
    @XmlElement(name = "module_label", required = true)
    protected String moduleLabel;
    @XmlElement(name = "favorite_enabled")
    protected boolean favoriteEnabled;
    @XmlElement(required = true)
    protected AclList acls;

    /**
     * Gets the value of the moduleKey property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModuleKey() {
        return moduleKey;
    }

    /**
     * Sets the value of the moduleKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModuleKey(String value) {
        this.moduleKey = value;
    }

    /**
     * Gets the value of the moduleLabel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModuleLabel() {
        return moduleLabel;
    }

    /**
     * Sets the value of the moduleLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModuleLabel(String value) {
        this.moduleLabel = value;
    }

    /**
     * Gets the value of the favoriteEnabled property.
     * 
     */
    public boolean isFavoriteEnabled() {
        return favoriteEnabled;
    }

    /**
     * Sets the value of the favoriteEnabled property.
     * 
     */
    public void setFavoriteEnabled(boolean value) {
        this.favoriteEnabled = value;
    }

    /**
     * Gets the value of the acls property.
     * 
     * @return
     *     possible object is
     *     {@link AclList }
     *     
     */
    public AclList getAcls() {
        return acls;
    }

    /**
     * Sets the value of the acls property.
     * 
     * @param value
     *     allowed object is
     *     {@link AclList }
     *     
     */
    public void setAcls(AclList value) {
        this.acls = value;
    }

}
