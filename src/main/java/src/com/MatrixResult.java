
package src.com;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>MatrixResult complex type�� Java �ࡣ
 * 
 * <p>����ģʽƬ��ָ�������ڴ����е�Ԥ�����ݡ�
 * 
 * <pre>
 * &lt;complexType name="MatrixResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="bResult" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="nStyle" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="sToken" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sHelper" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MatrixResult", propOrder = {
    "bResult",
    "nStyle",
    "sToken",
    "sHelper",
    "sResult"
})
public class MatrixResult {

    protected boolean bResult;
    protected int nStyle;
    protected String sToken;
    protected String sHelper;
    protected String sResult;

    /**
     * ��ȡbResult���Ե�ֵ��
     * 
     */
    public boolean isBResult() {
        return bResult;
    }

    /**
     * ����bResult���Ե�ֵ��
     * 
     */
    public void setBResult(boolean value) {
        this.bResult = value;
    }

    /**
     * ��ȡnStyle���Ե�ֵ��
     * 
     */
    public int getNStyle() {
        return nStyle;
    }

    /**
     * ����nStyle���Ե�ֵ��
     * 
     */
    public void setNStyle(int value) {
        this.nStyle = value;
    }

    /**
     * ��ȡsToken���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSToken() {
        return sToken;
    }

    /**
     * ����sToken���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSToken(String value) {
        this.sToken = value;
    }

    /**
     * ��ȡsHelper���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSHelper() {
        return sHelper;
    }

    /**
     * ����sHelper���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSHelper(String value) {
        this.sHelper = value;
    }

    /**
     * ��ȡsResult���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSResult() {
        return sResult;
    }

    /**
     * ����sResult���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSResult(String value) {
        this.sResult = value;
    }

}
