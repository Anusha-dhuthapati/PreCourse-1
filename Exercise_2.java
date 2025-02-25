    // Time Complexity : O(1)
    // Space Complexity : n is the number of nodes in linked list
    // Any problem you faced while coding this : The code gave an error on the class name, so I
    // remove the public parameter 
  



    class StackAsLinkedList { 
  
        StackNode root; 
      
        static class StackNode { 
            int data; 
            StackNode next; 
           
            StackNode(int data) 
            { 
                //Constructor here 
                this.data = data;
                this.next = null;
            } 
        } 
        
        
        public boolean isEmpty() 
        { 
            //Write your code here for the condition if stack is empty. 
            if (root.next == null){
                return true;
            }
            else
                return false;
        } 
      
        public void push(int data) 
        { 
            //Write code to push data to the stack. 
            StackNode st = new StackNode(data);
            st.next = root;
            root = st;
        } 
      
        public int pop() 
        { 	
        //If Stack Empty Return 0 and print "Stack Underflow"
          if(isEmpty()){
              System.out.println("Stack Underflow");
              return 0;
          }
            //Write code to pop the topmost element of stack.
            int val = root.data;
            root = root.next;
          
        //Also return the popped element 
            return val;
        } 
      
        public int peek() 
        { 
            //Write code to just return the topmost element without removing it.
            return root.data;
        } 
      
        //Driver code
        public static void main(String[] args) 
        { 
      
            StackAsLinkedList sll = new StackAsLinkedList(); 
      
            sll.push(10); 
            sll.push(20); 
            sll.push(30); 
      
            System.out.println(sll.pop() + " popped from stack"); 
      
            System.out.println("Top element is " + sll.peek()); 
        } 
    } 
    