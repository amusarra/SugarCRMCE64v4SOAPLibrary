
package com.sugarcrm.sugarcrm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for link_list2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="link_list2">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="link_list" type="{http://www.sugarcrm.com/sugarcrm}link_list"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "link_list2", propOrder = {

})
public class LinkList2 {

    @XmlElement(name = "link_list", required = true)
    protected LinkList linkList;

    /**
     * Gets the value of the linkList property.
     * 
     * @return
     *     possible object is
     *     {@link LinkList }
     *     
     */
    public LinkList getLinkList() {
        return linkList;
    }

    /**
     * Sets the value of the linkList property.
     * 
     * @param value
     *     allowed object is
     *     {@link LinkList }
     *     
     */
    public void setLinkList(LinkList value) {
        this.linkList = value;
    }

}
