public class RussianAlphabet {
    public static void main(String args[]){
        int i;
        char[] arr = {'а', 'б', 'в', 'г', 'д', 'е', 'ё', 'ж', 'з', 'и', 'й','к', 'л', 'м', 'н', 'о', 'п', 'р', 'с', 'т', 'у', 'ф','х', 'ц', 'ч', 'ш', 'щ', 'ъ', 'ы', 'ь', 'э', 'ю', 'я'};
        for(i = 0; i < arr.length; i++){
            System.out.printf("%c ", arr[i]);
        }
        System.out.printf("\n");
    }
}
