package com.bdlz.generics;

public class Maximum {

        public static Float findMaximum(Float a, Float b, Float c) {
            Float max = a;
            if (b.compareTo(a)>0 && b.compareTo(c)>0) {
                max = b;
            } if (c.compareTo(max) > 0) {
                max = c;
            }
            return max;
        }
    }

