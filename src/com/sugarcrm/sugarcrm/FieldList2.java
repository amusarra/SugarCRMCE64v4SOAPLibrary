
package com.sugarcrm.sugarcrm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for field_list2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="field_list2">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="field_list" type="{http://www.sugarcrm.com/sugarcrm}field_list"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "field_list2", propOrder = {

})
public class FieldList2 {

    @XmlElement(name = "field_list", required = true)
    protected FieldList fieldList;

    /**
     * Gets the value of the fieldList property.
     * 
     * @return
     *     possible object is
     *     {@link FieldList }
     *     
     */
    public FieldList getFieldList() {
        return fieldList;
    }

    /**
     * Sets the value of the fieldList property.
     * 
     * @param value
     *     allowed object is
     *     {@link FieldList }
     *     
     */
    public void setFieldList(FieldList value) {
        this.fieldList = value;
    }

}
