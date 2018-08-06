import java.util.Map;
import java.util.Iterator;
import java.util.Set;
import java.io.*;
import java.util.Scanner;

public class Morse {

public static void main (String[] args) {
	int i =0;
	int count= 0;
	String str = new String();
	HashMap<String, String> hmap = new HashMap<String, String>();
	hmap.put("a",".-");
	hmap.put("b","-...");
	hmap.put("c","-.-.");
	hmap.put("d","-..");
	hmap.put("e",".");
	hmap.put("f","..-.");
	hmap.put("g","--.");
	hmap.put("h","....");
	hmap.put("i","..");
	hmap.put("j",".---");
	hmap.put("k","-.-");
	hmap.put("l",".-..");
	hmap.put("m","--");
	hmap.put("n","-.");
	hmap.put("o","---");
	hmap.put("p",".--.");
	hmap.put("q","--.-");
	hmap.put("r",".-.");
	hmap.put("s","...");
	hmap.put("t","-");
	hmap.put("u","..-");
	hmap.put("v","...-");
	hmap.put("w",".--");
	hmap.put("x","-..-");
	hmap.put("y","-.--");
	hmap.put("z","--..");
	hmap.put(" ","\n");

	Set set = hmap.entrySet();
	Iterator iterator = set.iterator();
	while (iterator.hasNext())
	{
		Map.Entry mapentry = (Map.Entry)iterator.next();
		// System.out.print("Key is:"+mapentry.getKey()+"Value is:");
		// System.out.println(mapentry.getValue());
	}
	// String v = hmap.get("a");
	// System.out.println(v);
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter the words:");
	String sentence = scanner.nextLine();
	String [] words = sentence.split("");
	// System.out.println("Words are:");
	// for(String word: words){
	// 	System.out.print(word);
	// }
	while(true){
	for(i=0;i<words.length;i++)
	{
		if(hmap.containsKey(words[i]))
		{
			hmap.get(words[i]);
		}
		str = hmap.get(words[i]);
		System.out.print(str);
		// System.out.print(hmap.get(words[i]));
	}
	if(str.equals(str))
		{
			count = count + 1;
			break ;
		}
	}
	}
}