package lambdas.method_reference;

public class TestLambdas {

    public static void main(String[] args) {
        String s = "Hello ";
        Double d = 0.123;

        TransformUtils<Double> doubleUtils = new TransformUtils<>();
//        doubleUtils.transform(d, x -> Math.sin(x));
        System.out.println(doubleUtils.transform(d, Math::sin));

        TransformUtils<String> stringUtils = new TransformUtils<>();
//        stringUtils.transform(s, x -> TransformUtils.exclaim(x));
        System.out.println(stringUtils.transform(s, TransformUtils::exclaim));

        String name = "NiKo";
//        stringUtils.transform(s,x -> x.concat(name));
        System.out.println(stringUtils.transform(name, s::concat));

        System.out.println(stringUtils.transform(s,String::toUpperCase));

    }

}
