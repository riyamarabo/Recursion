package edu.gcccd.csis;

public class Recursion {

    static String printEveryOther(final int[] ia, final int k)
    {
        if (k < 0) throw new IllegalArgumentException("index must be greater or equal 0");
        if (ia == null ) throw new NullPointerException(("Array cannot be null"));
        if (k>ia.length-1)
        {
            return "";
        }
        else
        {
            String returned = "";
            return returned + printEveryOther(ia, k+2) + ia[k];
        }
    }


    static String printStars(final String s) {

        if (s!=null && s.length() >1)
        {
            if (s.charAt(0) == s.charAt(1))
            {
                return s.substring(0,1) + "*" +  printStars(s.substring(1));
            }
            else
            {
                return s.substring(0,1)+ printStars(s.substring(1));
            }

        }else return s;

    }


    static int sum(int k) {
        return k > 0 ? k + sum(k - 1) : 0;
    }

    public static void main(String[] args)
    {
        int[] array = new int[]{10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        System.out.println(printEveryOther(array, 2).charAt(1));
        System.out.println(printStars("Hhellloo"));
        System.out.println(sum(4));
    }
}



