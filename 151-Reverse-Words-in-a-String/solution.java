public class Solution {
    public String reverseWords(String s) {
		String str = s.trim();
		String[] list = str.split("\\s+");
		StringBuilder sb = new StringBuilder();
		
		
		for (int i = list.length - 1; i >= 0; i--) {
			String element = list[i];			
			sb.append(element.trim());
			sb.append(" ");
		}
		
		return sb.toString().trim();
	
	}
}