import java.util.Date;
class REvent{
    private double x,y;
    private Date time;
    public REvent(){x = y = 0 ; time = null;}
    public REvent(double x,double y){
        this.x = x;
        this.y = y;
        time = new Date();
    }

    public double getX(){return x;}
    public double getY(){return y;}
    public Date getTime(){return time;}

    public void setX(double a){x = a;}
    public void setY(double b){y = b;}
    public void setTime(Date c){time = c;}

    public boolean equals(Object ob){
        if(ob instanceof REvent){
            REvent another = (REvent)ob;
            if (this.getX() == another.getX() && this.getY() == another.getY() && (this.getTime()).equals(another.getTime()))
                return true;
        }
        return false;
    }

    public int hashcode(){
        int result=17;
        result = 31 * result + (int)this.getX();
        result = 31 * result + (int)this.getY();
        return result;
    }


    public double distance(){
        double x0 = this.getX() - 0;
        double y0 = this.getY() - 0;
        double distance = Math.sqrt(x0 * x0 + y0 * y0);
        return distance;
    }

    public double distance(REvent another){
        if((this.getTime()).equals(another.getTime())){
            double x0 = this.getX() - another.getX();
            double y0 = this.getY() - another.getY();
            double distance = Math.sqrt(x0 * x0 + y0 * y0);
            return distance;
        }
        else {
            System.out.println("不在同一时刻,distance无效!");
            return 0;
        }
    }

    public PEvent tranformRtoP(){
        double r,θ;
        Date time;
        r = Math.sqrt(this.getX() * this.getX() + this.getY() * this.getY());
        θ = Math.atan(this.getY() / this.getY());
        time = this.time;
        return new PEvent(r,θ);
    }

    public String toString(){
        String str = "";
        str = str + "(" + this.getX() + "," + this.getY() + ")--time:" + this.getTime();
        return str;
    }

}