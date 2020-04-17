
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
 *         &lt;element name="InvokeScriptResult" type="{http:/service.tomtone.com/}MatrixResult"/>
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
    "invokeScriptResult"
})
@XmlRootElement(name = "InvokeScriptResponse")
public class InvokeScriptResponse {

    @XmlElement(name = "InvokeScriptResult", required = true)
    protected MatrixResult invokeScriptResult;

    /**
     * ��ȡinvokeScriptResult���Ե�ֵ��
     * 
     * @return
     *     possible object is
     *     {@link MatrixResult }
     *     
     */
    public MatrixResult getInvokeScriptResult() {
        return invokeScriptResult;
    }

    /**
     * ����invokeScriptResult���Ե�ֵ��
     * 
     * @param value
     *     allowed object is
     *     {@link MatrixResult }
     *     
     */
    public void setInvokeScriptResult(MatrixResult value) {
        this.invokeScriptResult = value;
    }

}
