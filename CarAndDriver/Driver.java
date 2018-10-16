//��ʻԱ���з�װ�������У�������������סַ���������ڣ�������֤���ڡ�
// ׼�ݳ��͡���Ч���ڡ���Ч����.��Ƭ����Ƭ����Image�������壩��������ŵ�
//������Ӧ��get������set������toString������equals������hashcode������

import java.awt.Toolkit;
import java.awt.Image;
import java.util.Scanner;

class Driver{
    private String name;//����
    private char sex;//�Ա�
    private String nationality;//����
    private String address;//סַ
    private String birthday;//��������
    private String firstget;//������֤����
    private String carclass;//׼�ݳ���
    private String validFrom;//��Ч��ʼ����
    private double validFor;//��Ч����
    private double number;//�������
    Toolkit imgtool = Toolkit.getDefaultToolkit();
    Image myimg = imgtool.getImage(".\\driver.JPG");


    public Driver(){name = null;}
    public Driver(String name){
        this.name = name;
    }

    public void input(){
        Scanner keyin = new Scanner(System.in);
        System.out.print("�������ʻԱ�Ա�");
        sex = keyin.nextLine().charAt(0);
        System.out.print("�������ʻԱ������");
        nationality = keyin.nextLine();
        System.out.print("�������ʻԱסַ��");
        address = keyin.nextLine();
        System.out.print("�������ʻԱ�������ڣ�");
        birthday = keyin.nextLine();
        System.out.print("�������ʻԱ������֤���ڣ�");
        firstget = keyin.nextLine();
        System.out.print("�������ʻԱ׼�ݳ��ͣ�");
        carclass = keyin.nextLine();
        System.out.print("�������ʻԱ��Ч��ʼ���ڣ�");
        validFrom = keyin.nextLine();
        System.out.print("�������ʻԱ��Ч���ޣ�");
        validFor = keyin.nextDouble();
        System.out.print("�������ʻԱ������ţ�");
        number = keyin.nextDouble();

    }

    public String getName(){return name;}
    public char getSex(){return sex;}
    public String getNationality(){return nationality;}
    public String getAddress(){return address;}
    public String getBirthday(){return birthday;}
    public String getFirstget(){return firstget;}
    public String getCarclass(){return carclass;}
    public String getValidFrom(){return validFrom;}
    public double getValidFor(){return validFor;}
    public double getNumber(){return number;}

    public boolean setName(String n){
        if(n == null)return false;
        else{
            name=n;
            return true;
        }
    }
    public boolean setSex(char s){
        if(s == 'F'|| s== 'M'){
            sex=s;
            return true;
        }
        else return false;
    }
    public boolean setNationality(String na){
        if(na == null)return false;
        else{
        nationality = na;
        return true;
        }
    }
    public boolean setAddress(String ad){
        if(ad == null)return false;
        else{
            address=ad;
            return true;
        }
    }
    public boolean setBirthday(String b){
        if(b == null || b.length() != 8)return false;
        else {
            birthday = b;
            return true;
        }
    }
    public boolean setFirstget(String f){
        if(f== null || f.length() != 8)return false;
        else {
            firstget = f;
            return true;
        }
    }
    public boolean setCarclass(String cc){
        if(cc == null)return false;
        else{
            carclass=cc;
            return true;
        }
    }
    public boolean setValidFrom(String vfrom){
        if(vfrom== null || vfrom.length() != 8)return false;
        else {
            validFrom = vfrom;
            return true;
        }
    }
    public boolean setValidFor(double vfor){
        if(vfor == 0 || String.valueOf(vfor).length() != 8)return false;
    else {
        validFor = vfor;
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


    public boolean equals(Object ob){
        if(ob instanceof Driver){
            Driver another = (Driver)ob;
            if(this.name == another.name && this.sex == another.sex && this.nationality == another.nationality
                && this.address == another.address && this.birthday == another.birthday && this.firstget == another.firstget
                && this.carclass == another.carclass && this.validFrom == another.validFrom && this.validFor == another.validFor
                && this.number == another.number)
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
        String str = "" + "-----------------------�л��������͹���������ʻ֤-----------------------";
        str = str + "\n����:" + name + "\t\t�Ա�:" + sex + "\t\t����:" + nationality + "\nסַ:" + address + "\n��������:" + birthday
                + "\n������֤����:" + firstget + "\n׼�ݳ���:" + carclass + "\n��Ч��ʼ����:" + validFrom
                + "\t\t��Ч����:" + validFor + "\n�������:" + number;
        str = str + "\n----------------------------------------------------------------------";
        return str;
    }

}