public class StringManipulatorTest {
    public static void main(String[] args){
        StringManipulator iD = new StringManipulator();
        String result = iD.concatSubstring("hello", 1, 2, "world");
        System.out.println(result);
    }
}