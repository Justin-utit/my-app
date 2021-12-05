package com.modernjava.prepare.forty;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
What is a Regular Expression?
A regular expression is a sequence of characters that forms a search pattern.
When you search for data in a text, you can use this search pattern to describe what you are searching for.

A regular expression can be a single character, or a more complicated pattern.

Regular expressions can be used to perform all types of text search and text replace operations.

Java does not have a built-in Regular Expression class, but we can import the java.util.regex package to work with regular expressions.
The package includes the following classes:

Pattern Class - Defines a pattern (to be used in a search)
Matcher Class - Used to search for the pattern
PatternSyntaxException Class - Indicates syntax error in a regular expression pattern
 */
public class RegEx_40 {
    public static void main(String[] args) {
        /*
        Example Explained
        In this example, The word "w3schools" is being searched for in a sentence.

        First, the pattern is created using the Pattern.compile() method.
        The first parameter indicates which pattern is being searched for and the second parameter has a flag to indicates that
        the search should be case-insensitive. The second parameter is optional.

        The matcher() method is used to search for the pattern in a string. It returns a Matcher object which
        contains information about the search that was performed.

        The find() method returns true if the pattern was found in the string and false if it was not found.
         */
        Pattern pattern = Pattern.compile("w3schools", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher("Visit W3Schools!");
        boolean matchFound = matcher.find();
        if(matchFound) {
            System.out.println("Match found");
        } else {
            System.out.println("Match not found");
        }

        /*
        Metacharacters are characters with a special meaning:

        Metacharacter	Description
        |	Find a match for any one of the patterns separated by | as in: cat|dog|fish
        .	Find just one instance of any character
        ^	Finds a match as the beginning of a string as in: ^Hello
        $	Finds a match at the end of the string as in: World$
        \d	Find a digit
        \s	Find a whitespace character
        \b	Find a match at the beginning of a word like this: \bWORD, or at the end of a word like this: WORD\b
         */
        /*
        直接用這個網站給的例子去看:
            https://www.geeksforgeeks.org/regular-expressions-in-java/
         */
        //1st way
        Pattern p = Pattern.compile(".s");// . represents single character
        Matcher m = p.matcher("as");
        boolean b = m.matches();

        //2nd way
        boolean b2=Pattern.compile(".s").matcher("as").matches();

        //3rd way
        boolean b3 = Pattern.matches(".s", "as");
        System.out.println(b+" "+b2+" "+b3);



        // Following line prints "true" because the whole
        // text "geeksforgeeks" matches pattern
        // "geeksforge*ks"
        System.out.println(Pattern.matches(
                "geeksforge*ks", "geeksforgeeks"));

        // Following line prints "false" because the whole
        // text "geeksfor" doesn't match pattern "g*geeks*"
        System.out.println(
                Pattern.matches("g*geeks*", "geeksfor"));


        /*
        常見應用
        https://alvinalexander.com/blog/post/java/common-regular-expressions-that-java-developers-need/
         */


    }
    public static final Pattern VALID_EMAIL_ADDRESS_REGEX =
            Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);

    public static boolean validate(String emailStr) {
        Matcher matcher = VALID_EMAIL_ADDRESS_REGEX.matcher(emailStr);
        return matcher.find();
    }
}













