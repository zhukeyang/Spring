package vo;

public class QueryParam {
    private Object p1;
    private Object p2;

    public QueryParam(Object p1, Object p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    @Override
    public String toString() {
        return "QueryParam{" +
                "p1=" + p1 +
                ", p2=" + p2 +
                '}';
    }

    public QueryParam() {
    }

    public Object getP1() {
        return p1;
    }

    public void setP1(Object p1) {
        this.p1 = p1;
    }

    public Object getP2() {
        return p2;
    }

    public void setP2(Object p2) {
        this.p2 = p2;
    }
}
