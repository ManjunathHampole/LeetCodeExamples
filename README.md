# LeetCodeExamples
Putting up my variations of the examples from Leet Code. Not all answers are 100% accurate to the questions. 

Question 1:
Validate if a given string is numeric.
Some examples:
"0" => true
" 0.1 " => true
"abc" => false
"1 a" => false
"2e10" => true
Note: It is intended for the problem statement to be ambiguous. You should gather all requirements up front before implementing one.
Link : https://leetcode.com/problems/valid-number/description/ 


Question 2:
A password is considered strong if below conditions are all met:
It has at least 6 characters and at most 20 characters. 
It must contain at least one lowercase letter, at least one uppercase letter, and at least one digit. 
It must NOT contain three repeating characters in a row ("...aaa..." is weak, but "...aa...a..." is strong, assuming other conditions are met). 
Write a function strongPasswordChecker(s), that takes a string s as input, and return the MINIMUM change required to make s a strong password. If s is already strong, return 0.
Insertion, deletion or replace of any one character are all considered as one change.
Link : https://leetcode.com/problems/strong-password-checker/description/ 

Question 3:
International Morse Code defines a standard encoding where each letter is mapped to a series of dots and dashes, as follows: "a" maps to ".-", "b" maps to "-...", "c" maps to "-.-.", and so on.
For convenience, the full table for the 26 letters of the English alphabet is given below:
[".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."]
Now, given a list of words, each word can be written as a concatenation of the Morse code of each letter. For example, "cab" can be written as "-.-.-....-", (which is the concatenation "-.-." + "-..." + ".-"). We'll call such a concatenation, the transformation of a word.
Return the number of different transformations among all words we have.
Link : https://leetcode.com/problems/unique-morse-code-words/description/ 
