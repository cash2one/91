package com.ast.ast1949.domain.products;

import java.util.Date;

/**
 * ProductsKeywordsRank generated by MyEclipse Persistence Tools
 */

public class ProductsKeywordsRankDO implements java.io.Serializable {

	// Fields

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;
	private Integer id;				//编号
	private Integer productId;		//供求编号
	private String 	name;			//关键字名称
	private Date 	startTime;		//开始时间
	private Date 	endTime;		//结束时间
	private String 	isChecked;		//是否审核
	private Date 	gmtCreated;		//创建时间
	private Date 	gmtModified;	//修改时间
	
	private String 	applyAccount;	//申请人帐号
	private Integer companyId;		//公司编号
	private String 	type;			//标王类型
	private Date 	buyTime;		//购买时间
	

	// Constructors

	/** default constructor */
	public ProductsKeywordsRankDO() {
	}

	/** minimal constructor */
	public ProductsKeywordsRankDO(Integer id, String name) {
		this.id = id;
		this.name = name;
	}

	/** simple constructor */
	public ProductsKeywordsRankDO(Integer id, Integer productId, String name,
			Date startTime, Date endTime, String isChecked, Date gmtCreated,
			Date gmtModified) {
		this.id = id;
		this.productId = productId;
		this.name = name;
		this.startTime = startTime;
		this.endTime = endTime;
		this.isChecked = isChecked;
		this.gmtCreated = gmtCreated;
		this.gmtModified = gmtModified;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getProductId() {
		return this.productId;
	}

	public void setProductId(Integer productId) {
		this.productId = productId;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getStartTime() {
		return this.startTime;
	}

	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	public Date getEndTime() {
		return this.endTime;
	}

	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	public String getIsChecked() {
		return this.isChecked;
	}

	public void setIsChecked(String isChecked) {
		this.isChecked = isChecked;
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

	/**
	 * @return the applyAccount
	 */
	public String getApplyAccount() {
		return applyAccount;
	}

	/**
	 * @param applyAccount the applyAccount to set
	 */
	public void setApplyAccount(String applyAccount) {
		this.applyAccount = applyAccount;
	}

	/**
	 * @return the companyId
	 */
	public Integer getCompanyId() {
		return companyId;
	}

	/**
	 * @param companyId the companyId to set
	 */
	public void setCompanyId(Integer companyId) {
		this.companyId = companyId;
	}

	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}

	/**
	 * @param type the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}

	/**
	 * @return the buyTime
	 */
	public Date getBuyTime() {
		return buyTime;
	}

	/**
	 * @param buyTime the buyTime to set
	 */
	public void setBuyTime(Date buyTime) {
		this.buyTime = buyTime;
	}

}