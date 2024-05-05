package org.example;

import java.util.ArrayList;
import java.util.Objects;

/**
 * Author: Gayan Sanjeewa
 * User: gayan
 * Date: 5/5/24
 * Time: 10:31 PM
 */
public class AddTwoNumbers {
    public static void main(String[] args) {
        ListNode listNode = new ListNode();
        listNode.val = 2;
        ListNode listNode1 = new ListNode();
        listNode1.val = 4;
        listNode.next = listNode1;


        ListNode listNode3 = new ListNode();
        listNode3.val = 5;
        ListNode listNode4 = new ListNode();
        listNode4.val = 6;
        ListNode listNode5 = new ListNode();
        listNode5.val = 4;

        ListNode listNode6 = new ListNode();
        listNode6.val = 9;
        listNode3.next =listNode4;
        listNode4.next = listNode5;
        listNode5.next = listNode6;

        long l = System.currentTimeMillis();
        ListNode finalNode = addTwoNumbers(listNode, listNode3);
        printNodeLog(finalNode);
        long l2 = System.currentTimeMillis();
        System.out.println("Total processing time - " + (l2-l));

    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ArrayList<Integer> arrayListNode1 = new ArrayList<>();
        ArrayList<Integer> arrayListNode2 = new ArrayList<>();

        convertToArrayList(l1,arrayListNode1);
        convertToArrayList(l2,arrayListNode2);

        if(arrayListNode1.size() > arrayListNode2.size()){

            for (int i = arrayListNode2.size(); i < arrayListNode1.size(); i++) {
                arrayListNode2.add(0);
            }
        }else {
            for (int i = arrayListNode1.size(); i < arrayListNode2.size(); i++) {
                arrayListNode1.add(0);
            }
        }
        Integer rest = 0;
        String total = "";
        for (int i = 0; i < arrayListNode1.size(); i++) {
            int tot = arrayListNode1.get(i)+rest+arrayListNode2.get(i);
            if(tot >= 10){
                tot = tot-10;
                rest = 1;
            }else {
                rest = 0;
            }
            total = total+tot;
        }

        if(rest> 0 ){
            total+=rest;
        }
        ArrayList<Integer> finalNodeList = new ArrayList<>();

        for (int i = 0; i < total.length(); i++) {
            finalNodeList.add(Integer.parseInt(String.valueOf(total.charAt(i))));
        }
        int count =0;
        return  setVal(finalNodeList, count);
    }
    static ListNode setVal(ArrayList<Integer> finalNodeList , int count){
        ListNode listNode = new ListNode();
        listNode.val = finalNodeList.get(count);
        count++;
        if(finalNodeList.size()!=count) {
            listNode.next = setVal(finalNodeList, count);
        }
        return listNode;
    }

    static void convertToArrayList(ListNode listNode , ArrayList<Integer> arrayList){
        arrayList.add(listNode.val);
        if(Objects.nonNull(listNode.next)){
            convertToArrayList(listNode.next,arrayList);
        }
    }

    static void printNodeLog(ListNode listNode){
        System.out.print(listNode.val);
        if(Objects.nonNull(listNode.next)){
            printNodeLog(listNode.next);
        }else {
            System.out.println("\n");
        }
    }

}

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }

}
