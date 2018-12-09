package design.pattern.creational.singleton.enum_singleton;

/**
 * @author hum
 * enum 类天然单例（类加载的时候便初始化完成），且无法反射创建，序列化不会创建新对象
 */
public enum EnumInstance {
    INSTANCE;
    private Object data;

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public static EnumInstance getInstance() {
        return INSTANCE;
    }

}
