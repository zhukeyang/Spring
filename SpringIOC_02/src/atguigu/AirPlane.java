package atguigu;

public class AirPlane {
    private String fdj;
    private String yc;//机翼长度
    private Integer personNum;//载客量
    private String jz;//机长名字
    private String fjsName;//副驾驶名字

    @Override
    public String toString() {
        return "AirPlane{" +
                "fdj='" + fdj + '\'' +
                ", yc='" + yc + '\'' +
                ", personNum=" + personNum +
                ", jz='" + jz + '\'' +
                ", fjsName='" + fjsName + '\'' +
                '}';
    }

    public AirPlane() {
    }

    public AirPlane(String fdj, String yc, Integer personNum, String jz, String fjsName) {
        this.fdj = fdj;
        this.yc = yc;
        this.personNum = personNum;
        this.jz = jz;
        this.fjsName = fjsName;
    }

    public String getFdj() {
        return fdj;
    }

    public void setFdj(String fdj) {
        this.fdj = fdj;
    }

    public String getYc() {
        return yc;
    }

    public void setYc(String yc) {
        this.yc = yc;
    }

    public Integer getPersonNum() {
        return personNum;
    }

    public void setPersonNum(Integer personNum) {
        this.personNum = personNum;
    }

    public String getJz() {
        return jz;
    }

    public void setJz(String jz) {
        this.jz = jz;
    }

    public String getFjsName() {
        return fjsName;
    }

    public void setFjsName(String fjsName) {
        this.fjsName = fjsName;
    }
}
