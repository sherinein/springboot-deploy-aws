package org.soap.contractfirst.api.loaneligibility;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="", propOrder= {
	"customerName",
	"age",
	"yearlyIncome",
	"cibileScore",
	"employmentMode"
})
@XmlRootElement(name="CustomerRequest")
public class CustomerRequest {
	@XmlElement(required=true)
	protected String customerName;
	protected int age;
	protected long yearlyIncome;
	protected int cibilScore;
	@XmlElement(required=true)
	protected String employmentMode;
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public long getYearlyIncome() {
		return yearlyIncome;
	}
	public void setYearlyIncome(long yearlyIncome) {
		this.yearlyIncome = yearlyIncome;
	}
	public int getCibilScore() {
		return cibilScore;
	}
	public void setCibilScore(int cibilScore) {
		this.cibilScore = cibilScore;
	}
	public String getEmploymentMode() {
		return employmentMode;
	}
	public void setEmploymentMode(String employmentMode) {
		this.employmentMode = employmentMode;
	}

	
}
