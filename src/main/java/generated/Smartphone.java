//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.10.13 at 11:26:36 PM BST 
//


package generated;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{}url"/>
 *         &lt;element ref="{}price"/>
 *         &lt;element ref="{}color"/>
 *         &lt;element ref="{}so"/>
 *         &lt;element ref="{}processor"/>
 *         &lt;element ref="{}screen"/>
 *         &lt;element ref="{}network"/>
 *         &lt;element ref="{}communication"/>
 *         &lt;element ref="{}camera"/>
 *         &lt;element ref="{}battery_type"/>
 *         &lt;element ref="{}autonomy"/>
 *         &lt;element ref="{}dimensions"/>
 *         &lt;element ref="{}weight"/>
 *       &lt;/sequence>
 *       &lt;attribute name="modelo" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "url",
    "price",
    "color",
    "so",
    "processor",
    "screen",
    "network",
    "communication",
    "camera",
    "batteryType",
    "autonomy",
    "dimensions",
    "weight"
})
@XmlRootElement(name = "smartphone")
public class Smartphone {

    @XmlElement(required = true)
    @XmlSchemaType(name = "anyURI")
    protected String url;
    @XmlElement(required = true)
    protected String price;
    @XmlElement(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String color;
    @XmlElement(required = true)
    protected String so;
    @XmlElement(required = true)
    protected String processor;
    @XmlElement(required = true)
    protected Screen screen;
    @XmlElement(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NMTOKEN")
    protected String network;
    @XmlElement(required = true)
    protected Communication communication;
    @XmlElement(required = true)
    protected Camera camera;
    @XmlElement(name = "battery_type", required = true)
    protected String batteryType;
    @XmlElement(required = true)
    protected String autonomy;
    @XmlElement(required = true)
    protected String dimensions;
    @XmlElement(required = true)
    protected String weight;
    @XmlAttribute(name = "modelo", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String modelo;

    /**
     * Gets the value of the url property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUrl() {
        return url;
    }

    /**
     * Sets the value of the url property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUrl(String value) {
        this.url = value;
    }

    /**
     * Gets the value of the price property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrice() {
        return price;
    }

    /**
     * Sets the value of the price property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrice(String value) {
        this.price = value;
    }

    /**
     * Gets the value of the color property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getColor() {
        return color;
    }

    /**
     * Sets the value of the color property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setColor(String value) {
        this.color = value;
    }

    /**
     * Gets the value of the so property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSo() {
        return so;
    }

    /**
     * Sets the value of the so property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSo(String value) {
        this.so = value;
    }

    /**
     * Gets the value of the processor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProcessor() {
        return processor;
    }

    /**
     * Sets the value of the processor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProcessor(String value) {
        this.processor = value;
    }

    /**
     * Gets the value of the screen property.
     * 
     * @return
     *     possible object is
     *     {@link Screen }
     *     
     */
    public Screen getScreen() {
        return screen;
    }

    /**
     * Sets the value of the screen property.
     * 
     * @param value
     *     allowed object is
     *     {@link Screen }
     *     
     */
    public void setScreen(Screen value) {
        this.screen = value;
    }

    /**
     * Gets the value of the network property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNetwork() {
        return network;
    }

    /**
     * Sets the value of the network property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNetwork(String value) {
        this.network = value;
    }

    /**
     * Gets the value of the communication property.
     * 
     * @return
     *     possible object is
     *     {@link Communication }
     *     
     */
    public Communication getCommunication() {
        return communication;
    }

    /**
     * Sets the value of the communication property.
     * 
     * @param value
     *     allowed object is
     *     {@link Communication }
     *     
     */
    public void setCommunication(Communication value) {
        this.communication = value;
    }

    /**
     * Gets the value of the camera property.
     * 
     * @return
     *     possible object is
     *     {@link Camera }
     *     
     */
    public Camera getCamera() {
        return camera;
    }

    /**
     * Sets the value of the camera property.
     * 
     * @param value
     *     allowed object is
     *     {@link Camera }
     *     
     */
    public void setCamera(Camera value) {
        this.camera = value;
    }

    /**
     * Gets the value of the batteryType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBatteryType() {
        return batteryType;
    }

    /**
     * Sets the value of the batteryType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBatteryType(String value) {
        this.batteryType = value;
    }

    /**
     * Gets the value of the autonomy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAutonomy() {
        return autonomy;
    }

    /**
     * Sets the value of the autonomy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAutonomy(String value) {
        this.autonomy = value;
    }

    /**
     * Gets the value of the dimensions property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDimensions() {
        return dimensions;
    }

    /**
     * Sets the value of the dimensions property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDimensions(String value) {
        this.dimensions = value;
    }

    /**
     * Gets the value of the weight property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWeight() {
        return weight;
    }

    /**
     * Sets the value of the weight property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWeight(String value) {
        this.weight = value;
    }

    /**
     * Gets the value of the modelo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * Sets the value of the modelo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModelo(String value) {
        this.modelo = value;
    }

}
