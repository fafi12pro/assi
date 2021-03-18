
public class payment {
private final int size = 5;
int salary[];
int front = 0;
int rear =  - 1;
int currentSize = 0 ;
    private int[] newsal;
public payment(){
salary = new int[this .size];
}
public void enqueue( int info) {
if (isQueueFull()) {
System.out.println( "Queue is full, increase size..." );
increaseCapacity();
}
rear++;
if (rear >= salary.length && currentSize != salary.length){
rear = 0 ;
}
salary[rear] = info;
currentSize++;
System.out.println( "adding: " + info);
}
public void dequeue() {
if (isQueueEmpty()) {
System.out.println( "" );
} else {
front++;
if(front > salary.length- 1){
System.out.println( "removed: " +salary[front- 1 ]);
front = 0 ;
} else {
System.out.println( "removed: " +salary[front- 1 ]);
}
currentSize--;
}
}
public boolean isQueueFull(){
boolean status = false ;
if (currentSize == salary.length){
status = true ;
}
return status;
}
public boolean isQueueEmpty(){
boolean status = false ;
if (currentSize == 0 ){
status = true ;
}
return status;
}
private void increaseCapacity(){
int newCapacity = this .salary.length* 2;
int [] newsal = new int [newCapacity];
int tmpFront = front;
int index = - 1;
while (true ){
newsal[--index] = this.salary[tmpFront];
tmpFront--;
if(tmpFront == this .salary.length){
tmpFront = 0 ;
}
if(currentSize == index+ 1){
break ;
}
}
this .salary = newsal;
System.out.println( "New salary capacity: " +this .salary.length);
this .front = 0;
this .rear = index;
}
public static void main(String a[]){
payment queue = new payment();
queue.enqueue( 10000);
queue.dequeue();
queue.enqueue( 20000);
queue.enqueue( 30000);
queue.enqueue( 60000);
queue.dequeue();
queue.dequeue();
queue.enqueue( 25000);
queue.enqueue( 12000);
queue.dequeue();
queue.dequeue();
queue.enqueue( 100000 );
queue.enqueue( 30000);
queue.dequeue();

}

    }

