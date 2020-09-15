package cn.cqswxy.entity;

public class Customer {

	private Integer customerId;
	private String customerName;
	private String customerMobile;
	private Boolean customerGender;
	private String customerAddress;
	private String customerPortray;
	
	public Integer getCustomerId() {
		return customerId;
	}
	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCustomerMobile() {
		return customerMobile;
	}
	public void setCustomerMobile(String customerMobile) {
		this.customerMobile = customerMobile;
	}
	public Boolean getCustomerGender() {
		return customerGender;
	}
	public void setCustomerGender(Boolean customerGender) {
		this.customerGender = customerGender;
	}
	public String getCustomerAddress() {
		return customerAddress;
	}
	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}
	public String getCustomerPortray() {
		return customerPortray;
	}
	public void setCustomerPortray(String customerPortray) {
		this.customerPortray = customerPortray;
	}
}
