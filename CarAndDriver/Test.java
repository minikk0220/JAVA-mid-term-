//��װ���������ƣ��������ͣ������ˣ�סַ�����������룬����ʶ��ţ��������ڣ���������
// ��ǰ�����������������������ͼƬ(400*300)�����г̹�������
//get������set������hashcode������equals������toString�������ṩ���ܷ������١���ʻ�����١�ͣ������ǰƽ���ͺġ����͡����ƿ���ʻ����ȣ�������ʻ������Ҫ·��������
// ������һ��main��������ɸ������Ĳ���
// �ṩһ���෽��getDesigner,�����ַ�����������ߣ�[����]  ѧ�ţ�[ѧ��] �༶��[�༶]����
// ��ʾ���ͼƬͬ��ʻԱ������Ƭ��



class Test {
    public static String getDesigner(){
        return "����ߣ�[��쿭]  ѧ�ţ�[320170941570] �༶��[���������]";
    }

    public static void main(String []args){
        System.out.println(Test.getDesigner());
        Driver d = new Driver("xuhk");
        d.input();
        System.out.println(d.toString());

        Car c = new Car("��B88888");
        c.input();
        System.out.println(c.toString());
        System.out.println("================������̬==============");
        c.speedUp(100);
        c.speedDown(50 );
        c.addOil();
        System.out.println("������ǰƽ���ͺģ�" + c.oilConsump() + "(L/�ٹ���)");
        System.out.println("�������ƿ���ʻ���룺" + c.canGo() + "km");
    }
}























