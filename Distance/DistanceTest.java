//���������ʱ�������ƽ������ϵ���¼��ĳ��������ֱ�ΪREvent��ֱ������ϵ����PEvent�������꣩��
//�¼���XY���ꡢʱ��Ϊ˽�����ԣ�����Ϊ˫��������
//���ṩ��Ӧ�Ĺ��췽����get������set��������дequals������hashcode������toString����
//�ṩ�¼�����ʱ�õ㵽��һ��ľ�������ط���distance(),���βδ����¼�����ʱ��ԭ��ľ��룬���βδ����βε�ľ��루ע��ͬһ��ʱ�̵���������������壩
//�ṩ��������ϵ�Ļ���ת�����������Ҫ�ṩһ���෽��getDesigner,�����ַ�����������ߣ�[����]  ѧ�ţ�[ѧ��] �༶��[�༶]��



class DistanceTest{
    public static String getDesigner(){
        return "����ߣ�[��쿭]  ѧ�ţ�[320170941570] �༶��[���������]";
    }
    public static void main(String []args){
        System.out.println(DistanceTest.getDesigner());
        REvent R1 = new REvent(1,2);
        REvent R2 = new REvent(3,4);
        REvent R3 = new REvent(1,2);
        PEvent P1 = new PEvent(1,Math.PI/2);
        PEvent P2 = new PEvent(2,Math.PI/2);
        System.out.println("���R1" + R1.toString());
        System.out.println("���R2" + R2.toString());
        System.out.println("���R3" + R3.toString());
        System.out.println("���P1" + P1.toString());
        System.out.println("���P2" + P2.toString());

        System.out.println("R1 == R2?" + R1.equals(R2));
        System.out.println("P1 == P2?" + P1.equals(P2));
        System.out.println("R1 == R3?" + R1.equals(R3));


        System.out.println("R1��R2����:" + R1.distance(R2));
        System.out.println("P1��P2����:" + P1.distance(P2));
        System.out.println("R1��R3����:" + R1.distance(R3));

        System.out.println("R1ת��Ϊ������:" + R1.tranformRtoP());
        System.out.println("P1ת��Ϊֱ������:" + P1.transformPtoR());
    }
}

