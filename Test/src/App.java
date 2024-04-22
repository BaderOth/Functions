public class App {
    
    public static void main(String[] args) throws Exception {

        System.out.println("Hello, World!");
    }

    public static int mult(int x, int y) {
        int result = 1;
        if (x < y) {
            for (int i = x; i <= y; i++) {
                result *= i;
            }
        } else if (x > y) {
            for (int i = y; i <= x; i++) {
                result *= i;
            }
        } else {
            return x;
        }
        return result;
    }

    public static int add(int x,int y){
        int sum=0;
        if(x<y){
            for(int i=x;i<=y;i++){
                sum+=i;
            }
            return sum;
        }
        else if(x>y){
            for(int i=y;i<=x;i++){
                sum+=i;
            }
            return sum;
        }
        return 0;
    } 
}
