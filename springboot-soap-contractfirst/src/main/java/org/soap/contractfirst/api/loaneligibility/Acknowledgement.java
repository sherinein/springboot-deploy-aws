package org.soap.contractfirst.api.loaneligibility;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="",propOrder= {
	"isEligible",
	"approvedAmount",
	"criteriaMismatch"
})
@XmlRootElement(name="Acknowledgement")
public class Acknowledgement {
	
	protected boolean isEligible;
	protected long approvedAmount;
	@XmlElement(name="CriteriaMismatch",required=true)
	protected List<String> criteriaMismatch;
	public boolean isEligible() {
		return isEligible;
	}
	public void setEligible(boolean isEligible) {
		this.isEligible = isEligible;
	}
	public long getApprovedAmount() {
		return approvedAmount;
	}
	public void setApprovedAmount(long approvedAmount) {
		this.approvedAmount = approvedAmount;
	}
	public List<String> getCriteriaMismatch() {
		return criteriaMismatch;
	}
	public void setCriteriaMismatch(List<String> criteriaMismatch) {
		this.criteriaMismatch = criteriaMismatch;
	}
	

	
	
	
	
}
