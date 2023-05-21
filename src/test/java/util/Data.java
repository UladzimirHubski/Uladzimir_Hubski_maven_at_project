package util;

import java.util.List;
import java.util.Objects;

public class Data {
    private String code;
    private List<Names> data;

    public Data(String code, List<Names> data) {
        this.code = code;
        this.data = data;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public List<Names> getData() {
        return data;
    }

    public void setData(List<Names> data) {
        this.data = data;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Data data1 = (Data) o;
        return code.equals(data1.code) && data.equals(data1.data);
    }

    @Override
    public int hashCode() {
        return Objects.hash(code, data);
    }

    @Override
    public String toString() {
        return "Data{" +
                "code='" + code + '\'' +
                ", data=" + data +
                '}';
    }
}
