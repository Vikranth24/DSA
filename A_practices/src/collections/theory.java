package collections;

public class theory {
	
	/*
	 * 
	 https://www.javatpoint.com/collections-in-java
	 
	 
	 
	 
	                        Collections
	                        
* The Collection in Java is a framework that provides an architecture to store and manipulate the
  group of objects.
	 
* Java Collections can achieve all the operations that you perform on a data such as searching, sorting, 
  insertion, manipulation, and deletion.
  	
* Java Collection means a single unit of objects. Java Collection framework provides many interfaces
  (Set, List, Queue, Deque) and classes (ArrayList, Vector, LinkedList, PriorityQueue, HashSet,
   LinkedHashSet, TreeSet).
   
 
 * collection framework is stored in the java.lang package.
 * The mehtods used to perform add, remove and removeall methods are stored in java.util package.
 
 
        methode 
        
   1) add            -  It is used to insert an element in this collection.
   2) addAll         -  It is used to insert the specified collection elements in the invoking collection.
   3) remove         -  It is used to delete an element from the collection.
   4) removeAll      -  It is used to delete all the elements of collection present in another collection.
   5) removeIf       -  It is used to delete all the elements of the collection that satisfy the specified predicate.
   6) retainAll      -  It is used to delete all the elements of invoking collection except the specified collection.
   7) size           -  It returns the total number of elements in the collection.
   8) clear          -  It is used to make the object empty.
   9) contains       -  used to search an element
  10) contains all   - 	It is used to search the specified collection in the collection.
  11) iterator       -  as the name says used to iterate using hasnext and next method. ( we can also use for loop for iteration)
  12) toArray        -  It converts collection into array.
  13) isEmpty        -  It checks if collection is empty.
  14) equals(Object element) - it matches two collections.
  15)  hashCode()    -  It returns the hash code number (integer) of the collection.
  
  
  
  * collection can only store non premative datatype.
  * converting array list to array
      
          Integer[] intArray = intList.toArray(new Integer[0]);
          
  * convertibng array to arraylist
   
          List<Integer> intList = Arrays.asList(intArray);  
          
          
          
          
          
          
 1) Iterable interface 
* has 3 methods hasnext(), next, and remove(). 
* 
               Iterator itr=list.iterator();  
               while(itr.hasNext()){  
               System.out.println(itr.next());  
} 

 
 
                         
 2) Collection interface
 * Has metods like add, addAll etc...
          
 
          
          
          
3) list interface 
 * it inherits the all collection interface
                 
                 
                 List <data-type> list1= new ArrayList();  
                 List <data-type> list2 = new LinkedList();  
                 List <data-type> list3 = new Vector();  
                 List <data-type> list4 = new Stack();  
                        
  
                        
                        
                        
4)  Arraylist class  
 * It provides fast random access and is good for scenarios where elements are frequently accessed or searched.
 * Java ArrayList class uses a dynamic array for storing the elements. It is like an array, but there is no size limit
 * can have duplicate element.
 * it is non synchronized.
 * it works on index basis.
 * We can not create an array list of the primitive types, such as int, float, char, etc. It is required 
   to use the required wrapper class in such cases. For example: 
 * Java ArrayList gets initialized by the size. The size is dynamic in the array list, which varies according 
   to the elements getting added or removed from the list.  
   
           
           
                      ArrayList<String> str=new ArrayList<String>();
                      
                      
                      
5)  LinkedList class
*  It is suitable when there is a frequent need for adding or removing elements.
*  can contain duplicate
*  Java LinkedList class is non synchronized
*  
*  
*    ex if one element is there in linkedlist.  
*           node 1 
           vikranth  reference
           node2 
           reference  null

             
                      LinkedList<String str=new LinkedList<String>();
                      
                                 
                                 
                                 
                                 
6) vector class
* vector uses a dynamic array to store the data elements. It is similar to ArrayList. 
* It is synchronized and contains many methods that are not the part of Collection framework.
                         
                          Vector<String> v=new Vector<String>();  
           
  
 7) Stack class
*  The stack is the subclass of Vector
*  It implements the last-in-first-out data structure,
*  The stack contains all of the methods of Vector class and also provides its methods like 
   boolean push(), boolean peek(), boolean push(object o), which defines its properties.
   
   methods 
    push   - similar to add
    pust(object)- similar to add.  
    pop     - removes the latest added element and returns the removed element as the result.
    peel    - returns the element which is rescently added.
    empty()  - returns true if the stack is empty
    search   - used to search specific object in the stack.
    
  
  
  
8) Queue  interface
* Queue interface maintains the first-in-first-out order.
* There are various classes like PriorityQueue, Deque, and ArrayDeque which implements the Queue interface.
                         
                         
                         Queue<String> q1 = new PriorityQueue();  
                         Queue<String> q2 = new ArrayDeque(); 
                   
    Methods                      
                         
 poll - It is used to retrieve and remove the head of the queue ( first element added) (If the queue is empty, it returns null.)
 offer - just like add.
 remove - remove the first element added  to the queue. (Throws NoSuchElementException if the queue is empty.)
 element - shows the first element added (NoSuchElementException if the queue is empty.)
 peek     - shows the first added element (Returns null if the queue is empty.)
 
 
 9) PriorityQueue
 * The PriorityQueue class implements the Queue interface. It holds the elements or objects which are to be processed by their priorities( FIFO).
 * PriorityQueue doesn't allow null values to be stored in the queue.                        
                         
      
                        
                        
                        
10) Deque
* Deque interface extends the Queue interface. In Deque, we can remove and add the elements from both the side.
                         
                         Deque d = new ArrayDeque();  
                         
                         
   
   
11)  ArrayDeque
* ArrayDeque class implements the Deque interface.
*  It facilitates us to use the Deque. Unlike queue, we can add or delete the elements from both the ends.
*  ArrayDeque is faster than ArrayList and Stack and has no capacity restrictions.
  
  
  
  Methods
  
 addFirst - 
 addLast
 removeFirst
 removeLast
 getFirst
 getLast
 size
 isEmpty 
 clear.
 
 
 
 
 12) set
 *  It represents the unordered set of elements which doesn't allow us to store the duplicate items
 *   We can store at most one null value in Set. Set is implemented by HashSet, LinkedHashSet, and TreeSet.
 *  HashSet does not guarantee any specific order of elements. The order can change over time, and it doesn't follow the
     insertion order.                 
                    Set<data-type> s1 = new HashSet<data-type>();  
                    Set<data-type> s2 = new LinkedHashSet<data-type>();  
                    Set<data-type> s3 = new TreeSet<data-type>();  
 
 
13) hashset 
* It represents the unordered set of elements which doesn't allow us to store the duplicate items
* LinkedHashSet maintains the order of elements based on the order in which they were inserted into the set. Iterating over a LinkedHashSet returns elements in the order
 0 they were added.
 
 14) LinkedHashSet
 * it maintains the order
 * it is same as hashset.
  
  
  
  15) treeSet 
 *The elements in TreeSet stored in ascending order.
  
  
  
  
  
  
  
                                            Map
                                            
1) Map
*A map contains values on the basis of key, i.e. key and value pair.
* Each key and value pair is known as an entry. A Map contains unique keys.
  
  
  Methods
 put                      - use to add the key value pair
 putAll                   -	It is used to insert the specified map in the map.
 putIfAbsent              - adds the key value only if the key value is not exist.
 remove  (key)            - used to remove specified key.
 remove (key , value)     - used to remove key and value.
 clear                    - used to empty the object
 containsValue( value)    - shows true if the value exists.
 containsKey( key)        - shows true if the key exists.
 equals(Object o)         - compares one map with other.
 get(Object key)          - used to get value present for the key.
 isEmpty()                - return true if the map is empty.
 replace(K key, V value)  - changes the value for the key given in replace method.
 replace(K key, V oldValue, V newValue)-
 size()                   - 
 
 
 
 
 2) Hashmap
* Java HashMap contains values based on the key.
* Java HashMap contains only unique keys.
* Java HashMap may have one null key and multiple null values.
* Java HashMap is non synchronized.
* Java HashMap maintains no order.
* The initial default capacity of Java HashMap class is 16 with a load factor of 0.75.
 
  
  
  3) linkedhash map
* Java LinkedHashMap contains values based on the key.
* Java LinkedHashMap contains unique elements.
* Java LinkedHashMap may have one null key and multiple null values.
* Java LinkedHashMap is non synchronized.
* Java LinkedHashMap maintains insertion order.
* The initial default capacity of Java HashMap class is 16 with a load factor of 0.75.
  
 
 
 
 4)Treemap
* java TreeMap contains values based on the key. It implements the NavigableMap interface and extends AbstractMap class.
* Java TreeMap contains only unique elements.
* Java TreeMap cannot have a null key but can have multiple null values.
* Java TreeMap is non synchronized.
* Java TreeMap maintains ascending order.
 
 
 
 
 
 
 
 
 
 
 
 */
	
	
	public static void main(String[] args)
	{
		
	}

}
