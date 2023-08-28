package regex;

public class RegexExample {

    public static void main(String[] args) {
     /*
    \\d - одна цифра

    * - 0 или более
    + - 1 или более
    ? - 0 или 1 символов до

    (x|y|z) - одно строка из множества строк

    [a-zA-z] - все английские буквы
    [^abc]- все символы кроме a, b, c

    . - любой символ
    {2} - ровно 2 символа
    {2,} - 2 или более символа
    {2,5} - от 2 до 5 символов
     */

        String a = "-234353213243";
        String b = "4176386821699";
        String c = "+123245642335";

        System.out.println(b.matches("(-|\\+)?\\d*")); //true
        System.out.println(a.matches("(-|\\+)?\\d*")); //true
        System.out.println(c.matches("(-|\\+)?\\d*")); //true

        String d = "mjd3v1vSA32211Ab2s21u34541435";

        System.out.println(d.matches("[a-zA-Z123]+\\d+")); // true

        String e = "hello";
        String f = "Anna";

        System.out.println(e.matches("[^abc]+")); // true
        System.out.println(f.matches("[^abc]+")); // false

        String url = "http://www.google.com";
        String url2 = "http://www.yandex.ru";
        String url3 = "http://www.somon.tj";

        System.out.println(url.matches("http://www\\..*\\.(com|ru)")); //true
        System.out.println(url2.matches("http://www\\..+\\.(com|ru)")); //true
        System.out.println(url3.matches("http://www\\..+\\.(com|ru)")); //false

        String g = "12";
        String h = "3418";
        String k = "2";

        System.out.println(b.matches("\\d{2}")); //false
        System.out.println(g.matches("\\d{2}")); //true

        System.out.println(b.matches("\\d{2,5}")); //false
        System.out.println(h.matches("\\d{2,5}")); //true

        System.out.println(b.matches("\\d{2,}")); //true
        System.out.println(k.matches("\\d{2,}")); //false

    }

}
