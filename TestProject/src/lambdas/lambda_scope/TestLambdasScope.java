package lambdas.lambda_scope;

public class TestLambdasScope {

    public static void main(String[] args) {

        LambdaScopeTest scope = new LambdaScopeTest();
        LambdaScopeTest.LambdaScopeInner inner = scope.new LambdaScopeInner();
        inner.testScope(99.00);

    }

}
