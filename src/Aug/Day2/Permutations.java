package Aug.Day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Permutations {

    public static void genratePermute(int idx,List<Integer>currPermut,List<List<Integer>> result){

        if(idx== currPermut.size()){
            result.add(new ArrayList<>(currPermut));
            return;
        }
        for (int i = idx; i < currPermut.size(); i++) {
            Collections.swap(currPermut,idx,i);
            genratePermute(idx+1,currPermut,result);
            Collections.swap(currPermut,i,idx);
        }

    }

    public static List<List<Integer>> permute(int[] nums) {

        List<List<Integer>> result = new ArrayList<>();
        List<Integer> prm = new ArrayList<>();
        for (int num : nums) {
            prm.add(num);
        }
        genratePermute(0,prm,result);
        return result;

    }

    public static void main(String[] args) {
        int[] nums = new int[]{1 ,2,3};

        System.out.println(permute(nums));
    }
}
