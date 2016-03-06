package com.patrick;
import java.util.*;
public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String inputLake = scanner.next();//Lake Name.
        Double inputLakeTime = scanner.nextDouble();//Running time.

        HashMap times = new HashMap();//Map of lakes to lists of times.

        boolean doesContainLake = times.containsValue(inputLake);
        if (!doesContainLake){
            ArrayList listOfTimes = new ArrayList();
            listOfTimes.add(inputLakeTime);
            times.put(inputLake,listOfTimes);
        }
        else{
            times.get(inputLake);
        }
       }
    }