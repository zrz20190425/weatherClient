
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
 *         &lt;element name="lpszToken" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "bStyleXml"
})
@XmlRootElement(name = "InvokeLogout")
public class InvokeLogout {

    protected String lpszToken;
    protected int bStyleXml;

    /**
     * ��ȡlpszToken���Ե�ֵ��
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
     * ����lpszToken���Ե�ֵ��
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
