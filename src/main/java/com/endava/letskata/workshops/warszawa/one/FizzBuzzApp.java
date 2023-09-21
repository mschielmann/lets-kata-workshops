package com.endava.letskata.workshops.warszawa.one;

class FizzBuzzApp {

    String test(final Integer i) {
        if (i == 0) {
            return "0";
        }

        String result = "";
        if (i % 3 == 0) {
            result += "Fizz";
        }
        if (i % 5 == 0) {
            result += "Buzz";
        }

        return result.equals("") ? i.toString() : result;
    }
}
