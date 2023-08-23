package daseulpractice;

public class Util {
    public Util()
    {

    }

    //중복검사 함수
    public boolean isContains(int[] arr, int target){
        boolean isContains = false;

        for (int i = 0; i < arr.length; i++) {
            if (target == arr[i]) {
                isContains = true;
                break;
            }
        }
        return isContains;
    }
}
