/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Wine.Store.System;

import java.util.Arrays;
import java.util.LinkedList;

/**
 *
 * @author Anuj
 */
public class MergeSort {
        
    public void mergeSorting(LinkedList<Integer> a){
        if(a.size()<=1){
            return;
        }
        Integer[] first = new Integer[a.size()/2];
        Integer[] second = new Integer[a.size()-first.length];
        for(int i = 0;i<first.length;i++){
            first[i]=a.get(i);
        }
        for(int i=0;i<second.length;i++){
            second[i]=a.get(first.length+i);
        }
        LinkedList<Integer> firstlist = new LinkedList<>(Arrays.asList(first));
        LinkedList<Integer> secondlist = new LinkedList<>(Arrays.asList(second));
        mergeSorting(firstlist);
        mergeSorting(secondlist);
        merge(firstlist,secondlist,a);
    }
    
    private void merge(LinkedList<Integer> first, LinkedList<Integer> second, LinkedList<Integer> a){
        int iFirst = 0;
        int iSecond = 0;
        int j = 0;
        
        while(iFirst<first.size() && iSecond < second.size()){
            if(first.get(iFirst) < second.get(iSecond)){
                a.set(j,first.get(iFirst));
                iFirst++;
            }
            else{
                 a.set(j,second.get(iSecond));
                 iSecond++;
            }
            j++;
        }
        
        while(iFirst < first.size()){
             a.set(j,first.get(iFirst));
             iFirst++;
             j++;
        }
        
        while(iSecond < second.size()){
            a.set(j,second.get(iSecond));
            iSecond++;
            j++;
        }
    }
    
}
