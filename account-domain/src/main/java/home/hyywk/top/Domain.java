package home.hyywk.top;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/**
 * 所有的实体类都应当继承这个类，确保所有的实体类，在必要的时候可以装配额外的属性
 * @author 王凯
 * @createdDate 2019/7/18-23:57
 */
public class Domain implements Serializable {

    /**
     * 额外的属性， 从mybatis表当中查出别的表的字段时，填充到该属性值当中
     */
    protected Map<String, Object> extrAttrbutes;

    public void setExtrAttrbutes(Map<String, Object> extrAttrbutes) {
        this.extrAttrbutes = extrAttrbutes;
    }

    public Map<String, Object> getExtrAttrbutes() {
        if ( extrAttrbutes == null ) {
            extrAttrbutes = new HashMap<>(1);
        }
        return extrAttrbutes;
    }
}
