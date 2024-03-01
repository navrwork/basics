package com.navr.dsa.leet;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class LinkedList01 {
    public static void main(String[] args) {

        ListNode ln1 = new ListNode(4);
        ListNode ln2 = new ListNode(2);
        ListNode ln3 = new ListNode(1);
        ListNode ln4 = new ListNode(3);
//        ListNode ln5 = new ListNode(50);
//        ListNode ln6 = new ListNode(16);
        ln1.next = ln2;
        ln2.next = ln3;
        ln3.next = ln4;
//        ln4.next = ln5;
//        ln5.next = ln6;

        ListNode head = ln1;

        LinkedList01 obj = new LinkedList01();
//        obj.getReverseValue(ln1);
//        int addedNum = obj.addTwoNumbers(ln1, ln4);
//        obj.constructListNode(addedNum);

        obj.printNodeList(head);

//        obj.removeNodeFromList(ln1, 6);

//        obj.removeNodeFromEnd(ln1, 2);

//        ListNode newHead = obj.removeNodeFromEnd_v2(ln1, 2);

        ListNode head2 = obj.sortList(head);

        obj.printNodeList(head2);
    }

    public void printNodeList(ListNode head) {
        if (head!=null) {
            ListNode currNode = head;
            System.out.print("[ ");
            do {
                System.out.printf(currNode.toString()+" ");
                currNode = currNode.next;
            } while (currNode!=null);
        }
        System.out.printf(" ]%n");
    }
    public int addTwoNumbers(ListNode l1, ListNode l2) {
        int r1 = getReverseValue(l1);
        int r2 = getReverseValue(l2);
        int r3 = r1+r2;
        System.out.printf("r1=%d, r2=%d, r3=%d%n", r1,r2,r3);
        return  r3;
    }

    private int getReverseValue(ListNode l1) {
        int rev = 0;
        StringBuilder sb = new StringBuilder();
        ListNode ln = l1;
        do {
            sb.append(ln.val);
            ln = ln.next;
        } while (ln!=null);
        int revNum = Integer.parseInt(sb.reverse().toString());
        System.out.println("revNum="+revNum);
        return revNum;
    }

    private ListNode constructListNode(int num) {
        ListNode ln = null;
        ListNode prevLn = null;
        StringBuilder sb = new StringBuilder(Integer.toString(num));
        int i = 1; // digit position
        int pendingDigits = sb.length()-1;
        int nu = num;
        while (nu > 0) {
            System.out.printf("### nu=%d, pendingDigits=%d%n", nu, pendingDigits);
            ln = new ListNode();
            int adj = (int)Math.pow(10,pendingDigits--);
            ln.val = nu / adj;
            nu = nu - ln.val * adj;
            if (prevLn!=null) {
                prevLn.next = ln;
                System.out.printf("prevLn=%s, prevLn.val=%d, prevLn.next=%s", prevLn, prevLn.val, prevLn.next);
            }
            System.out.printf("nu=%d, adj=%d, ln.val=%d%n", nu,adj,ln.val);
            System.out.printf("ln=%s, prevLn=%s%n",ln, prevLn);
            prevLn = ln;
        }
        return ln;
    }

    private void removeNodeFromList(ListNode head, int n) {
        if (head != null) {
            int nodeCounter = 1;
            ListNode currNode = head;
            ListNode prevNode = null;
            do {
                if (nodeCounter == n - 1) {
                    prevNode = currNode;
                }
                if (nodeCounter == n && prevNode != null) {
                    prevNode.next = currNode.next;
//                    currNode.next = null;
                }
                System.out.println("currNode=" + currNode.toString() + ", prevNode=" + ((prevNode != null) ? prevNode.toString() : null));
                currNode = currNode.next;
                nodeCounter++;
            } while (currNode != null);
        }
    }

    private ListNode removeNodeFromEnd(ListNode head, int n){
        int nodeCount = fetchNodeCount(head);
        n = nodeCount - n + 1;
        System.out.println("New n="+n);
        ListNode retNode = n==1?head.next:head;
        if (head != null) {
            int nodeCounter = 1;
            ListNode currNode = head;
            ListNode prevNode = null;
            do {
                if (nodeCounter == n - 1) {
                    prevNode = currNode;
                }
                if (nodeCounter == n && prevNode != null) {
                    prevNode.next = currNode.next;
//                    currNode.next = null;
                }
                System.out.println("currNode=" + currNode.toString() + ", prevNode=" + ((prevNode != null) ? prevNode.toString() : null));
                currNode = currNode.next;
                nodeCounter++;
            } while (currNode != null);
        }
        return retNode;
    }

    private ListNode removeNodeFromEnd_v2(ListNode head, int n){
        List<ListNode> nodeList = fetchNodeList(head);
        int newN = nodeList.size()-n;
        if (newN==0){
            head = head.next;
        } else {
            nodeList.get(newN-1).next = nodeList.get(newN).next;
        }


//        int nodeCount = fetchNodeCount(head);
//        n = nodeCount - n + 1;
//        System.out.println("New n="+n);
//        ListNode retNode = n==1?head.next:head;
//        if (head != null) {
//            int nodeCounter = 1;
//            ListNode currNode = head;
//            ListNode prevNode = null;
//            do {
//                if (nodeCounter == n - 1) {
//                    prevNode = currNode;
//                }
//                if (nodeCounter == n && prevNode != null) {
//                    prevNode.next = currNode.next;
////                    currNode.next = null;
//                }
//                System.out.println("currNode=" + currNode.toString() + ", prevNode=" + ((prevNode != null) ? prevNode.toString() : null));
//                currNode = currNode.next;
//                nodeCounter++;
//            } while (currNode != null);
//        }
        return head;
    }


    private int fetchNodeCount(ListNode head) {
        ListNode currNode = head;
        int nodeCount = 0;
        while (currNode != null) {
            nodeCount++;
            currNode = currNode.next;
        }
        System.out.println("nodeCount="+nodeCount);
        return nodeCount;
    }

    private List<ListNode> fetchNodeList(ListNode head) {
        List<ListNode> nodeList = new ArrayList<>();
        ListNode currNode = head;
        int nodeCount = 0;

        while (currNode != null) {
            nodeList.add(currNode);
            currNode = currNode.next;
        }
        System.out.println("nodeList size ="+nodeList.size());
        return nodeList;
    }

    private ListNode sortList(ListNode head) {
        List<ListNode> nodeList = new ArrayList<>();
        ListNode currNode = head;
        int nodeCount = 0;

        while (currNode != null) {
            nodeList.add(currNode);
            currNode = currNode.next;
        }

        nodeList.sort(new Comparator<ListNode>() {
            @Override
            public int compare(ListNode o1, ListNode o2) {
                return o1.val-o2.val;
            }
        });

//        List<ListNode> sortedList = nodeList.stream().sorted((o1,o2)->{return o1.val-o2.val;}).collect(Collectors.toList());

        ListNode head2 = null;
        ListNode prevNode = null;
        int counter = 1;
        for (ListNode node : nodeList) {
            if (head2==null) {
                head2 = node;
            }
            if(prevNode!=null){
                prevNode.next = node;
            }
            prevNode = node;

            if (counter==nodeList.size()) {
                node.next = null;
            }
            counter++;
        }
        System.out.println("sortedList size ="+nodeList.size());
        System.out.println(nodeList);
        return head2;
    }
}

