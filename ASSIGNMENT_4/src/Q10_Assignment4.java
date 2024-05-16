package Assignment_4;
import java.util.*;
public class Q10_Assignment4 {

	public static void main(String[] args) {
		String s="Hello, I am the the day";
		Hashtable<String,Integer> wordFreq= new Hashtable<>();
		// \\s:represents any whitespace character and 1 represent one
		String[] words = s.split("\\+");
		for(String word: words) {
			word= word.toLowerCase();
			if(!wordFreq.containsKey(word)) {
				wordFreq.put(word, 1);
			}
			else {
				wordFreq.put(word, wordFreq.get(word)+1);
			}
		}
		int maxfreq=0;
		for(int Freq: wordFreq.values()) {
			if(Freq>maxfreq)
				maxfreq= Freq;
		}
		
		List<String> mostOccuringWords= new ArrayList<>();
		for(String word: wordFreq.keySet()) {
			if(wordFreq.get(word)== maxfreq) {
				mostOccuringWords.add(word);
			}
		}
		System.out.println("Most occuring word(s) with frequency "+maxfreq);
		for(String word: mostOccuringWords) {
			System.out.println(word);
		}
	}

}
