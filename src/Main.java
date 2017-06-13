import com.tingel.operations.Addition;
import com.tingel.operations.Operation;
import com.tingel.operations.OperationResponder;
import com.tingel.operations.Subtraction;

public class Main {

    public static void main(String[] args) {
	    // write your code here
	    System.out.println("Hello World!");
	    
	    Operation add1 = new Addition();
	    System.out.println("add1; Expected TRUE: " + add1.process(new int[]{1,2}, 3));
	    
	    Operation add2 = new Addition();
	    System.out.println("add2; Expected FALSE: " + add2.process(new int[]{1,3}, 3));
	    
	    Operation sub1 = new Subtraction();
	    System.out.println("sub1; Expected TRUE: " + sub1.process(new int[]{7,5,1}, 1));
	    
	    Operation sub2 = new Subtraction();
	    System.out.println("sub2; Expected FALSE: " + sub2.process(new int[]{7,5,2},1));
	    
	    System.out.println(OperationResponder.handleResponse("+"));
	    System.out.println(OperationResponder.handleResponse("-"));
	    
    }
}
