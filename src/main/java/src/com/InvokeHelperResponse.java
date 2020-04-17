
package src.com;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
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
 *         &lt;element name="InvokeHelperResult" type="{http:/service.tomtone.com/}MatrixResult"/>
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
    "invokeHelperResult"
})
@XmlRootElement(name = "InvokeHelperResponse")
public class InvokeHelperResponse {

    @XmlElement(name = "InvokeHelperResult", required = true)
    protected MatrixResult invokeHelperResult;

    /**
     * ��ȡinvokeHelperResult���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link MatrixResult }
     *     
     */
    public MatrixResult getInvokeHelperResult() {
        return invokeHelperResult;
    }

    /**
     * ����invokeHelperResult���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link MatrixResult }
     *     
     */
    public void setInvokeHelperResult(MatrixResult value) {
        this.invokeHelperResult = value;
    }

}
