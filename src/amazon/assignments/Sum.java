package amazon.assignments;

public class Sum {
    int a;
    int b;
    public int sum(int a, int b){
        return a + b;
    }

    public static void main(String[] args){
        Sum s = new Sum();
        int result = s.sum(5,10);
        System.out.println(" Sum " + s);

        }
}
