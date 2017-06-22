package prototype;

/**
 * Created by rek on 22.06.17.
 */
public abstract class AbstractHero implements Cloneable {

    private String id;
    protected String type;

    abstract void sayName();

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public String getType() {
        return type;
    }

    @Override
    public Object clone() {
        Object clone = null;
        try {
            clone = super.clone();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return clone;
    }
}
