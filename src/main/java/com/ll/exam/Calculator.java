package com.ll.exam;

public class Calculator {
    public static int calc(String s) {
        boolean isMulti = s.indexOf(" * ") != -1;
        boolean isSubtract = s.indexOf(" - ") != -1;
        boolean isPlus = s.indexOf(" + ") != -1;
        if (isPlus) {
            return plus(s);
        } else if (isMulti) {
            return multi(s);
        } else if (isSubtract) {
            return subtract(s);
        }
        return 0;
    }
    public static int plus(String s) {
        String[] sBits = s.split(" \\+ ");
        int no1, no2;
        no1 = Integer.parseInt(sBits[0]);
        no2 = Integer.parseInt(sBits[1]);

        return no1 + no2;
    }

    public static int subtract(String s) {
        String[] sBits = s.split(" \\- ");
        int no1, no2;
        no1 = Integer.parseInt(sBits[0]);
        no2 = Integer.parseInt(sBits[1]);
        return no1 - no2;
    }

    public static int multi(String s) {
        String[] sBits = s.split(" \\* ");
        int no1, no2;
        no1 = Integer.parseInt(sBits[0]);
        no2 = Integer.parseInt(sBits[1]);
        return no1 * no2;
    }
}
