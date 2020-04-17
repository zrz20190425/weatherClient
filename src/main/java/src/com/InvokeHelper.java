
package src.com;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>anonymous complex type?? Java ??
 * 
 * <p>????????????????????????????????
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="lpszToken" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lpszHelper" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lpszKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lpszParams" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="bStyleXml" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "lpszToken",
    "lpszHelper",
    "lpszKey",
    "lpszParams",
    "bStyleXml"
})
@XmlRootElement(name = "InvokeHelper")
public class InvokeHelper {

    protected String lpszToken;
    protected String lpszHelper;
    protected String lpszKey;
    protected String lpszParams;
    protected int bStyleXml;

    /**
     * ???lpszToken????????
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLpszToken() {
        return lpszToken;
    }

    /**
     * ????lpszToken????????
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLpszToken(String value) {
        this.lpszToken = value;
    }

    /**
     * ???lpszHelper????????
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLpszHelper() {
        return lpszHelper;
    }

    /**
     * ????lpszHelper????????
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLpszHelper(String value) {
        this.lpszHelper = value;
    }

    /**
     * ???lpszKey????????
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLpszKey() {
        return lpszKey;
    }

    /**
     * ????lpszKey????????
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLpszKey(String value) {
        this.lpszKey = value;
    }

    /**
     * ???lpszParams????????
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLpszParams() {
        return lpszParams;
    }

    /**
     * ????lpszParams????????
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLpszParams(String value) {
        this.lpszParams = value;
    }

    /**
     * ???bStyleXml????????
     * 
     */
    public int getBStyleXml() {
        return bStyleXml;
    }

    /**
     * ????bStyleXml????????
     * 
     */
    public void setBStyleXml(int value) {
        this.bStyleXml = value;
    }

}
