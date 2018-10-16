//封装：汽车号牌，车辆类型，所有人，住址，发动机号码，车辆识别号，生产日期，油箱容量
// 当前油量，重量，载重量，外观图片(400*300)，总行程公里数等
//get方法和set方法、hashcode方法、equals方法、toString方法，提供功能方法加速、行驶、减速、停车、当前平均油耗、加油、估计可行驶距离等，其中行驶方法需要路径参数。
// 并给出一个main方法来完成各方法的测试
// 提供一个类方法getDesigner,返回字符串：“设计者：[姓名]  学号：[学号] 班级：[班级]”。
// 显示外观图片同驾驶员类中照片。

import java.awt.Toolkit;
import java.awt.Image;
import java.util.Scanner;

class Car {
    private String carNumber;//汽车号牌
    private String carType;//车辆类型
    private String own;//所有人                          1
    private String address;//住址                         1
    private String fuction;//使用性质
    private String model;//品牌型号
    private String carFindNumber;//车辆识别号
    private String engineNumber;//发动机识别号
    private String recordDate;//注册日期
    private String issueDate;//发证日期
    private String birthDate;//生产日期
    private double number;//档案编号
    private double peoNumber;//规定载人数
    private double weight;//总质量
    private double weightFor;//载重量
    private double tankCapa;//油箱容量
    private double tankCapaNow;//当前油量                    1
    private double sumGo;//总行程公里数
    private double speed;
    private Statement statement;


    public Car(){
        carNumber = null;
        this.statement = Statement.STOP;
    }
    public Car(String carName) {
        this.carNumber = carName;
        this.statement = Statement.STOP;
    }


    public String getCarNumber(){return carNumber;}
    public String getCarType(){return carType;}
    public String getOwn(){return own;}
    public String getAdress(){return address;}
    public String getFuction(){return fuction;}
    public String getModel(){return model;}
    public String getCarFindNumber(){return carFindNumber;}
    public String getEngineNumber(){return engineNumber;}
    public String getRecordDate(){return recordDate;}
    public String getIssueDate(){return issueDate;}
    public String getBirthDate(){return birthDate;}
    public double getNumber(){return number;}
    public double getPeoNumber(){return peoNumber;}
    public double getWeight(){return weight;}
    public double getWeightFor(){return weightFor;}
    public double getTankCapa(){return tankCapa;}
    public double getTankCapaNow(){return tankCapaNow;}
    public double getSumGo(){return sumGo;}
    public double getSpeed(){return speed;}
    public Statement getStatement(){return statement;}


    public boolean setCarNumber(String cn){
        if(cn == null)return false;
        else {
            carNumber = cn;
            return true;
        }
    }
    public boolean setCarType(String ct){
        if(ct == null)return false;
        else {
            carType = ct;
            return true;
        }
    }
    public boolean setOwn(String o){
        if(o == null)return false;
        else {
            own = o;
            return true;
        }
    }
    public boolean setAddress(String ad){
        if(ad == null)return false;
        else {
            address = ad;
            return true;
        }
    }
    public boolean setFuction(String fu){
        if(fu == null)return false;
        else {
            fuction = fu;
            return true;
        }
    }
    public boolean setModel(String m){
        if(m == null)return false;
        else {
            model = m;
            return true;
        }
    }
    public boolean setCarFindNumber(String cfn){
        if(cfn == null || cfn.length() != 17)return false;
        else {
            carFindNumber = cfn;
            return true;
        }
    }
    public boolean setEngineNumber(String en){
        if(en == null || en.length() != 7)return false;
        else {
            engineNumber=en;
            return true;
        }
    }
    public boolean setRecordDate(String rd){
        if(rd == null || rd.length() != 8)return false;
        else {
            recordDate=rd;
            return true;
        }
    }
    public boolean setIssueDate(String issd) {
        if (issd == null || issd.length() != 8) return false;
        else {
            issueDate = issd;
            return true;
        }
    }
    public boolean setBirthDate(String bird){
        if(bird == null || bird.length() != 8)return false;
        else {
            birthDate = bird;
            return true;
        }
    }
    public boolean setNumber(double n){
        if(String.valueOf(n).length() != 12)return false;
        else {
            number = n;
            return true;
        }
    }
    public boolean setPeoNumber(double pn){
        if(pn <= 0 || String.valueOf(pn).length() > 10)return false;
        else {
            peoNumber = pn;
            return true;
        }
    }
    public boolean setWeight(double w){
        if(w <= 0)return false;
        else {
            weight = w;
            return true;
        }
    }
    public boolean setWeightFor(double wf){
        if(wf == 0 || wf >= weight)return false;
        else {
            weightFor = wf;
            return true;
        }
    }
    public boolean setTankCapa(double tc){
        if(tc <= 0)return false;
        else {
            number = tc;
            return true;
        }
    }
    public boolean setTankCapaNow(double tcn){
        if(tcn <= 0 || tcn > tankCapa)return false;
        else {
            tankCapaNow = tcn;
            return true;
        }
    }
    public boolean setSunGo(double sg){
        if(sg < 0)return false;
        else {
            number = sg;
            return true;
        }
    }
    public boolean setSpeed(double s){
        if(s < 0 || s>200)return false;
        else {
            speed = s;
            return true;
        }
    }


    public void input(){
        Scanner keyin = new Scanner(System.in);
        System.out.print("请输入车辆类型:");
        carType = keyin.nextLine();
        System.out.print("请输入车辆所有人:");
        own = keyin.nextLine();
        System.out.print("请输入车辆住址:");
        address = keyin.nextLine();
        System.out.print("请输入车辆使用性质:");
        fuction = keyin.nextLine();
        System.out.print("请输入车辆品牌型号:");
        model = keyin.nextLine();
        System.out.print("请输入车辆识别号:");
        carFindNumber = keyin.nextLine();
        System.out.print("请输入车辆发动机号码:");
        engineNumber = keyin.nextLine();
        System.out.print("请输入车辆注册日期:");
        recordDate = keyin.nextLine();
        System.out.print("请输入车辆发证日期:");
        issueDate = keyin.nextLine();
        System.out.print("请输入车辆生产日期:");
        birthDate = keyin.nextLine();
        System.out.print("请输入车辆档案编号:");
        number = keyin.nextDouble();
        System.out.print("请输入车辆规定载人数:");
        peoNumber = keyin.nextDouble();
        System.out.print("请输入车辆总质量:");
        weight = keyin.nextDouble();
        System.out.print("请输入车辆载重量:");
        weightFor = keyin.nextDouble();
        System.out.print("请输入车辆油箱容量:");
        tankCapa = keyin.nextDouble();
        System.out.print("请输入车辆当前油量:");
        tankCapaNow = keyin.nextDouble();
        System.out.print("请输入车辆总行程公里数:");
        sumGo = keyin.nextDouble();

        Toolkit imgtool=Toolkit.getDefaultToolkit();
        Image myimg1=imgtool.getImage(".\\car1.JPG");

    }

    public enum Statement {
        STOP("静止"), RUN("行驶中");

        private String type;

        Statement(String type) {
            this.type = type;
        }

        public String getType() {
            return type;
        }
    }


    public void speedUp(double speedAdd){//加速
        speed = Math.random()*200;
        speed = speed + speedAdd;
        if(speed == 0) {
            this.statement = Statement.STOP;
            System.out.println("车辆静止中!");
        }
        else{
            this.statement = Statement.RUN;
            System.out.println("当前速度：" + speed + "(km/h)\t车辆正在加速!");
        }
        if(speed > 200)
            System.out.println("车速已超200,请减速！");

    }
    public void speedDown(double speedSub){//加速
        speed = Math.random()*200;
        speed = speed - speedSub;
        if(speed == 0) {
            this.statement = Statement.STOP;
            System.out.println("车辆静止中!");
        }
        else{
            this.statement = Statement.RUN;
            System.out.println("当前速度：" + speed + "(km/h)\t车辆正在减速!");
        }
    }

    public void addOil(){//加油
        tankCapaNow = Math.random() * tankCapa;
        System.out.println("当前油量：" + tankCapaNow + "\t正在加油！");
        if(tankCapaNow == tankCapa)
            System.out.println("油量充足！");
    }
    public static double oilConsump(){//当前平均油耗（百公里）
        double oilConNow = (Math.random() * 100);//燃油消耗量
        double goNow = 100 + (Math.random() * 1000);//行驶里程
        return oilConNow / goNow * 100;
    }
    public double canGo(){//估计可行驶距离
        double canGo = tankCapaNow * 100 / this.oilConsump();
        return canGo;
    }




    public boolean equals(Object ob){
        if(ob instanceof Car) {
            Car another = (Car)ob;
            if (this.carNumber == another.carNumber && this.carType == another.carType && this.own == another.own
                    && this.address == another.address && this.fuction == another.fuction && this.model == another.model
                    && this.carFindNumber == another.carFindNumber && this.engineNumber == another.engineNumber
                    && this.recordDate == another.recordDate && this.issueDate == another.issueDate && this.birthDate == another.birthDate
                    && this.number == another.number && this.tankCapa == another.tankCapa && this.tankCapaNow == another.tankCapaNow
                    && this.weight == another.weight && this.weightFor == another.weightFor && this.sumGo == another.sumGo)
                return true;
        }
        return false;
    }

    public int hashcode(){
        int result = 17;
        result = 31 * result + (int)this.getNumber();
        return result;
    }

    public String toString(){
        String str = "" + "-------------中华人名共和国机动车行驶证---------------";
        str = str + "\n车牌号码:" + carNumber + "\t\t车辆类型:" + carType + "\n所有人:" + own + "\n住址:" + address + "\n使用性质:" + fuction
                + "\t\t\t\t品牌型号:" + model + "\n车辆识别号:" + carFindNumber + "\n发动机号码:" + engineNumber + "\n注册日期:"
                + recordDate + "\t\t发证日期:" + issueDate + "\n生产日期:" + birthDate + "\t\t档案编号:" + number + "\n油箱容量:"
                + tankCapa + "\t\t\t当前油量:" + tankCapaNow + "\n总质量:" + weight + "\t\t\t载重量:" + weightFor + "\t\t规定载人数:"
                + peoNumber + "\n总行程公里数:" + sumGo;
        str = str + "\n----------------------------------------------------";
        return str;
    }


}
