public class helloworld{
    public static void main(String[] args){
        System.out.println("hello world!");
        
        // concatenating strings with overloaded + operator
        int x = 10, y = 20;
        System.out.println("x: " + x + "\ny: " + y);

        // for loop has the same syntax as C++
        int sum = 0;
        for(int i = 1; i <= 10; ++i) {
            sum += i;
        }
        System.out.println("sum is " + sum);
    }
}