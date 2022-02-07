/********************************************************************
// These are the notes for ch 6 used in hayes class


import
//******************************************************************* */


import java.text.DecimalFormat;
import java.text.NumberFormat;
import javax.swing.*;
import java.util.StringTokenizer;
import java.util.*;
import java.util.ArrayList;//yes AL are in util

public class ch6intro_to_ArrayList

{
    final static int MAX = 20;

public static void main (String[] args)
{
    //ArrayList notes

    // <> indicates the type of ArrayList
    //<> optional -- you would have to cast as you get the object
    //ex: (String)list.get(0)
    ArrayList <String> farm = new ArrayList<>();//size not defined because ArrayList is dynamic
    
    farm.add("cow");farm.add("chicken");//adds the obj to the end of the list
    for (int i = 0; i<20;i++)
    {
        farm.add("cow");
        farm.add("chicken");
        farm.add("chicken");
        farm.add("duck");
        farm.add("horse");

    }
    farm.add("dog");farm.add("dog");farm.add("dog");
    farm.add("pig");farm.add("pig");farm.add("pig");
    farm.add("pig");farm.add("pig");farm.add("pig");

    System.out.println(farm);
    
    int count = 0;
    for (int i = 0; i<farm.size();)
    {
        if(farm.get(i).equals("chicken"))//no index, use the .get(index) method
            {count++; farm.remove(i);}
        else
            i++;
            // #1 i-- in the if statment
            // #2 remove i++ and make else i++
            // #3 change if to a while
            // # process it backwards and then index doesn't get affected
    }
    
    farm.add(0, "chicken");
    farm.add(5, "chicken");
    String anm = farm.set(0, "puppy");//replaces lmao and returns old value
    System.out.println(anm);
    
    System.out.println("There are " + count+ " chickens");
    
    System.out.println(farm);
    /*
    ArrayList <String> list = new ArrayList<>();

    //ArrayList <int> list1 = new ArrayList<>();// no primitive data types

    ArrayList <Integer> list1 = new ArrayList<>();

    ArrayList <CD> mycds = new ArrayList<>();

    //for(int i = 0; i<3; i++)
    //{

    mycds.add(new CD("Wilco","Jeff Tweety",12.99,16);
    mycds.add(new CD("Throwup","Britiny Spears",12.99,16);
    mycds.add(new CD("Oxygen","CatFish and the Bottlemen",12.99,16);

    System.out.print(mycds);

    //}
/**/
}// end of main

}// end of class











