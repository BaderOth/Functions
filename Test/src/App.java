public class App {
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
    public static void main(String[] args) throws Exception {

        System.out.println("Hello, World!");
    }
}
