import java.util.*;
public class Digits {

    private ArrayList<Integer> digitList = new ArrayList<>();
    public Digits(int num) throws IllegalArgumentException
    {
        if (num < 0) throw new IllegalArgumentException(String.format("The number passed to the constructor (%s) cannot be negative!", num));
        String number = String.valueOf(num);

        String[] arr = number.split("");
        for (String i : arr){
            digitList.add(Integer.valueOf(i));
        }

    }


    public boolean isStrictlyIncreasing()
    {

        boolean t = true;
        for (int i : digitList){
            try{
                if(i >= digitList.get(digitList.indexOf(i)+1)){
                    return false;
                }
            } catch (Exception e){}
        }
        return t;

    }

    public ArrayList<Integer> getDigitList() {
        return digitList;
    }
}