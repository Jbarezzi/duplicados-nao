public class App {
  public static void main(String[] args) throws Exception {
    String[] words1 = new String[]{"Morango", "Uva", "Acerola", "Manga"};
    String[] words2 = new String[]{"Pêra", "Caju", "Morango", "Kiwi", "Acerola"};
    
    for(int i = 0; i < words1.length; i++) {
      for(int j = 0; j < words2.length; j++) {
        if(words1[i] == words2[j]) {
          System.out.println(words1[i]);
        }
      }
    }
  }
}
