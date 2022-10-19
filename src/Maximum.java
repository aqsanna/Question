public class Maximum {
    public int maximum(int a, int b, int c, int d) {
        int max =a;

        if(b>max){
            max=b;
        }
        if(c>max){
            max=c;
        }
        if(d>max) {
            max =d;
        }
         return max;

    }

    public static void main(String[] args) {
        Maximum max = new Maximum();
        System.out.println(max.maximum(4, 5, 8, 3));


    }

}
