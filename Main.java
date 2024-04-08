import java.util.Scanner;


public class Main {
    public static Scanner sc = new Scanner(System.in);

    public static int findMin(int n, int mn){ // complexity O(n)
        if(n == 0){
            return mn;
        }
        int temp = sc.nextInt();
        if(mn > temp){
            mn = temp;
        }
        return findMin(n-1, mn);
    }
    public static void task1(){
        int n = sc.nextInt();
        int mn = Integer.MAX_VALUE;
        System.out.print(findMin(n, mn));
    }


    public static double findAverage(int n, int m, double sum){ // complexity O(n)
        if(n == 0){
            return sum/m;
        }
        int temp = sc.nextInt();
        sum += temp;
        return findAverage(n-1, m, sum);
    }
    public static void task2(){
        int n = sc.nextInt();
        double sum = 0;
        int m = n;
        System.out.println(findAverage(n, m, sum));
    }


    public static boolean isPrime(int n, int m){ // complexity O(n)
        if(n == m){
            return true;
        }
        if(n % m == 0 || n < 2){
            return false;
        }
        return isPrime(n, m+1);
    }
    public static void task3(){
        int n = sc.nextInt();
        int m = 2;
        System.out.println(isPrime(n, m));
    }


    public static int findFactorial(int n){ //complexity O(n)
        if(n == 1){
            return 1;
        }
        return n * findFactorial(n-1);
    }
    public static void task4(){
        int n = sc.nextInt();
        System.out.println(findFactorial(n));
    }


    public static int findFibo(int n){ //complexity O(2^n)
        if (n == 0){
            return 0;
        }
        if (n == 1){
            return 1;
        }

        return findFibo(n - 2) + findFibo(n - 1);
    }
    public static void task5(){
        int n = sc.nextInt();
        int m = n;
        System.out.println(findFibo(n));
    }


    public static int findDegree(int n, int m, int sum){ //complexity O(m)
        if(m == 0){
            return sum;
        }

        sum *= n;

        return findDegree(n, m-1, sum);
    }
    public static void task6(){
        int n = sc.nextInt();
        int m = sc.nextInt();
        int sum = 1;
        System.out.println(findDegree(n, m, sum));
    }


    public static String swap(String str, int i, int j) {
        StringBuilder sb = new StringBuilder(str);
        sb.setCharAt(i, str.charAt(j));
        sb.setCharAt(j, str.charAt(i));
        return sb.toString();
    }
    private static void allPermutationsOfString(String s , int i) { //complexity O(n!)
        if(i == s.length()){
            System.out.println(s);
            return;
        }
        for(int j=i;j<s.length();j++){
            s = swap(s, i, j);
            allPermutationsOfString(s, i+1);
            s = swap(s, i, j);
        }
    }
    public static void permutation(String s, int n){ //complexity O(n!)
        if(n == s.length()){
            System.out.println(s);
            return;
        }

        for(int j = n; j < s.length(); j++){
            s = swap(s, n, j);
            allPermutationsOfString(s, n+1);
            s = swap(s, n, j);
        }
    }
    public static void task7(){
        String s = sc.next();
        permutation(s, 0);
    }


    public static boolean onlyDigits(String s, int n){
        if(n == s.length()){
            return true;
        }

        if(s.charAt(n) < '0' || s.charAt(n) > '9'){
            return false;
        }

        return onlyDigits(s, n+1);
    }
    public static void task8(){
        String s = sc.next();
        System.out.println(onlyDigits(s, 0) ? "YES" : "NO");
    }


    public static int binomialCof(int n, int k){ //complexity O(2^n)
        if(k == 0 || k == n){
            return 1;
        }
        return binomialCof(n-1, k-1) + binomialCof(n-1, k);
    }
    public static void task9(){
        int n = sc.nextInt();
        int k = sc.nextInt();
        System.out.println(binomialCof(n, k));
    }


    public static int GCD(int a, int b) {
        if (b == 0) {
            return a;
        }

        return GCD(b, a % b);
    }
    public static void task10(){
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(GCD(a, b));
    }




    public static void main(String[] args) {
        task1();
    }
}
