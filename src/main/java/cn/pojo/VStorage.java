package cn.pojo;

import java.io.Serializable;

import org.springframework.stereotype.Component;

@Component("vStorage")
public class VStorage implements Serializable {
	private static final long serialVersionUID = 5050829700582305478L;

	private Long stkId;

    private String stkProduct;

    private String stkWarehouse;

    private String stkWare;

    private Long stkCount;

    private String stkMemo;

    public Long getStkId() {
        return stkId;
    }

    public void setStkId(Long stkId) {
        this.stkId = stkId;
    }

    public String getStkProduct() {
        return stkProduct;
    }

    public void setStkProduct(String stkProduct) {
        this.stkProduct = stkProduct == null ? null : stkProduct.trim();
    }

    public String getStkWarehouse() {
        return stkWarehouse;
    }

    public void setStkWarehouse(String stkWarehouse) {
        this.stkWarehouse = stkWarehouse == null ? null : stkWarehouse.trim();
    }

    public String getStkWare() {
        return stkWare;
    }

    public void setStkWare(String stkWare) {
        this.stkWare = stkWare == null ? null : stkWare.trim();
    }

    public Long getStkCount() {
        return stkCount;
    }

    public void setStkCount(Long stkCount) {
        this.stkCount = stkCount;
    }

    public String getStkMemo() {
        return stkMemo;
    }

    public void setStkMemo(String stkMemo) {
        this.stkMemo = stkMemo == null ? null : stkMemo.trim();
    }

	@Override
	public String toString() {
		return "VStorage [stkId=" + stkId + ", stkProduct=" + stkProduct + ", stkWarehouse=" + stkWarehouse
				+ ", stkWare=" + stkWare + ", stkCount=" + stkCount + ", stkMemo=" + stkMemo + "]";
	}

}