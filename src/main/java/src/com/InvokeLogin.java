
package src.com;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>anonymous complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="lpszUser" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lpszPswd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lpszNetwk" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "lpszUser",
    "lpszPswd",
    "lpszNetwk",
    "bStyleXml"
})
@XmlRootElement(name = "InvokeLogin")
public class InvokeLogin {

    protected String lpszUser;
    protected String lpszPswd;
    protected String lpszNetwk;
    protected int bStyleXml;

    /**
     * ��ȡlpszUser���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLpszUser() {
        return lpszUser;
    }

    /**
     * ����lpszUser���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLpszUser(String value) {
        this.lpszUser = value;
    }

    /**
     * ��ȡlpszPswd���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLpszPswd() {
        return lpszPswd;
    }

    /**
     * ����lpszPswd���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLpszPswd(String value) {
        this.lpszPswd = value;
    }

    /**
     * ��ȡlpszNetwk���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLpszNetwk() {
        return lpszNetwk;
    }

    /**
     * ����lpszNetwk���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLpszNetwk(String value) {
        this.lpszNetwk = value;
    }

    /**
     * ��ȡbStyleXml���Ե�ֵ��
     * 
     */
    public int getBStyleXml() {
        return bStyleXml;
    }

    /**
     * ����bStyleXml���Ե�ֵ��
     * 
     */
    public void setBStyleXml(int value) {
        this.bStyleXml = value;
    }

}
