package io.zipcoder;

import java.util.StringTokenizer;

//complies, but test is not passing....

public class Problem2 {

    int numPrevious = 0;
    int numPrePrevious = 1;
    StringBuilder fibonacciString = new StringBuilder();

    //fibonacciIteration
    public String fibonacciIteration(int n) {
        if (n == 0) {
            fibonacciString.append("0");
        }
        if (n == 1) {
            fibonacciString.append("0 1");
        }
        else {
            fibonacciString.append("0, 1, ");
            for (int nextNum = 0; nextNum < n; nextNum++) {
                nextNum = numPrevious + numPrePrevious;
                if(nextNum > n) {
                    break;
                }
                fibonacciString.append(nextNum + ", ");
                numPrevious = numPrePrevious;
                numPrePrevious = nextNum;
            }
        }
        fibonacciString.deleteCharAt(fibonacciString.length()-1);
        return fibonacciString.toString();
    }

    
//    public String fibonacciRecursion(int n) {
//
//    }

}

//if num is greater then n, remove it; don't print it