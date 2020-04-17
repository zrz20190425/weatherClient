
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
 *         &lt;element name="InvokeManualResult" type="{http:/service.tomtone.com/}MatrixResult"/>
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
    "invokeManualResult"
})
@XmlRootElement(name = "InvokeManualResponse")
public class InvokeManualResponse {

    @XmlElement(name = "InvokeManualResult", required = true)
    protected MatrixResult invokeManualResult;

    /**
     * ��ȡinvokeManualResult���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link MatrixResult }
     *     
     */
    public MatrixResult getInvokeManualResult() {
        return invokeManualResult;
    }

    /**
     * ����invokeManualResult���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link MatrixResult }
     *     
     */
    public void setInvokeManualResult(MatrixResult value) {
        this.invokeManualResult = value;
    }

}
