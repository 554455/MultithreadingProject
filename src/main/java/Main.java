public class Main {
    public static void main(String[] args) {
        Foo foo = new Foo();

    Runnable first = new Runnable() {
        @Override
        public void run() {
            foo.first();
        }
    };
    Runnable second = new Runnable() {
        @Override
        public void run() {
            foo.second();
        }
    };
        Runnable third = new Runnable() {
            @Override
            public void run() {
                foo.third();
            }
        };
        first.run();
        second.run();
        third.run();
    }

}
