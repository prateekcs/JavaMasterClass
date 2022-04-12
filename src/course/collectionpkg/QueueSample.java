package course.collectionpkg;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueSample {
    public static void main(String[] args) {
        //Queue<String> queue = new LinkedList<>();
        Queue<String> queue = new LinkedList<>();//element will be sorted first
        queue.add("Apple");
        queue.add("Orange");
        queue.add("Grape");
        queue.add("four");
        //System.out.println(queue.peek());
       /* queue.remove();//not pass any argument then head or peek value will remove automatically
        //use poll method if there is no element it returns null while remove generate no value excception
        System.out.println(queue.peek());
        for (String fruit : queue){
            System.out.println(fruit);*/
        System.out.println(queue);
        }
    }

