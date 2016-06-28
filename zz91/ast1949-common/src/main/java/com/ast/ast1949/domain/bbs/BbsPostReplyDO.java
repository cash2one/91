package com.ast.ast1949.domain.bbs;

import java.util.Date;

/**
 * BbsPostReply generated by MyEclipse Persistence Tools
 */

public class BbsPostReplyDO implements java.io.Serializable {

	// Fields

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer id;
	private Integer companyId;
	private Integer toCompanyId;
	private String account;
	private Integer bbsPostId;
	private Integer bbsPostReplyId;
	private String title;
	private String content;
	private String isDel;
	private String checkPerson;
	private String checkStatus;
	private Date checkTime;
	private String unpassReason;
	private String uncheckedCheckStatus;
	private Date gmtCreated;
	private Date gmtModified;
	private Integer bbsPostCategoryId; //bbspost表中的categoryid
	private Integer replyCount;
	private Integer zanCount;//点赞数
	private String nickname;//昵称
	
	

	// Constructors

	
	public Integer getZanCount() {
		return zanCount;
	}

	public void setZanCount(Integer zanCount) {
		this.zanCount = zanCount;
	}

	public Integer getBbsPostCategoryId() {
		return bbsPostCategoryId;
	}

	public void setBbsPostCategoryId(Integer bbsPostCategoryId) {
		this.bbsPostCategoryId = bbsPostCategoryId;
	}

	/** default constructor */
	public BbsPostReplyDO() {
	}

	/** minimal constructor */
	public BbsPostReplyDO(Integer id) {
		this.id = id;
	}

	/** full constructor */
	public BbsPostReplyDO(Integer id, Integer companyId,Integer toCompanyId, String account,
			Integer bbsPostId,Integer bbsPostReplyId,String title, String content, String isDel,
			String checkPerson, String checkStatus, Date checkTime,
			String unpassReason, String uncheckedCheckStatus, Date gmtCreated,
			Date gmtModified) {
		this.id = id;
		this.companyId = companyId;
		this.toCompanyId = toCompanyId;
		this.account = account;
		this.bbsPostId = bbsPostId; 
		this.bbsPostReplyId = bbsPostReplyId;
		this.title = title;
		this.content = content;
		this.isDel = isDel;
		this.checkPerson = checkPerson;
		this.checkStatus = checkStatus;
		this.checkTime = checkTime;
		this.unpassReason = unpassReason;
		this.uncheckedCheckStatus = uncheckedCheckStatus;
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

	public Integer getCompanyId() {
		return this.companyId;
	}

	public void setCompanyId(Integer companyId) {
		this.companyId = companyId;
	}

	public Integer getToCompanyId() {
		return toCompanyId;
	}

	public void setToCompanyId(Integer toCompanyId) {
		this.toCompanyId = toCompanyId;
	}

	public String getAccount() {
		return this.account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public Integer getBbsPostId() {
		return this.bbsPostId;
	}

	public void setBbsPostId(Integer bbsPostId) {
		this.bbsPostId = bbsPostId;
	}

	public Integer getBbsPostReplyId() {
		return bbsPostReplyId;
	}

	public void setBbsPostReplyId(Integer bbsPostReplyId) {
		this.bbsPostReplyId = bbsPostReplyId;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getIsDel() {
		return this.isDel;
	}

	public void setIsDel(String isDel) {
		this.isDel = isDel;
	}

	public String getCheckPerson() {
		return this.checkPerson;
	}

	public void setCheckPerson(String checkPerson) {
		this.checkPerson = checkPerson;
	}

	public String getCheckStatus() {
		return this.checkStatus;
	}

	public void setCheckStatus(String checkStatus) {
		this.checkStatus = checkStatus;
	}

	public Date getCheckTime() {
		return this.checkTime;
	}

	public void setCheckTime(Date checkTime) {
		this.checkTime = checkTime;
	}

	public String getUnpassReason() {
		return this.unpassReason;
	}

	public void setUnpassReason(String unpassReason) {
		this.unpassReason = unpassReason;
	}

	public String getUncheckedCheckStatus() {
		return this.uncheckedCheckStatus;
	}

	public void setUncheckedCheckStatus(String uncheckedCheckStatus) {
		this.uncheckedCheckStatus = uncheckedCheckStatus;
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

	public Integer getReplyCount() {
		return replyCount;
	}

	public void setReplyCount(Integer replyCount) {
		this.replyCount = replyCount;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

}