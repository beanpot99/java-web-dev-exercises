package org.launchcode.java.demos.lsn7interfaces;

import java.util.ArrayList;
import java.util.Comparator;

public class Main {
    public static void main(String[] args){
        Case menu = new Case();
        ArrayList<Flavor> flavors = menu.getFlavors();
        ArrayList<Cone> cones = menu.getCones();
        //Comparator comparator = new FlavorComparator();
        flavors.sort(new FlavorComparator());
        cones.sort(new ConeComparator());
        for(int i=0; i< flavors.size();i++){
            System.out.println(flavors.get(i).getName()+" contains: ");
            for(int k=0; k< flavors.get(i).getAllergens().size();k++){
                 System.out.println(flavors.get(i).getAllergens().get(k));

            }
        }
        for(int j=0;j<cones.size();j++){
            System.out.println(cones.get(j).getName() + ": $" + cones.get(j).getCost());
        }

        // TODO: Use a Comparator class to sort the 'flavors' array alphabetically by the 'name'
        //  field.

        // TODO: Use a Comparator class to sort the 'cones' array in increasing order by the 'cost'
        //  field.

        // TODO: Print the 'flavors' and 'cones' lists (in a clear manner) to verify the sorting.
    }
}
