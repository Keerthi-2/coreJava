package Collections;

public class Stringbuilder {
    public static void main(String[] args){
        String s1="keerthi";
        String s2="keerthi";
        System.out.println((s1==s2)+" eqauals function demo: "+s1.equals(s2));
        StringBuilder sb1=new StringBuilder("Mummy");
        StringBuilder sb2=new StringBuilder("Mummy");
        System.out.println(sb1==sb2);
        sb1.append("wow");
        sb1.append(true);
        sb1.append(10);
        sb1.append(sb2);
        sb1.append("crazy");
        sb1.toString();
        System.out.println(sb1);
        sb1.reverse();
        System.out.println("after reversal: "+sb1);
        System.out.println(sb1.indexOf("true"));

        for(int i=0;i<sb1.length();i++)
            System.out.println(sb1.charAt(i));
        String s="This is the World you want";
        //replace vowels with star *

        StringBuilder res=new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u'||s.charAt(i)=='A'||s.charAt(i)=='E'||s.charAt(i)=='I'||s.charAt(i)=='O'||s.charAt(i)=='U')
                res.append("*");
            else{
                res.append(s.charAt(i));
            }
        }
        System.out.println(res);
        res.replace(0,2,"keerthi");
        res.insert(4,"ash");
        System.out.println("after replacing: "+res);


    }
}
