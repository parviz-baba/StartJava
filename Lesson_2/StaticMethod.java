public class StaticMethod {
    public static String getMethodName() {
        return new Exception().getStackTrace()[1].getMethodName();
    }

    public static void main(String[] args) {
        StaticMethod staticMethod = new StaticMethod();
        System.out.println(staticMethod.getMethodName() + "() -> возвращает имя метода");

        AllMethodsCalls allMethodsCalls = new AllMethodsCalls();
        allMethodsCalls.callAllMethods();
    }
}