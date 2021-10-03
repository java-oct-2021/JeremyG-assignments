import java.util.ArrayList;
public class BasicJava {

    //Print 1-255
    public void print255() {
        for(int i = 1; i < 256; i++) {
            System.out.println(i);
        }
    }

    //Print odd numbers between 1-255
    public void odds255() {
        for(int i = 1; i < 256; i++) {
            if(i % 2 != 0) {
                System.out.println(i);
            }
        }
    }

    //Sigma of 255
    public int sigma255() {
        int sum = 0;
        for(int i = 1; i < 256; i++) {
            sum += i;
        }
        return sum;
    }

    //Iterating through an array
    public void iteratingArray(int[] x) {
        for(int i = 0; i < x.length; i++) {
            System.out.println(x[i]); 
        }
    }

    //Find Max
    public void findMax(int[] x) {
        int max = x[0];
        for(int i = 0; i < x.length; i++) {
            if(x[i] > max) {
                max = x[i];
            }
        }
        System.out.println(max);
    }

    //Array with odd numbers
    public void arrayOdd() {
        ArrayList<Integer> y = new ArrayList<Integer>();
        for(int i = 1; i < 256; i++) {
            if(i % 2 != 0) {
                y.add(i);
            }
        }
    }
}



