package org.startup.java;

/**
 * Hello world!
 *
 */
public class App 
{
    public boolean isPalyndrome(String inputString) {
        if (inputString.length() == 0) {
            return true;
        } else {
            char firstChar = inputString.charAt(0);
            char lastChar = inputString.charAt(inputString.length() - 1);
            String mid = inputString.substring(1, inputString.length() - 1);
            return (firstChar == lastChar) && isPalyndrome(mid);
        }
    }

    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }
}
