package Test_Package;
import java.util.ArrayList;

public class Spli_words_from_sentence {
	public static void main(String[] args) {
		int i, index=0;
		String str="Will get job soon";
		ArrayList<String> li= new ArrayList<String>();
		for(i=0;i<str.length();i++)
		{
			if(str.charAt(i)==' ')
			{
				String words = str.substring(index,i);
				li.add(words);
				index=i+1;		
			}			
		}
		
		li.add(str.substring(index));
		for(String s: li )
		{
			System.out.println(s);
		}
	}
}
