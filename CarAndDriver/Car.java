//��װ���������ƣ��������ͣ������ˣ�סַ�����������룬����ʶ��ţ��������ڣ���������
// ��ǰ�����������������������ͼƬ(400*300)�����г̹�������
//get������set������hashcode������equals������toString�������ṩ���ܷ������١���ʻ�����١�ͣ������ǰƽ���ͺġ����͡����ƿ���ʻ����ȣ�������ʻ������Ҫ·��������
// ������һ��main��������ɸ������Ĳ���
// �ṩһ���෽��getDesigner,�����ַ�����������ߣ�[����]  ѧ�ţ�[ѧ��] �༶��[�༶]����
// ��ʾ���ͼƬͬ��ʻԱ������Ƭ��

import java.awt.Toolkit;
import java.awt.Image;
import java.util.Scanner;

class Car {
    private String carNumber;//��������
    private String carType;//��������
    private String own;//������                          1
    private String address;//סַ                         1
    private String fuction;//ʹ������
    private String model;//Ʒ���ͺ�
    private String carFindNumber;//����ʶ���
    private String engineNumber;//������ʶ���
    private String recordDate;//ע������
    private String issueDate;//��֤����
    private String birthDate;//��������
    private double number;//�������
    private double peoNumber;//�涨������
    private double weight;//������
    private double weightFor;//������
    private double tankCapa;//��������
    private double tankCapaNow;//��ǰ����                    1
    private double sumGo;//���г̹�����
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
        System.out.print("�����복������:");
        carType = keyin.nextLine();
        System.out.print("�����복��������:");
        own = keyin.nextLine();
        System.out.print("�����복��סַ:");
        address = keyin.nextLine();
        System.out.print("�����복��ʹ������:");
        fuction = keyin.nextLine();
        System.out.print("�����복��Ʒ���ͺ�:");
        model = keyin.nextLine();
        System.out.print("�����복��ʶ���:");
        carFindNumber = keyin.nextLine();
        System.out.print("�����복������������:");
        engineNumber = keyin.nextLine();
        System.out.print("�����복��ע������:");
        recordDate = keyin.nextLine();
        System.out.print("�����복����֤����:");
        issueDate = keyin.nextLine();
        System.out.print("�����복����������:");
        birthDate = keyin.nextLine();
        System.out.print("�����복���������:");
        number = keyin.nextDouble();
        System.out.print("�����복���涨������:");
        peoNumber = keyin.nextDouble();
        System.out.print("�����복��������:");
        weight = keyin.nextDouble();
        System.out.print("�����복��������:");
        weightFor = keyin.nextDouble();
        System.out.print("�����복����������:");
        tankCapa = keyin.nextDouble();
        System.out.print("�����복����ǰ����:");
        tankCapaNow = keyin.nextDouble();
        System.out.print("�����복�����г̹�����:");
        sumGo = keyin.nextDouble();

        Toolkit imgtool=Toolkit.getDefaultToolkit();
        Image myimg1=imgtool.getImage(".\\car1.JPG");

    }

    public enum Statement {
        STOP("��ֹ"), RUN("��ʻ��");

        private String type;

        Statement(String type) {
            this.type = type;
        }

        public String getType() {
            return type;
        }
    }


    public void speedUp(double speedAdd){//����
        speed = Math.random()*200;
        speed = speed + speedAdd;
        if(speed == 0) {
            this.statement = Statement.STOP;
            System.out.println("������ֹ��!");
        }
        else{
            this.statement = Statement.RUN;
            System.out.println("��ǰ�ٶȣ�" + speed + "(km/h)\t�������ڼ���!");
        }
        if(speed > 200)
            System.out.println("�����ѳ�200,����٣�");

    }
    public void speedDown(double speedSub){//����
        speed = Math.random()*200;
        speed = speed - speedSub;
        if(speed == 0) {
            this.statement = Statement.STOP;
            System.out.println("������ֹ��!");
        }
        else{
            this.statement = Statement.RUN;
            System.out.println("��ǰ�ٶȣ�" + speed + "(km/h)\t�������ڼ���!");
        }
    }

    public void addOil(){//����
        tankCapaNow = Math.random() * tankCapa;
        System.out.println("��ǰ������" + tankCapaNow + "\t���ڼ��ͣ�");
        if(tankCapaNow == tankCapa)
            System.out.println("�������㣡");
    }
    public static double oilConsump(){//��ǰƽ���ͺģ��ٹ��
        double oilConNow = (Math.random() * 100);//ȼ��������
        double goNow = 100 + (Math.random() * 1000);//��ʻ���
        return oilConNow / goNow * 100;
    }
    public double canGo(){//���ƿ���ʻ����
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
        String str = "" + "-------------�л��������͹���������ʻ֤---------------";
        str = str + "\n���ƺ���:" + carNumber + "\t\t��������:" + carType + "\n������:" + own + "\nסַ:" + address + "\nʹ������:" + fuction
                + "\t\t\t\tƷ���ͺ�:" + model + "\n����ʶ���:" + carFindNumber + "\n����������:" + engineNumber + "\nע������:"
                + recordDate + "\t\t��֤����:" + issueDate + "\n��������:" + birthDate + "\t\t�������:" + number + "\n��������:"
                + tankCapa + "\t\t\t��ǰ����:" + tankCapaNow + "\n������:" + weight + "\t\t\t������:" + weightFor + "\t\t�涨������:"
                + peoNumber + "\n���г̹�����:" + sumGo;
        str = str + "\n----------------------------------------------------";
        return str;
    }


}
