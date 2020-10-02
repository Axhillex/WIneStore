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
public class BinarySearch {
    
    public int binarySearch(LinkedList<Integer> list, int f, int l, int x) {
        if (l>=1) 
        { 
            int mid = f + (l - f)/2; 

            if (list.get(mid) == x) 
            {
               return mid; 
            }
            else if (list.get(mid) > x) 
            {
               return binarySearch(list, f, mid-1, x); 
            }
            else
            {
                return binarySearch(list, mid+1, l, x); 
            }
        }
        else
        {
            return -1; 
        }
    }
    
    public int binarySearchString(LinkedList<String> list, int f, int l, String x){
        
        int mid = 0;
        while(f<=l){
            mid = (f+l)/2;

            if(x.compareTo(list.get(mid)) > 0){
                return binarySearchString(list, mid+1, l, x); 
            }else if(x.compareTo(list.get(mid)) < 0){
                return binarySearchString(list, f, mid-1, x); 
            }else{
                break;
            }
        }
        return mid;
    }
}
