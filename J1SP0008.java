
package j1.s.p0008;

import java.util.AbstractMap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.StringTokenizer;

public class J1SP0008 {

    private Map<Character, Integer> charCounter = new HashMap<Character, Integer>();
    private Map<String, Integer> wordCounter = new HashMap<String, Integer>();
    
    /*
        Print hashMap
    */
    public void display(){
        System.out.println("Print character: ");
        for (char c:charCounter.keySet()){
            String value = charCounter.get(c).toString();
            System.out.println(c + ": " + value);
        }
        
        System.out.println("Print word");
        for (String st : wordCounter.keySet()) {
            String key = st.toString();
            String value = wordCounter.get(st).toString();
            System.out.println(key + ": " + value);
        }
    }
    
    public void analyze(String content){
        for (char ch:content.toCharArray()){        
            if (Character.isSpaceChar(ch)) continue;
            if (!charCounter.containsKey(ch)){ // check key appear in charCounter
                charCounter.put(ch, 1);         // Insert key and value to charCounter(HashMap Code)
            }else
            {
                charCounter.put(ch, ((int)charCounter.get(ch)) + 1);   
            }
        }
        
        StringTokenizer tokenizer = new StringTokenizer(content); // divide word in String
        while (tokenizer.hasMoreTokens()){          // check more Token in String
            String token = tokenizer.nextToken();   // move to next token 
            if (!wordCounter.containsKey(token)){
                wordCounter.put(token, 1);
            }else
            {
                wordCounter.put(token, ((int)wordCounter.get(token)) + 1);
            }
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String st;
        st = sc.nextLine();
        
        J1SP0008 count =  new J1SP0008();
        count.analyze(st);
        count.display();
    }
    
}
