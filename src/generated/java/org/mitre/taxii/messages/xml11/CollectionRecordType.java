
package org.mitre.taxii.messages.xml11;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * A record for a data collection.
 * 
 * <p>Java class for CollectionRecordType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CollectionRecordType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Collection_Volume" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
 *         &lt;element name="Content_Binding" type="{http://taxii.mitre.org/messages/taxii_xml_binding-1.1}ContentBindingIDType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Push_Method" type="{http://taxii.mitre.org/messages/taxii_xml_binding-1.1}PushMethodType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Polling_Service" type="{http://taxii.mitre.org/messages/taxii_xml_binding-1.1}ServiceContactInfoType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Subscription_Service" type="{http://taxii.mitre.org/messages/taxii_xml_binding-1.1}ServiceContactInfoType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Receiving_Inbox_Service" type="{http://taxii.mitre.org/messages/taxii_xml_binding-1.1}InboxServiceBindingsType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="collection_name" use="required" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *       &lt;attribute name="collection_type" type="{http://taxii.mitre.org/messages/taxii_xml_binding-1.1}CollectionTypeEnum" default="DATA_FEED" />
 *       &lt;attribute name="available" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CollectionRecordType", propOrder = {
    "description",
    "collectionVolume",
    "contentBinding",
    "pushMethod",
    "pollingService",
    "subscriptionService",
    "receivingInboxService"
})
public class CollectionRecordType {

    @XmlElement(name = "Description", required = true)
    protected String description;
    @XmlElement(name = "Collection_Volume")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger collectionVolume;
    @XmlElement(name = "Content_Binding")
    protected List<ContentBindingIDType> contentBinding;
    @XmlElement(name = "Push_Method")
    protected List<PushMethodType> pushMethod;
    @XmlElement(name = "Polling_Service")
    protected List<ServiceContactInfoType> pollingService;
    @XmlElement(name = "Subscription_Service")
    protected List<ServiceContactInfoType> subscriptionService;
    @XmlElement(name = "Receiving_Inbox_Service")
    protected List<InboxServiceBindingsType> receivingInboxService;
    @XmlAttribute(name = "collection_name", required = true)
    @XmlSchemaType(name = "anyURI")
    protected String collectionName;
    @XmlAttribute(name = "collection_type")
    protected CollectionTypeEnum collectionType;
    @XmlAttribute(name = "available")
    protected Boolean available;

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the collectionVolume property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCollectionVolume() {
        return collectionVolume;
    }

    /**
     * Sets the value of the collectionVolume property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCollectionVolume(BigInteger value) {
        this.collectionVolume = value;
    }

    /**
     * Gets the value of the contentBinding property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contentBinding property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContentBinding().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ContentBindingIDType }
     * 
     * 
     */
    public List<ContentBindingIDType> getContentBinding() {
        if (contentBinding == null) {
            contentBinding = new ArrayList<ContentBindingIDType>();
        }
        return this.contentBinding;
    }

    /**
     * Gets the value of the pushMethod property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pushMethod property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPushMethod().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PushMethodType }
     * 
     * 
     */
    public List<PushMethodType> getPushMethod() {
        if (pushMethod == null) {
            pushMethod = new ArrayList<PushMethodType>();
        }
        return this.pushMethod;
    }

    /**
     * Gets the value of the pollingService property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pollingService property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPollingService().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ServiceContactInfoType }
     * 
     * 
     */
    public List<ServiceContactInfoType> getPollingService() {
        if (pollingService == null) {
            pollingService = new ArrayList<ServiceContactInfoType>();
        }
        return this.pollingService;
    }

    /**
     * Gets the value of the subscriptionService property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the subscriptionService property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubscriptionService().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ServiceContactInfoType }
     * 
     * 
     */
    public List<ServiceContactInfoType> getSubscriptionService() {
        if (subscriptionService == null) {
            subscriptionService = new ArrayList<ServiceContactInfoType>();
        }
        return this.subscriptionService;
    }

    /**
     * Gets the value of the receivingInboxService property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the receivingInboxService property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReceivingInboxService().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InboxServiceBindingsType }
     * 
     * 
     */
    public List<InboxServiceBindingsType> getReceivingInboxService() {
        if (receivingInboxService == null) {
            receivingInboxService = new ArrayList<InboxServiceBindingsType>();
        }
        return this.receivingInboxService;
    }

    /**
     * Gets the value of the collectionName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCollectionName() {
        return collectionName;
    }

    /**
     * Sets the value of the collectionName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCollectionName(String value) {
        this.collectionName = value;
    }

    /**
     * Gets the value of the collectionType property.
     * 
     * @return
     *     possible object is
     *     {@link CollectionTypeEnum }
     *     
     */
    public CollectionTypeEnum getCollectionType() {
        if (collectionType == null) {
            return CollectionTypeEnum.DATA_FEED;
        } else {
            return collectionType;
        }
    }

    /**
     * Sets the value of the collectionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CollectionTypeEnum }
     *     
     */
    public void setCollectionType(CollectionTypeEnum value) {
        this.collectionType = value;
    }

    /**
     * Gets the value of the available property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAvailable() {
        return available;
    }

    /**
     * Sets the value of the available property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAvailable(Boolean value) {
        this.available = value;
    }

}
