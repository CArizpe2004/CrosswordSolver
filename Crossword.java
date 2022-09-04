import java.util.*;
public class Crossword {
	private List<String> list;
	private List<String> lengthList;
	private List<String> indexList;
	
	public Crossword() {
		list = new LinkedList<>();
		lengthList = new LinkedList<>();
		indexList = new LinkedList<>();
	}
	
	public void add(String word) {
		list.add(word);
	}
	public void reset() {
		lengthList = new LinkedList<>();
		indexList = new LinkedList<>();
	}
	
	public void containsLength(int length) {
		for(String word : list) {
			if(word.length() == length) lengthList.add(word);
		}
	}
	public void containsLetterAt(int index, char letter) {
		for(String word : lengthList) {
			if(word.charAt(index - 1) == letter) indexList.add(word);
		}
	}
	
	@Override
	public String toString() {
		return lengthList + "\n" + indexList;
	}
}
