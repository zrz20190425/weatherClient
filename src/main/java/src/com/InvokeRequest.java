
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
 *         &lt;element name="lpszUrl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="lpszParams" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="bPost" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="bUtf8" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
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
    "lpszUrl",
    "lpszParams",
    "bPost",
    "bUtf8"
})
@XmlRootElement(name = "InvokeRequest")
public class InvokeRequest {

    protected String lpszUrl;
    protected String lpszParams;
    protected boolean bPost;
    protected boolean bUtf8;

    /**
     * ��ȡlpszUrl���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLpszUrl() {
        return lpszUrl;
    }

    /**
     * ����lpszUrl���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLpszUrl(String value) {
        this.lpszUrl = value;
    }

    /**
     * ��ȡlpszParams���Ե�ֵ��
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
     * ����lpszParams���Ե�ֵ��
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
     * ��ȡbPost���Ե�ֵ��
     * 
     */
    public boolean isBPost() {
        return bPost;
    }

    /**
     * ����bPost���Ե�ֵ��
     * 
     */
    public void setBPost(boolean value) {
        this.bPost = value;
    }

    /**
     * ��ȡbUtf8���Ե�ֵ��
     * 
     */
    public boolean isBUtf8() {
        return bUtf8;
    }

    /**
     * ����bUtf8���Ե�ֵ��
     * 
     */
    public void setBUtf8(boolean value) {
        this.bUtf8 = value;
    }

}
