public class StringMatching {
public static void main(String[] args) {

    String str = "Codetantra";  
    // String code = "Code*antr*";
    String code = "Code?antra";

    // String check_1 = "";
    // String check_2 = "";
    boolean equal = true;
if(str.length() == code.length() && !str.contains("?")){
    for(int i=0; i<code.length(); i++){

        char ch1 = str.charAt(i);
        char ch2 = code.charAt(i);

        if(ch2 != '*' && ch1 != ch2){ 
            equal =  false;
            break;
        }
    }
}
else {

    if(code.charAt(code.length() -1)  == '?'){
        System.out.println("entry");
    for(int i=0; i<code.length()-1; i++){
        if(str.charAt(i) != code.charAt(i)){
            equal = false;
        }
    }
}
else {

    int index = code.indexOf('?');
    String sub1 = str.substring(0, index);

    String sub2 = code.substring(0, index);
    String end1 = str.substring(str.length() - (code.length() - index - 1), str.length());
    String end2 = code.substring(index+1, code.length());
    equal = sub1.equals(sub2) && end1.equals(end2);
    System.out.println(sub1 + " " +  sub2 + " " + end1 + " "+ end2);
}
}
    System.out.println(equal);
}
}
