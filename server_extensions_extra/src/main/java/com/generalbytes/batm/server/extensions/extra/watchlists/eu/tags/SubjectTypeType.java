//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.12.07 at 11:07:14 AM CET 
//


package com.generalbytes.batm.server.extensions.extra.watchlists.eu.tags;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * The subject type is a type that gives information about the kind of entity that is sanctioned.
 * 
 * <p>Java class for SubjectTypeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SubjectTypeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="code" use="required" type="{http://eu.europa.ec/fpi/fsd/export}DefaultCodeType" />
 *       &lt;attribute name="classificationCode" use="required" type="{http://eu.europa.ec/fpi/fsd/export}SubjectTypeClassificationCodeType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SubjectTypeType")
public class SubjectTypeType {

    @XmlAttribute(name = "code", required = true)
    protected String code;
    @XmlAttribute(name = "classificationCode", required = true)
    protected SubjectTypeClassificationCodeType classificationCode;

    /**
     * Gets the value of the code property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCode() {
        return code;
    }

    /**
     * Sets the value of the code property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCode(String value) {
        this.code = value;
    }

    /**
     * Gets the value of the classificationCode property.
     * 
     * @return
     *     possible object is
     *     {@link SubjectTypeClassificationCodeType }
     *     
     */
    public SubjectTypeClassificationCodeType getClassificationCode() {
        return classificationCode;
    }

    /**
     * Sets the value of the classificationCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubjectTypeClassificationCodeType }
     *     
     */
    public void setClassificationCode(SubjectTypeClassificationCodeType value) {
        this.classificationCode = value;
    }

}
