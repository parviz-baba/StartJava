public class ReturnMethodName {
    public static String getMethodName() {
        return new Exception().getStackTrace()[1].getMethodName();
    }
}