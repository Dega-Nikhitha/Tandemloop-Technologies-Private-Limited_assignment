package assignment.java1;
import java.util.*;

public class Problem4 {
	  public static Map<Integer, Integer> countMultiples(List<Integer> inputList) {
	        Map<Integer, Integer> result = new HashMap<>();

	        for (int i = 1; i <= 9; i++) {
	            int count = 0;
	            for (int num : inputList) {
	                if (num % i == 0) {
	                    count++;
	                }
	            }
	            result.put(i, count);
	        }

	        return result;
	    }

	    public static void main(String[] args) {
	    	Scanner scanner = new Scanner(System.in);
        System.out.println("Enter numbers:");
        String input = scanner.nextLine();
        String[] parts = input.trim().split("\\s+");
        List<Integer> inputList = new ArrayList<>();
        for (String part : parts) {
            inputList.add(Integer.parseInt(part));
        }
        Map<Integer, Integer> output = countMultiples(inputList);

	        for (int key = 1; key <= 9; key++) {
	            System.out.println(key + ": " + output.get(key));
	        }
	    }
	}

