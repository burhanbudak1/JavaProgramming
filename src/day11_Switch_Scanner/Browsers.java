package day11_Switch_Scanner;

public class Browsers {
    public static void main(String[] args) {
        String browsername = "edge";
        String result = "";

        boolean validBrowser = browsername == "chrome" || browsername == "firefox"
          || browsername == "opera" || browsername == "safari" || browsername == "edge";

        if (validBrowser){
            if (browsername == "chrome"){
                result = "Chrome Browser is Selected";
            } else if (browsername == "firefox") {
                result = "Firefox Browser is Selected";
            } else if (browsername == "opera") {
                result = "Opera Browser is Selected";
            } else if (browsername == "safari") {
                result = "Safari Browser is Selected";
            }else {
                result = "Edge Browser is Selected";
            }
        }else {
            result = "Invalid Browser Name";

        }System.out.println(result);













    }





}
