// Q. User enters age value and it will be validated by regex.

import java.util.regex.*;
import java.util.scanner.*;

public class AgePattern {
    public static void main(String[] args) {
	String Pattern = "[0-9]{1,2}";
	int flag = 1 ;
	while (flag == 1){

	System.out.println("Enter Age: ");
        Scanner sc = new Scanner(System.in);
	String age = sc.next;
	Pattern P = Pattern.compile(Pattern);
	Matcher M = P.matcher(age);
if (M.matches()){
flag = 0;
}else{
System.out.println("Try Again.");
}
}
}


