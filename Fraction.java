class Fraction{
    private int num;
    private int den;
    public Fraction(){
        num = 0;
        den = 1;
    }

    public Fraction(int n, int d) {
        num = n;
        if (d == 0) {
            System.out.println("Error! Zero Denominator, setting it to 1");
            den = 1;
        } else {
            den = d;
        }
    }

    public Fraction(String f){
        int slashIndex = f.indexOf("/");
        String n = f.substring(0,slashIndex);
        String d = f.substring(slashIndex+1);
        num = Integer.parseInt(n);
        den = Integer.parseInt(d);
    }

    public Fraction(Fraction f) {
        num = f.getNum();
        den = f.getDenom();
    }

    public int getNum() {
        return num;
    }

    public int getDenom() {
        return den;
    }

    public void reduce() { 
        int r = findGCF(num, den);
        num /= r;
        den /= r; 
    }

    public int findGCF(int n,int d){
        if(n < 0){
            n = 0 - n;
        }
        if(d < 0){
            d = 0 - d;
        }
        while(n != d){
            if(n > d){
                n -= d;
            }else{
                d -= n;
            }
        }
        return n;
    }

    public void setDen(int d){
        if(d != 0){
            den = d;
        }
    }

    public void setNum(int n){
        num = n;
    }

    public static Fraction multiply (Fraction a, Fraction b){
        int newNum = a.getNum() * b.getNum();
        int newDen = a.getDenom() * b.getDenom();
        Fraction ans = new Fraction (newNum,newDen);
        ans.reduce();
        return ans;
    }
    
    public static Fraction divide (Fraction a, Fraction b){
        int newNum = a.getNum() * b.getDenom();
        int newDen = a.getDenom() * b.getNum();
        Fraction ans = new Fraction (newNum,newDen);
        ans.reduce();
        return ans;
    }
    
    public static Fraction add (Fraction a, Fraction b){
        int newNum1 = a.getNum() * b.getDenom();
        int newNum2 = b.getNum() * a.getDenom();
        int newDen = a.getDenom() * b.getDenom();
        Fraction ans = new Fraction (newNum1 + newNum2,newDen);
        ans.reduce();
        return ans;
    }
    
    public static Fraction subtract (Fraction a, Fraction b){
        int newNum1 = a.getNum() * b.getDenom();
        int newNum2 = b.getNum() * a.getDenom();
        int newDen = a.getDenom() * b.getDenom();
        Fraction ans = new Fraction (newNum1 - newNum2,newDen);
        ans.reduce();
        return ans;
    }
    
    public String toString(){
        return num + "/" + den;
    }
    
    public double toDouble(){
        double ret = num / den;
        return ret;
    }
}

