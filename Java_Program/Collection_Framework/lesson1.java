package in.lesson.CollFrameWork; // Storing our class inside it.// package == folder
// compile: Javac -d . lesson1.java    run: java in.lesson.CollFrameWork.lesson1
/* Difference Array and collection Framework: 

	1. Array-- fixed in size, not recommended w.r.t memory, recommended w.r.t performance, homogeneous
			   data type, not that much readymade support available.
	2. Collection-- Growable in nature, recommmended w.r.t memory, not recommended w.r.t performance,
					heterogeneous data type allowed, many readymade supports are available.

  Collection framework:

   i. Collection(I)- 1.2 version-- consider as root of collection framework, which is not totally true.
	 1. List(I)-- ArrayList(retrive), LinkedList(insertion, deletion from middle), (Vector -- Stack > 1.0v)
	 2. Set(I)-- (HashSet-- LinkedHashSet), (SortedSet(I)-- NavigableSet(I)(1.6v)-- TreeSet)
	 3. (Queue(I)-- PriorityQueue, BlockingQueue)-1.5 version

   ii.Map(I)
   	 1. (HashMap-- LinkedHashMap), IndetityHashMap, (SortedMap(I)-- NavigableMap(I)-- TreeMap),WeakHashMap,
																								 Hashtable
   * SORTING: i. Comparable(I), ii. Comparator(I)
   * CURSORS: i. Enumeration-- Vector(element()), ii. Iterator-- Collection(iterator())
              iii. ListIterator-- List(listIterator())
*//////////////////////////////////////////////////////////////////////////////////////////////////////////

// Every Collection class implements serializable and cloneable interface.
/* Collection Interface have common methods: 
	add(.), addAll(.), remove(.), removeall(.), retainAll(.), contains(.), containsAll(.), isEmpty()--all
	method return type is boolean.  int size(), void clear(), Object[] toArray(), Iterator iterator().
*/
/*     ///////////////////////////////////////////////////////////////////////////////////      */
// List Interface-- group of individual object as single object. Duplicates allowed, Insertion order fixed.
// INDEX play very important role in list.
/* List Method-- void add(int indx, Object o), boolean addAll(int indx, coll o) Object get(int indx),
   Object set(int ind, Obj newObj),int indexdOf(Obj o), int lastIndexOf(Obj o), ListIterator listIterator()
*/
  ///////////////////////////// ArrayList Implementation: /////////////////////////////
	/*Underline data structure is growable array */
// Initial capacity: 10   // N_C = (C_C * (3/2))+1  // 3 constructor
/*  1. AL al = new AL() : create empty AL with initial capacity 10. Once capacity full: new AL will create.
	2. AL al = new AL(int initialization) : create any empty AL with specified initial capacity.
	3. AL al = new AL(Collection C) : It is usful for interconversion b/w collection object. */

	//// There is a method present in java.util.Arrays --> Arrays.toList()=> It converts array into list.

//import java.util.*; // Implicit import of package.-- least priority
import java.util.ArrayList; // Explicit import of class from package.-- Highest priority
import java.util.Scanner;
import java.util.List; // Explicit import is recommended in Industry level.
import java.util.LinkedList;
import java.util.Vector;
import java.util.Stack;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;

class lessonAL // default class cannot be accessed from from outside this Package.(package level modifier)
{
	int n = 5; // Instance variable(Object level variable or attribut)-- Heap Area
	static int x= 10; // Static variable(class level variable or field)-- Method Area
	
	public static void main(String[] args){
		System.out.println("ARRAY LIST::::::");
		ArrayList al =new ArrayList();// non-generic: warning will be shown.(Not type safe)
		ArrayList all = new ArrayList(); 
		/* ArrayList<Integer> al = new ArrayList<>(); // Generic--1.5version*/
		List<Integer> l= new ArrayList<Integer>(); // polymorphism allowed for Base not for parameter.
		/*ArrayList<Object> all= new ArrayList<String>(); */ //NOT ALLOWED
		al.add(10); // 0
		al.add("Shivam");// 1
		al.add('A'); //2
		al.add('Z');
		al.add(19.4); 
		al.add(null); // null insertion is possible.
		System.out.println("al: " + al);
		al.add(2,'Z');/* Shifting of all Object occur after 2nd index.// that's why arraylist not used for 
					 //	insertion and deletion of object. It consumes so much time.*/
		all.add("Raj");
		all.add(73);
		System.out.println("al: " + al);
		al.set(0,3); // It will remove the object 10 from 0th index and place 3 in place of it.
		System.out.println(al);
		System.out.println("At 3rd index: " + al.get(3));// Concatantion(Whole will convert into string)
		al.remove(2);
		System.out.println("al: " + al);
		System.out.println("all: " + all);
		System.out.println("addAll: " + al.addAll(all)); // inserting whole collection at last. // true
		System.out.println("al: " + al);
		System.out.println("addAll: " + al.addAll(0,all));// inserting whole collection at the begninning.
		System.out.println("al: " + al);
		System.out.println("indexOf(Shivam): " + al.indexOf("Shivam"));
		System.out.println("lastIndexOf(Z): " + al.lastIndexOf('Z'));
	
	}
}

///////////////////// LinkedList Implementation ///////////////////////////

  /* Underline data structure is double LInkedList.*/ //Best for insertion and deletion. Worst for retrive.
/*linked list methods: void addFirst(.), void addLast(.), Object getFirst(), Object getLast(),
                     Object removeFirst(), Object removeLast().*/
// Node having two part: i. info  ii. adress of next node.
/*Methods are similar like AL: addFirst(20) -- add(0, 20)*/
//  LinkedList ll = new LinkedList();

class lessonLL
{
	static{
	System.out.println("LINKED LIST::::::");
	}
	public static void main(String... args){ // var-arg arrgument in place of String array.
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the value just for fun: ");
		int x = s.nextInt();   // Taking dynammic input from user.....
		String s = s.nextLine();
		LinkedList ll = new LinkedList();
		ll.add(3);
		ll.add("hahaha");
		ll.add(null); // null insertion is possible
		System.out.println("LL: " + ll);
		ll.addFirst('Y');
		ll.addLast(94.422);
		System.out.println("LL: " + ll);
		System.out.println("getFirst: " + ll.getFirst());
		System.out.println("removeLast: " + ll.removeLast());
		System.out.println("LL: " + ll);
	}
}

/////////////////////////////  Vector Implementation /////////////////////////

/* Difference b/w Vector(1.0 version) and ArrayList (1.2 version): 
	Vector: 1. Every method is Synchronized. 2. Thread Safe. 3. Threds requires to wait for operation
	AL: 1. Every method is non-Synchronized. 2. Not thread Safe. 3. Threads not requires to wait.*/
//  performance wise AL is better. SAFETY wise Vector is better.
/* OtherWise Both are same*/

//vector class methods: 
/*  addElement(.), removeElement(.), removeElementAt(int Inx), removeAllElements(), Object get(int inx),
	Object elementAt(indx), firstElement(), lastElement(), int size(), int capacity()
	// Enumeration element() --> used to make object of Enumeration. */

// Constructor of Vector class: // new_capacity = old_capacity*2 --> new object will be created everytime.
/* 1. Vector v = new Vector(): create an empty vector object with default initial capacity 10.
   2. Vector v = new Vector(int specified_capacity): vector object with our own specified capacity.
   3. Vector v = new Vector(int spec_capa, itn increment_capacity): when capacity will reach new object
   												  will be created with: (spec_capa + increment_capacity).
   4. Vector v = new Vector(Collection c): used for interconversion of collection. */

class lessonVEC
{
	public static void main(String[] args){
		System.out.println("VECTOR::::::::::::");
		Vector v = new Vector();
		v.add("lalala");
		v.add(7);
		v.addElement("ohooo");
		v.addElement(null);
		v.addElement(07);
		v.add(84.353);
		System.out.println("v: "+ v);
		v.removeElementAt(2);
		v.add("nooooo");
		v.removeElement(7);
		System.out.println("Capacity: " + v.capacity() + "  Size: " + v.size());
		System.out.println("firstElement: " + v.firstElement());
	}
}
///////////////// Stack Implementation /////////////////////

/* Stack follows the principle of LIFO. (ex. plates in wedding)*/
	/*METHODS: Object push(.), Object pop(.), Object peek(.), boolean empty(), int search()*/
//search("a") -- kitni barr pop karne se "a" gayab hoga; // peek() -- return top element of stack.

class lessonSTK
{
	public static void main(String... args){
		System.out.println("STACK::::::::::::");
		Stack st = new Stack();
		st.push("S");
		st.push("H");
		st.push(73);
		st.add('I');
		st.push(null);
		st.push("NICE");
		System.out.println(st);
		System.out.println("pop: " + st.pop());
		System.out.println(st);
		System.out.println("peek: " + st.peek());
		System.out.println("search: " + st.search('U')); // -1
		System.out.println("search: " + st.search('I')); // 1 (At the top of the Stack).
	}
}

//////// Three cursors of Java Collection: ///////////////////////////////////////////////////////

/* If we want to get object one by one from the collection then we can use cursors. */

//////////////// Enumeration Implementation ////////////////////////////

/* 1. Enumeration--> public boolean hasMoreElements(), public Object nextElement()*/
// It is only applicable for Vector and Stack. By using Enumeration we can only perform read operation.
/* Enumeration is a legacy cursor as it is present since 1.0 version */

class lessonENM
{
	public static void main(String[] args){
		Vector v = new Vector();
		for(int i=0;i<= 10;i++)
			v.addElement(i);
		System.out.println(v);
		Enumeration en = v.elements(); // with vector class elements(), Enumeration object will created.
		while(en.hasMoreElements()){
			Object o = en.nextElement();
			Integer i = (Integer)o;  ////// Integer i = (Integer)en.nextElement();
			if(i%2==0)
				System.out.println(i);
		}
		System.out.println(v);
	}
}

/////////////// Iterator Implementation ///////////////////////

/* Iterator -- apply for any collection object(UNIVERSAL cursor)-- read and rempve operation can be done.*/
// Methods: public boolean hasNext(), public Object next(), public void remove()
/*LIMITATION: by using Enumeration and Iterator we can always move in forward dirn.(single dirn. cursor)
  only read and remove operation can be done. we cannot perform replacement & addition of new object. */

class lessonITR
{
	public static void main(String... args){
		System.out.println("Iterator:::::::::::");
		ArrayList l = new ArrayList();
		for(int i=0; i<=10;i++)
			l.add(i);
		System.out.println(l);
		Iterator it = l.iterator(); //// creation of Iterator object.
		while(it.hasNext()){
			Integer i = (Integer)it.next();
			if(i%2==0)
				System.out.print(i + " ");
			else 
				it.remove();
		}
		System.out.println();
		System.out.println(l);
	}
}

////////////// ListIterator Implementation /////////////////////

/* 3. ListIterator -- we can move in forward, backward both. we can perform read, remove, addition of new
					  object and replacement.*/
//Methods: boolean hasNext(), Object next(), int nextIndex(), boolean hasPrevious(), Object previous(),
//		   int previousIndex(), void remove(), void set(Object newObj), void add(Object newObj).
/* It is only applicable for list Object only*/

class lessonLITR
{
	public static void main(String[] args){
		ArrayList<Integer> al = new ArrayList<>();
		for(int i=0;i<=10;i++)
			al.add(i);
		System.out.println(al);
		ListIterator li = al.listIterator();
		while(li.hasNext()){
			Integer in = (Integer)li.next(); /* Even if you make generic object, you have to typecast it.
			// If we not typecast then-- incompatable types: Object cannot be converted to Integer.*/
	// But rather than using iterator we can directly access by for(int x : al)=> no need to typecast.
			if(in==2)
				li.remove();
			else if(in==4)
				li.add(20);
			else if(in == 6)
				li.set(90);
			else 
				System.out.println("nextIndex: " + li.nextIndex());
		}
		System.out.println("ListIterator on al: " + al);
	}
}

