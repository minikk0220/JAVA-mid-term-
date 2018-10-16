//驾驶员类中封装的数据有：姓名、国籍、住址、出生日期，初次领证日期、
// 准驾车型、有效日期、有效期限.照片（照片采用Image类来定义）、档案编号等
//给出相应的get方法和set方法、toString方法、equals方法和hashcode方法等

import java.awt.Toolkit;
import java.awt.Image;
import java.util.Scanner;

class Driver{
    private String name;//姓名
    private char sex;//性别
    private String nationality;//国籍
    private String address;//住址
    private String birthday;//出生日期
    private String firstget;//初次领证日期
    private String carclass;//准驾车型
    private String validFrom;//有效起始日期
    private double validFor;//有效期限
    private double number;//档案编号
    Toolkit imgtool = Toolkit.getDefaultToolkit();
    Image myimg = imgtool.getImage(".\\driver.JPG");


    public Driver(){name = null;}
    public Driver(String name){
        this.name = name;
    }

    public void input(){
        Scanner keyin = new Scanner(System.in);
        System.out.print("请输入驾驶员性别：");
        sex = keyin.nextLine().charAt(0);
        System.out.print("请输入驾驶员国籍：");
        nationality = keyin.nextLine();
        System.out.print("请输入驾驶员住址：");
        address = keyin.nextLine();
        System.out.print("请输入驾驶员出生日期：");
        birthday = keyin.nextLine();
        System.out.print("请输入驾驶员初次领证日期：");
        firstget = keyin.nextLine();
        System.out.print("请输入驾驶员准驾车型：");
        carclass = keyin.nextLine();
        System.out.print("请输入驾驶员有效起始日期：");
        validFrom = keyin.nextLine();
        System.out.print("请输入驾驶员有效期限：");
        validFor = keyin.nextDouble();
        System.out.print("请输入驾驶员档案编号：");
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
        String str = "" + "-----------------------中华人名共和国机动车驾驶证-----------------------";
        str = str + "\n姓名:" + name + "\t\t性别:" + sex + "\t\t国籍:" + nationality + "\n住址:" + address + "\n出生日期:" + birthday
                + "\n初次领证日期:" + firstget + "\n准驾车型:" + carclass + "\n有效起始日期:" + validFrom
                + "\t\t有效期限:" + validFor + "\n档案编号:" + number;
        str = str + "\n----------------------------------------------------------------------";
        return str;
    }

}