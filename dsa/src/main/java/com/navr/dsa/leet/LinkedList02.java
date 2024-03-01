package com.navr.dsa.leet;

import java.util.Stack;

public class LinkedList02 {
    public static void main(String[] args) {
        ListNode ln1 = new ListNode(1);
        ListNode ln2 = new ListNode(3);
        ListNode ln3 = new ListNode(5);
        ListNode ln4 = new ListNode(7);

        ListNode ln5 = new ListNode(2);
        ListNode ln6 = new ListNode(4);
        ListNode ln7 = new ListNode(6);

        // List #1
        ln1.next = ln2;
        ln2.next = ln3;
        ln3.next = ln4;

        // List #2
        ln5.next = ln6;
        ln6.next = ln7;


//        reverseList(ln1);

//        ListNode mergedList = mergeList(ln1, ln5);
//        printList(mergedList);


        ListNode revList = reverseList_v3(ln1);
        printList(revList);
    }

    private static void reverseList(ListNode head) {

        printList(head);

        ListNode currNode = head;
        ListNode prevNode = null;
        ListNode nextNode = head;
        ListNode first = null;

        while (nextNode != null) {
            nextNode = nextNode.next;
            currNode.next = prevNode;
            prevNode = currNode;
            currNode = nextNode;
            System.out.println("## prevNode="+prevNode+", currNode="+currNode+", nextNode="+nextNode);
        }
        printList(prevNode);
    }

    private static void reverseList_v2(ListNode head) {

        printList(head);

        Stack<ListNode> s = new Stack<>();
        ListNode currNode = head;
        ListNode newHead = null;

        while (currNode != null) {
            s.push(currNode);
            System.out.println("## currNode="+currNode);
            currNode = currNode.next;
//            if (currNode!=null) {
//                newHead = currNode;
//            }
        }
        while(!s.isEmpty()) {
            System.out.printf("peek=%s%n", s.peek());
            if (newHead==null) {
                newHead = s.pop();
                currNode = newHead;
            } else {
                currNode.next = s.pop();
                currNode = currNode.next;
            }
        }
        currNode.next = null; // for last element
        printList(newHead);
    }

    // Based on recursion
    private static ListNode reverseList_v3(ListNode head) {
        System.out.println("head="+head);
        // base case
        if (head.next==null) {
            System.out.println("base case ... head="+head);
            return head;
        }

        ListNode newHead = reverseList_v3(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;
    }

    private static ListNode mergeList(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode();
        ListNode tmpPtr = dummyHead;
        while(l1!=null && l2!=null) {
            if (l1.val<=l2.val) {
                tmpPtr.next = l1;
                l1 = l1.next;
            } else {
                tmpPtr.next = l2;
                l2 = l2.next;
            }
            tmpPtr = tmpPtr.next;
            if (l1==null) {
                tmpPtr.next = l2;
            } else if (l2==null) {
                tmpPtr.next = l1;
            }
        }
        return dummyHead.next;
    }

    private static void printList(ListNode head) {
        ListNode node = head;
        System.out.printf("%n[ ");
        while(node!=null) {
            System.out.printf(" %d -> ",node.val);
            node = node.next;
        }
        System.out.printf(" X ]%n");
    }


}
