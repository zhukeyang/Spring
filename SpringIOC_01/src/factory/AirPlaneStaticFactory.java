package factory;

import com.atguigu.AirPlane;

//静态工厂
public class AirPlaneStaticFactory {
    public static AirPlane getAirPlane(String jzName)
    {
        System.out.println("static正在造飞机");
        AirPlane airPlane =new AirPlane();
        airPlane.setFdj("太行");
        airPlane.setFjsName("李信");
        airPlane.setJz(jzName);
        airPlane.setPersonNum(300);
        airPlane.setYc("198.98m");
        return airPlane;
    }

    }

