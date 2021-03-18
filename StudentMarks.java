public class SearchList {  
  
    
  
    class Marks{  
        int data;  
        Marks previous;  
        Marks next;  
  
        public Marks(int data) {  
            this.data = data;  
        }  
    }  
  
   
    Marks head, tail = null;  
  
   
    public void addMarks(int data) {  
         
        Marks newMarks = new Marks(data);  
  
         
        if(head == null) {  
             
            head = tail = newMarks;  
            
            head.previous = null;  
             
            tail.next = null;  
        }  
        else {  
             
            tail.next = newMarks;  
              
            newMarks.previous = tail;  
              
            tail = newMarks;  
            
            tail.next = null;  
        }  
    }  
  
     
    public void searchMarks(int value) {  
        int i = 1;  
        boolean mark = false;  
         
        Marks current = head;  
  
         
        if(head == null) {  
            System.out.println("List is empty");  
            return;  
        }  
        while(current != null) {  
        
            if(current.data == value) {  
                mark = true;  
                break;  
            }  
            current = current.next;  
            i++;  
        }  
        if(mark)  
             System.out.println("mark is present in the mark list: " + i);  
        else  
             System.out.println("Mark is not present in the  mark list");  
    }  
  
    public static void main(String[] args) {  
  
        SearchList dList = new SearchList();  
        
        dList.addMarks(50);  
        dList.addMarks(95);  
        dList.addMarks(65);  
        dList.addMarks(70);  
        dList.addMarks(80);  
        dList.addMarks(100);
         
        dList.searchMarks(40);  
        dList.searchMarks(95); 
        dList.searchMarks(50);
        dList.searchMarks(45);
    }  
}  