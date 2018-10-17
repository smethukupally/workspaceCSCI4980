package util;

//import org.junit.Test;

public class TestSearchUtil {
   // * content = "123123x123" searchTerm = "1" --> [0, 1, 3, 1, 7, 1]
   // * content = "123123x123" searchTerm = "123" --> [0, 6, 7, 3]
   // * @return an array of int pairs (index, length)
   
   public void testGetSearchTermOccurrences() {
      String searchTerm = "123";
      String content = "123123x123";
      int[] searchTermOccurrences = SearchUtil.getSearchTermOccurrences(searchTerm, content);
      for (int i = 0; i < searchTermOccurrences.length; i++) {
         System.out.println(i + " => [" + searchTermOccurrences[i] + "]");
      }
   }
}
