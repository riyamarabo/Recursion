package edu.gcccd.csis;

public class Factorial {

    static String print(int a[], int n)
    {
//        int i =  a.length-1;
        if (n > a.length-1) {
             return "";
        }else
            {

//            System.out.printf("%d", a[a.length-n]);
//            print(a, n-1);
                String returned = "";
                return returned += print(a,n+2) + (a[n]);
//                return returned += print(new int[]{a[i]}, n) ;
        }


    }


    public static String printStars(final String s) {

        if (s == null || s.length() <= 1) {
            return s;
        }
        if (s.charAt(0) == (s.charAt(1))) {
            return s.substring(0, 1) + "*" + printStars(s.substring(1));
        } else {
            return s.substring(0, 1) + printStars(s.substring(1));
        }
}
    private static String printStars1(String d) {
        {
            if ( d != null && d.length()>1  ) {

                if ((d.charAt(0)) == (d.charAt(1))) {
                    return d.substring(0, 1) + "*" + printStars1(d.substring(1));
                } else {
                    return d.substring(0, 1) + printStars1(d.substring(1));
                }
            }else
            {
                return d;
            }




        }
    }

    public static void main(String[] args) {

//        int [] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//
//        System.out.println(print(array, 2));
//
       String s = "ppuuttaaiinn";
//        if (s.substring(0,1).equals(s.substring(1,2))  ) {
//            System.out.println(s.substring(0, 1) + "*" + s.substring(1));
//        }
//        else
//        {
//            System.out.println(s.substring(0, 1) + s.substring(1));
//        }
        System.out.println(printStars1(s));


    }
}
