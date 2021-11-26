package day49_maps;
	import java.util.LinkedList;
	import java.util.PriorityQueue;
	import java.util.Queue;
	public class Queue01 {
	    public static void main(String[] args) {
	        Queue<String > q1=new LinkedList<>();//obj icin const
	        q1.add("basri");
	        q1.add("hakan");
	        q1.add("sedef");
	        q1.add("ahmet");
	        System.out.println(q1);//[basri, hakan, sedef, ahmet]--> java LinkedList geregi insettion order'e gore sia olsuturdu
	        Queue<String > q2=new PriorityQueue<>();//obj icin const
	        q2.add("rabia");
	        q2.add("oguz");
	        q2.add("yagmur");
	        q2.add("mehmet");
	        System.out.println(q2);//[mehmet, oguz, yagmur, rabia]--> java kendi PriorityQueue(oncelik sirasi) algoritmasini calistirdi
	        System.out.println(q1.peek());//basri --> ilk elemani silmeden return eder
	        System.out.println(q1);//[basri, hakan, sedef, ahmet]
	      System.out.println(q1.poll());//basri -> ilk elemani silerek return eder
	        System.out.println(q1);//[ hakan, sedef, ahmet]
	        q1.clear();//artik q1 bos
	        System.out.println(q1.poll());//bos bir obj den ilk eleman silip return etme komutu girdik-->Null
	     
	        System.out.println(q1.remove());//bos bir obj den ilk eleman silip return etme komutu girdik--> NoSuchElementException
	        // q1.remove();
	      // System.out.println(q1);//[sedef, ahmet]
	        
	        
	        System.out.println(q1.offer("merve"));//true
	        System.out.println(q1);//[hakan, sedef, ahmet, merve]--> offer() method'u add() methodu gibi eleman ekler
	                              // ancak eleman siniri konulduysa add() metodu IllegalStateException firlatir. 
	                             // anacak offer() method'unda bu durumolmadan kod calismaya devam edet

	    }
	}

