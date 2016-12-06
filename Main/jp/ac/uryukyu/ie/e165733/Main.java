package jp.ac.uryukyu.ie.e165733;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            String str = null;
            System.out.println(str.length());
        } catch (NullPointerException e) {
            e.printStackTrace();
        }
    }
}