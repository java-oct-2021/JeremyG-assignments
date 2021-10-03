public class BasicJavaTest {
    public static void main(String[] args) {
        
        BasicJava basics = new BasicJava();

        basics.print255();

        basics.odds255();

        int testSigma255 = basics.sigma255();

        int[] x = {1,3,5,7,9,13};
        basics.iteratingArray(x);

        int[] y = {-3, -5, -7};
        basics.findMax(y);

        basics.arrayOdd();
        
    }
}
