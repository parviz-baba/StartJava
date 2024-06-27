public class MethodNameHelper {
    public static String getMethodName() {
        return new Exception().getStackTrace()[1].getMethodName();
    }
}