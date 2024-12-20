import java.io.*;

public class Directory{
public static void main(String[] args){
File f = new File ("G:\\NFSU\\SEMESTER 3\\JAVA Practise");
if (f.isDirectory()){
String name[] = f.list();
for (String n : name){
System.out.println(n);
}
}
}
}