import java.util.Date;
class PEvent{
    private double r,θ;
    private Date time;
    public PEvent(){
        r = θ = 0;time = null;
    }
    public PEvent(double r,double θ){
        this.r = r;
        this.θ = θ;
        time = new Date();
    }
    public double getR(){return r;}
    public double getθ(){return θ;}
    public Date getTime(){return time;}

    public void setR(double a){r = a;}
    public void setθ(double b){θ = b;}
    public void setTime(Date c){time = c;}

    public boolean equals(Object ob){
        if(ob instanceof PEvent) {
            PEvent another = (PEvent) ob;
            if (this.getR() == another.getR() && this.getθ() == another.getθ() && (this.getTime()).equals(another.getTime()))
                return true;
        }
        return false;
    }

    public int hashcode(){
        int result = 17;
        result = 31 * result + (int)this.getR();
        result = 31 * result + (int)this.getθ();
        return result;
    }

    public double distance(){
        double x0 = this.getR()-0;
        double y0 = this.getθ()-0;
        double distance = Math.sqrt(x0*x0+y0*y0);
        return distance;
    }

    public double distance(PEvent another){
        if((this.getTime()).equals(another.getTime())){
            double r1 = this.getR() * this.getR();
            double r2 = another.getR() * another.getR();
            double θ0=this.getθ() - another.getθ();
            double distance = Math.sqrt(r1 + r2 - 2 * this.getR() * another.getR() * Math.cos(θ0));
            return distance; 
        }
        else {
            System.out.println("不在同一时刻,distance无效!");
            return 0;
        }
    }

    public REvent transformPtoR(){
        double x,y;
        Date time;
        x = r * Math.cos(θ);
        y = r * Math.sin(θ);
        time = this.time;
        return new REvent(x,y);
    }
    public String toString(){
        String str = "";
        str = str + "(" + this.getR() + "," + this.getθ() + ")--time:" + this.getTime();
        return str;
    }
}