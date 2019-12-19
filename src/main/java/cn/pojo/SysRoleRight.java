package cn.pojo;

import java.io.Serializable;

import org.springframework.stereotype.Component;

@Component("sysRoleRight")
public class SysRoleRight implements Serializable {
	private static final long serialVersionUID = -5927024428011011249L;

	private Long roleRightId;

	private String rfRightCode;

    private Long rfRoleId;

	public Long getRoleRightId() {
		return roleRightId;
	}

	public void setRoleRightId(Long roleRightId) {
		this.roleRightId = roleRightId;
	}

	public String getRfRightCode() {
        return rfRightCode;
    }

    public void setRfRightCode(String rfRightCode) {
        this.rfRightCode = rfRightCode == null ? null : rfRightCode.trim();
    }

    public Long getRfRoleId() {
        return rfRoleId;
    }

    public void setRfRoleId(Long rfRoleId) {
        this.rfRoleId = rfRoleId;
    }

	@Override
	public String toString() {
		return "SysRoleRight [roleRightId=" + roleRightId + ", rfRightCode=" + rfRightCode + ", rfRoleId=" + rfRoleId
				+ "]";
	}

}