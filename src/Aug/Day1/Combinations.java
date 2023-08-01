package Aug.Day1;

import java.util.ArrayList;
import java.util.List;

class Combinations {
    public static List<List<Integer>> combine(int n, int k) {

        List<List<Integer>> result = new ArrayList<>();
        generateCombination(1,n,k,new ArrayList<>(),result);
        return result;
    }

    public static void generateCombination(int start,int n , int k , List<Integer>comp , List<List<Integer>>result){

        if(k==0){
            result.add(new ArrayList<>(comp));
            return;
        }
        for (int i = start; i <= n - k + 1; i++) {
            comp.add(i);
            generateCombination(i+1,n,k-1,comp,result);
            comp.remove(comp.size()-1);
        }

    }

    public static void main(String[] args) {
        System.out.println(combine(4,2));
    }
}