public class App {
    public static void main(String[] args) {
        
        String[] fruits = {"Morango", "Uva", "Acerola", "Manga", "Caju"};
        String[] fruits2 = {"Pêra", "Caju", "Morango", "Kiwi", "Uva"};


        for(int i =0; i < fruits.length; i++){
            for(int j = 0; j < fruits2.length; j++){
                if(fruits[i].equals(fruits2[j])){
                    System.out.println(fruits[i]);
                }
            }
        }
    }
}
