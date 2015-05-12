package com.buch.publisher.model;

import java.util.Date;
import java.util.Calendar;
import java.util.GregorianCalendar;

import lombok.Data;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;


@Data
public class PublisherVo {
	
	private String pubCd;
	private String pubGb;
	private String pubNm;
	private String busiNo;
	private String busiPresident;
	
	private String busiTel;
	private String busiFax;
	private String busiZip;
	private String busiAddr1;
	private String busiAddr2;
	
	private String busiIndustry;
	private String busiItem;
	private String taxGb;
	private String billType;
	private String dealType;
	@DateTimeFormat(iso= ISO.DATE)
	private Date closeDt; //�먯젏��
	private String busiDelivery;
	@NotEmpty(message = "- �대찓�쇱쓣 �낅젰�섏꽭��")
	private String busiEmail;
	@DateTimeFormat(iso= ISO.DATE)
	private Date sttlementDt; //寃곗옱��
	
	private String useYn;
	private String regId;
	@DateTimeFormat(iso= ISO.DATE)
	private Date  regDt;
	private String modId;
	private Date  modDt;
	public PublisherVo() {
		// TODO Auto-generated constructor stub
		//2013.12.21 [�댁꽦洹��붾㈃���ㅻ뒛�좎쭨濡��뗮똿. Start
		Calendar today = new GregorianCalendar();
		today.set(today.get(Calendar.YEAR), today.get(Calendar.MONTH),today.get(Calendar.DATE),0 ,0 ,0);
		closeDt = today.getTime();
		sttlementDt = today.getTime();
		regDt = today.getTime();
		this.setRegId("ADMIN");
		//2013.12.21 [�댁꽦洹��붾㈃���ㅻ뒛�좎쭨濡��뗮똿. End
	}

	public PublisherVo(String pubCd,String pubNm,String busiPresident
			,String busiTel,String busiFax,String busiZip,String busiAddr1){
		this.pubCd = pubCd;
		this.pubNm = pubNm;
		this.busiPresident = busiPresident;
		this.busiTel = busiTel;
		this.busiFax = busiFax;
		this.busiZip = busiZip;
		this.busiAddr1 = busiAddr1;
	}	
	

	public String getPubCd() {
		return pubCd;
	}

	public void setPubCd(String pubCd) {
		this.pubCd = pubCd;
	}

	public String getPubGb() {
		return pubGb;
	}

	public void setPubGb(String pubGb) {
		this.pubGb = pubGb;
	}

	public String getPubNm() {
		return pubNm;
	}

	public void setPubNm(String pubNm) {
		this.pubNm = pubNm;
	}

	public String getBusiNo() {
		return busiNo;
	}

	public void setBusiNo(String busiNo) {
		this.busiNo = busiNo;
	}

	public String getBusiPresident() {
		return busiPresident;
	}

	public void setBusiPresident(String busiPresident) {
		this.busiPresident = busiPresident;
	}

	public String getBusiTel() {
		return busiTel;
	}

	public void setBusiTel(String busiTel) {
		this.busiTel = busiTel;
	}

	public String getBusiFax() {
		return busiFax;
	}

	public void setBusiFax(String busiFax) {
		this.busiFax = busiFax;
	}

	public String getBusiZip() {
		return busiZip;
	}

	public void setBusiZip(String busiZip) {
		this.busiZip = busiZip;
	}

	public String getBusiAddr1() {
		return busiAddr1;
	}

	public void setBusiAddr1(String busiAddr1) {
		this.busiAddr1 = busiAddr1;
	}

	public String getBusiAddr2() {
		return busiAddr2;
	}

	public void setBusiAddr2(String busiAddr2) {
		this.busiAddr2 = busiAddr2;
	}

	public String getBusiIndustry() {
		return busiIndustry;
	}

	public void setBusiIndustry(String busiIndustry) {
		this.busiIndustry = busiIndustry;
	}

	public String getBusiItem() {
		return busiItem;
	}

	public void setBusiItem(String busiItem) {
		this.busiItem = busiItem;
	}

	public String getTaxGb() {
		return taxGb;
	}

	public void setTaxGb(String taxGb) {
		this.taxGb = taxGb;
	}

	public String getBillType() {
		return billType;
	}

	public void setBillType(String billType) {
		this.billType = billType;
	}

	public String getDealType() {
		return dealType;
	}

	public void setDealType(String dealType) {
		this.dealType = dealType;
	}

	public Date getCloseDt() {
		return closeDt;
	}

	public void setCloseDt(Date closeDt) {
		this.closeDt = closeDt;
	}

	public String getBusiDelivery() {
		return busiDelivery;
	}

	public void setBusiDelivery(String busiDelivery) {
		this.busiDelivery = busiDelivery;
	}

	public String getBusiEmail() {
		return busiEmail;
	}

	public void setBusiEmail(String busiEmail) {
		this.busiEmail = busiEmail;
	}

	public Date getSttlementDt() {
		return sttlementDt;
	}

	public void setSttlementDt(Date sttlementDt) {
		this.sttlementDt = sttlementDt;
	}

	public String getUseYn() {
		return useYn;
	}

	public void setUseYn(String useYn) {
		this.useYn = useYn;
	}

	public String getRegId() {
		return regId;
	}

	public void setRegId(String regId) {
		this.regId = regId;
	}

	public Date getRegDt() {
		return regDt;
	}

	public void setRegDt(Date regDt) {
		this.regDt = regDt;
	}

	public String getModId() {
		return modId;
	}

	public void setModId(String modId) {
		this.modId = modId;
	}

	public Date getModDt() {
		return modDt;
	}

	public void setModDt(Date modDt) {
		this.modDt = modDt;
	}

	@Override
	public String toString() {
		return "PublisherVo [pubCd=" + pubCd + ", pubGb=" + pubGb + ", pubNm="
				+ pubNm + ", busiNo=" + busiNo + ", busiPresident="
				+ busiPresident + ", busiTel=" + busiTel + ", busiFax="
				+ busiFax + ", busiZip=" + busiZip + ", busiAddr1=" + busiAddr1
				+ ", busiAddr2=" + busiAddr2 + ", busiIndustry=" + busiIndustry
				+ ", busiItem=" + busiItem + ", taxGb=" + taxGb + ", billType="
				+ billType + ", dealType=" + dealType + ", closeDt=" + closeDt
				+ ", busiDelivery=" + busiDelivery + ", busiEmail=" + busiEmail
				+ ", sttlementDt=" + sttlementDt + ", useYn=" + useYn
				+ ", regId=" + regId + ", regDt=" + regDt + ", modId=" + modId
				+ ", modDt=" + modDt + "]";
	}
	
	
	

}
