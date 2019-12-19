package cn.pojo;

import java.io.Serializable;

import org.springframework.stereotype.Component;

@Component("sysUser")
public class SysUser implements Serializable {
	private static final long serialVersionUID = -7705095582957962569L;

	private Long usrId;

    private String usrName;

    private String usrPassword;

    private Long usrFlag;

    private Long usrRoleId;

    public Long getUsrId() {
        return usrId;
    }

    public void setUsrId(Long usrId) {
        this.usrId = usrId;
    }

    public String getUsrName() {
        return usrName;
    }

    public void setUsrName(String usrName) {
        this.usrName = usrName == null ? null : usrName.trim();
    }

    public String getUsrPassword() {
        return usrPassword;
    }

    public void setUsrPassword(String usrPassword) {
        this.usrPassword = usrPassword == null ? null : usrPassword.trim();
    }

    public Long getUsrFlag() {
        return usrFlag;
    }

    public void setUsrFlag(Long usrFlag) {
        this.usrFlag = usrFlag;
    }

    public Long getUsrRoleId() {
        return usrRoleId;
    }

    public void setUsrRoleId(Long usrRoleId) {
        this.usrRoleId = usrRoleId;
    }

	@Override
	public String toString() {
		return "SysUser [usrId=" + usrId + ", usrName=" + usrName + ", usrPassword=" + usrPassword + ", usrFlag="
				+ usrFlag + ", usrRoleId=" + usrRoleId + "]";
	}

}