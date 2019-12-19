package cn.pojo;

import java.io.Serializable;
import java.util.Date;

import org.springframework.stereotype.Component;
@Component("cstActivity")
public class CstActivity implements Serializable {
	private static final long serialVersionUID = -9003066245883547279L;

	private Long atvId;

    private String atvCustNo;

    private String atvCustName;

    private Date atvDate;

    private String atvPlace;

    private String atvTitle;

    private String atvDesc;

    public Long getAtvId() {
        return atvId;
    }

    public void setAtvId(Long atvId) {
        this.atvId = atvId;
    }

    public String getAtvCustNo() {
        return atvCustNo;
    }

    public void setAtvCustNo(String atvCustNo) {
        this.atvCustNo = atvCustNo == null ? null : atvCustNo.trim();
    }

    public String getAtvCustName() {
        return atvCustName;
    }

    public void setAtvCustName(String atvCustName) {
        this.atvCustName = atvCustName == null ? null : atvCustName.trim();
    }

    public Date getAtvDate() {
        return atvDate;
    }

    public void setAtvDate(Date atvDate) {
        this.atvDate = atvDate;
    }

    public String getAtvPlace() {
        return atvPlace;
    }

    public void setAtvPlace(String atvPlace) {
        this.atvPlace = atvPlace == null ? null : atvPlace.trim();
    }

    public String getAtvTitle() {
        return atvTitle;
    }

    public void setAtvTitle(String atvTitle) {
        this.atvTitle = atvTitle == null ? null : atvTitle.trim();
    }

    public String getAtvDesc() {
        return atvDesc;
    }

    public void setAtvDesc(String atvDesc) {
        this.atvDesc = atvDesc == null ? null : atvDesc.trim();
    }

	@Override
	public String toString() {
		return "CstActivity [atvId=" + atvId + ", atvCustNo=" + atvCustNo + ", atvCustName=" + atvCustName
				+ ", atvDate=" + atvDate + ", atvPlace=" + atvPlace + ", atvTitle=" + atvTitle + ", atvDesc=" + atvDesc
				+ "]";
	}

}