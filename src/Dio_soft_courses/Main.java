package Dio_soft_courses;

public class Main {
    public static void main(String[] args) {
        Person dev1 = new Person("Steve", true, 26, Enum.DEVELOPER);
        Person dev2 = new Person("Mac", true, 33, Enum.DEVELOPER);
        Person qa1 = new Person("Marge", false, 38, Enum.QA);
        Person qa2 = new Person("Marge", false, 38, Enum.QA);
        Person qa3 = qa1;
        Person seo = new Person("Dave", true, 43,Enum.DIRECTOR);


        System.out.println("dev1==dev2 is "+ (dev1==dev2) + " and dev1.equals(dev2) is "+ dev1.equals(dev2));
        System.out.println("qa1==qa2 is "+ (qa1==qa2) + " and qa1.equals(qa2) is "+ qa1.equals(qa2));
        System.out.println("seo==dev1 is "+ (seo==dev1) + " and seo.equals(qa2) is "+ seo.equals(qa2));
        System.out.println("qa1==qa3 is "+ (qa1==qa3) + " and qa1.equals(qa3) is "+ qa1.equals(qa3));
}}
