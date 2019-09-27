package Question_5; //Удалить в строке все лишние пробелы

public class question_5 {
    public static void main(String[] args) {
        String space = " I want    to solve   this    interesting     task  "; //пример
        String result = space.replaceAll(" {1,}", " ");
        System.out.println("Before: ");
        System.out.println(space);
        System.out.println("After: ");
        System.out.println(result.trim()); //trim возвращает копию строки с пропущенными начальными и конечными пробелами
    }
}
