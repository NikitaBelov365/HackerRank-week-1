import java.util.Scanner;

public class Solution {
    public static boolean isUpper(String str) {
        return str.equals(str.toUpperCase());
    }

    public static String strModified(String str, String z) {
        String myNewStr = "";
        if (z.equals(")")) {
            myNewStr = str.substring(4, str.length() - 2);
        } else {
            myNewStr = str.substring(4);
        }
        return myNewStr;
    }

    public static String firstToUp(String str) {
        String[] strArr = str.split("");
        strArr[0] = strArr[0].toUpperCase();
        String returnStr = "";
        for (int i = 0; i < strArr.length; i++) {
            returnStr = returnStr + strArr[i];
        }
        return returnStr;
    }

    public static void solution(String str) {
        String[] myString = str.split("");
        String x = myString[0];
        String y = myString[2];
        String z = myString[myString.length - 1];

        String modifiedStr = strModified(str, z);
        String newString = "";

        if (x.equals("S") & y.equals("M")) {
            for (int i = 4; i < modifiedStr.length() + 4; i++) {
                if (isUpper(myString[i]) & i > 4) {
                    newString = newString + " " + myString[i].toLowerCase();
                } else {
                    newString = newString + myString[i];
                }
            }


        } else if (x.equals("S") & y.equals("V")) {
            for (int i = 4; i < modifiedStr.length() + 4; i++) {
                if (isUpper(myString[i]) & i > 4) {
                    newString = newString + " " + myString[i].toLowerCase();
                } else {
                    newString = newString + myString[i];
                }
            }

        } else if (x.equals("S") & y.equals("C")) {
            for (int i = 4; i < modifiedStr.length() + 4; i++) {
                if (isUpper(myString[i]) & i > 4) {
                    newString = newString + " " + myString[i];
                } else {
                    newString = newString + myString[i];
                }
            }
            newString = newString.toLowerCase();

        } else if (x.equals("C") & y.equals("M")) {
            String[] temp = modifiedStr.split(" ");
            for (int i = 0; i < temp.length; i++) {
                if (i == 0) {
                    newString = newString + temp[i];
                } else {
                    newString = newString + firstToUp(temp[i]);
                }
            }
            newString = newString + "()";

        } else if (x.equals("C") & y.equals("V")) {
            String[] temp = modifiedStr.split(" ");
            for (int i = 0; i < temp.length; i++) {
                if (i == 0) {
                    newString = newString + temp[i];
                } else {
                    newString = newString + firstToUp(temp[i]);
                }
            }
        } else {
            String[] temp = modifiedStr.split(" ");
            for (int i = 0; i < temp.length; i++) {
                newString = newString + firstToUp(temp[i]);
            }
        }
        System.out.println(newString);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder input = new StringBuilder();
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            input.append(line).append("\n");
        }
        String tempString = input.toString();
        String[] tempArray = tempString.split("\n");
        for (int i = 0; i < tempArray.length; i++) {
            solution(tempArray[i]);
        }
        scanner.close();

    }
}