//приведение типов
//int->char
//float->char
// float->char->int.


package lesson2;

public class TypesMatch {
    public static void main(String[] args) {
        //int->char
        int x = 57;
        char y = (char) x;
        System.out.println("int->char "+y);
        //float-> char
        float f = 78.0f;
        char ff = (char)f;
        System.out.println("float-> char "+ff);
        //float->char->int
        float q = 67.0f;
        char w = (char)q;
        int e = (int)w;
        System.out.println("float->char->int "+e);
    }
}
