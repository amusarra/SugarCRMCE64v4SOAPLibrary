
package com.sugarcrm.sugarcrm;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for module_list complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="module_list">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="modules" type="{http://www.sugarcrm.com/sugarcrm}module_list_array"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "module_list", propOrder = {

})
public class ModuleList {

    @XmlElement(required = true)
    protected ModuleListArray modules;

    /**
     * Gets the value of the modules property.
     * 
     * @return
     *     possible object is
     *     {@link ModuleListArray }
     *     
     */
    public ModuleListArray getModules() {
        return modules;
    }

    /**
     * Sets the value of the modules property.
     * 
     * @param value
     *     allowed object is
     *     {@link ModuleListArray }
     *     
     */
    public void setModules(ModuleListArray value) {
        this.modules = value;
    }

}
