package com.patrick;
import java.util.*;
public class Main {
//Lakes running log w/ no methods.
    public static void main(String[] args) {
        HashMap mapOfTimes = new HashMap();//Map of lakes (Strings) to lists of mapOfTimes.

        ArrayList listOfTimesCalhoun = new ArrayList();
        listOfTimesCalhoun.add(43.32);
        listOfTimesCalhoun.add(45.15);
        mapOfTimes.put("Calhoun", listOfTimesCalhoun);

        ArrayList listOfTimesHarriet = new ArrayList();
        listOfTimesHarriet.add(49.34);
        listOfTimesHarriet.add(44.43);
        listOfTimesHarriet.add(46.22);
        mapOfTimes.put("Harriet",listOfTimesHarriet);

        ArrayList listOfTimesComo = new ArrayList();
        listOfTimesComo.add(32.11);
        listOfTimesComo.add(28.14);
        mapOfTimes.put("Como", listOfTimesComo);

        Scanner scanner = new Scanner(System.in);
        String inputLake = scanner.next();//Lake Name.
        Double inputLakeTime = scanner.nextDouble();//Running time.

        boolean doesContainLake = mapOfTimes.containsKey(inputLake);
        if (!doesContainLake) {
            ArrayList listOfTimes = new ArrayList();
            listOfTimes.add(inputLakeTime);
            mapOfTimes.put(inputLake, listOfTimes);
        } else {
            List timesList = (List)mapOfTimes.get(inputLake);
            timesList.add(inputLakeTime);

        }


        for (Object o : mapOfTimes.keySet()) {
            String nameOfLake = (String) o;
            List lakeTimes = (List) mapOfTimes.get(nameOfLake);
            Double lowestTime = getQuickestTime(lakeTimes);

            System.out.println(nameOfLake +", " + lowestTime);
            //System.out.println(lowestTime);

        }
    }
    public static Double getQuickestTime(List lakeTimes){
        Double quickestTime = Double.POSITIVE_INFINITY;
        for (Object o : lakeTimes) {
            Double time = (Double) o;
            if (time < quickestTime)
                quickestTime = time;
           // System.out.println(o);
        }
        return quickestTime;
//if time < quickestTime
    }
}


