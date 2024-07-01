public class MethodNameUtil {
    public static String get() {
        return new Exception().getStackTrace()[1].getMethodName();
    }
}