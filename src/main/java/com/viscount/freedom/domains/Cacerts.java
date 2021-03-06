package com.viscount.freedom.domains;
// Generated Mar 2, 2016 10:13:57 PM by Hibernate Tools 4.3.1.Final

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Cacerts generated by hbm2java
 */
@Entity
@Table(name = "cacerts", schema = "public")
public class Cacerts implements java.io.Serializable {

	private long id;
	private String content;
	private String issuedto;
	private String issuedby;
	private Date expirationdate;
	private String filename;
	private String issuername;
	private String serialnumber;
	private String subjectname;
	private String akid;
	private String skid;

	public Cacerts() {
	}

	public Cacerts(long id) {
		this.id = id;
	}

	public Cacerts(long id, String content, String issuedto, String issuedby, Date expirationdate, String filename,
			String issuername, String serialnumber, String subjectname, String akid, String skid) {
		this.id = id;
		this.content = content;
		this.issuedto = issuedto;
		this.issuedby = issuedby;
		this.expirationdate = expirationdate;
		this.filename = filename;
		this.issuername = issuername;
		this.serialnumber = serialnumber;
		this.subjectname = subjectname;
		this.akid = akid;
		this.skid = skid;
	}

	@Id

	@Column(name = "id", unique = true, nullable = false)
	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	@Column(name = "content")
	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	@Column(name = "issuedto", length = 200)
	public String getIssuedto() {
		return this.issuedto;
	}

	public void setIssuedto(String issuedto) {
		this.issuedto = issuedto;
	}

	@Column(name = "issuedby", length = 200)
	public String getIssuedby() {
		return this.issuedby;
	}

	public void setIssuedby(String issuedby) {
		this.issuedby = issuedby;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "expirationdate", length = 29)
	public Date getExpirationdate() {
		return this.expirationdate;
	}

	public void setExpirationdate(Date expirationdate) {
		this.expirationdate = expirationdate;
	}

	@Column(name = "filename", length = 200)
	public String getFilename() {
		return this.filename;
	}

	public void setFilename(String filename) {
		this.filename = filename;
	}

	@Column(name = "issuername", length = 300)
	public String getIssuername() {
		return this.issuername;
	}

	public void setIssuername(String issuername) {
		this.issuername = issuername;
	}

	@Column(name = "serialnumber", length = 100)
	public String getSerialnumber() {
		return this.serialnumber;
	}

	public void setSerialnumber(String serialnumber) {
		this.serialnumber = serialnumber;
	}

	@Column(name = "subjectname", length = 300)
	public String getSubjectname() {
		return this.subjectname;
	}

	public void setSubjectname(String subjectname) {
		this.subjectname = subjectname;
	}

	@Column(name = "akid")
	public String getAkid() {
		return this.akid;
	}

	public void setAkid(String akid) {
		this.akid = akid;
	}

	@Column(name = "skid")
	public String getSkid() {
		return this.skid;
	}

	public void setSkid(String skid) {
		this.skid = skid;
	}

}
