package cn.pojo;

import java.io.Serializable;
import java.util.Date;

import org.springframework.stereotype.Component;
@Component("salChance")
public class SalChance implements Serializable {
	private static final long serialVersionUID = 2493988416375921139L;

	private Long chcId;

    private String chcSource;

    private String chcCustName;

    private String chcTitle;

    private Long chcRate;

    private String chcLinkman;

    private String chcTel;

    private String chcDesc;

    private Long chcCreateId;

    private String chcCreateBy;

    private Date chcCreateDate;

    private Long chcDueId;

    private String chcDueTo;

    private Date chcDueDate;

    private String chcStatus;

    public Long getChcId() {
        return chcId;
    }

    public void setChcId(Long chcId) {
        this.chcId = chcId;
    }

    public String getChcSource() {
        return chcSource;
    }

    public void setChcSource(String chcSource) {
        this.chcSource = chcSource == null ? null : chcSource.trim();
    }

    public String getChcCustName() {
        return chcCustName;
    }

    public void setChcCustName(String chcCustName) {
        this.chcCustName = chcCustName == null ? null : chcCustName.trim();
    }

    public String getChcTitle() {
        return chcTitle;
    }

    public void setChcTitle(String chcTitle) {
        this.chcTitle = chcTitle == null ? null : chcTitle.trim();
    }

    public Long getChcRate() {
        return chcRate;
    }

    public void setChcRate(Long chcRate) {
        this.chcRate = chcRate;
    }

    public String getChcLinkman() {
        return chcLinkman;
    }

    public void setChcLinkman(String chcLinkman) {
        this.chcLinkman = chcLinkman == null ? null : chcLinkman.trim();
    }

    public String getChcTel() {
        return chcTel;
    }

    public void setChcTel(String chcTel) {
        this.chcTel = chcTel == null ? null : chcTel.trim();
    }

    public String getChcDesc() {
        return chcDesc;
    }

    public void setChcDesc(String chcDesc) {
        this.chcDesc = chcDesc == null ? null : chcDesc.trim();
    }

    public Long getChcCreateId() {
        return chcCreateId;
    }

    public void setChcCreateId(Long chcCreateId) {
        this.chcCreateId = chcCreateId;
    }

    public String getChcCreateBy() {
        return chcCreateBy;
    }

    public void setChcCreateBy(String chcCreateBy) {
        this.chcCreateBy = chcCreateBy == null ? null : chcCreateBy.trim();
    }

    public Date getChcCreateDate() {
        return chcCreateDate;
    }

    public void setChcCreateDate(Date chcCreateDate) {
        this.chcCreateDate = chcCreateDate;
    }

    public Long getChcDueId() {
        return chcDueId;
    }

    public void setChcDueId(Long chcDueId) {
        this.chcDueId = chcDueId;
    }

    public String getChcDueTo() {
        return chcDueTo;
    }

    public void setChcDueTo(String chcDueTo) {
        this.chcDueTo = chcDueTo == null ? null : chcDueTo.trim();
    }

    public Date getChcDueDate() {
        return chcDueDate;
    }

    public void setChcDueDate(Date chcDueDate) {
        this.chcDueDate = chcDueDate;
    }

    public String getChcStatus() {
        return chcStatus;
    }

    public void setChcStatus(String chcStatus) {
        this.chcStatus = chcStatus == null ? null : chcStatus.trim();
    }

	@Override
	public String toString() {
		return "SalChance [chcId=" + chcId + ", chcSource=" + chcSource + ", chcCustName=" + chcCustName + ", chcTitle="
				+ chcTitle + ", chcRate=" + chcRate + ", chcLinkman=" + chcLinkman + ", chcTel=" + chcTel + ", chcDesc="
				+ chcDesc + ", chcCreateId=" + chcCreateId + ", chcCreateBy=" + chcCreateBy + ", chcCreateDate="
				+ chcCreateDate + ", chcDueId=" + chcDueId + ", chcDueTo=" + chcDueTo + ", chcDueDate=" + chcDueDate
				+ ", chcStatus=" + chcStatus + "]";
	}

}