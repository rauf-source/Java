import org.apache.commons.lang3.StringUtils;
public class Main{


public static void main(String args[]){
String name = "alice";
String nameUp = "EMINEM";
String email = "";
 
System.out.println("name is empty: " + StringUtils.isEmpty(name));
System.out.println("email is empty: " + StringUtils.isEmpty(email));
System.out.println("alice in uppper case " + StringUtils.upperCase(name));
System.out.println("EMINEM in lower case " + StringUtils.lowerCase(nameUp));
System.out.println("EMINEM in reverse " + StringUtils.reverse(nameUp));
System.out.println("EMINEM in rotation " + StringUtils.rotate(nameUp,1));
System.out.println("EMINEM is numeric " + StringUtils.isNumeric(nameUp));
System.out.println("123 is numeric " + StringUtils.isNumeric("123"));



}


}