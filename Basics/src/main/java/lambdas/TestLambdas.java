package lambdas;

public class TestLambdas {
    public static void main(String[] args) {
        Foo standard = new FooImpl();
        standard.foo();

        Foo lambda1 = () ->System.out.println("Lambda implementation of Foo.");

        Foo anan = new Foo() {
            @Override
            public void foo() {
                System.out.println("Method Local Anonymous Inner Class Implementation");
            }
        };

        ParamLambda paramLambda = (x)-> System.out.println(x);

    }
}

