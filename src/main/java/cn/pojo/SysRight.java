package cn.pojo;

import java.io.Serializable;

import org.springframework.stereotype.Component;

@Component("sysRight")
public class SysRight implements Serializable {
	private static final long serialVersionUID = -8180994259770848252L;

	private Long sysRightId;

	private String rightCode;

    private String rightParentCode;

    private String rightType;

    private String rightText;

    private String rightUrl;

    private String rightTip;

	public Long getSysRightId() {
		return sysRightId;
	}

	public void setSysRightId(Long sysRightId) {
		this.sysRightId = sysRightId;
	}

	public String getRightCode() {
        return rightCode;
    }

    public void setRightCode(String rightCode) {
        this.rightCode = rightCode == null ? null : rightCode.trim();
    }

    public String getRightParentCode() {
        return rightParentCode;
    }

    public void setRightParentCode(String rightParentCode) {
        this.rightParentCode = rightParentCode == null ? null : rightParentCode.trim();
    }

    public String getRightType() {
        return rightType;
    }

    public void setRightType(String rightType) {
        this.rightType = rightType == null ? null : rightType.trim();
    }

    public String getRightText() {
        return rightText;
    }

    public void setRightText(String rightText) {
        this.rightText = rightText == null ? null : rightText.trim();
    }

    public String getRightUrl() {
        return rightUrl;
    }

    public void setRightUrl(String rightUrl) {
        this.rightUrl = rightUrl == null ? null : rightUrl.trim();
    }

    public String getRightTip() {
        return rightTip;
    }

    public void setRightTip(String rightTip) {
        this.rightTip = rightTip == null ? null : rightTip.trim();
    }

	@Override
	public String toString() {
		return "SysRight [sysRightId=" + sysRightId + ", rightCode=" + rightCode + ", rightParentCode="
				+ rightParentCode + ", rightType=" + rightType + ", rightText=" + rightText + ", rightUrl=" + rightUrl
				+ ", rightTip=" + rightTip + "]";
	}


}