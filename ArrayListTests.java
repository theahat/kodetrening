/*
arraylist commands
names.add(value)
names.add(index, value)
names.remove() - removes element 0
names.set(index, value) - swaps value on index
names.get(index)
 */

import java.util.ArrayList;
import java.util.Scanner; 

public class ArrayListTests {

    public static void arrays(){
        ArrayList<String> friends = new ArrayList<String>();
        friends.add("Cindy");
        friends.add("Emma");
        friends.add("Lisa");;
        System.out.println(friends);
    }

    public static ArrayList<Double> removeDupes(ArrayList<Double> list){
        //remove duplicates
        System.out.println("Removing duplicates...");
        ArrayList<Double> newValues = new ArrayList<Double>();
        for (Double value : list) {
            if (!newValues.contains(value)){
                newValues.add(value);
            }
        }
        return newValues;
    }

    public static void largestInArray(ArrayList<Double> newValues){
        
        //find largest:
        System.out.println("Finding largest...");
        double largest = newValues.get(0);
        for (int i = 1; i < newValues.size(); i++) {
            if (newValues.get(i) > largest) {
                largest = newValues.get(i);
            }
        }

        //print with largest marked
        System.out.println("Here is the list with the largest value marked:");
        for (double element : newValues) {
            System.out.print(element);
            if (element == largest){
                System.out.print(" <== largest value");
            }
            System.out.println();
        }
    }

    public static ArrayList<Integer> reverse(ArrayList<Integer> list){
        ArrayList<Integer> newList = new ArrayList<Integer>();
        for (int i = (list.size()-1); i>=0; i--){
            newList.add(list.get(i));
        }
        return newList;
    } 

    public static void main(String[] args) {
        //arrays();
        /*
        ArrayList<Double> values = new ArrayList<Double>();
        System.out.print("Please enter values: ");
        Scanner tastatur = new Scanner(System.in);
        while (tastatur.hasNextDouble()){
            values.add(tastatur.nextDouble());
        }
        ArrayList<Double> newValues = removeDupes(values);
        largestInArray(newValues);
        */
        ArrayList<Integer> primes = new ArrayList<Integer>();
        primes.add(2);
        primes.add(3);
        primes.add(5);
        primes.add(7);
        primes.add(11);
        System.out.println(reverse(primes));
    }

}
