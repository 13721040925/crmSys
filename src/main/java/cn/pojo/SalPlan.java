package cn.pojo;

import java.io.Serializable;
import java.util.Date;

import org.springframework.stereotype.Component;
@Component("salPlan")
public class SalPlan implements Serializable {
	private static final long serialVersionUID = 7495245476025669680L;

	private Long plaId;

    private Long plaChcId;

    private Date plaDate;

    private String plaTodo;

    private String plaResult;

    public Long getPlaId() {
        return plaId;
    }

    public void setPlaId(Long plaId) {
        this.plaId = plaId;
    }

    public Long getPlaChcId() {
        return plaChcId;
    }

    public void setPlaChcId(Long plaChcId) {
        this.plaChcId = plaChcId;
    }

    public Date getPlaDate() {
        return plaDate;
    }

    public void setPlaDate(Date plaDate) {
        this.plaDate = plaDate;
    }

    public String getPlaTodo() {
        return plaTodo;
    }

    public void setPlaTodo(String plaTodo) {
        this.plaTodo = plaTodo == null ? null : plaTodo.trim();
    }

    public String getPlaResult() {
        return plaResult;
    }

    public void setPlaResult(String plaResult) {
        this.plaResult = plaResult == null ? null : plaResult.trim();
    }

	@Override
	public String toString() {
		return "SalPlan [plaId=" + plaId + ", plaChcId=" + plaChcId + ", plaDate=" + plaDate + ", plaTodo=" + plaTodo
				+ ", plaResult=" + plaResult + "]";
	}

}