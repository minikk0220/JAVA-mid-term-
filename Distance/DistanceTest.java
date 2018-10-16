//请给出带有时间的两个平面坐标系中事件的抽象，类名分别为REvent（直角坐标系），PEvent（极坐标）。
//事件的XY坐标、时间为私有属性，精度为双精度类型
//并提供相应的构造方法和get方法和set方法，重写equals方法、hashcode方法、toString方法
//提供事件发生时该点到另一点的距离的重载方法distance(),无形参代表事件发生时到原点的距离，有形参代表到形参点的距离（注意同一个时刻的两点间距离才有意义）
//提供两种坐标系的互相转换方法。最后还要提供一个类方法getDesigner,返回字符串：“设计者：[姓名]  学号：[学号] 班级：[班级]”



class DistanceTest{
    public static String getDesigner(){
        return "设计者：[许红凯]  学号：[320170941570] 班级：[计算机二班]";
    }
    public static void main(String []args){
        System.out.println(DistanceTest.getDesigner());
        REvent R1 = new REvent(1,2);
        REvent R2 = new REvent(3,4);
        REvent R3 = new REvent(1,2);
        PEvent P1 = new PEvent(1,Math.PI/2);
        PEvent P2 = new PEvent(2,Math.PI/2);
        System.out.println("输出R1" + R1.toString());
        System.out.println("输出R2" + R2.toString());
        System.out.println("输出R3" + R3.toString());
        System.out.println("输出P1" + P1.toString());
        System.out.println("输出P2" + P2.toString());

        System.out.println("R1 == R2?" + R1.equals(R2));
        System.out.println("P1 == P2?" + P1.equals(P2));
        System.out.println("R1 == R3?" + R1.equals(R3));


        System.out.println("R1与R2距离:" + R1.distance(R2));
        System.out.println("P1与P2距离:" + P1.distance(P2));
        System.out.println("R1与R3距离:" + R1.distance(R3));

        System.out.println("R1转换为极坐标:" + R1.tranformRtoP());
        System.out.println("P1转换为直角坐标:" + P1.transformPtoR());
    }
}

