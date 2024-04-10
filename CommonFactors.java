public class CommonFactors {
    public int commonFactors(int a, int b) {
        int len = Math.min(a,b);
        int out = 0;
        for(int i=1; i<=len; i++){
            if(a%i==0 && b%i==0){
                out++;
            }

        }
        return out;
    }
}
