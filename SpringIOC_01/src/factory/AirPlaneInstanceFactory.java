package factory;

import com.atguigu.AirPlane;

//实例工厂
public class AirPlaneInstanceFactory {
    AirPlaneStaticFactory airPlaneStaticFactory =new AirPlaneStaticFactory();
    public AirPlane getAirPlane(String jzName)
    {
        System.out.println("正在造飞机");
        AirPlane airPlane =new AirPlane();
        airPlane.setFdj("太行");
        airPlane.setFjsName("李信");
        airPlane.setJz(jzName);
        airPlane.setPersonNum(300);
        airPlane.setYc("198.98m");
        return airPlane;
    }
}
