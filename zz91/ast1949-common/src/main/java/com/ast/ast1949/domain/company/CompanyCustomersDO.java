package com.ast.ast1949.domain.company;

import java.util.Date;

import com.ast.ast1949.domain.DomainSupport;

/**
 * CompanyCustomers generated by MyEclipse Persistence Tools
 */

public class CompanyCustomersDO extends DomainSupport{

	// Fields

	/**
	 *
	 */
	private static final long serialVersionUID = 6238424704230705117L;
	private Integer companyContactsId;
	private Integer companyCustomersGroupId;
	private String name;
	private String mobile;
	private String email;
	private String sex;
	private String telCountryCode;
	private String telAreaCode;
	private String tel;
	private String faxCountryCode;
	private String faxAreaCode;
	private String fax;
	private String company;
	private String countryCode;
	private String areaCode;
	private String address;
	private String postCode;
	private Short rank;
	private Short status;
	private String remark;
	private Integer companyId;
	private String account;
	private Date gmtCreated;
	private Date gmtModified;
    private String position;
    
    private String foreignCity;
    
    
	// Constructors

	public String getForeignCity() {
		return foreignCity;
	}

	public void setForeignCity(String foreignCity) {
		this.foreignCity = foreignCity;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	/** default constructor */
	public CompanyCustomersDO() {
	}

	/** minimal constructor */
	public CompanyCustomersDO(Integer id) {
		setId(id);
	}

	/** full constructor */
	public CompanyCustomersDO(Integer id, Integer companyContactsId,
			Integer companyCustomersGroupId, String name, String mobile,
			String email, String sex, String telCountryCode,
			String telAreaCode, String tel, String faxCountryCode,
			String faxAreaCode, String fax, String company, String countryCode,
			String areaCode, String address, String postCode, Short rank,
			Short status, String remark, Integer companyId, String account,
			Date gmtCreated, Date gmtModified) {
		setId(id);
		this.companyContactsId = companyContactsId;
		this.companyCustomersGroupId = companyCustomersGroupId;
		this.name = name;
		this.mobile = mobile;
		this.email = email;
		this.sex = sex;
		this.telCountryCode = telCountryCode;
		this.telAreaCode = telAreaCode;
		this.tel = tel;
		this.faxCountryCode = faxCountryCode;
		this.faxAreaCode = faxAreaCode;
		this.fax = fax;
		this.company = company;
		this.countryCode = countryCode;
		this.areaCode = areaCode;
		this.address = address;
		this.postCode = postCode;
		this.rank = rank;
		this.status = status;
		this.remark = remark;
		this.companyId = companyId;
		this.account = account;
		this.gmtCreated = gmtCreated;
		this.gmtModified = gmtModified;
	}

	// Property accessors

	public Integer getCompanyContactsId() {
		return this.companyContactsId;
	}

	public void setCompanyContactsId(Integer companyContactsId) {
		this.companyContactsId = companyContactsId;
	}

	public Integer getCompanyCustomersGroupId() {
		return this.companyCustomersGroupId;
	}

	public void setCompanyCustomersGroupId(Integer companyCustomersGroupId) {
		this.companyCustomersGroupId = companyCustomersGroupId;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMobile() {
		return this.mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSex() {
		return this.sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getTelCountryCode() {
		return this.telCountryCode;
	}

	public void setTelCountryCode(String telCountryCode) {
		this.telCountryCode = telCountryCode;
	}

	public String getTelAreaCode() {
		return this.telAreaCode;
	}

	public void setTelAreaCode(String telAreaCode) {
		this.telAreaCode = telAreaCode;
	}

	public String getTel() {
		return this.tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getFaxCountryCode() {
		return this.faxCountryCode;
	}

	public void setFaxCountryCode(String faxCountryCode) {
		this.faxCountryCode = faxCountryCode;
	}

	public String getFaxAreaCode() {
		return this.faxAreaCode;
	}

	public void setFaxAreaCode(String faxAreaCode) {
		this.faxAreaCode = faxAreaCode;
	}

	public String getFax() {
		return this.fax;
	}

	public void setFax(String fax) {
		this.fax = fax;
	}

	public String getCompany() {
		return this.company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getCountryCode() {
		return this.countryCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	public String getAreaCode() {
		return this.areaCode;
	}

	public void setAreaCode(String areaCode) {
		this.areaCode = areaCode;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPostCode() {
		return this.postCode;
	}

	public void setPostCode(String postCode) {
		this.postCode = postCode;
	}

	public Short getRank() {
		return this.rank;
	}

	public void setRank(Short rank) {
		this.rank = rank;
	}

	public Short getStatus() {
		return this.status;
	}

	public void setStatus(Short status) {
		this.status = status;
	}

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public Integer getCompanyId() {
		return this.companyId;
	}

	public void setCompanyId(Integer companyId) {
		this.companyId = companyId;
	}

	public String getAccount() {
		return this.account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public Date getGmtCreated() {
		return this.gmtCreated;
	}

	public void setGmtCreated(Date gmtCreated) {
		this.gmtCreated = gmtCreated;
	}

	public Date getGmtModified() {
		return this.gmtModified;
	}

	public void setGmtModified(Date gmtModified) {
		this.gmtModified = gmtModified;
	}

}