class Happynew{
    public boolean isHappy(int n) {
        int count=0;
        while(n!=1){
            int dig=0;
            while(n!=0){
                dig = dig + (int)Math.pow(n%10,2);
                n/=10;
            }
            n = dig;
            count++;
             if(count>7){
            return false;
            }
        }
        return true;
    }
}