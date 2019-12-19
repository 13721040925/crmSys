package cn.pojo;

import java.io.Serializable;
import java.util.Date;

import org.springframework.stereotype.Component;
@Component("cstLost")
public class CstLost implements Serializable {
	private static final long serialVersionUID = -1840371206869858408L;

	private Long lstId;

    private String lstCustNo;

    private String lstCustName;

    private Long lstCustManagerId;

    private String lstCustManagerName;

    private Date lstLastOrderDate;

    private Date lstLostDate;

    private String lstDelay;

    private String lstReason;

    private String lstStatus;

    public Long getLstId() {
        return lstId;
    }

    public void setLstId(Long lstId) {
        this.lstId = lstId;
    }

    public String getLstCustNo() {
        return lstCustNo;
    }

    public void setLstCustNo(String lstCustNo) {
        this.lstCustNo = lstCustNo == null ? null : lstCustNo.trim();
    }

    public String getLstCustName() {
        return lstCustName;
    }

    public void setLstCustName(String lstCustName) {
        this.lstCustName = lstCustName == null ? null : lstCustName.trim();
    }

    public Long getLstCustManagerId() {
        return lstCustManagerId;
    }

    public void setLstCustManagerId(Long lstCustManagerId) {
        this.lstCustManagerId = lstCustManagerId;
    }

    public String getLstCustManagerName() {
        return lstCustManagerName;
    }

    public void setLstCustManagerName(String lstCustManagerName) {
        this.lstCustManagerName = lstCustManagerName == null ? null : lstCustManagerName.trim();
    }

    public Date getLstLastOrderDate() {
        return lstLastOrderDate;
    }

    public void setLstLastOrderDate(Date lstLastOrderDate) {
        this.lstLastOrderDate = lstLastOrderDate;
    }

    public Date getLstLostDate() {
        return lstLostDate;
    }

    public void setLstLostDate(Date lstLostDate) {
        this.lstLostDate = lstLostDate;
    }

    public String getLstDelay() {
        return lstDelay;
    }

    public void setLstDelay(String lstDelay) {
        this.lstDelay = lstDelay == null ? null : lstDelay.trim();
    }

    public String getLstReason() {
        return lstReason;
    }

    public void setLstReason(String lstReason) {
        this.lstReason = lstReason == null ? null : lstReason.trim();
    }

    public String getLstStatus() {
        return lstStatus;
    }

    public void setLstStatus(String lstStatus) {
        this.lstStatus = lstStatus == null ? null : lstStatus.trim();
    }

	@Override
	public String toString() {
		return "CstLost [lstId=" + lstId + ", lstCustNo=" + lstCustNo + ", lstCustName=" + lstCustName
				+ ", lstCustManagerId=" + lstCustManagerId + ", lstCustManagerName=" + lstCustManagerName
				+ ", lstLastOrderDate=" + lstLastOrderDate + ", lstLostDate=" + lstLostDate + ", lstDelay=" + lstDelay
				+ ", lstReason=" + lstReason + ", lstStatus=" + lstStatus + "]";
	}

}