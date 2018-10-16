import java.util.Date;
class PEvent{
    private double r,��;
    private Date time;
    public PEvent(){
        r = �� = 0;time = null;
    }
    public PEvent(double r,double ��){
        this.r = r;
        this.�� = ��;
        time = new Date();
    }
    public double getR(){return r;}
    public double get��(){return ��;}
    public Date getTime(){return time;}

    public void setR(double a){r = a;}
    public void set��(double b){�� = b;}
    public void setTime(Date c){time = c;}

    public boolean equals(Object ob){
        if(ob instanceof PEvent) {
            PEvent another = (PEvent) ob;
            if (this.getR() == another.getR() && this.get��() == another.get��() && (this.getTime()).equals(another.getTime()))
                return true;
        }
        return false;
    }

    public int hashcode(){
        int result = 17;
        result = 31 * result + (int)this.getR();
        result = 31 * result + (int)this.get��();
        return result;
    }

    public double distance(){
        double x0 = this.getR()-0;
        double y0 = this.get��()-0;
        double distance = Math.sqrt(x0*x0+y0*y0);
        return distance;
    }

    public double distance(PEvent another){
        if((this.getTime()).equals(another.getTime())){
            double r1 = this.getR() * this.getR();
            double r2 = another.getR() * another.getR();
            double ��0=this.get��() - another.get��();
            double distance = Math.sqrt(r1 + r2 - 2 * this.getR() * another.getR() * Math.cos(��0));
            return distance; 
        }
        else {
            System.out.println("����ͬһʱ��,distance��Ч!");
            return 0;
        }
    }

    public REvent transformPtoR(){
        double x,y;
        Date time;
        x = r * Math.cos(��);
        y = r * Math.sin(��);
        time = this.time;
        return new REvent(x,y);
    }
    public String toString(){
        String str = "";
        str = str + "(" + this.getR() + "," + this.get��() + ")--time:" + this.getTime();
        return str;
    }
}