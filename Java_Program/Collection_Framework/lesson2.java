/* ////////// Set Interface: //////////// */

// represent a group of individual object as a single entity, where Duplicates not allowed, Insertion order
// is not fixed.
/* Set Interface doesn't contain any method so we have to use only Collection interface methods. */

////////////////////////  HashSet Implementation  /////////////////////////////

/* As duplicates not allowed-- S.o.p(add(10));-> true,  S.o.p(add(10);-> false
   Object will be stored on the basis of hashcode */
// So, HashSet is best for SEARCH operation. Performance will be high.

// HashSet constructor:  // NO FORMULA for new_capacity.
/* 1. HashSet s = new HashSet()-- create empty object with initial capapity 16 and default fill ration 0.75
   2. HashSet s = new HashSet(int spec_capacity)-- create empty object with specified intial capacity.
   3. HashSet s = new HashSet(int spec_cap, float fillRatio)-- NOT RECOMMENDED TO USE
   4. HashSet s = new HashSet(Collection c)-- Interconversion b/w Collection Object. */

import java.util.HashSet;
import java.util.LinkedHashSet;
class lessonHS
{
	public static void main(String[] args){
		HashSet hs = new HashSet();
		System.out.println(hs.add(10));
		hs.add("Shivam");
		hs.add(null);		//// null insertion is possible.
		System.out.println(hs.add(10));
		System.out.println(hs);
	}
}

/////////////////////  LinkedHashSet Implementation  /////////////////////////////

/* child class of HashSet. Duplicates not allowed but INSERTION order is PRESERVED.(1.4v) */
// null insertion is possible.  LinkedHashSet lhs = new LinkedHashSet();
// -------------------------------------------------------------------------------------------------------

/* //////////////  SortedSet Interface  //////////////// */

// Insertion of an object is based on some sorted order. Asccending is by default.







