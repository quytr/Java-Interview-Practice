package com.syntax.ali;

public class StringPassword {

    public static String SimplePassword(String str) {

        if (str.equalsIgnoreCase("password")) {
            return "false";
        } else {

            if (str.length() > 7 && str.length() < 31 && (str.toLowerCase().replaceAll("[a-z 0-9]", "").length() > 0)) {
                for (int i = 0; i < str.length(); i++) {
                    if (Character.isUpperCase(str.charAt(i))) {
                        return "true";
                    }
                }

            }

        }
        return "false";

    }

    public static void main(String[] args) {

        String s = "password";
        System.out.println(SimplePassword(s));

        String s2 = "turkey90AAA=";
        System.out.println(SimplePassword(s2));

        String s3 = "hello123&=abe";
        System.out.println(SimplePassword(s3));

    }
}
