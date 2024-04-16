package guru.qa;

public class Main {

    private String msg = "Hello qa guru!";

    public static void main(String[] args) {

        System.out.println(getMassage());
    }

    private static String getMassage() {
        return msg;
    }
    
}