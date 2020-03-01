package io.github.abitgen.hackerrank.compare;

public class Comparator {
    public boolean compare(String s1, String s2) {
        return s1.equals(s2);
    }

    public boolean compare(int num1, int num2) {
        return num1 == num2;
    }

    public boolean compare(int[] array1, int[] array2) {
        if(array1.length == array2.length){
            for(int i = 0; i< array1.length;i++){
                if(array1[i] != array2[i]){
                    return false;
                }
            }
            return true;
        }
        return false;
    }
}
