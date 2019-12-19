package cn.pojo;

import java.io.Serializable;

import org.springframework.stereotype.Component;

@Component("basDict")
public class BasDict implements Serializable {
	private static final long serialVersionUID = 7376476199211186533L;

	private Long dictId;

    private String dictType;

    private String dictItem;

    private String dictValue;

    private Short dictIsEditable;

    public Long getDictId() {
        return dictId;
    }

    public void setDictId(Long dictId) {
        this.dictId = dictId;
    }

    public String getDictType() {
        return dictType;
    }

    public void setDictType(String dictType) {
        this.dictType = dictType == null ? null : dictType.trim();
    }

    public String getDictItem() {
        return dictItem;
    }

    public void setDictItem(String dictItem) {
        this.dictItem = dictItem == null ? null : dictItem.trim();
    }

    public String getDictValue() {
        return dictValue;
    }

    public void setDictValue(String dictValue) {
        this.dictValue = dictValue == null ? null : dictValue.trim();
    }

    public Short getDictIsEditable() {
        return dictIsEditable;
    }

    public void setDictIsEditable(Short dictIsEditable) {
        this.dictIsEditable = dictIsEditable;
    }

	@Override
	public String toString() {
		return "BasDict [dictId=" + dictId + ", dictType=" + dictType + ", dictItem=" + dictItem + ", dictValue="
				+ dictValue + ", dictIsEditable=" + dictIsEditable + "]";
	}

}