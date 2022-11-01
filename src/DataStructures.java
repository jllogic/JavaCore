import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;


public class DataStructures {
	
	
	public static int findIndex(int arr[], int t)
    {
  
        int index = Arrays.binarySearch(arr, t);
        return (index < 0) ? -1 : index;
    }
	
		
			
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x = 10;
		
		
		
		
		String y = "Hooray";
		
		List<String> a = new ArrayList<>();
		
		a.add("Hello World");
		a.add(y);
		a.add("Saved");
		a.add(y);
		a.set(2, "wHATS UP");
		a.set(0, "HELLO WORLD");
		//delete operation hard in array
		int b[]= new int[5];

		int f[] = new int[3];
		
		f[0] = 7;
		f[1] = 9;
		f[2] = 10;
		int []numbers = {5,3,4,5};
		
		String[] colors = {"purple", "blue", "green"};
		
		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}
		
		//reverse
		for (int i = numbers.length - 1; i >= 0; i--) {
			System.out.println(numbers[i]);
			
		}
		
		//getting index of array is more work
		//enhanced loop
		for(int number : numbers ){
			System.out.println("This is iteration " + number);
		}
		
		
		
		//Not working
		//Arrays.stream(colors).forEach(System.out::println);
		//Arrays have alot of utility methods
		System.out.println("If it contains y say it " + a.contains(y));
		System.out.println(a.lastIndexOf(y));
		System.out.println(Arrays.toString(numbers));
		System.out.println(findIndex(numbers, 7));
		System.out.println(Arrays.binarySearch(numbers, 7));
		
		// 2D Array
		
		char[][] board = new char[3][3];
		
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				board[i][j] = '-';
			}
		}
		
		board[0][0] = '0';
		board[1][0] = '0';
		board[2][0] = '0';
		System.out.println(Arrays.deepToString(board));
		
		//Another way to create 2 dimensional array
		char[][] boardTwo = new char[][]{
				new char[]{'0','-','-'},
				new char[]{'0','-','-'},
				new char[]{'0','-','-'}
		};
		
		System.out.println(Arrays.deepToString(boardTwo));
		
		/*
		 * LIST ordered,Allow Duplicates, No fixed Size, fast data retrieval,starts with 10
		 */
	
		List<String> myList = new ArrayList<>();
		myList.add("blue");
		myList.add("blue");
		
		System.out.println(myList);
		
		for (String list : myList){
			System.out.println(list);
		}
		
		//Stack
		/*
		 * LIFO extends Vector five operations that allow vector to be stack
		 * push,pop and peek
		 * Vector synchronized if not needed to be thread safe use ArrayList
		 */
		// 3,2,1
			Stack<Integer> stack = new Stack<>();
			stack.push(1);
			stack.push(2);
			stack.push(3);
			
			System.out.println(stack.peek());
			System.out.println(stack.size());
			System.out.println(stack.pop());
			System.out.println(stack.size());
			System.out.println(stack.empty());
			

			/*
			 * Queues
			 * FIFO
			 */
			// 9,8,7,6
			Queue<Integer> ticket = new LinkedList<>();
			ticket.add(9);
			ticket.add(8);
			ticket.add(7);
			ticket.add(6);
			System.out.println(ticket.size());
			System.out.println(ticket.peek());
			System.out.println(ticket.poll());
			System.out.println(ticket.size());
			System.out.println(ticket.peek());
			
			LinkedList<Integer> linkedList = new LinkedList<>();
			linkedList.add(9);
			linkedList.add(8);
			linkedList.add(7);
			linkedList.add(6);
			
			System.out.println(linkedList);
			
			for(Integer list : linkedList){
				System.out.println("Hi there is the list " + list);
			}
			
			ListIterator<Integer> numberList = linkedList.listIterator();
			
			while(numberList.hasNext()){
				System.out.println(numberList.next());
			}
			
			while(numberList.hasPrevious()){
				System.out.println(numberList.previous());
			}
			
			/*
			 * Set
			 * No Duplicates, 1 null element, TreeSet has order, HashSet no order
			 * 
			 */
			
			// might have to override toString and equals methods when passing object
			Set<Integer> balls = new HashSet<>();
			
			balls.add(9);
			balls.add(8);
			balls.add(7);
			//not added no duplicates
			balls.add(7);
			
			
			System.out.println(balls);

			System.out.println(balls.size());
			
			/*
			 * Map
			 * Key Value pair. Only 1 value for each key
			 * key should be unique or you will override
			 */
			
			Map<Integer,String> map = new HashMap<>();
			map.put(1, "Hello World");
			map.put(2, "Hi");
			map.put(3, "Hello");
			map.put(4, "Work");
			
			System.out.println(map.get(1));
			System.out.println(map.keySet());
			System.out.println(map.getOrDefault(5, "You have reached a telephone number no longer availible"));
			
			
}

}
