package com.navr.learn.java5;

import java.util.ArrayList;
import java.util.List;

/**
 * List&lt;? super T&gt; is a bounded wildcard in Java generics that represents a list of some unknown type
 * that is a supertype of T. This is incredibly useful when you want to write data to the list while maintaining type safety.
 * <ul>
 *     <li>
 *         For List&lt;? super T&gt;, only instances of T or its subtypes can be added to the list.
 *         The wildcard ? super T restricts the types the list can accept to T and any superclass of T.
 *         For example, if T is Integer, the list could be of type List&lt;Integer&gt;, List&lt;Number&gt;, or List&lt;Object&gt;.
 *         It cannot be of type List&lt;String&gt; because String is not a superclass of Integer.
 *     </li>
 *     <li>
 *         When you perform a read operation on List&lt;? super T&gt;, the compiler only knows that the list can hold elements
 *         that are of type T or any of its superclasses (e.g., Number or Object for '? super Integer').
 *         Since the compiler cannot determine the exact type stored in the list, it defaults to the lowest common denominator type
 *         that is guaranteed to work: Object.
 *     </li>
 * </ul>
 */
public class ListOfUnknownBoundedSuperType {

    public static void main(String[] args) {
        listOfUnknownBoundedSuperType();
    }

    private static void listOfUnknownBoundedSuperType() {
        List<? super Integer> superIntList = new ArrayList<>();
        superIntList.add(100); // Ok. Integer element allowed.
        superIntList.add(200); // Ok. Integer element allowed.
        superIntList.add(null); // Ok. null allowed.
//        superIntList.add(new Object()); // Not Ok. Compilation error.

        // Read operation needs an explicit casting
        Object obj = superIntList.get(0); // Returns Object
        Integer num = (Integer) obj; // Explicit cast required
        System.out.printf("listOfUnknownBoundedSuperType: num=%d%n", num);

        List<Object> objectList = new ArrayList<>();
        superIntList = objectList; // Ok.
        List<Number> numberList = new ArrayList<>();
        superIntList = numberList; // Ok
        List<Double> doubleList = new ArrayList<>();
//        superIntList = doubleList; // Not Ok. Incompatible types. Found: 'java.util.List<java.lang.Double>', required: 'java.util.List<? super java.lang.Integer>'


        // you can add anything because all classes are subtypes of Object.
        List<? super Object> objList = new ArrayList<Object>();
        objList.add(new Object()); // Ok
        objList.add(123); // Ok
        objList.add("hello"); // Ok

        // Read operation returns Object. Needs an explicit casting.
        Object e0 = objList.get(0); // Ok. Returns Object type.
        Integer e1 = (Integer) objList.get(1); // Ok. Returns Object type. Can be cast to Integer.
        String e2 = (String) objList.get(2); // Ok. Returns Object type. Can be cast to String.
        System.out.printf("listOfUnknownBoundedSuperType: e0=%s, e1=%d, e2=%s%n", e0, e1, e2);

    }
}
