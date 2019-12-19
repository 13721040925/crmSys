package cn.pojo;

import java.io.Serializable;

import org.springframework.stereotype.Component;

@Component("sysRole")
public class SysRole implements Serializable {
	private static final long serialVersionUID = 1403495397165985223L;

	private Long roleId;

    private String roleName;

    private String roleDesc;

    private Long roleFlag;

    public Long getRoleId() {
        return roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName == null ? null : roleName.trim();
    }

    public String getRoleDesc() {
        return roleDesc;
    }

    public void setRoleDesc(String roleDesc) {
        this.roleDesc = roleDesc == null ? null : roleDesc.trim();
    }

    public Long getRoleFlag() {
        return roleFlag;
    }

    public void setRoleFlag(Long roleFlag) {
        this.roleFlag = roleFlag;
    }

	@Override
	public String toString() {
		return "SysRole [roleId=" + roleId + ", roleName=" + roleName + ", roleDesc=" + roleDesc + ", roleFlag="
				+ roleFlag + "]";
	}

}