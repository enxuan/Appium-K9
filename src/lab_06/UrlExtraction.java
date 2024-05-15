package lab_06;

public class UrlExtraction {

    public static void main(String[] args) {
        String url = "https://google.com";

        //check http or https
        if (url.contains("https")) {
            System.out.println("the url is https");
        } else {
            System.out.println("the url is http");
        }

        // print domain name
        String[] splitUrl = url.split("//");
        if (splitUrl[1] != null) {
            System.out.println("the domain name: " + splitUrl[1]);
        }

        // check url is .com of .net

        if (url.contains(".com")) {
            System.out.println("the url is .com");
        } else if (url.contains(".net")) {
            System.out.println("the url is .net");
        }
    }
}
