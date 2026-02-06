package SeleniumIntroduction;

public class MethodsDemo {

    public static void main(String[] args) {

        MethodsDemo d = new MethodsDemo();
        String name = d.getData();
        System.out.println(name);
    }

    public String getData() {
        System.out.println("hello world");
        return "piyush kumar";
    }
}
