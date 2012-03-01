
package com.sugarcrm.sugarcrm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for link_value2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="link_value2">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="link_value" type="{http://www.sugarcrm.com/sugarcrm}link_value"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "link_value2", propOrder = {

})
public class LinkValue2 {

    @XmlElement(name = "link_value", required = true)
    protected LinkValue linkValue;

    /**
     * Gets the value of the linkValue property.
     * 
     * @return
     *     possible object is
     *     {@link LinkValue }
     *     
     */
    public LinkValue getLinkValue() {
        return linkValue;
    }

    /**
     * Sets the value of the linkValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link LinkValue }
     *     
     */
    public void setLinkValue(LinkValue value) {
        this.linkValue = value;
    }

}
