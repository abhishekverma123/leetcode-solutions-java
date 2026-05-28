package StackImplementationUsing_Array;

public class StackMainClass {

	public static void main(String[] args) throws StackFullException, StackEmptyException{
		// TODO Auto-generated method stub
		
		StackUsingArray stack = new StackUsingArray(3);
		            
             //System.out.println(stack.size()); // -1 + 1;
             
             stack.push(50);  // -1 - 0
             stack.push(40);   // 0 - 1
            // System.out.println(stack.size()); // 1 +1  = 2
             
             stack.push(30);
             stack.push(20);
             stack.push(10);
           //  stack.push(45);
           //  System.out.println(stack.size()); 
            // stack.push(2);
             System.out.println(stack.size());  
             System.out.println(stack.top());  // 10
             // System.out.println(stack.pop()); // delete 
              //System.out.println(stack.top()); // 20 
             // stack.pop();
              //stack.pop();
            // System.out.println(stack.isEmpty());
//             for(int i = 0; i< 5;i++) {
//            	     System.out.println(stack.pop());
//             }
//             System.out.println(stack.isEmpty());
                 
             
             

	}

}
