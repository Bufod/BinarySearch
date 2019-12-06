package com.company;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

import static com.sun.activation.registries.LogSupport.log;

public class Main {

    public static int binarySearch(int[] arr, int el, int start, int end){
        if (el == arr[start])
            return start;
        int median = (end + start)/2;
        if (el >= arr[median])
            return binarySearch(arr, el, median, end);
        else
            return binarySearch(arr, el, start, median);
    }

    public static int binarySearch(int[] arr, int el){
        return binarySearch(arr, el, 0, arr.length);
    }

    public static void main(String[] args) throws IOException {
        int[] arr = new int[]{1,2,3,4,5,6,7};
        int ind = binarySearch(arr, 6);
        System.out.println(arr[ind] + " " + ind);
    }
}
