//封装：汽车号牌，车辆类型，所有人，住址，发动机号码，车辆识别号，生产日期，油箱容量
// 当前油量，重量，载重量，外观图片(400*300)，总行程公里数等
//get方法和set方法、hashcode方法、equals方法、toString方法，提供功能方法加速、行驶、减速、停车、当前平均油耗、加油、估计可行驶距离等，其中行驶方法需要路径参数。
// 并给出一个main方法来完成各方法的测试
// 提供一个类方法getDesigner,返回字符串：“设计者：[姓名]  学号：[学号] 班级：[班级]”。
// 显示外观图片同驾驶员类中照片。



class Test {
    public static String getDesigner(){
        return "设计者：[许红凯]  学号：[320170941570] 班级：[计算机二班]";
    }

    public static void main(String []args){
        System.out.println(Test.getDesigner());
        Driver d = new Driver("xuhk");
        d.input();
        System.out.println(d.toString());

        Car c = new Car("浙B88888");
        c.input();
        System.out.println(c.toString());
        System.out.println("================车辆动态==============");
        c.speedUp(100);
        c.speedDown(50 );
        c.addOil();
        System.out.println("车辆当前平均油耗：" + c.oilConsump() + "(L/百公里)");
        System.out.println("车辆估计可行驶距离：" + c.canGo() + "km");
    }
}























