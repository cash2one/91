package com.ast.ast1949.domain.analysis;

import java.io.Serializable;
import java.util.Date;

import com.ast.ast1949.util.DateUtil;

public class AnalysisInquiry  implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Integer id;
	private String inquiryType;
	private Integer inquiryTarget;
	private Integer num;
	private Date gmtTarget;//统计日期
	private Date gmtCreated;
	private Date gmtModified;
	private String targetDate;
	
	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}
	/**
	 * @return the num
	 */
	public Integer getNum() {
		return num;
	}
	/**
	 * @param num the num to set
	 */
	public void setNum(Integer num) {
		this.num = num;
	}
	/**
	 * @return the gmtTarget
	 */
	public Date getGmtTarget() {
		return gmtTarget;
	}
	/**
	 * @param gmtTarget the gmtTarget to set
	 */
	public void setGmtTarget(Date gmtTarget) {
		this.gmtTarget = gmtTarget;
	}
	/**
	 * @return the gmtCreated
	 */
	public Date getGmtCreated() {
		return gmtCreated;
	}
	/**
	 * @param gmtCreated the gmtCreated to set
	 */
	public void setGmtCreated(Date gmtCreated) {
		this.gmtCreated = gmtCreated;
	}
	/**
	 * @return the gmtModified
	 */
	public Date getGmtModified() {
		return gmtModified;
	}
	/**
	 * @param gmtModified the gmtModified to set
	 */
	public void setGmtModified(Date gmtModified) {
		this.gmtModified = gmtModified;
	}
	/**
	 * @return the inquiryType
	 */
	public String getInquiryType() {
		return inquiryType;
	}
	/**
	 * @param inquiryType the inquiryType to set
	 */
	public void setInquiryType(String inquiryType) {
		this.inquiryType = inquiryType;
	}
	/**
	 * @return the inquiryTarget
	 */
	public Integer getInquiryTarget() {
		return inquiryTarget;
	}
	/**
	 * @param inquiryTarget the inquiryTarget to set
	 */
	public void setInquiryTarget(Integer inquiryTarget) {
		this.inquiryTarget = inquiryTarget;
	}
	public String getTargetDate() {
		if(gmtTarget!=null){
			return DateUtil.toString(gmtTarget, "yyyy-MM-dd");
		}
		return targetDate;
	}
	public void setTargetDate(String targetDate) {
		this.targetDate = targetDate;
	}
	
}
