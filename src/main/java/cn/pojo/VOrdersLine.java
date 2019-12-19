package cn.pojo;

import java.io.Serializable;

import org.springframework.stereotype.Component;

@Component("vOrdersLine")
public class VOrdersLine implements Serializable {
	private static final long serialVersionUID = -3652058282914689619L;

	private Long oddId;

    private Long oddOrderId;

    private Long oddProdId;

    private Long oddCount;

    private String oddUnit;

    private Double oddPrice;

    public Long getOddId() {
        return oddId;
    }

    public void setOddId(Long oddId) {
        this.oddId = oddId;
    }

    public Long getOddOrderId() {
        return oddOrderId;
    }

    public void setOddOrderId(Long oddOrderId) {
        this.oddOrderId = oddOrderId;
    }

    public Long getOddProdId() {
        return oddProdId;
    }

    public void setOddProdId(Long oddProdId) {
        this.oddProdId = oddProdId;
    }

    public Long getOddCount() {
        return oddCount;
    }

    public void setOddCount(Long oddCount) {
        this.oddCount = oddCount;
    }

    public String getOddUnit() {
        return oddUnit;
    }

    public void setOddUnit(String oddUnit) {
        this.oddUnit = oddUnit == null ? null : oddUnit.trim();
    }

    public Double getOddPrice() {
        return oddPrice;
    }

    public void setOddPrice(Double oddPrice) {
        this.oddPrice = oddPrice;
    }

	@Override
	public String toString() {
		return "VOrdersLine [oddId=" + oddId + ", oddOrderId=" + oddOrderId + ", oddProdId=" + oddProdId + ", oddCount="
				+ oddCount + ", oddUnit=" + oddUnit + ", oddPrice=" + oddPrice + "]";
	}

}